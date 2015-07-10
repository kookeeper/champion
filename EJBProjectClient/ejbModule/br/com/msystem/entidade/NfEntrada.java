package br.com.msystem.entidade;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the nf_entradas database table.
 * 
 */
@Entity
@Table(name="nf_entradas")
public class NfEntrada implements Serializable {
	private static final long serialVersionUID = 1L;
	private int nfEntradaSq;
	private BigDecimal baseIcms;
	private BigDecimal baseIcmsSubst;
	private Date dtEntrada;
	private Timestamp dtemissaoNfEnt;
	private int numeroNfEnt;
	private byte[] observacao;
	private String transferida;
	private BigDecimal vlrDespAcess;
	private BigDecimal vlrFrete;
	private BigDecimal vlrIcms;
	private BigDecimal vlrIcmsSubst;
	private BigDecimal vlrIpi;
	private BigDecimal vlrProdutos;
	private BigDecimal vlrSeguro;
	private BigDecimal vlrTotal;
	private Cliente cliente;
	private Natureza natureza;
	private List<NfEntradaItem> nfEntradasItens;
	private List<ProdutoFaltante> produtosFaltantes;

    public NfEntrada() {
    }


	@Id
	@Column(name="NF_ENTRADA_SQ", unique=true, nullable=false)
	public int getNfEntradaSq() {
		return this.nfEntradaSq;
	}

	public void setNfEntradaSq(int nfEntradaSq) {
		this.nfEntradaSq = nfEntradaSq;
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


    @Temporal( TemporalType.TIMESTAMP)
	@Column(name="DT_ENTRADA")
	public Date getDtEntrada() {
		return this.dtEntrada;
	}

	public void setDtEntrada(Date dtEntrada) {
		this.dtEntrada = dtEntrada;
	}


	@Column(name="DTEMISSAO_NF_ENT", nullable=false)
	public Timestamp getDtemissaoNfEnt() {
		return this.dtemissaoNfEnt;
	}

	public void setDtemissaoNfEnt(Timestamp dtemissaoNfEnt) {
		this.dtemissaoNfEnt = dtemissaoNfEnt;
	}


	@Column(name="NUMERO_NF_ENT", nullable=false)
	public int getNumeroNfEnt() {
		return this.numeroNfEnt;
	}

	public void setNumeroNfEnt(int numeroNfEnt) {
		this.numeroNfEnt = numeroNfEnt;
	}


    @Lob()
	public byte[] getObservacao() {
		return this.observacao;
	}

	public void setObservacao(byte[] observacao) {
		this.observacao = observacao;
	}


	@Column(length=1)
	public String getTransferida() {
		return this.transferida;
	}

	public void setTransferida(String transferida) {
		this.transferida = transferida;
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


	//bi-directional many-to-one association to Cliente
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="CLIENTE_SQ", nullable=false)
	public Cliente getCliente() {
		return this.cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	

	//bi-directional many-to-one association to Natureza
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="NATUREZA_SQ")
	public Natureza getNatureza() {
		return this.natureza;
	}

	public void setNatureza(Natureza natureza) {
		this.natureza = natureza;
	}
	

	//bi-directional many-to-one association to NfEntradasIten
	@OneToMany(mappedBy="nfEntrada")
	public List<NfEntradaItem> getNfEntradasItens() {
		return this.nfEntradasItens;
	}

	public void setNfEntradasItens(List<NfEntradaItem> nfEntradasItens) {
		this.nfEntradasItens = nfEntradasItens;
	}
	

	//bi-directional many-to-one association to ProdutosFaltante
	@OneToMany(mappedBy="nfEntrada")
	public List<ProdutoFaltante> getProdutosFaltantes() {
		return this.produtosFaltantes;
	}

	public void setProdutosFaltantes(List<ProdutoFaltante> produtosFaltantes) {
		this.produtosFaltantes = produtosFaltantes;
	}
	
}