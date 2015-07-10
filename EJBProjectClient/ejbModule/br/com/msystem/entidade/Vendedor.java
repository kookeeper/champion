package br.com.msystem.entidade;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the vendedores database table.
 * 
 */
@Entity
@Table(name="vendedores")
public class Vendedor implements Serializable {
	private static final long serialVersionUID = 1L;
	private int vendedorSq;
	private String baseComissao;
	private int codigoVendedor;
	private Date dataCadastro;
	private Date dataInativacao;
	private String nomeVendedor;
	private String obsComissaoDesconto;
	private BigDecimal pctComissaoDesconto;
	private BigDecimal pctComissaoParceria;
	private BigDecimal pctComissaoPropria;
	private int pctDesconto;
	private int pctDescontoMaster;
	private String tipoVendedor;
	private List<Agenda> agendas;
	private List<Assistencia> assistencias;
	private List<Cliente> clientes;
	private List<Contato> contatos;
	private List<Nfiscal> nfiscais;
	private List<Pedido> pedidos;
	private List<Usuario> usuarios;

    public Vendedor() {
    }


    public Vendedor(int vendedorSq, int codigoVendedor, String nomeVendedor) {
    	this.vendedorSq = vendedorSq;
    	this.codigoVendedor = codigoVendedor;
    	this.nomeVendedor = nomeVendedor;
    }
    
	@Id
	@Column(name="VENDEDOR_SQ", unique=true, nullable=false)
	public int getVendedorSq() {
		return this.vendedorSq;
	}

	public void setVendedorSq(int vendedorSq) {
		this.vendedorSq = vendedorSq;
	}


	@Column(name="base_comissao", length=1)
	public String getBaseComissao() {
		return this.baseComissao;
	}

	public void setBaseComissao(String baseComissao) {
		this.baseComissao = baseComissao;
	}


	@Column(name="CODIGO_VENDEDOR", nullable=false)
	public int getCodigoVendedor() {
		return this.codigoVendedor;
	}

	public void setCodigoVendedor(int codigoVendedor) {
		this.codigoVendedor = codigoVendedor;
	}


    @Temporal( TemporalType.DATE)
	@Column(name="data_cadastro")
	public Date getDataCadastro() {
		return this.dataCadastro;
	}

	public void setDataCadastro(Date dataCadastro) {
		this.dataCadastro = dataCadastro;
	}


    @Temporal( TemporalType.DATE)
	@Column(name="data_inativacao")
	public Date getDataInativacao() {
		return this.dataInativacao;
	}

	public void setDataInativacao(Date dataInativacao) {
		this.dataInativacao = dataInativacao;
	}


	@Column(name="NOME_VENDEDOR", nullable=false, length=100)
	public String getNomeVendedor() {
		return this.nomeVendedor;
	}

	public void setNomeVendedor(String nomeVendedor) {
		this.nomeVendedor = nomeVendedor;
	}


	@Column(name="obs_comissao_desconto", length=100)
	public String getObsComissaoDesconto() {
		return this.obsComissaoDesconto;
	}

	public void setObsComissaoDesconto(String obsComissaoDesconto) {
		this.obsComissaoDesconto = obsComissaoDesconto;
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


	@Column(name="pct_desconto")
	public int getPctDesconto() {
		return this.pctDesconto;
	}

	public void setPctDesconto(int pctDesconto) {
		this.pctDesconto = pctDesconto;
	}


	@Column(name="pct_desconto_master")
	public int getPctDescontoMaster() {
		return this.pctDescontoMaster;
	}

	public void setPctDescontoMaster(int pctDescontoMaster) {
		this.pctDescontoMaster = pctDescontoMaster;
	}


	@Column(name="tipo_vendedor", length=1)
	public String getTipoVendedor() {
		return this.tipoVendedor;
	}

	public void setTipoVendedor(String tipoVendedor) {
		this.tipoVendedor = tipoVendedor;
	}


	//bi-directional many-to-one association to Agenda
	@OneToMany(mappedBy="vendedore")
	public List<Agenda> getAgendas() {
		return this.agendas;
	}

	public void setAgendas(List<Agenda> agendas) {
		this.agendas = agendas;
	}
	

	//bi-directional many-to-one association to Assistencia
	@OneToMany(mappedBy="vendedore")
	public List<Assistencia> getAssistencias() {
		return this.assistencias;
	}

	public void setAssistencias(List<Assistencia> assistencias) {
		this.assistencias = assistencias;
	}
	

	//bi-directional many-to-one association to Cliente
	@OneToMany(mappedBy="vendedore")
	public List<Cliente> getClientes() {
		return this.clientes;
	}

	public void setClientes(List<Cliente> clientes) {
		this.clientes = clientes;
	}
	

	//bi-directional many-to-one association to Contato
	@OneToMany(mappedBy="vendedore")
	public List<Contato> getContatos() {
		return this.contatos;
	}

	public void setContatos(List<Contato> contatos) {
		this.contatos = contatos;
	}
	

	//bi-directional many-to-one association to Nfiscai
	@OneToMany(mappedBy="vendedore")
	public List<Nfiscal> getNfiscais() {
		return this.nfiscais;
	}

	public void setNfiscais(List<Nfiscal> nfiscais) {
		this.nfiscais = nfiscais;
	}
	

	//bi-directional many-to-one association to Pedido
	@OneToMany(mappedBy="vendedor")
	public List<Pedido> getPedidos() {
		return this.pedidos;
	}

	public void setPedidos(List<Pedido> pedidos) {
		this.pedidos = pedidos;
	}
	

	//bi-directional many-to-one association to Usuario
	@OneToMany(mappedBy="vendedore")
	public List<Usuario> getUsuarios() {
		return this.usuarios;
	}

	public void setUsuarios(List<Usuario> usuarios) {
		this.usuarios = usuarios;
	}
	
}