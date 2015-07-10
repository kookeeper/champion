package br.com.msystem.bean;

import java.math.BigDecimal;
import java.util.List;

import javax.ejb.Local;

import br.com.msystem.entidade.CondPagto;
import br.com.msystem.entidade.Produto;
import br.com.msystem.entidade.Vendedor;

@Local
public interface PedidoBeanLocal {

	void registrarVenda(List<Produto> listaProduto, Vendedor vendedor,
			CondPagto condPagto, CondPagto condPagto2, CondPagto condPagto3,
			BigDecimal vlrCondPagto, BigDecimal vlrCondPagto2, BigDecimal vlrCondPagto3, String cpf,
			BigDecimal vlrDesc, Integer numeroComprovanteCartao/*, int pctDescontoMaximo,
			int vendedorMaster*/);

}
