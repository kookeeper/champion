package br.com.msystem.entidade;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.math.BigDecimal;
import java.util.List;


/**
 * The persistent class for the nfiscais database table.
 * 
 */
@Entity
@Table(name="nfiscais")
public class Nfiscal implements Serializable {
	private static final long serialVersionUID = 1L;
	private int nfiscalSq;
	private BigDecimal baseIcms;
	private BigDecimal baseIcmsSubst;
	private String cancelada;
	private int classFiscal1;
	private int classFiscal10;
	private int classFiscal11;
	private int classFiscal12;
	private int classFiscal13;
	private int classFiscal14;
	private int classFiscal15;
	private int classFiscal16;
	private int classFiscal17;
	private int classFiscal18;
	private int classFiscal19;
	private int classFiscal2;
	private int classFiscal20;
	private int classFiscal21;
	private int classFiscal22;
	private int classFiscal23;
	private int classFiscal24;
	private int classFiscal3;
	private int classFiscal4;
	private int classFiscal5;
	private int classFiscal6;
	private int classFiscal7;
	private int classFiscal8;
	private int classFiscal9;
	private String concluida;
	private BigDecimal cotacaoDolar;
	private int diasDemonstracao;
	private Timestamp dtNfiscalRetorno;
	private Timestamp dtemissaoNfiscal;
	private Timestamp dtsaidaNfiscal;
	private String especieTransp;
	private String freteTransp;
	private String infAdicional;
	private String localEmbarque;
	private String marcaTransp;
	private String mensagem;
	private String motivoCancelamento;
	private String nfManual;
	private String nfeChave;
	private byte[] nfeResposta;
	private int nfiscalSqReferencia;
	private int nrNfiscalRetorno;
	private int numeroNfe;
	private int numeroNfiscal;
	private String numeroTransp;
	private String pbrutoTransp;
	private String placaTransp;
	private String pliquidoTransp;
	private int qtdeTransp;
	private String reciboNfe;
	private String retornoObservacao;
	private String retornoProduto;
	private String ufEmbarque;
	private String ufPlacaTransp;
	private BigDecimal vlrDespAcess;
	private BigDecimal vlrFrete;
	private BigDecimal vlrIcms;
	private BigDecimal vlrIcmsSubst;
	private BigDecimal vlrIi;
	private BigDecimal vlrIpi;
	private BigDecimal vlrProdutos;
	private BigDecimal vlrSeguro;
	private BigDecimal vlrTotal;
	private List<CartaCorrecao> cartaCorrecaos;
	private List<Duplicata> duplicatas;
	private Pedido pedido;
	private Cliente cliente;
	private CondPagto condPagto;
	private Linha linha;
	private Natureza natureza1;
	private Natureza natureza2;
	private Transportadora transportadora;
	private Vendedor vendedore;
	private List<NfiscalItem> nfiscaisItens;

    public Nfiscal() {
    }


	@Id
	@Column(name="NFISCAL_SQ", unique=true, nullable=false)
	public int getNfiscalSq() {
		return this.nfiscalSq;
	}

	public void setNfiscalSq(int nfiscalSq) {
		this.nfiscalSq = nfiscalSq;
	}


	@Column(name="BASE_ICMS", precision=10, scale=2)
	public BigDecimal getBaseIcms() {
		return this.baseIcms;
	}

	public void setBaseIcms(BigDecimal baseIcms) {
		this.baseIcms = baseIcms;
	}


	@Column(name="BASE_ICMS_SUBST", precision=10, scale=2)
	public BigDecimal getBaseIcmsSubst() {
		return this.baseIcmsSubst;
	}

	public void setBaseIcmsSubst(BigDecimal baseIcmsSubst) {
		this.baseIcmsSubst = baseIcmsSubst;
	}


	@Column(nullable=false, length=1)
	public String getCancelada() {
		return this.cancelada;
	}

	public void setCancelada(String cancelada) {
		this.cancelada = cancelada;
	}


	@Column(name="CLASS_FISCAL1")
	public int getClassFiscal1() {
		return this.classFiscal1;
	}

	public void setClassFiscal1(int classFiscal1) {
		this.classFiscal1 = classFiscal1;
	}


	@Column(name="class_fiscal10")
	public int getClassFiscal10() {
		return this.classFiscal10;
	}

	public void setClassFiscal10(int classFiscal10) {
		this.classFiscal10 = classFiscal10;
	}


	@Column(name="class_fiscal11")
	public int getClassFiscal11() {
		return this.classFiscal11;
	}

	public void setClassFiscal11(int classFiscal11) {
		this.classFiscal11 = classFiscal11;
	}


	@Column(name="class_fiscal12")
	public int getClassFiscal12() {
		return this.classFiscal12;
	}

	public void setClassFiscal12(int classFiscal12) {
		this.classFiscal12 = classFiscal12;
	}


	@Column(name="class_fiscal13")
	public int getClassFiscal13() {
		return this.classFiscal13;
	}

	public void setClassFiscal13(int classFiscal13) {
		this.classFiscal13 = classFiscal13;
	}


	@Column(name="class_fiscal14")
	public int getClassFiscal14() {
		return this.classFiscal14;
	}

	public void setClassFiscal14(int classFiscal14) {
		this.classFiscal14 = classFiscal14;
	}


	@Column(name="class_fiscal15")
	public int getClassFiscal15() {
		return this.classFiscal15;
	}

	public void setClassFiscal15(int classFiscal15) {
		this.classFiscal15 = classFiscal15;
	}


	@Column(name="class_fiscal16")
	public int getClassFiscal16() {
		return this.classFiscal16;
	}

	public void setClassFiscal16(int classFiscal16) {
		this.classFiscal16 = classFiscal16;
	}


	@Column(name="class_fiscal17")
	public int getClassFiscal17() {
		return this.classFiscal17;
	}

	public void setClassFiscal17(int classFiscal17) {
		this.classFiscal17 = classFiscal17;
	}


	@Column(name="class_fiscal18")
	public int getClassFiscal18() {
		return this.classFiscal18;
	}

	public void setClassFiscal18(int classFiscal18) {
		this.classFiscal18 = classFiscal18;
	}


	@Column(name="class_fiscal19")
	public int getClassFiscal19() {
		return this.classFiscal19;
	}

	public void setClassFiscal19(int classFiscal19) {
		this.classFiscal19 = classFiscal19;
	}


	@Column(name="CLASS_FISCAL2")
	public int getClassFiscal2() {
		return this.classFiscal2;
	}

	public void setClassFiscal2(int classFiscal2) {
		this.classFiscal2 = classFiscal2;
	}


	@Column(name="class_fiscal20")
	public int getClassFiscal20() {
		return this.classFiscal20;
	}

	public void setClassFiscal20(int classFiscal20) {
		this.classFiscal20 = classFiscal20;
	}


	@Column(name="class_fiscal21")
	public int getClassFiscal21() {
		return this.classFiscal21;
	}

	public void setClassFiscal21(int classFiscal21) {
		this.classFiscal21 = classFiscal21;
	}


	@Column(name="class_fiscal22")
	public int getClassFiscal22() {
		return this.classFiscal22;
	}

	public void setClassFiscal22(int classFiscal22) {
		this.classFiscal22 = classFiscal22;
	}


	@Column(name="class_fiscal23")
	public int getClassFiscal23() {
		return this.classFiscal23;
	}

	public void setClassFiscal23(int classFiscal23) {
		this.classFiscal23 = classFiscal23;
	}


	@Column(name="class_fiscal24")
	public int getClassFiscal24() {
		return this.classFiscal24;
	}

	public void setClassFiscal24(int classFiscal24) {
		this.classFiscal24 = classFiscal24;
	}


	@Column(name="CLASS_FISCAL3")
	public int getClassFiscal3() {
		return this.classFiscal3;
	}

	public void setClassFiscal3(int classFiscal3) {
		this.classFiscal3 = classFiscal3;
	}


	@Column(name="CLASS_FISCAL4")
	public int getClassFiscal4() {
		return this.classFiscal4;
	}

	public void setClassFiscal4(int classFiscal4) {
		this.classFiscal4 = classFiscal4;
	}


	@Column(name="CLASS_FISCAL5")
	public int getClassFiscal5() {
		return this.classFiscal5;
	}

	public void setClassFiscal5(int classFiscal5) {
		this.classFiscal5 = classFiscal5;
	}


	@Column(name="CLASS_FISCAL6")
	public int getClassFiscal6() {
		return this.classFiscal6;
	}

	public void setClassFiscal6(int classFiscal6) {
		this.classFiscal6 = classFiscal6;
	}


	@Column(name="CLASS_FISCAL7")
	public int getClassFiscal7() {
		return this.classFiscal7;
	}

	public void setClassFiscal7(int classFiscal7) {
		this.classFiscal7 = classFiscal7;
	}


	@Column(name="class_fiscal8")
	public int getClassFiscal8() {
		return this.classFiscal8;
	}

	public void setClassFiscal8(int classFiscal8) {
		this.classFiscal8 = classFiscal8;
	}


	@Column(name="class_fiscal9")
	public int getClassFiscal9() {
		return this.classFiscal9;
	}

	public void setClassFiscal9(int classFiscal9) {
		this.classFiscal9 = classFiscal9;
	}


	@Column(length=1)
	public String getConcluida() {
		return this.concluida;
	}

	public void setConcluida(String concluida) {
		this.concluida = concluida;
	}


	@Column(name="COTACAO_DOLAR", precision=10, scale=4)
	public BigDecimal getCotacaoDolar() {
		return this.cotacaoDolar;
	}

	public void setCotacaoDolar(BigDecimal cotacaoDolar) {
		this.cotacaoDolar = cotacaoDolar;
	}


	@Column(name="DIAS_DEMONSTRACAO")
	public int getDiasDemonstracao() {
		return this.diasDemonstracao;
	}

	public void setDiasDemonstracao(int diasDemonstracao) {
		this.diasDemonstracao = diasDemonstracao;
	}


	@Column(name="DT_NFISCAL_RETORNO")
	public Timestamp getDtNfiscalRetorno() {
		return this.dtNfiscalRetorno;
	}

	public void setDtNfiscalRetorno(Timestamp dtNfiscalRetorno) {
		this.dtNfiscalRetorno = dtNfiscalRetorno;
	}


	@Column(name="DTEMISSAO_NFISCAL", nullable=false)
	public Timestamp getDtemissaoNfiscal() {
		return this.dtemissaoNfiscal;
	}

	public void setDtemissaoNfiscal(Timestamp dtemissaoNfiscal) {
		this.dtemissaoNfiscal = dtemissaoNfiscal;
	}


	@Column(name="DTSAIDA_NFISCAL")
	public Timestamp getDtsaidaNfiscal() {
		return this.dtsaidaNfiscal;
	}

	public void setDtsaidaNfiscal(Timestamp dtsaidaNfiscal) {
		this.dtsaidaNfiscal = dtsaidaNfiscal;
	}


	@Column(name="ESPECIE_TRANSP", length=20)
	public String getEspecieTransp() {
		return this.especieTransp;
	}

	public void setEspecieTransp(String especieTransp) {
		this.especieTransp = especieTransp;
	}


	@Column(name="FRETE_TRANSP", length=1)
	public String getFreteTransp() {
		return this.freteTransp;
	}

	public void setFreteTransp(String freteTransp) {
		this.freteTransp = freteTransp;
	}


	@Column(name="inf_adicional", length=100)
	public String getInfAdicional() {
		return this.infAdicional;
	}

	public void setInfAdicional(String infAdicional) {
		this.infAdicional = infAdicional;
	}


	@Column(name="local_embarque", length=60)
	public String getLocalEmbarque() {
		return this.localEmbarque;
	}

	public void setLocalEmbarque(String localEmbarque) {
		this.localEmbarque = localEmbarque;
	}


	@Column(name="MARCA_TRANSP", length=30)
	public String getMarcaTransp() {
		return this.marcaTransp;
	}

	public void setMarcaTransp(String marcaTransp) {
		this.marcaTransp = marcaTransp;
	}


    @Lob()
	public String getMensagem() {
		return this.mensagem;
	}

	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}


	@Column(name="motivo_cancelamento", length=45)
	public String getMotivoCancelamento() {
		return this.motivoCancelamento;
	}

	public void setMotivoCancelamento(String motivoCancelamento) {
		this.motivoCancelamento = motivoCancelamento;
	}


	@Column(name="NF_MANUAL", length=1)
	public String getNfManual() {
		return this.nfManual;
	}

	public void setNfManual(String nfManual) {
		this.nfManual = nfManual;
	}


	@Column(name="nfe_chave", length=47)
	public String getNfeChave() {
		return this.nfeChave;
	}

	public void setNfeChave(String nfeChave) {
		this.nfeChave = nfeChave;
	}


    @Lob()
	@Column(name="nfe_resposta")
	public byte[] getNfeResposta() {
		return this.nfeResposta;
	}

	public void setNfeResposta(byte[] nfeResposta) {
		this.nfeResposta = nfeResposta;
	}


	@Column(name="nfiscal_sq_referencia")
	public int getNfiscalSqReferencia() {
		return this.nfiscalSqReferencia;
	}

	public void setNfiscalSqReferencia(int nfiscalSqReferencia) {
		this.nfiscalSqReferencia = nfiscalSqReferencia;
	}


	@Column(name="NR_NFISCAL_RETORNO")
	public int getNrNfiscalRetorno() {
		return this.nrNfiscalRetorno;
	}

	public void setNrNfiscalRetorno(int nrNfiscalRetorno) {
		this.nrNfiscalRetorno = nrNfiscalRetorno;
	}


	@Column(name="numero_nfe")
	public int getNumeroNfe() {
		return this.numeroNfe;
	}

	public void setNumeroNfe(int numeroNfe) {
		this.numeroNfe = numeroNfe;
	}


	@Column(name="NUMERO_NFISCAL", nullable=false)
	public int getNumeroNfiscal() {
		return this.numeroNfiscal;
	}

	public void setNumeroNfiscal(int numeroNfiscal) {
		this.numeroNfiscal = numeroNfiscal;
	}


	@Column(name="NUMERO_TRANSP", length=10)
	public String getNumeroTransp() {
		return this.numeroTransp;
	}

	public void setNumeroTransp(String numeroTransp) {
		this.numeroTransp = numeroTransp;
	}


	@Column(name="PBRUTO_TRANSP", length=20)
	public String getPbrutoTransp() {
		return this.pbrutoTransp;
	}

	public void setPbrutoTransp(String pbrutoTransp) {
		this.pbrutoTransp = pbrutoTransp;
	}


	@Column(name="PLACA_TRANSP", length=7)
	public String getPlacaTransp() {
		return this.placaTransp;
	}

	public void setPlacaTransp(String placaTransp) {
		this.placaTransp = placaTransp;
	}


	@Column(name="PLIQUIDO_TRANSP", length=20)
	public String getPliquidoTransp() {
		return this.pliquidoTransp;
	}

	public void setPliquidoTransp(String pliquidoTransp) {
		this.pliquidoTransp = pliquidoTransp;
	}


	@Column(name="QTDE_TRANSP")
	public int getQtdeTransp() {
		return this.qtdeTransp;
	}

	public void setQtdeTransp(int qtdeTransp) {
		this.qtdeTransp = qtdeTransp;
	}


	@Column(name="recibo_nfe", length=15)
	public String getReciboNfe() {
		return this.reciboNfe;
	}

	public void setReciboNfe(String reciboNfe) {
		this.reciboNfe = reciboNfe;
	}


    @Lob()
	@Column(name="RETORNO_OBSERVACAO")
	public String getRetornoObservacao() {
		return this.retornoObservacao;
	}

	public void setRetornoObservacao(String retornoObservacao) {
		this.retornoObservacao = retornoObservacao;
	}


	@Column(name="RETORNO_PRODUTO", length=1)
	public String getRetornoProduto() {
		return this.retornoProduto;
	}

	public void setRetornoProduto(String retornoProduto) {
		this.retornoProduto = retornoProduto;
	}


	@Column(name="uf_embarque", length=2)
	public String getUfEmbarque() {
		return this.ufEmbarque;
	}

	public void setUfEmbarque(String ufEmbarque) {
		this.ufEmbarque = ufEmbarque;
	}


	@Column(name="UF_PLACA_TRANSP", length=2)
	public String getUfPlacaTransp() {
		return this.ufPlacaTransp;
	}

	public void setUfPlacaTransp(String ufPlacaTransp) {
		this.ufPlacaTransp = ufPlacaTransp;
	}


	@Column(name="VLR_DESP_ACESS", precision=10, scale=2)
	public BigDecimal getVlrDespAcess() {
		return this.vlrDespAcess;
	}

	public void setVlrDespAcess(BigDecimal vlrDespAcess) {
		this.vlrDespAcess = vlrDespAcess;
	}


	@Column(name="VLR_FRETE", precision=10, scale=2)
	public BigDecimal getVlrFrete() {
		return this.vlrFrete;
	}

	public void setVlrFrete(BigDecimal vlrFrete) {
		this.vlrFrete = vlrFrete;
	}


	@Column(name="VLR_ICMS", precision=10, scale=2)
	public BigDecimal getVlrIcms() {
		return this.vlrIcms;
	}

	public void setVlrIcms(BigDecimal vlrIcms) {
		this.vlrIcms = vlrIcms;
	}


	@Column(name="VLR_ICMS_SUBST", precision=10, scale=2)
	public BigDecimal getVlrIcmsSubst() {
		return this.vlrIcmsSubst;
	}

	public void setVlrIcmsSubst(BigDecimal vlrIcmsSubst) {
		this.vlrIcmsSubst = vlrIcmsSubst;
	}


	@Column(name="vlr_ii", precision=10, scale=2)
	public BigDecimal getVlrIi() {
		return this.vlrIi;
	}

	public void setVlrIi(BigDecimal vlrIi) {
		this.vlrIi = vlrIi;
	}


	@Column(name="VLR_IPI", precision=10, scale=2)
	public BigDecimal getVlrIpi() {
		return this.vlrIpi;
	}

	public void setVlrIpi(BigDecimal vlrIpi) {
		this.vlrIpi = vlrIpi;
	}


	@Column(name="VLR_PRODUTOS", precision=10, scale=2)
	public BigDecimal getVlrProdutos() {
		return this.vlrProdutos;
	}

	public void setVlrProdutos(BigDecimal vlrProdutos) {
		this.vlrProdutos = vlrProdutos;
	}


	@Column(name="VLR_SEGURO", precision=10, scale=2)
	public BigDecimal getVlrSeguro() {
		return this.vlrSeguro;
	}

	public void setVlrSeguro(BigDecimal vlrSeguro) {
		this.vlrSeguro = vlrSeguro;
	}


	@Column(name="VLR_TOTAL", precision=10, scale=2)
	public BigDecimal getVlrTotal() {
		return this.vlrTotal;
	}

	public void setVlrTotal(BigDecimal vlrTotal) {
		this.vlrTotal = vlrTotal;
	}


	//bi-directional many-to-one association to CartaCorrecao
	@OneToMany(mappedBy="nfiscai")
	public List<CartaCorrecao> getCartaCorrecaos() {
		return this.cartaCorrecaos;
	}

	public void setCartaCorrecaos(List<CartaCorrecao> cartaCorrecaos) {
		this.cartaCorrecaos = cartaCorrecaos;
	}
	

	//bi-directional many-to-one association to Duplicata
	@OneToMany(mappedBy="nfiscai")
	public List<Duplicata> getDuplicatas() {
		return this.duplicatas;
	}

	public void setDuplicatas(List<Duplicata> duplicatas) {
		this.duplicatas = duplicatas;
	}
	

	//bi-directional many-to-one association to Pedido
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="PEDIDO_SQ")
	public Pedido getPedido() {
		return this.pedido;
	}

	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}
	

	//bi-directional many-to-one association to Cliente
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="CLIENTE_SQ", nullable=false)
	public Cliente getCliente() {
		return this.cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	

	//bi-directional many-to-one association to CondPagto
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="COND_PAGTO_SQ", nullable=false)
	public CondPagto getCondPagto() {
		return this.condPagto;
	}

	public void setCondPagto(CondPagto condPagto) {
		this.condPagto = condPagto;
	}
	

	//bi-directional many-to-one association to Linha
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="linha_sq")
	public Linha getLinha() {
		return this.linha;
	}

	public void setLinha(Linha linha) {
		this.linha = linha;
	}
	

	//bi-directional many-to-one association to Natureza
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="NATUREZA_SQ", nullable=false)
	public Natureza getNatureza1() {
		return this.natureza1;
	}

	public void setNatureza1(Natureza natureza1) {
		this.natureza1 = natureza1;
	}
	

	//bi-directional many-to-one association to Natureza
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="NATUREZA_RET_DEM")
	public Natureza getNatureza2() {
		return this.natureza2;
	}

	public void setNatureza2(Natureza natureza2) {
		this.natureza2 = natureza2;
	}
	

	//bi-directional many-to-one association to Transportadora
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="TRANSPORTADORA_SQ", nullable=false)
	public Transportadora getTransportadora() {
		return this.transportadora;
	}

	public void setTransportadora(Transportadora transportadora) {
		this.transportadora = transportadora;
	}
	

	//bi-directional many-to-one association to Vendedore
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="VENDEDOR_SQ", nullable=false)
	public Vendedor getVendedore() {
		return this.vendedore;
	}

	public void setVendedore(Vendedor vendedore) {
		this.vendedore = vendedore;
	}
	

	//bi-directional many-to-one association to NfiscaisIten
	@OneToMany(mappedBy="nfiscai")
	public List<NfiscalItem> getNfiscaisItens() {
		return this.nfiscaisItens;
	}

	public void setNfiscaisItens(List<NfiscalItem> nfiscaisItens) {
		this.nfiscaisItens = nfiscaisItens;
	}
	
}