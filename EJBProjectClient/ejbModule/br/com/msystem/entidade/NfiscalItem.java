package br.com.msystem.entidade;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the nfiscais_itens database table.
 * 
 */
@Entity
@Table(name="nfiscais_itens")
public class NfiscalItem implements Serializable {
	private static final long serialVersionUID = 1L;
	private int nfiscalItemSq;
	private BigDecimal aliqIcmsItem;
	private BigDecimal aliqIpiItem;
	private BigDecimal baseIcmsItem;
	private BigDecimal baseIcmsSubstItem;
	private BigDecimal baseIiItem;
	private String classFiscal;
	private String codigoExportador;
	private Date dataDesemb;
	private Date dataDi;
	private int item;
	private String localDesemb;
	private String nrSerieItem;
	private String numeroDi;
	private int numeroEstoque;
	private int origemMercadoria;
	private BigDecimal pctDesc;
	private BigDecimal pctJuros;
	private BigDecimal pesoBruto;
	private BigDecimal pesoLiquido;
	private int qtdeItem;
	private int qtdeItem1Old;
	private int qtdeItem10Old;
	private int qtdeItem2Old;
	private int qtdeItem3Old;
	private int qtdeItem4Old;
	private int qtdeItem5Old;
	private int qtdeItem6Old;
	private int qtdeItem7Old;
	private int qtdeItem8Old;
	private int qtdeItem9Old;
	private int stribut;
	private String ufDesemb;
	private BigDecimal vlrDesc;
	private BigDecimal vlrDespAcessItem;
	private BigDecimal vlrDespAduItem;
	private BigDecimal vlrFreteItem;
	private BigDecimal vlrIcmsItem;
	private BigDecimal vlrIcmsSubstItem;
	private BigDecimal vlrIiItem;
	private BigDecimal vlrIofItem;
	private BigDecimal vlrIpiItem;
	private BigDecimal vlrJuros;
	private BigDecimal vlrSeguroItem;
	private BigDecimal vlrTotalItem;
	private BigDecimal vlrUnitItem;
	private List<Contato> contatos;
	private Nfiscal nfiscai;
	private Produto produto;
	private List<NfiscalItemAdicao> nfiscaisItensAdicaos;
	private List<NfiscalItemSerie> nfiscaisItensSeries;

    public NfiscalItem() {
    }


	@Id
	@Column(name="NFISCAL_ITEM_SQ", unique=true, nullable=false)
	public int getNfiscalItemSq() {
		return this.nfiscalItemSq;
	}

	public void setNfiscalItemSq(int nfiscalItemSq) {
		this.nfiscalItemSq = nfiscalItemSq;
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


	@Column(name="base_icms_item", precision=10, scale=2)
	public BigDecimal getBaseIcmsItem() {
		return this.baseIcmsItem;
	}

	public void setBaseIcmsItem(BigDecimal baseIcmsItem) {
		this.baseIcmsItem = baseIcmsItem;
	}


	@Column(name="base_icms_subst_item", precision=10, scale=2)
	public BigDecimal getBaseIcmsSubstItem() {
		return this.baseIcmsSubstItem;
	}

	public void setBaseIcmsSubstItem(BigDecimal baseIcmsSubstItem) {
		this.baseIcmsSubstItem = baseIcmsSubstItem;
	}


	@Column(name="base_ii_item", precision=10, scale=2)
	public BigDecimal getBaseIiItem() {
		return this.baseIiItem;
	}

	public void setBaseIiItem(BigDecimal baseIiItem) {
		this.baseIiItem = baseIiItem;
	}


	@Column(name="CLASS_FISCAL", length=1)
	public String getClassFiscal() {
		return this.classFiscal;
	}

	public void setClassFiscal(String classFiscal) {
		this.classFiscal = classFiscal;
	}


	@Column(name="codigo_exportador", length=60)
	public String getCodigoExportador() {
		return this.codigoExportador;
	}

	public void setCodigoExportador(String codigoExportador) {
		this.codigoExportador = codigoExportador;
	}


    @Temporal( TemporalType.DATE)
	@Column(name="data_desemb")
	public Date getDataDesemb() {
		return this.dataDesemb;
	}

	public void setDataDesemb(Date dataDesemb) {
		this.dataDesemb = dataDesemb;
	}


    @Temporal( TemporalType.DATE)
	@Column(name="data_di")
	public Date getDataDi() {
		return this.dataDi;
	}

	public void setDataDi(Date dataDi) {
		this.dataDi = dataDi;
	}


	@Column(nullable=false)
	public int getItem() {
		return this.item;
	}

	public void setItem(int item) {
		this.item = item;
	}


	@Column(name="local_desemb", length=60)
	public String getLocalDesemb() {
		return this.localDesemb;
	}

	public void setLocalDesemb(String localDesemb) {
		this.localDesemb = localDesemb;
	}


    @Lob()
	@Column(name="NR_SERIE_ITEM")
	public String getNrSerieItem() {
		return this.nrSerieItem;
	}

	public void setNrSerieItem(String nrSerieItem) {
		this.nrSerieItem = nrSerieItem;
	}


	@Column(name="numero_di", length=10)
	public String getNumeroDi() {
		return this.numeroDi;
	}

	public void setNumeroDi(String numeroDi) {
		this.numeroDi = numeroDi;
	}


	@Column(name="numero_estoque")
	public int getNumeroEstoque() {
		return this.numeroEstoque;
	}

	public void setNumeroEstoque(int numeroEstoque) {
		this.numeroEstoque = numeroEstoque;
	}


	@Column(name="origem_mercadoria")
	public int getOrigemMercadoria() {
		return this.origemMercadoria;
	}

	public void setOrigemMercadoria(int origemMercadoria) {
		this.origemMercadoria = origemMercadoria;
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


	@Column(name="qtde_item")
	public int getQtdeItem() {
		return this.qtdeItem;
	}

	public void setQtdeItem(int qtdeItem) {
		this.qtdeItem = qtdeItem;
	}


	@Column(name="qtde_item1_old")
	public int getQtdeItem1Old() {
		return this.qtdeItem1Old;
	}

	public void setQtdeItem1Old(int qtdeItem1Old) {
		this.qtdeItem1Old = qtdeItem1Old;
	}


	@Column(name="qtde_item10_old")
	public int getQtdeItem10Old() {
		return this.qtdeItem10Old;
	}

	public void setQtdeItem10Old(int qtdeItem10Old) {
		this.qtdeItem10Old = qtdeItem10Old;
	}


	@Column(name="qtde_item2_old")
	public int getQtdeItem2Old() {
		return this.qtdeItem2Old;
	}

	public void setQtdeItem2Old(int qtdeItem2Old) {
		this.qtdeItem2Old = qtdeItem2Old;
	}


	@Column(name="qtde_item3_old")
	public int getQtdeItem3Old() {
		return this.qtdeItem3Old;
	}

	public void setQtdeItem3Old(int qtdeItem3Old) {
		this.qtdeItem3Old = qtdeItem3Old;
	}


	@Column(name="qtde_item4_old")
	public int getQtdeItem4Old() {
		return this.qtdeItem4Old;
	}

	public void setQtdeItem4Old(int qtdeItem4Old) {
		this.qtdeItem4Old = qtdeItem4Old;
	}


	@Column(name="qtde_item5_old")
	public int getQtdeItem5Old() {
		return this.qtdeItem5Old;
	}

	public void setQtdeItem5Old(int qtdeItem5Old) {
		this.qtdeItem5Old = qtdeItem5Old;
	}


	@Column(name="qtde_item6_old")
	public int getQtdeItem6Old() {
		return this.qtdeItem6Old;
	}

	public void setQtdeItem6Old(int qtdeItem6Old) {
		this.qtdeItem6Old = qtdeItem6Old;
	}


	@Column(name="qtde_item7_old")
	public int getQtdeItem7Old() {
		return this.qtdeItem7Old;
	}

	public void setQtdeItem7Old(int qtdeItem7Old) {
		this.qtdeItem7Old = qtdeItem7Old;
	}


	@Column(name="qtde_item8_old")
	public int getQtdeItem8Old() {
		return this.qtdeItem8Old;
	}

	public void setQtdeItem8Old(int qtdeItem8Old) {
		this.qtdeItem8Old = qtdeItem8Old;
	}


	@Column(name="qtde_item9_old")
	public int getQtdeItem9Old() {
		return this.qtdeItem9Old;
	}

	public void setQtdeItem9Old(int qtdeItem9Old) {
		this.qtdeItem9Old = qtdeItem9Old;
	}


	public int getStribut() {
		return this.stribut;
	}

	public void setStribut(int stribut) {
		this.stribut = stribut;
	}


	@Column(name="uf_desemb", length=2)
	public String getUfDesemb() {
		return this.ufDesemb;
	}

	public void setUfDesemb(String ufDesemb) {
		this.ufDesemb = ufDesemb;
	}


	@Column(name="VLR_DESC", precision=10, scale=2)
	public BigDecimal getVlrDesc() {
		return this.vlrDesc;
	}

	public void setVlrDesc(BigDecimal vlrDesc) {
		this.vlrDesc = vlrDesc;
	}


	@Column(name="vlr_desp_acess_item", precision=10, scale=2)
	public BigDecimal getVlrDespAcessItem() {
		return this.vlrDespAcessItem;
	}

	public void setVlrDespAcessItem(BigDecimal vlrDespAcessItem) {
		this.vlrDespAcessItem = vlrDespAcessItem;
	}


	@Column(name="vlr_desp_adu_item", precision=10, scale=2)
	public BigDecimal getVlrDespAduItem() {
		return this.vlrDespAduItem;
	}

	public void setVlrDespAduItem(BigDecimal vlrDespAduItem) {
		this.vlrDespAduItem = vlrDespAduItem;
	}


	@Column(name="vlr_frete_item", precision=10, scale=2)
	public BigDecimal getVlrFreteItem() {
		return this.vlrFreteItem;
	}

	public void setVlrFreteItem(BigDecimal vlrFreteItem) {
		this.vlrFreteItem = vlrFreteItem;
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


	@Column(name="vlr_ii_item", precision=10, scale=2)
	public BigDecimal getVlrIiItem() {
		return this.vlrIiItem;
	}

	public void setVlrIiItem(BigDecimal vlrIiItem) {
		this.vlrIiItem = vlrIiItem;
	}


	@Column(name="vlr_iof_item", precision=10, scale=2)
	public BigDecimal getVlrIofItem() {
		return this.vlrIofItem;
	}

	public void setVlrIofItem(BigDecimal vlrIofItem) {
		this.vlrIofItem = vlrIofItem;
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


	@Column(name="vlr_seguro_item", precision=10, scale=2)
	public BigDecimal getVlrSeguroItem() {
		return this.vlrSeguroItem;
	}

	public void setVlrSeguroItem(BigDecimal vlrSeguroItem) {
		this.vlrSeguroItem = vlrSeguroItem;
	}


	@Column(name="VLR_TOTAL_ITEM", precision=10, scale=2)
	public BigDecimal getVlrTotalItem() {
		return this.vlrTotalItem;
	}

	public void setVlrTotalItem(BigDecimal vlrTotalItem) {
		this.vlrTotalItem = vlrTotalItem;
	}


	@Column(name="VLR_UNIT_ITEM", precision=10, scale=2)
	public BigDecimal getVlrUnitItem() {
		return this.vlrUnitItem;
	}

	public void setVlrUnitItem(BigDecimal vlrUnitItem) {
		this.vlrUnitItem = vlrUnitItem;
	}


	//bi-directional many-to-one association to Contato
	@OneToMany(mappedBy="nfiscaisIten")
	public List<Contato> getContatos() {
		return this.contatos;
	}

	public void setContatos(List<Contato> contatos) {
		this.contatos = contatos;
	}
	

	//bi-directional many-to-one association to Nfiscai
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="NFISCAL_SQ", nullable=false)
	public Nfiscal getNfiscai() {
		return this.nfiscai;
	}

	public void setNfiscai(Nfiscal nfiscai) {
		this.nfiscai = nfiscai;
	}
	

	//bi-directional many-to-one association to Produto
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="PRODUTO_SQ")
	public Produto getProduto() {
		return this.produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	

	//bi-directional many-to-one association to NfiscaisItensAdicao
	@OneToMany(mappedBy="nfiscaisIten")
	public List<NfiscalItemAdicao> getNfiscaisItensAdicaos() {
		return this.nfiscaisItensAdicaos;
	}

	public void setNfiscaisItensAdicaos(List<NfiscalItemAdicao> nfiscaisItensAdicaos) {
		this.nfiscaisItensAdicaos = nfiscaisItensAdicaos;
	}
	

	//bi-directional many-to-one association to NfiscaisItensSerie
	@OneToMany(mappedBy="nfiscaisIten")
	public List<NfiscalItemSerie> getNfiscaisItensSeries() {
		return this.nfiscaisItensSeries;
	}

	public void setNfiscaisItensSeries(List<NfiscalItemSerie> nfiscaisItensSeries) {
		this.nfiscaisItensSeries = nfiscaisItensSeries;
	}
	
}