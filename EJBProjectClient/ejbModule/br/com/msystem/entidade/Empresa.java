package br.com.msystem.entidade;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.math.BigDecimal;
import java.util.List;


/**
 * The persistent class for the empresas database table.
 * 
 */
@Entity
@Table(name="empresas")
public class Empresa implements Serializable {
	private static final long serialVersionUID = 1L;
	private int empresaSq;
	private int aammClassificacao;
	private int acessos;
	private BigDecimal aliqCofins;
	private BigDecimal aliqIcmsPec1;
	private BigDecimal aliqIcmsProd1;
	private BigDecimal aliqIss;
	private BigDecimal aliqPis;
	private String altDataPedido;
	private String altDtemissaoNfiscal;
	private String altNrNfiscal;
	private String altNrPedido;
	private String baixaEstoquePedido;
	private String bancoImagens;
	private String codigoEmpresa;
	private int codigoRegimeTributario;
	private int codigoSituacaoOperacao;
	private String descricaoEstoque1;
	private String descricaoEstoque10;
	private String descricaoEstoque2;
	private String descricaoEstoque3;
	private String descricaoEstoque4;
	private String descricaoEstoque5;
	private String descricaoEstoque6;
	private String descricaoEstoque7;
	private String descricaoEstoque8;
	private String descricaoEstoque9;
	private int diasDemonstracao;
	private String estado;
	private String estoqueNegativo;
	private BigDecimal jurosReceber;
	private BigDecimal margemEsqNf;
	private BigDecimal margemSupNf;
	private String nomeEmpresa;
	private int numeroAssistencia;
	private int numeroNfiscal;
	private int numeroPedido;
	private int numeroRma;
	private String senha;
	private int stribut;
	private Timestamp ultimaClassificacao;
	private List<Balanco> balancos;
	private List<HistoricoAcesso> historicoAcessos;

    public Empresa() {
    }


	@Id
	@Column(name="EMPRESA_SQ", unique=true, nullable=false)
	public int getEmpresaSq() {
		return this.empresaSq;
	}

	public void setEmpresaSq(int empresaSq) {
		this.empresaSq = empresaSq;
	}


	@Column(name="AAMM_CLASSIFICACAO")
	public int getAammClassificacao() {
		return this.aammClassificacao;
	}

	public void setAammClassificacao(int aammClassificacao) {
		this.aammClassificacao = aammClassificacao;
	}


	public int getAcessos() {
		return this.acessos;
	}

	public void setAcessos(int acessos) {
		this.acessos = acessos;
	}


	@Column(name="ALIQ_COFINS", precision=10, scale=2)
	public BigDecimal getAliqCofins() {
		return this.aliqCofins;
	}

	public void setAliqCofins(BigDecimal aliqCofins) {
		this.aliqCofins = aliqCofins;
	}


	@Column(name="ALIQ_ICMS_PEC1", precision=10, scale=2)
	public BigDecimal getAliqIcmsPec1() {
		return this.aliqIcmsPec1;
	}

	public void setAliqIcmsPec1(BigDecimal aliqIcmsPec1) {
		this.aliqIcmsPec1 = aliqIcmsPec1;
	}


	@Column(name="ALIQ_ICMS_PROD1", precision=10, scale=2)
	public BigDecimal getAliqIcmsProd1() {
		return this.aliqIcmsProd1;
	}

	public void setAliqIcmsProd1(BigDecimal aliqIcmsProd1) {
		this.aliqIcmsProd1 = aliqIcmsProd1;
	}


	@Column(name="ALIQ_ISS", precision=10, scale=2)
	public BigDecimal getAliqIss() {
		return this.aliqIss;
	}

	public void setAliqIss(BigDecimal aliqIss) {
		this.aliqIss = aliqIss;
	}


	@Column(name="ALIQ_PIS", precision=10, scale=2)
	public BigDecimal getAliqPis() {
		return this.aliqPis;
	}

	public void setAliqPis(BigDecimal aliqPis) {
		this.aliqPis = aliqPis;
	}


	@Column(name="ALT_DATA_PEDIDO", length=1)
	public String getAltDataPedido() {
		return this.altDataPedido;
	}

	public void setAltDataPedido(String altDataPedido) {
		this.altDataPedido = altDataPedido;
	}


	@Column(name="ALT_DTEMISSAO_NFISCAL", length=1)
	public String getAltDtemissaoNfiscal() {
		return this.altDtemissaoNfiscal;
	}

	public void setAltDtemissaoNfiscal(String altDtemissaoNfiscal) {
		this.altDtemissaoNfiscal = altDtemissaoNfiscal;
	}


	@Column(name="ALT_NR_NFISCAL", length=1)
	public String getAltNrNfiscal() {
		return this.altNrNfiscal;
	}

	public void setAltNrNfiscal(String altNrNfiscal) {
		this.altNrNfiscal = altNrNfiscal;
	}


	@Column(name="ALT_NR_PEDIDO", length=1)
	public String getAltNrPedido() {
		return this.altNrPedido;
	}

	public void setAltNrPedido(String altNrPedido) {
		this.altNrPedido = altNrPedido;
	}


	@Column(name="baixa_estoque_pedido", length=1)
	public String getBaixaEstoquePedido() {
		return this.baixaEstoquePedido;
	}

	public void setBaixaEstoquePedido(String baixaEstoquePedido) {
		this.baixaEstoquePedido = baixaEstoquePedido;
	}


	@Column(name="BANCO_IMAGENS", length=50)
	public String getBancoImagens() {
		return this.bancoImagens;
	}

	public void setBancoImagens(String bancoImagens) {
		this.bancoImagens = bancoImagens;
	}


	@Column(name="CODIGO_EMPRESA", nullable=false, length=15)
	public String getCodigoEmpresa() {
		return this.codigoEmpresa;
	}

	public void setCodigoEmpresa(String codigoEmpresa) {
		this.codigoEmpresa = codigoEmpresa;
	}


	@Column(name="codigo_regime_tributario", nullable=false)
	public int getCodigoRegimeTributario() {
		return this.codigoRegimeTributario;
	}

	public void setCodigoRegimeTributario(int codigoRegimeTributario) {
		this.codigoRegimeTributario = codigoRegimeTributario;
	}


	@Column(name="codigo_situacao_operacao")
	public int getCodigoSituacaoOperacao() {
		return this.codigoSituacaoOperacao;
	}

	public void setCodigoSituacaoOperacao(int codigoSituacaoOperacao) {
		this.codigoSituacaoOperacao = codigoSituacaoOperacao;
	}


	@Column(name="descricao_estoque1", length=100)
	public String getDescricaoEstoque1() {
		return this.descricaoEstoque1;
	}

	public void setDescricaoEstoque1(String descricaoEstoque1) {
		this.descricaoEstoque1 = descricaoEstoque1;
	}


	@Column(name="descricao_estoque10", length=100)
	public String getDescricaoEstoque10() {
		return this.descricaoEstoque10;
	}

	public void setDescricaoEstoque10(String descricaoEstoque10) {
		this.descricaoEstoque10 = descricaoEstoque10;
	}


	@Column(name="descricao_estoque2", length=100)
	public String getDescricaoEstoque2() {
		return this.descricaoEstoque2;
	}

	public void setDescricaoEstoque2(String descricaoEstoque2) {
		this.descricaoEstoque2 = descricaoEstoque2;
	}


	@Column(name="descricao_estoque3", length=100)
	public String getDescricaoEstoque3() {
		return this.descricaoEstoque3;
	}

	public void setDescricaoEstoque3(String descricaoEstoque3) {
		this.descricaoEstoque3 = descricaoEstoque3;
	}


	@Column(name="descricao_estoque4", length=100)
	public String getDescricaoEstoque4() {
		return this.descricaoEstoque4;
	}

	public void setDescricaoEstoque4(String descricaoEstoque4) {
		this.descricaoEstoque4 = descricaoEstoque4;
	}


	@Column(name="descricao_estoque5", length=100)
	public String getDescricaoEstoque5() {
		return this.descricaoEstoque5;
	}

	public void setDescricaoEstoque5(String descricaoEstoque5) {
		this.descricaoEstoque5 = descricaoEstoque5;
	}


	@Column(name="descricao_estoque6", length=100)
	public String getDescricaoEstoque6() {
		return this.descricaoEstoque6;
	}

	public void setDescricaoEstoque6(String descricaoEstoque6) {
		this.descricaoEstoque6 = descricaoEstoque6;
	}


	@Column(name="descricao_estoque7", length=100)
	public String getDescricaoEstoque7() {
		return this.descricaoEstoque7;
	}

	public void setDescricaoEstoque7(String descricaoEstoque7) {
		this.descricaoEstoque7 = descricaoEstoque7;
	}


	@Column(name="descricao_estoque8", length=100)
	public String getDescricaoEstoque8() {
		return this.descricaoEstoque8;
	}

	public void setDescricaoEstoque8(String descricaoEstoque8) {
		this.descricaoEstoque8 = descricaoEstoque8;
	}


	@Column(name="descricao_estoque9", length=100)
	public String getDescricaoEstoque9() {
		return this.descricaoEstoque9;
	}

	public void setDescricaoEstoque9(String descricaoEstoque9) {
		this.descricaoEstoque9 = descricaoEstoque9;
	}


	@Column(name="DIAS_DEMONSTRACAO")
	public int getDiasDemonstracao() {
		return this.diasDemonstracao;
	}

	public void setDiasDemonstracao(int diasDemonstracao) {
		this.diasDemonstracao = diasDemonstracao;
	}


	@Column(length=2)
	public String getEstado() {
		return this.estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}


	@Column(name="estoque_negativo", length=1)
	public String getEstoqueNegativo() {
		return this.estoqueNegativo;
	}

	public void setEstoqueNegativo(String estoqueNegativo) {
		this.estoqueNegativo = estoqueNegativo;
	}


	@Column(name="juros_receber", precision=10, scale=2)
	public BigDecimal getJurosReceber() {
		return this.jurosReceber;
	}

	public void setJurosReceber(BigDecimal jurosReceber) {
		this.jurosReceber = jurosReceber;
	}


	@Column(name="MARGEM_ESQ_NF", precision=10, scale=2)
	public BigDecimal getMargemEsqNf() {
		return this.margemEsqNf;
	}

	public void setMargemEsqNf(BigDecimal margemEsqNf) {
		this.margemEsqNf = margemEsqNf;
	}


	@Column(name="MARGEM_SUP_NF", precision=10, scale=2)
	public BigDecimal getMargemSupNf() {
		return this.margemSupNf;
	}

	public void setMargemSupNf(BigDecimal margemSupNf) {
		this.margemSupNf = margemSupNf;
	}


	@Column(name="NOME_EMPRESA", nullable=false, length=50)
	public String getNomeEmpresa() {
		return this.nomeEmpresa;
	}

	public void setNomeEmpresa(String nomeEmpresa) {
		this.nomeEmpresa = nomeEmpresa;
	}


	@Column(name="NUMERO_ASSISTENCIA")
	public int getNumeroAssistencia() {
		return this.numeroAssistencia;
	}

	public void setNumeroAssistencia(int numeroAssistencia) {
		this.numeroAssistencia = numeroAssistencia;
	}


	@Column(name="NUMERO_NFISCAL")
	public int getNumeroNfiscal() {
		return this.numeroNfiscal;
	}

	public void setNumeroNfiscal(int numeroNfiscal) {
		this.numeroNfiscal = numeroNfiscal;
	}


	@Column(name="NUMERO_PEDIDO")
	public int getNumeroPedido() {
		return this.numeroPedido;
	}

	public void setNumeroPedido(int numeroPedido) {
		this.numeroPedido = numeroPedido;
	}


	@Column(name="numero_rma")
	public int getNumeroRma() {
		return this.numeroRma;
	}

	public void setNumeroRma(int numeroRma) {
		this.numeroRma = numeroRma;
	}


	@Column(length=14)
	public String getSenha() {
		return this.senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}


	public int getStribut() {
		return this.stribut;
	}

	public void setStribut(int stribut) {
		this.stribut = stribut;
	}


	@Column(name="ULTIMA_CLASSIFICACAO", nullable=false)
	public Timestamp getUltimaClassificacao() {
		return this.ultimaClassificacao;
	}

	public void setUltimaClassificacao(Timestamp ultimaClassificacao) {
		this.ultimaClassificacao = ultimaClassificacao;
	}


	//bi-directional many-to-one association to Balanco
	@OneToMany(mappedBy="empresa")
	public List<Balanco> getBalancos() {
		return this.balancos;
	}

	public void setBalancos(List<Balanco> balancos) {
		this.balancos = balancos;
	}
	

	//bi-directional many-to-one association to HistoricoAcesso
	@OneToMany(mappedBy="empresa")
	public List<HistoricoAcesso> getHistoricoAcessos() {
		return this.historicoAcessos;
	}

	public void setHistoricoAcessos(List<HistoricoAcesso> historicoAcessos) {
		this.historicoAcessos = historicoAcessos;
	}
	
}