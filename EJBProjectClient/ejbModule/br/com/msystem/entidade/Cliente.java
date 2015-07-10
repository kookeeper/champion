package br.com.msystem.entidade;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.math.BigDecimal;
import java.util.List;


/**
 * The persistent class for the clientes database table.
 * 
 */
@Entity
@Table(name="clientes")
public class Cliente implements Serializable {
	private static final long serialVersionUID = 1L;
	private int clienteSq;
	private String bairro;
	private String baseComissao;
	private String biro;
	private BigDecimal capitalAtual;
	private String cep;
	private String cidade;
	private String cnae;
	private String codigoCliente;
	private String complCelular;
	private String complEndereco;
	private String complFax;
	private String complFone1;
	private String complFone2;
	private String complFone3;
	private String contato;
	private Timestamp dataAlt;
	private Timestamp dataCadastro;
	private Timestamp dataFundacao;
	private String dddCelular;
	private String dddFax;
	private String dddFone1;
	private String dddFone2;
	private String dddFone3;
	private String eMail;
	private String endereco;
	private String estado;
	private BigDecimal faturamentoMensal;
	private String inscrEstadual;
	private String inscrMunicipal;
	private String nomeCliente;
	private String nomeFantasia;
	private String numero;
	private String numeroCelular;
	private String numeroFax;
	private String numeroFone1;
	private String numeroFone2;
	private String numeroFone3;
	private String obsComissaoDesconto;
	private String observacao;
	private String pais;
	private BigDecimal pctComissaoDesconto;
	private BigDecimal pctComissaoParceria;
	private BigDecimal pctComissaoPropria;
	private int ramoAtividadeSq;
	private String revenda;
	private String webSite;
	private List<Agenda> agendas;
	private List<Assistencia> assistencias;
	private Classificacao classificacao;
	private TipoCliente tipoCliente;
	private Transportadora transportadora;
	private Vendedor vendedore;
	private Usuario usuario;
	private List<ContaPagarAuto> contasPagarAutos;
	private List<Contato> contatos;
	private List<NfEntrada> nfEntradas;
	private List<NfServico> nfServicos;
	private List<Nfiscal> nfiscais;
	private List<Pedido> pedidos;
	private List<ProdutoFaltante> produtosFaltantes;

    public Cliente() {
    }


	@Id
	@Column(name="CLIENTE_SQ", unique=true, nullable=false)
	public int getClienteSq() {
		return this.clienteSq;
	}

	public void setClienteSq(int clienteSq) {
		this.clienteSq = clienteSq;
	}


	@Column(length=30)
	public String getBairro() {
		return this.bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}


	@Column(name="base_comissao", length=1)
	public String getBaseComissao() {
		return this.baseComissao;
	}

	public void setBaseComissao(String baseComissao) {
		this.baseComissao = baseComissao;
	}


	@Column(length=1)
	public String getBiro() {
		return this.biro;
	}

	public void setBiro(String biro) {
		this.biro = biro;
	}


	@Column(name="CAPITAL_ATUAL", precision=10, scale=2)
	public BigDecimal getCapitalAtual() {
		return this.capitalAtual;
	}

	public void setCapitalAtual(BigDecimal capitalAtual) {
		this.capitalAtual = capitalAtual;
	}


	@Column(length=8)
	public String getCep() {
		return this.cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}


	@Column(length=30)
	public String getCidade() {
		return this.cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}


	@Column(length=7)
	public String getCnae() {
		return this.cnae;
	}

	public void setCnae(String cnae) {
		this.cnae = cnae;
	}


	@Column(name="CODIGO_CLIENTE", nullable=false, length=15)
	public String getCodigoCliente() {
		return this.codigoCliente;
	}

	public void setCodigoCliente(String codigoCliente) {
		this.codigoCliente = codigoCliente;
	}


	@Column(name="COMPL_CELULAR", length=10)
	public String getComplCelular() {
		return this.complCelular;
	}

	public void setComplCelular(String complCelular) {
		this.complCelular = complCelular;
	}


	@Column(name="COMPL_ENDERECO", length=50)
	public String getComplEndereco() {
		return this.complEndereco;
	}

	public void setComplEndereco(String complEndereco) {
		this.complEndereco = complEndereco;
	}


	@Column(name="COMPL_FAX", length=10)
	public String getComplFax() {
		return this.complFax;
	}

	public void setComplFax(String complFax) {
		this.complFax = complFax;
	}


	@Column(name="COMPL_FONE1", length=10)
	public String getComplFone1() {
		return this.complFone1;
	}

	public void setComplFone1(String complFone1) {
		this.complFone1 = complFone1;
	}


	@Column(name="COMPL_FONE2", length=10)
	public String getComplFone2() {
		return this.complFone2;
	}

	public void setComplFone2(String complFone2) {
		this.complFone2 = complFone2;
	}


	@Column(name="COMPL_FONE3", length=10)
	public String getComplFone3() {
		return this.complFone3;
	}

	public void setComplFone3(String complFone3) {
		this.complFone3 = complFone3;
	}


	@Column(length=50)
	public String getContato() {
		return this.contato;
	}

	public void setContato(String contato) {
		this.contato = contato;
	}


	@Column(name="DATA_ALT")
	public Timestamp getDataAlt() {
		return this.dataAlt;
	}

	public void setDataAlt(Timestamp dataAlt) {
		this.dataAlt = dataAlt;
	}


	@Column(name="DATA_CADASTRO")
	public Timestamp getDataCadastro() {
		return this.dataCadastro;
	}

	public void setDataCadastro(Timestamp dataCadastro) {
		this.dataCadastro = dataCadastro;
	}


	@Column(name="DATA_FUNDACAO")
	public Timestamp getDataFundacao() {
		return this.dataFundacao;
	}

	public void setDataFundacao(Timestamp dataFundacao) {
		this.dataFundacao = dataFundacao;
	}


	@Column(name="DDD_CELULAR", length=4)
	public String getDddCelular() {
		return this.dddCelular;
	}

	public void setDddCelular(String dddCelular) {
		this.dddCelular = dddCelular;
	}


	@Column(name="DDD_FAX", length=4)
	public String getDddFax() {
		return this.dddFax;
	}

	public void setDddFax(String dddFax) {
		this.dddFax = dddFax;
	}


	@Column(name="DDD_FONE1", length=4)
	public String getDddFone1() {
		return this.dddFone1;
	}

	public void setDddFone1(String dddFone1) {
		this.dddFone1 = dddFone1;
	}


	@Column(name="DDD_FONE2", length=4)
	public String getDddFone2() {
		return this.dddFone2;
	}

	public void setDddFone2(String dddFone2) {
		this.dddFone2 = dddFone2;
	}


	@Column(name="DDD_FONE3", length=4)
	public String getDddFone3() {
		return this.dddFone3;
	}

	public void setDddFone3(String dddFone3) {
		this.dddFone3 = dddFone3;
	}


	@Column(name="E_MAIL", length=100)
	public String getEMail() {
		return this.eMail;
	}

	public void setEMail(String eMail) {
		this.eMail = eMail;
	}


	@Column(length=50)
	public String getEndereco() {
		return this.endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}


	@Column(length=2)
	public String getEstado() {
		return this.estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}


	@Column(name="FATURAMENTO_MENSAL", precision=10, scale=2)
	public BigDecimal getFaturamentoMensal() {
		return this.faturamentoMensal;
	}

	public void setFaturamentoMensal(BigDecimal faturamentoMensal) {
		this.faturamentoMensal = faturamentoMensal;
	}


	@Column(name="INSCR_ESTADUAL", length=20)
	public String getInscrEstadual() {
		return this.inscrEstadual;
	}

	public void setInscrEstadual(String inscrEstadual) {
		this.inscrEstadual = inscrEstadual;
	}


	@Column(name="INSCR_MUNICIPAL", length=20)
	public String getInscrMunicipal() {
		return this.inscrMunicipal;
	}

	public void setInscrMunicipal(String inscrMunicipal) {
		this.inscrMunicipal = inscrMunicipal;
	}


	@Column(name="NOME_CLIENTE", nullable=false, length=50)
	public String getNomeCliente() {
		return this.nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}


	@Column(name="NOME_FANTASIA", length=50)
	public String getNomeFantasia() {
		return this.nomeFantasia;
	}

	public void setNomeFantasia(String nomeFantasia) {
		this.nomeFantasia = nomeFantasia;
	}


	@Column(length=20)
	public String getNumero() {
		return this.numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}


	@Column(name="NUMERO_CELULAR", length=15)
	public String getNumeroCelular() {
		return this.numeroCelular;
	}

	public void setNumeroCelular(String numeroCelular) {
		this.numeroCelular = numeroCelular;
	}


	@Column(name="NUMERO_FAX", length=15)
	public String getNumeroFax() {
		return this.numeroFax;
	}

	public void setNumeroFax(String numeroFax) {
		this.numeroFax = numeroFax;
	}


	@Column(name="NUMERO_FONE1", length=15)
	public String getNumeroFone1() {
		return this.numeroFone1;
	}

	public void setNumeroFone1(String numeroFone1) {
		this.numeroFone1 = numeroFone1;
	}


	@Column(name="NUMERO_FONE2", length=15)
	public String getNumeroFone2() {
		return this.numeroFone2;
	}

	public void setNumeroFone2(String numeroFone2) {
		this.numeroFone2 = numeroFone2;
	}


	@Column(name="NUMERO_FONE3", length=15)
	public String getNumeroFone3() {
		return this.numeroFone3;
	}

	public void setNumeroFone3(String numeroFone3) {
		this.numeroFone3 = numeroFone3;
	}


	@Column(name="obs_comissao_desconto", length=100)
	public String getObsComissaoDesconto() {
		return this.obsComissaoDesconto;
	}

	public void setObsComissaoDesconto(String obsComissaoDesconto) {
		this.obsComissaoDesconto = obsComissaoDesconto;
	}


    @Lob()
	public String getObservacao() {
		return this.observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}


	@Column(length=20)
	public String getPais() {
		return this.pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}


	@Column(name="pct_comissao_desconto", precision=10, scale=2)
	public BigDecimal getPctComissaoDesconto() {
		return this.pctComissaoDesconto;
	}

	public void setPctComissaoDesconto(BigDecimal pctComissaoDesconto) {
		this.pctComissaoDesconto = pctComissaoDesconto;
	}


	@Column(name="pct_comissao_parceria", precision=10, scale=2)
	public BigDecimal getPctComissaoParceria() {
		return this.pctComissaoParceria;
	}

	public void setPctComissaoParceria(BigDecimal pctComissaoParceria) {
		this.pctComissaoParceria = pctComissaoParceria;
	}


	@Column(name="pct_comissao_propria", precision=10, scale=2)
	public BigDecimal getPctComissaoPropria() {
		return this.pctComissaoPropria;
	}

	public void setPctComissaoPropria(BigDecimal pctComissaoPropria) {
		this.pctComissaoPropria = pctComissaoPropria;
	}


	@Column(name="RAMO_ATIVIDADE_SQ")
	public int getRamoAtividadeSq() {
		return this.ramoAtividadeSq;
	}

	public void setRamoAtividadeSq(int ramoAtividadeSq) {
		this.ramoAtividadeSq = ramoAtividadeSq;
	}


	@Column(length=1)
	public String getRevenda() {
		return this.revenda;
	}

	public void setRevenda(String revenda) {
		this.revenda = revenda;
	}


	@Column(name="WEB_SITE", length=100)
	public String getWebSite() {
		return this.webSite;
	}

	public void setWebSite(String webSite) {
		this.webSite = webSite;
	}


	//bi-directional many-to-one association to Agenda
	@OneToMany(mappedBy="cliente")
	public List<Agenda> getAgendas() {
		return this.agendas;
	}

	public void setAgendas(List<Agenda> agendas) {
		this.agendas = agendas;
	}
	

	//bi-directional many-to-one association to Assistencia
	@OneToMany(mappedBy="cliente")
	public List<Assistencia> getAssistencias() {
		return this.assistencias;
	}

	public void setAssistencias(List<Assistencia> assistencias) {
		this.assistencias = assistencias;
	}
	

	//bi-directional many-to-one association to Classificacao
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="CLASSIFICACAO_SQ")
	public Classificacao getClassificacao() {
		return this.classificacao;
	}

	public void setClassificacao(Classificacao classificacao) {
		this.classificacao = classificacao;
	}
	

	//bi-directional many-to-one association to TipoCliente
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="tipo_cliente_sq")
	public TipoCliente getTipoCliente() {
		return this.tipoCliente;
	}

	public void setTipoCliente(TipoCliente tipoCliente) {
		this.tipoCliente = tipoCliente;
	}
	

	//bi-directional many-to-one association to Transportadora
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="TRANSPORTADORA_SQ")
	public Transportadora getTransportadora() {
		return this.transportadora;
	}

	public void setTransportadora(Transportadora transportadora) {
		this.transportadora = transportadora;
	}
	

	//bi-directional many-to-one association to Vendedore
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="vendedor_sq")
	public Vendedor getVendedore() {
		return this.vendedore;
	}

	public void setVendedore(Vendedor vendedore) {
		this.vendedore = vendedore;
	}
	

	//bi-directional many-to-one association to Usuario
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="USUARIO_SQ_ALT")
	public Usuario getUsuario() {
		return this.usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	

	//bi-directional many-to-one association to ContasPagarAuto
	@OneToMany(mappedBy="cliente")
	public List<ContaPagarAuto> getContasPagarAutos() {
		return this.contasPagarAutos;
	}

	public void setContasPagarAutos(List<ContaPagarAuto> contasPagarAutos) {
		this.contasPagarAutos = contasPagarAutos;
	}
	

	//bi-directional many-to-one association to Contato
	@OneToMany(mappedBy="cliente")
	public List<Contato> getContatos() {
		return this.contatos;
	}

	public void setContatos(List<Contato> contatos) {
		this.contatos = contatos;
	}
	

	//bi-directional many-to-one association to NfEntrada
	@OneToMany(mappedBy="cliente")
	public List<NfEntrada> getNfEntradas() {
		return this.nfEntradas;
	}

	public void setNfEntradas(List<NfEntrada> nfEntradas) {
		this.nfEntradas = nfEntradas;
	}
	

	//bi-directional many-to-one association to NfServico
	@OneToMany(mappedBy="cliente")
	public List<NfServico> getNfServicos() {
		return this.nfServicos;
	}

	public void setNfServicos(List<NfServico> nfServicos) {
		this.nfServicos = nfServicos;
	}
	

	//bi-directional many-to-one association to Nfiscai
	@OneToMany(mappedBy="cliente")
	public List<Nfiscal> getNfiscais() {
		return this.nfiscais;
	}

	public void setNfiscais(List<Nfiscal> nfiscais) {
		this.nfiscais = nfiscais;
	}
	

	//bi-directional many-to-one association to Pedido
	@OneToMany(mappedBy="cliente")
	public List<Pedido> getPedidos() {
		return this.pedidos;
	}

	public void setPedidos(List<Pedido> pedidos) {
		this.pedidos = pedidos;
	}
	

	//bi-directional many-to-one association to ProdutosFaltante
	@OneToMany(mappedBy="cliente")
	public List<ProdutoFaltante> getProdutosFaltantes() {
		return this.produtosFaltantes;
	}

	public void setProdutosFaltantes(List<ProdutoFaltante> produtosFaltantes) {
		this.produtosFaltantes = produtosFaltantes;
	}
	
}