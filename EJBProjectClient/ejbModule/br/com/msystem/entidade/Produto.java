package br.com.msystem.entidade;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;


/**
 * The persistent class for the produtos database table.
 * 
 */
@Entity
@Table(name="produtos")
public class Produto implements Serializable {
	private static final long serialVersionUID = 1L;
	private int produtoSq;
	private BigDecimal aliqIcmsSubst;
	private BigDecimal alturaBruta;
	private BigDecimal alturaLiquida;
	private String codigoDun;
	private String codigoProduto;
	private String codigoUpc;
	private int controleNumeroSerie;
	private String descricaoCompleta;
	private byte[] descricaoCompletaBlob;
	private String descricaoProduto;
	private int grupoBalanco;
	private BigDecimal larguraBruta;
	private BigDecimal larguraLiquida;
	private String marcaProduto;
	private String mascaraNumeroSerie;
	private int origemMercadoria;
	private BigDecimal pesoBruto;
	private BigDecimal pesoLiquido;
	private BigDecimal precoUnit;
	private String produtoAtivo;
	private BigDecimal profundidadeBruta;
	private BigDecimal profundidadeLiquida;
	private int qtdeEstoque1;
	private int qtdeEstoque10;
	private int qtdeEstoque2;
	private int qtdeEstoque3;
	private int qtdeEstoque4;
	private int qtdeEstoque5;
	private int qtdeEstoque6;
	private int qtdeEstoque7;
	private int qtdeEstoque8;
	private int qtdeEstoque9;
	private int tipoProduto;
	private String unProduto;
	private List<AssistenciaEquip> assistenciasEquips;
	private List<AssistenciaItem> assistenciasItens;
	private List<BalancoContagemProduto> balancoContagemProdutos;
	private List<ConteinerItem> conteinerItens;
	private List<Kardex> kardexs;
	private List<NfEntradaItem> nfEntradasItens;
	private List<NfiscalItem> nfiscaisItens;
	private List<PedidoItem> pedidosItens;
	private List<ProdutoImagem> produtoImagems;
	private List<ProdutoNumeroSerie> produtoNumeroSeries;
	private Linha linha;
	private Modelo modelo;
	private Nbm nbm;
	private Produto produto;
	private List<Produto> produtos;
	private List<ProdutoFaltante> produtosFaltantes;
	private List<RmaItem> rmaItems;

    public Produto() {
    }

    public Produto(String codigoProduto) {
    	this.codigoProduto = codigoProduto;
    }

	@Id
	@Column(name="PRODUTO_SQ", unique=true, nullable=false)
	public int getProdutoSq() {
		return this.produtoSq;
	}

	public void setProdutoSq(int produtoSq) {
		this.produtoSq = produtoSq;
	}


	@Column(name="aliq_icms_subst", precision=10, scale=2)
	public BigDecimal getAliqIcmsSubst() {
		return this.aliqIcmsSubst;
	}

	public void setAliqIcmsSubst(BigDecimal aliqIcmsSubst) {
		this.aliqIcmsSubst = aliqIcmsSubst;
	}


	@Column(name="altura_bruta", precision=10, scale=2)
	public BigDecimal getAlturaBruta() {
		return this.alturaBruta;
	}

	public void setAlturaBruta(BigDecimal alturaBruta) {
		this.alturaBruta = alturaBruta;
	}


	@Column(name="altura_liquida", precision=10, scale=2)
	public BigDecimal getAlturaLiquida() {
		return this.alturaLiquida;
	}

	public void setAlturaLiquida(BigDecimal alturaLiquida) {
		this.alturaLiquida = alturaLiquida;
	}


	@Column(name="codigo_dun", length=14)
	public String getCodigoDun() {
		return this.codigoDun;
	}

	public void setCodigoDun(String codigoDun) {
		this.codigoDun = codigoDun;
	}


	@Column(name="CODIGO_PRODUTO", nullable=false, length=20)
	public String getCodigoProduto() {
		return this.codigoProduto;
	}

	public void setCodigoProduto(String codigoProduto) {
		this.codigoProduto = codigoProduto;
	}


	@Column(name="codigo_upc", length=12)
	public String getCodigoUpc() {
		return this.codigoUpc;
	}

	public void setCodigoUpc(String codigoUpc) {
		this.codigoUpc = codigoUpc;
	}


	@Column(name="controle_numero_serie")
	public int getControleNumeroSerie() {
		return this.controleNumeroSerie;
	}

	public void setControleNumeroSerie(int controleNumeroSerie) {
		this.controleNumeroSerie = controleNumeroSerie;
	}


	@Column(name="descricao_completa", length=1000)
	public String getDescricaoCompleta() {
		return this.descricaoCompleta;
	}

	public void setDescricaoCompleta(String descricaoCompleta) {
		this.descricaoCompleta = descricaoCompleta;
	}


    @Lob()
	@Column(name="descricao_completa_blob")
	public byte[] getDescricaoCompletaBlob() {
		return this.descricaoCompletaBlob;
	}

	public void setDescricaoCompletaBlob(byte[] descricaoCompletaBlob) {
		this.descricaoCompletaBlob = descricaoCompletaBlob;
	}


	@Column(name="DESCRICAO_PRODUTO", nullable=false, length=50)
	public String getDescricaoProduto() {
		return this.descricaoProduto;
	}

	public void setDescricaoProduto(String descricaoProduto) {
		this.descricaoProduto = descricaoProduto;
	}


	@Column(name="grupo_balanco", nullable=false)
	public int getGrupoBalanco() {
		return this.grupoBalanco;
	}

	public void setGrupoBalanco(int grupoBalanco) {
		this.grupoBalanco = grupoBalanco;
	}


	@Column(name="largura_bruta", precision=10, scale=2)
	public BigDecimal getLarguraBruta() {
		return this.larguraBruta;
	}

	public void setLarguraBruta(BigDecimal larguraBruta) {
		this.larguraBruta = larguraBruta;
	}


	@Column(name="largura_liquida", precision=10, scale=2)
	public BigDecimal getLarguraLiquida() {
		return this.larguraLiquida;
	}

	public void setLarguraLiquida(BigDecimal larguraLiquida) {
		this.larguraLiquida = larguraLiquida;
	}


	@Column(name="MARCA_PRODUTO", length=20)
	public String getMarcaProduto() {
		return this.marcaProduto;
	}

	public void setMarcaProduto(String marcaProduto) {
		this.marcaProduto = marcaProduto;
	}


	@Column(name="mascara_numero_serie", length=50)
	public String getMascaraNumeroSerie() {
		return this.mascaraNumeroSerie;
	}

	public void setMascaraNumeroSerie(String mascaraNumeroSerie) {
		this.mascaraNumeroSerie = mascaraNumeroSerie;
	}


	@Column(name="origem_mercadoria")
	public int getOrigemMercadoria() {
		return this.origemMercadoria;
	}

	public void setOrigemMercadoria(int origemMercadoria) {
		this.origemMercadoria = origemMercadoria;
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


	@Column(name="produto_ativo", nullable=false, length=1)
	public String getProdutoAtivo() {
		return this.produtoAtivo;
	}

	public void setProdutoAtivo(String produtoAtivo) {
		this.produtoAtivo = produtoAtivo;
	}


	@Column(name="profundidade_bruta", precision=10, scale=2)
	public BigDecimal getProfundidadeBruta() {
		return this.profundidadeBruta;
	}

	public void setProfundidadeBruta(BigDecimal profundidadeBruta) {
		this.profundidadeBruta = profundidadeBruta;
	}


	@Column(name="profundidade_liquida", precision=10, scale=2)
	public BigDecimal getProfundidadeLiquida() {
		return this.profundidadeLiquida;
	}

	public void setProfundidadeLiquida(BigDecimal profundidadeLiquida) {
		this.profundidadeLiquida = profundidadeLiquida;
	}


	@Column(name="qtde_estoque1")
	public int getQtdeEstoque1() {
		return this.qtdeEstoque1;
	}

	public void setQtdeEstoque1(int qtdeEstoque1) {
		this.qtdeEstoque1 = qtdeEstoque1;
	}


	@Column(name="qtde_estoque10")
	public int getQtdeEstoque10() {
		return this.qtdeEstoque10;
	}

	public void setQtdeEstoque10(int qtdeEstoque10) {
		this.qtdeEstoque10 = qtdeEstoque10;
	}


	@Column(name="qtde_estoque2")
	public int getQtdeEstoque2() {
		return this.qtdeEstoque2;
	}

	public void setQtdeEstoque2(int qtdeEstoque2) {
		this.qtdeEstoque2 = qtdeEstoque2;
	}


	@Column(name="qtde_estoque3")
	public int getQtdeEstoque3() {
		return this.qtdeEstoque3;
	}

	public void setQtdeEstoque3(int qtdeEstoque3) {
		this.qtdeEstoque3 = qtdeEstoque3;
	}


	@Column(name="qtde_estoque4")
	public int getQtdeEstoque4() {
		return this.qtdeEstoque4;
	}

	public void setQtdeEstoque4(int qtdeEstoque4) {
		this.qtdeEstoque4 = qtdeEstoque4;
	}


	@Column(name="qtde_estoque5")
	public int getQtdeEstoque5() {
		return this.qtdeEstoque5;
	}

	public void setQtdeEstoque5(int qtdeEstoque5) {
		this.qtdeEstoque5 = qtdeEstoque5;
	}


	@Column(name="qtde_estoque6")
	public int getQtdeEstoque6() {
		return this.qtdeEstoque6;
	}

	public void setQtdeEstoque6(int qtdeEstoque6) {
		this.qtdeEstoque6 = qtdeEstoque6;
	}


	@Column(name="qtde_estoque7")
	public int getQtdeEstoque7() {
		return this.qtdeEstoque7;
	}

	public void setQtdeEstoque7(int qtdeEstoque7) {
		this.qtdeEstoque7 = qtdeEstoque7;
	}


	@Column(name="qtde_estoque8")
	public int getQtdeEstoque8() {
		return this.qtdeEstoque8;
	}

	public void setQtdeEstoque8(int qtdeEstoque8) {
		this.qtdeEstoque8 = qtdeEstoque8;
	}


	@Column(name="qtde_estoque9")
	public int getQtdeEstoque9() {
		return this.qtdeEstoque9;
	}

	public void setQtdeEstoque9(int qtdeEstoque9) {
		this.qtdeEstoque9 = qtdeEstoque9;
	}


	@Column(name="TIPO_PRODUTO")
	public int getTipoProduto() {
		return this.tipoProduto;
	}

	public void setTipoProduto(int tipoProduto) {
		this.tipoProduto = tipoProduto;
	}


	@Column(name="UN_PRODUTO", length=2)
	public String getUnProduto() {
		return this.unProduto;
	}

	public void setUnProduto(String unProduto) {
		this.unProduto = unProduto;
	}


	//bi-directional many-to-one association to AssistenciasEquip
	@OneToMany(mappedBy="produto")
	public List<AssistenciaEquip> getAssistenciasEquips() {
		return this.assistenciasEquips;
	}

	public void setAssistenciasEquips(List<AssistenciaEquip> assistenciasEquips) {
		this.assistenciasEquips = assistenciasEquips;
	}
	

	//bi-directional many-to-one association to AssistenciasIten
	@OneToMany(mappedBy="produto")
	public List<AssistenciaItem> getAssistenciasItens() {
		return this.assistenciasItens;
	}

	public void setAssistenciasItens(List<AssistenciaItem> assistenciasItens) {
		this.assistenciasItens = assistenciasItens;
	}
	

	//bi-directional many-to-one association to BalancoContagemProduto
	@OneToMany(mappedBy="produto")
	public List<BalancoContagemProduto> getBalancoContagemProdutos() {
		return this.balancoContagemProdutos;
	}

	public void setBalancoContagemProdutos(List<BalancoContagemProduto> balancoContagemProdutos) {
		this.balancoContagemProdutos = balancoContagemProdutos;
	}
	

	//bi-directional many-to-one association to ConteinerIten
	@OneToMany(mappedBy="produto")
	public List<ConteinerItem> getConteinerItens() {
		return this.conteinerItens;
	}

	public void setConteinerItens(List<ConteinerItem> conteinerItens) {
		this.conteinerItens = conteinerItens;
	}
	

	//bi-directional many-to-one association to Kardex
	@OneToMany(mappedBy="produto")
	public List<Kardex> getKardexs() {
		return this.kardexs;
	}

	public void setKardexs(List<Kardex> kardexs) {
		this.kardexs = kardexs;
	}
	

	//bi-directional many-to-one association to NfEntradasIten
	@OneToMany(mappedBy="produto")
	public List<NfEntradaItem> getNfEntradasItens() {
		return this.nfEntradasItens;
	}

	public void setNfEntradasItens(List<NfEntradaItem> nfEntradasItens) {
		this.nfEntradasItens = nfEntradasItens;
	}
	

	//bi-directional many-to-one association to NfiscaisIten
	@OneToMany(mappedBy="produto")
	public List<NfiscalItem> getNfiscaisItens() {
		return this.nfiscaisItens;
	}

	public void setNfiscaisItens(List<NfiscalItem> nfiscaisItens) {
		this.nfiscaisItens = nfiscaisItens;
	}
	

	//bi-directional many-to-one association to PedidosIten
	@OneToMany(mappedBy="produto")
	public List<PedidoItem> getPedidosItens() {
		return this.pedidosItens;
	}

	public void setPedidosItens(List<PedidoItem> pedidosItens) {
		this.pedidosItens = pedidosItens;
	}
	

	//bi-directional many-to-one association to ProdutoImagem
	@OneToMany(mappedBy="produto")
	public List<ProdutoImagem> getProdutoImagems() {
		return this.produtoImagems;
	}

	public void setProdutoImagems(List<ProdutoImagem> produtoImagems) {
		this.produtoImagems = produtoImagems;
	}
	

	//bi-directional many-to-one association to ProdutoNumeroSerie
	@OneToMany(mappedBy="produto")
	public List<ProdutoNumeroSerie> getProdutoNumeroSeries() {
		return this.produtoNumeroSeries;
	}

	public void setProdutoNumeroSeries(List<ProdutoNumeroSerie> produtoNumeroSeries) {
		this.produtoNumeroSeries = produtoNumeroSeries;
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
	

	//bi-directional many-to-one association to Modelo
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="MODELO_SQ", nullable=false)
	public Modelo getModelo() {
		return this.modelo;
	}

	public void setModelo(Modelo modelo) {
		this.modelo = modelo;
	}
	

	//bi-directional many-to-one association to Nbm
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="NBM_SQ", nullable=false)
	public Nbm getNbm() {
		return this.nbm;
	}

	public void setNbm(Nbm nbm) {
		this.nbm = nbm;
	}
	

	//bi-directional many-to-one association to Produto
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="produto_sq_retorno")
	public Produto getProduto() {
		return this.produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	

	//bi-directional many-to-one association to Produto
	@OneToMany(mappedBy="produto")
	public List<Produto> getProdutos() {
		return this.produtos;
	}

	public void setProdutos(List<Produto> produtos) {
		this.produtos = produtos;
	}
	

	//bi-directional many-to-one association to ProdutosFaltante
	@OneToMany(mappedBy="produto")
	public List<ProdutoFaltante> getProdutosFaltantes() {
		return this.produtosFaltantes;
	}

	public void setProdutosFaltantes(List<ProdutoFaltante> produtosFaltantes) {
		this.produtosFaltantes = produtosFaltantes;
	}
	

	//bi-directional many-to-one association to RmaItem
	@OneToMany(mappedBy="produto")
	public List<RmaItem> getRmaItems() {
		return this.rmaItems;
	}

	public void setRmaItems(List<RmaItem> rmaItems) {
		this.rmaItems = rmaItems;
	}
	
}