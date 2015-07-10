package br.com.msystem.entidade;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * The persistent class for the pedidos database table.
 * 
 */
@Entity
@Table(name = "pedidos")
public class Pedido implements Serializable {
	private static final long serialVersionUID = 1L;
	private int pedidoSq;
	private String baixouEstoque;
	private BigDecimal baseIcms;
	private BigDecimal baseIcmsSubst;
	private BigDecimal cotacaoDolar;
	private Timestamp dataPedido;
	private int diasDemonstracao;
	private String freteTransp;
	private int nfiscalSq;
	private Integer numeroComprovanteCartao;
	private int numeroPedido;
	private String observacaoNf;
	private String observacaoPed;
	private BigDecimal pctDesc;
	private BigDecimal pctJuros;
	private BigDecimal pesoBruto;
	private BigDecimal pesoLiquido;
	private String status;
	private int vendedorSqDesconto;
	private BigDecimal vlrDesc;
	private BigDecimal vlrFrete;
	private BigDecimal vlrIcms;
	private BigDecimal vlrIcmsSubst;
	private BigDecimal vlrIpi;
	private BigDecimal vlrJuros;
	private BigDecimal vlrProdutos;
	private BigDecimal vlrSeguro;
	private BigDecimal vlrTotal;
	private List<Nfiscal> nfiscais;
	private Cliente cliente;
	private CondPagto condPagto;
	private Linha linha;
	private Natureza natureza;
	private Transportadora transportadora;
	private Vendedor vendedor;
	private CondPagto condPagto2;
	private CondPagto condPagto3;
	private BigDecimal vlrCondPagto;
	private BigDecimal vlrCondPagto2;
	private BigDecimal vlrCondPagto3;
	private List<PedidoItem> pedidosItens;

	public Pedido() {
		this.baixouEstoque = "N";
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "PEDIDO_SQ", unique = true, nullable = false)
	public int getPedidoSq() {
		return this.pedidoSq;
	}

	public void setPedidoSq(int pedidoSq) {
		this.pedidoSq = pedidoSq;
	}

	@Column(name = "baixou_estoque", nullable = false, length = 1)
	public String getBaixouEstoque() {
		return this.baixouEstoque;
	}

	public void setBaixouEstoque(String baixouEstoque) {
		this.baixouEstoque = baixouEstoque;
	}

	@Column(name = "BASE_ICMS", precision = 10, scale = 2)
	public BigDecimal getBaseIcms() {
		return this.baseIcms;
	}

	public void setBaseIcms(BigDecimal baseIcms) {
		this.baseIcms = baseIcms;
	}

	@Column(name = "base_icms_subst", precision = 10, scale = 2)
	public BigDecimal getBaseIcmsSubst() {
		return this.baseIcmsSubst;
	}

	public void setBaseIcmsSubst(BigDecimal baseIcmsSubst) {
		this.baseIcmsSubst = baseIcmsSubst;
	}

	@Column(name = "COTACAO_DOLAR", precision = 10, scale = 4)
	public BigDecimal getCotacaoDolar() {
		return this.cotacaoDolar;
	}

	public void setCotacaoDolar(BigDecimal cotacaoDolar) {
		this.cotacaoDolar = cotacaoDolar;
	}

	@Column(name = "DATA_PEDIDO", nullable = false)
	public Timestamp getDataPedido() {
		return this.dataPedido;
	}

	public void setDataPedido(Timestamp dataPedido) {
		this.dataPedido = dataPedido;
	}

	@Column(name = "DIAS_DEMONSTRACAO")
	public int getDiasDemonstracao() {
		return this.diasDemonstracao;
	}

	public void setDiasDemonstracao(int diasDemonstracao) {
		this.diasDemonstracao = diasDemonstracao;
	}

	@Column(name = "FRETE_TRANSP", length = 1)
	public String getFreteTransp() {
		return this.freteTransp;
	}

	public void setFreteTransp(String freteTransp) {
		this.freteTransp = freteTransp;
	}

	@Column(name = "NFISCAL_SQ")
	public int getNfiscalSq() {
		return this.nfiscalSq;
	}

	public void setNfiscalSq(int nfiscalSq) {
		this.nfiscalSq = nfiscalSq;
	}

	@Column(name = "numero_comprovante_cartao")
	public Integer getNumeroComprovanteCartao() {
		return this.numeroComprovanteCartao;
	}

	public void setNumeroComprovanteCartao(Integer numeroComprovanteCartao) {
		this.numeroComprovanteCartao = numeroComprovanteCartao;
	}

	@Column(name = "NUMERO_PEDIDO")
	public int getNumeroPedido() {
		return this.numeroPedido;
	}

	public void setNumeroPedido(int numeroPedido) {
		this.numeroPedido = numeroPedido;
	}

	@Lob()
	@Column(name = "OBSERVACAO_NF")
	public String getObservacaoNf() {
		return this.observacaoNf;
	}

	public void setObservacaoNf(String observacaoNf) {
		this.observacaoNf = observacaoNf;
	}

	@Lob()
	@Column(name = "OBSERVACAO_PED")
	public String getObservacaoPed() {
		return this.observacaoPed;
	}

	public void setObservacaoPed(String observacaoPed) {
		this.observacaoPed = observacaoPed;
	}

	@Column(name = "PCT_DESC", precision = 10, scale = 2)
	public BigDecimal getPctDesc() {
		return this.pctDesc;
	}

	public void setPctDesc(BigDecimal pctDesc) {
		this.pctDesc = pctDesc;
	}

	@Column(name = "pct_juros", precision = 10, scale = 2)
	public BigDecimal getPctJuros() {
		return this.pctJuros;
	}

	public void setPctJuros(BigDecimal pctJuros) {
		this.pctJuros = pctJuros;
	}

	@Column(name = "PESO_BRUTO", precision = 10, scale = 2)
	public BigDecimal getPesoBruto() {
		return this.pesoBruto;
	}

	public void setPesoBruto(BigDecimal pesoBruto) {
		this.pesoBruto = pesoBruto;
	}

	@Column(name = "PESO_LIQUIDO", precision = 10, scale = 2)
	public BigDecimal getPesoLiquido() {
		return this.pesoLiquido;
	}

	public void setPesoLiquido(BigDecimal pesoLiquido) {
		this.pesoLiquido = pesoLiquido;
	}

	@Column(length = 1)
	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Column(name = "vendedor_sq_desconto")
	public int getVendedorSqDesconto() {
		return this.vendedorSqDesconto;
	}

	public void setVendedorSqDesconto(int vendedorSqDesconto) {
		this.vendedorSqDesconto = vendedorSqDesconto;
	}

	@Column(name = "VLR_DESC", precision = 10, scale = 2)
	public BigDecimal getVlrDesc() {
		return this.vlrDesc;
	}

	public void setVlrDesc(BigDecimal vlrDesc) {
		this.vlrDesc = vlrDesc;
	}

	@Column(name = "VLR_FRETE", precision = 10, scale = 2)
	public BigDecimal getVlrFrete() {
		return this.vlrFrete;
	}

	public void setVlrFrete(BigDecimal vlrFrete) {
		this.vlrFrete = vlrFrete;
	}

	@Column(name = "VLR_ICMS", precision = 10, scale = 2)
	public BigDecimal getVlrIcms() {
		return this.vlrIcms;
	}

	public void setVlrIcms(BigDecimal vlrIcms) {
		this.vlrIcms = vlrIcms;
	}

	@Column(name = "vlr_icms_subst", precision = 10, scale = 2)
	public BigDecimal getVlrIcmsSubst() {
		return this.vlrIcmsSubst;
	}

	public void setVlrIcmsSubst(BigDecimal vlrIcmsSubst) {
		this.vlrIcmsSubst = vlrIcmsSubst;
	}

	@Column(name = "VLR_IPI", precision = 10, scale = 2)
	public BigDecimal getVlrIpi() {
		return this.vlrIpi;
	}

	public void setVlrIpi(BigDecimal vlrIpi) {
		this.vlrIpi = vlrIpi;
	}

	@Column(name = "VLR_JUROS", precision = 10, scale = 2)
	public BigDecimal getVlrJuros() {
		return this.vlrJuros;
	}

	public void setVlrJuros(BigDecimal vlrJuros) {
		this.vlrJuros = vlrJuros;
	}

	@Column(name = "VLR_PRODUTOS", precision = 10, scale = 2)
	public BigDecimal getVlrProdutos() {
		return this.vlrProdutos;
	}

	public void setVlrProdutos(BigDecimal vlrProdutos) {
		this.vlrProdutos = vlrProdutos;
	}

	@Column(name = "VLR_SEGURO", precision = 10, scale = 2)
	public BigDecimal getVlrSeguro() {
		return this.vlrSeguro;
	}

	public void setVlrSeguro(BigDecimal vlrSeguro) {
		this.vlrSeguro = vlrSeguro;
	}

	@Column(name = "vlr_total", precision = 10, scale = 2)
	public BigDecimal getVlrTotal() {
		return this.vlrTotal;
	}

	public void setVlrTotal(BigDecimal vlrTotal) {
		this.vlrTotal = vlrTotal;
	}

	// bi-directional many-to-one association to Nfiscai
	@OneToMany(mappedBy = "pedido")
	public List<Nfiscal> getNfiscais() {
		return this.nfiscais;
	}

	public void setNfiscais(List<Nfiscal> nfiscais) {
		this.nfiscais = nfiscais;
	}

	// bi-directional many-to-one association to Cliente
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "CLIENTE_SQ", nullable = false)
	public Cliente getCliente() {
		return this.cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	// bi-directional many-to-one association to CondPagto
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "COND_PAGTO_SQ", nullable = false)
	public CondPagto getCondPagto() {
		return this.condPagto;
	}

	public void setCondPagto(CondPagto condPagto) {
		this.condPagto = condPagto;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "COND_PAGTO2_SQ", nullable = false)
	public CondPagto getCondPagto2() {
		return condPagto2;
	}

	public void setCondPagto2(CondPagto condPagto2) {
		this.condPagto2 = condPagto2;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "COND_PAGTO3_SQ", nullable = false)
	public CondPagto getCondPagto3() {
		return condPagto3;
	}

	public void setCondPagto3(CondPagto condPagto3) {
		this.condPagto3 = condPagto3;
	}

	@Column(name = "vlr_cond_pagto", precision = 10, scale = 2)
	public BigDecimal getVlrCondPagto() {
		return vlrCondPagto;
	}

	public void setVlrCondPagto(BigDecimal vlrCondPagto) {
		this.vlrCondPagto = vlrCondPagto;
	}

	@Column(name = "vlr_cond_pagto2", precision = 10, scale = 2)
	public BigDecimal getVlrCondPagto2() {
		return vlrCondPagto2;
	}

	public void setVlrCondPagto2(BigDecimal vlrCondPagto2) {
		this.vlrCondPagto2 = vlrCondPagto2;
	}

	@Column(name = "vlr_cond_pagto3", precision = 10, scale = 2)
	public BigDecimal getVlrCondPagto3() {
		return vlrCondPagto3;
	}

	public void setVlrCondPagto3(BigDecimal vlrCondPagto3) {
		this.vlrCondPagto3 = vlrCondPagto3;
	}

	// bi-directional many-to-one association to Linha
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "linha_sq")
	public Linha getLinha() {
		return this.linha;
	}

	public void setLinha(Linha linha) {
		this.linha = linha;
	}

	// bi-directional many-to-one association to Natureza
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "NATUREZA_SQ", nullable = false)
	public Natureza getNatureza() {
		return this.natureza;
	}

	public void setNatureza(Natureza natureza) {
		this.natureza = natureza;
	}

	// bi-directional many-to-one association to Transportadora
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "TRANSPORTADORA_SQ", nullable = false)
	public Transportadora getTransportadora() {
		return this.transportadora;
	}

	public void setTransportadora(Transportadora transportadora) {
		this.transportadora = transportadora;
	}

	// bi-directional many-to-one association to Vendedor
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "VENDEDOR_SQ", nullable = false)
	public Vendedor getVendedor() {
		return this.vendedor;
	}

	public void setVendedor(Vendedor vendedor) {
		this.vendedor = vendedor;
	}

	// bi-directional many-to-one association to PedidosIten
	@OneToMany(mappedBy = "pedido", cascade = CascadeType.ALL)
	public List<PedidoItem> getPedidosItens() {
		return this.pedidosItens;
	}

	public void setPedidosItens(List<PedidoItem> pedidosItens) {
		this.pedidosItens = pedidosItens;
	}

}