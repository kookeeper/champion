package br.com.msystem.entidade;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;


/**
 * The persistent class for the pedidos_itens database table.
 * 
 */
@Entity
@Table(name="pedidos_itens")
public class PedidoItem implements Serializable {
	private static final long serialVersionUID = 1L;
	private int pedidoItemSq;
	private BigDecimal aliqIcmsItem;
	private BigDecimal aliqIpiItem;
	private BigDecimal baseIcmsSubstItem;
	private String nrSerieItem;
	private int numeroEstoque;
	private BigDecimal pctDesc;
	private BigDecimal pctJuros;
	private BigDecimal pesoBruto;
	private BigDecimal pesoLiquido;
	private BigDecimal precoUnit;
	private int qtdePedidoItem;
	private BigDecimal qtdeProdutoRetorno;
	private BigDecimal vlrDesc;
	private BigDecimal vlrIcmsItem;
	private BigDecimal vlrIcmsSubstItem;
	private BigDecimal vlrIpiItem;
	private BigDecimal vlrJuros;
	private BigDecimal vlrTotalItem;
	private List<Kardex> kardexs;
	private Pedido pedido;
	private Produto produto;
	private List<PedidoItemSerie> pedidosItensSeries;

    public PedidoItem() {
    }


	@Id
	@Column(name="PEDIDO_ITEM_SQ", unique=true, nullable=false)
	public int getPedidoItemSq() {
		return this.pedidoItemSq;
	}

	public void setPedidoItemSq(int pedidoItemSq) {
		this.pedidoItemSq = pedidoItemSq;
	}


	@Column(name="ALIQ_ICMS_ITEM", precision=10, scale=2)
	public BigDecimal getAliqIcmsItem() {
		return this.aliqIcmsItem;
	}

	public void setAliqIcmsItem(BigDecimal aliqIcmsItem) {
		this.aliqIcmsItem = aliqIcmsItem;
	}


	@Column(name="ALIQ_IPI_ITEM", precision=10, scale=2)
	public BigDecimal getAliqIpiItem() {
		return this.aliqIpiItem;
	}

	public void setAliqIpiItem(BigDecimal aliqIpiItem) {
		this.aliqIpiItem = aliqIpiItem;
	}


	@Column(name="base_icms_subst_item", precision=10, scale=2)
	public BigDecimal getBaseIcmsSubstItem() {
		return this.baseIcmsSubstItem;
	}

	public void setBaseIcmsSubstItem(BigDecimal baseIcmsSubstItem) {
		this.baseIcmsSubstItem = baseIcmsSubstItem;
	}


    @Lob()
	@Column(name="NR_SERIE_ITEM")
	public String getNrSerieItem() {
		return this.nrSerieItem;
	}

	public void setNrSerieItem(String nrSerieItem) {
		this.nrSerieItem = nrSerieItem;
	}


	@Column(name="numero_estoque")
	public int getNumeroEstoque() {
		return this.numeroEstoque;
	}

	public void setNumeroEstoque(int numeroEstoque) {
		this.numeroEstoque = numeroEstoque;
	}


	@Column(name="PCT_DESC", precision=10, scale=2)
	public BigDecimal getPctDesc() {
		return this.pctDesc;
	}

	public void setPctDesc(BigDecimal pctDesc) {
		this.pctDesc = pctDesc;
	}


	@Column(name="PCT_JUROS", precision=10, scale=2)
	public BigDecimal getPctJuros() {
		return this.pctJuros;
	}

	public void setPctJuros(BigDecimal pctJuros) {
		this.pctJuros = pctJuros;
	}


	@Column(name="PESO_BRUTO", precision=10, scale=2)
	public BigDecimal getPesoBruto() {
		return this.pesoBruto;
	}

	public void setPesoBruto(BigDecimal pesoBruto) {
		this.pesoBruto = pesoBruto;
	}


	@Column(name="PESO_LIQUIDO", precision=10, scale=2)
	public BigDecimal getPesoLiquido() {
		return this.pesoLiquido;
	}

	public void setPesoLiquido(BigDecimal pesoLiquido) {
		this.pesoLiquido = pesoLiquido;
	}


	@Column(name="PRECO_UNIT", precision=10, scale=2)
	public BigDecimal getPrecoUnit() {
		return this.precoUnit;
	}

	public void setPrecoUnit(BigDecimal precoUnit) {
		this.precoUnit = precoUnit;
	}


	@Column(name="QTDE_PEDIDO_ITEM", nullable=false)
	public int getQtdePedidoItem() {
		return this.qtdePedidoItem;
	}

	public void setQtdePedidoItem(int qtdePedidoItem) {
		this.qtdePedidoItem = qtdePedidoItem;
	}


	@Column(name="qtde_produto_retorno", precision=10)
	public BigDecimal getQtdeProdutoRetorno() {
		return this.qtdeProdutoRetorno;
	}

	public void setQtdeProdutoRetorno(BigDecimal qtdeProdutoRetorno) {
		this.qtdeProdutoRetorno = qtdeProdutoRetorno;
	}


	@Column(name="VLR_DESC", precision=10, scale=2)
	public BigDecimal getVlrDesc() {
		return this.vlrDesc;
	}

	public void setVlrDesc(BigDecimal vlrDesc) {
		this.vlrDesc = vlrDesc;
	}


	@Column(name="VLR_ICMS_ITEM", precision=10, scale=2)
	public BigDecimal getVlrIcmsItem() {
		return this.vlrIcmsItem;
	}

	public void setVlrIcmsItem(BigDecimal vlrIcmsItem) {
		this.vlrIcmsItem = vlrIcmsItem;
	}


	@Column(name="vlr_icms_subst_item", precision=10, scale=2)
	public BigDecimal getVlrIcmsSubstItem() {
		return this.vlrIcmsSubstItem;
	}

	public void setVlrIcmsSubstItem(BigDecimal vlrIcmsSubstItem) {
		this.vlrIcmsSubstItem = vlrIcmsSubstItem;
	}


	@Column(name="VLR_IPI_ITEM", precision=10, scale=2)
	public BigDecimal getVlrIpiItem() {
		return this.vlrIpiItem;
	}

	public void setVlrIpiItem(BigDecimal vlrIpiItem) {
		this.vlrIpiItem = vlrIpiItem;
	}


	@Column(name="VLR_JUROS", precision=10, scale=2)
	public BigDecimal getVlrJuros() {
		return this.vlrJuros;
	}

	public void setVlrJuros(BigDecimal vlrJuros) {
		this.vlrJuros = vlrJuros;
	}


	@Column(name="VLR_TOTAL_ITEM", precision=10, scale=2)
	public BigDecimal getVlrTotalItem() {
		return this.vlrTotalItem;
	}

	public void setVlrTotalItem(BigDecimal vlrTotalItem) {
		this.vlrTotalItem = vlrTotalItem;
	}


	//bi-directional many-to-one association to Kardex
	@OneToMany(mappedBy="pedidosIten")
	public List<Kardex> getKardexs() {
		return this.kardexs;
	}

	public void setKardexs(List<Kardex> kardexs) {
		this.kardexs = kardexs;
	}
	

	//bi-directional many-to-one association to Pedido
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="PEDIDO_SQ", nullable=false)
	public Pedido getPedido() {
		return this.pedido;
	}

	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}

	//bi-directional many-to-one association to Produto
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="PRODUTO_SQ", nullable=false)
	public Produto getProduto() {
		return this.produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	

	//bi-directional many-to-one association to PedidosItensSerie
	@OneToMany(mappedBy="pedidosIten")
	public List<PedidoItemSerie> getPedidosItensSeries() {
		return this.pedidosItensSeries;
	}

	public void setPedidosItensSeries(List<PedidoItemSerie> pedidosItensSeries) {
		this.pedidosItensSeries = pedidosItensSeries;
	}

}