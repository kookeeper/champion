package br.com.msystem.bean;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import br.com.msystem.entidade.Cliente;
import br.com.msystem.entidade.CondPagto;
import br.com.msystem.entidade.Pedido;
import br.com.msystem.entidade.PedidoItem;
import br.com.msystem.entidade.Produto;
import br.com.msystem.entidade.Vendedor;
import br.com.msystem.exception.SystemException;

/**
 * Session Bean implementation class PedidoBean
 */
@Stateless(mappedName = "ejb/EARProject/EJBProject/PedidoBean")
public class PedidoBean extends GenericBean<Pedido> implements
		PedidoBeanRemote, PedidoBeanLocal {

	@EJB(mappedName = "ejb/EARProject/EJBProject/ClienteBean")
	ClienteBeanLocal clienteBean;

	@EJB(mappedName = "ejb/EARProject/EJBProject/NaturezaBean")
	NaturezaBeanLocal naturezaBean;

	@EJB(mappedName = "ejb/EARProject/EJBProject/VendedorBean")
	VendedorBeanLocal vendedorBean;

	@EJB(mappedName = "ejb/EARProject/EJBProject/ProdutoBean")
	ProdutoBeanLocal produtoBean;

	/**
	 * Default constructor.
	 */
	public PedidoBean() {
	}

	@Override
	public void registrarVenda(List<Produto> listaProduto, Vendedor vendedor,
			CondPagto condPagto, CondPagto condPagto2, CondPagto condPagto3,
			BigDecimal vlrCondPagto, BigDecimal vlrCondPagto2,
			BigDecimal vlrCondPagto3, String cpf, BigDecimal vlrDesc,
			Integer numeroComprovanteCartao/*
											 * , int pctDescontoMaximo, int
											 * vendedorMaster
											 */) {

		double vlrTotal = 0;
		for (Produto produto : listaProduto) {
			vlrTotal += produto.getPrecoUnit().doubleValue();
		}

		double vlrDescontoUnitario = 0;
		if (vlrDesc != null) {
			// retira o valor do desconto do valor total
			vlrTotal -= vlrDesc.doubleValue();
			vlrDescontoUnitario = Math.floor(vlrDesc.doubleValue()
					/ listaProduto.size());
		}

		double totalPagto = 0;
		if (vlrCondPagto != null)
			totalPagto += vlrCondPagto.doubleValue();
		if (vlrCondPagto2 != null)
			totalPagto += vlrCondPagto2.doubleValue();
		if (vlrCondPagto3 != null)
			totalPagto += vlrCondPagto3.doubleValue();

		if (vlrTotal != totalPagto) {
			throw new SystemException("Valor total do pedido ('" + vlrTotal
					+ "') difere do valor total de pagamentos ('" + totalPagto
					+ "').");
		}

		Cliente cliente = clienteBean.buscarPorCodigo(cpf);

		if (cliente == null) {
			cliente = clienteBean.criarCliente(cpf);
		}

		Pedido pedido = new Pedido();

		carregarNumeroPedido(pedido);

		pedido.setDataPedido(new Timestamp(new Date().getTime()));
		pedido.setVendedor(vendedor);
		pedido.setCondPagto(condPagto);
		pedido.setCondPagto2(condPagto2);
		pedido.setCondPagto3(condPagto3);
		pedido.setVlrCondPagto(vlrCondPagto);
		pedido.setVlrCondPagto2(vlrCondPagto2);
		pedido.setVlrCondPagto3(vlrCondPagto3);
		pedido.setNatureza(naturezaBean.buscarPorId(1));
		pedido.setTransportadora(cliente.getTransportadora());
		pedido.setCliente(cliente);
		pedido.setVlrDesc(vlrDesc);
		pedido.setNumeroComprovanteCartao(numeroComprovanteCartao);
		pedido.setCotacaoDolar(new BigDecimal(1));
		pedido.setVlrTotal(new BigDecimal(vlrTotal));

		/*
		 * if (vendedorBean.validarDesconto(pedido.getVlrTotal().doubleValue(),
		 * pedido.getVlrDesc().doubleValue(), pctDescontoMaximo)) {
		 * pedido.setVendedorSqDesconto(vendedorMaster); }
		 */
		pedido.setPedidosItens(new ArrayList<PedidoItem>());

		for (Produto produto : listaProduto) {
			PedidoItem pedidoItem = buscarItem(pedido, produto.getProdutoSq());

			if (pedidoItem.getPedidoItemSq() == 0) {
				pedidoItem.setProduto(produto);
				pedidoItem.setPrecoUnit(produto.getPrecoUnit());
			}
			pedidoItem.setQtdePedidoItem(pedidoItem.getQtdePedidoItem() + 1);
			pedidoItem.setVlrTotalItem(new BigDecimal(pedidoItem.getPrecoUnit()
					.longValue() * pedidoItem.getQtdePedidoItem()));
			pedidoItem.setVlrDesc(new BigDecimal(vlrDescontoUnitario
					* pedidoItem.getQtdePedidoItem()));
			pedidoItem.setNumeroEstoque(1);
			pedidoItem.setPedido(pedido);
			pedido.getPedidosItens().add(pedidoItem);
		}
		em.persist(pedido);
		em.flush();
	}

	private void carregarNumeroPedido(Pedido pedido) {
		if (pedido.getNumeroPedido() == 0) {
			Integer ultimo = (Integer) em.createQuery(
					"Select MAX(p.numeroPedido) FROM Pedido p")
					.getSingleResult();
			if (ultimo != null) {
				pedido.setNumeroPedido(ultimo + 1);
			} else {
				pedido.setNumeroPedido(1);
			}
		}
	}

	private PedidoItem buscarItem(Pedido pedido, int produtoSq) {
		for (PedidoItem pedidoItem : pedido.getPedidosItens()) {
			if (pedidoItem.getProduto().getProdutoSq() == produtoSq) {
				return pedidoItem;
			}
		}
		return new PedidoItem();
	}
}
