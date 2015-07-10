package br.com.msystem.entidade;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the usuarios database table.
 * 
 */
@Entity
@Table(name="usuarios")
public class Usuario implements Serializable {
	private static final long serialVersionUID = 1L;
	private int usuarioSq;
	private String codigoUsuario;
	private String erroEmailFrom;
	private String erroEmailTo;
	private String erroNomeFrom;
	private String erroNomeTo;
	private String erroPassword;
	private String erroSmtp;
	private String erroUsername;
	private byte[] foto;
	private String fotoUsuario;
	private String nomeUsuario;
	private String senhaUsuario;
	private List<Acesso> acessos;
	private List<Cliente> clientes;
	private List<HistoricoAlteracao> histAlteracoes;
	private List<HistoricoAcesso> historicoAcessos;
	private List<HistoricoLogin> historicoLogins;
	private List<Kardex> kardexs;
	private Vendedor vendedore;

    public Usuario() {
    }


	@Id
	@Column(name="USUARIO_SQ", unique=true, nullable=false)
	public int getUsuarioSq() {
		return this.usuarioSq;
	}

	public void setUsuarioSq(int usuarioSq) {
		this.usuarioSq = usuarioSq;
	}


	@Column(name="CODIGO_USUARIO", nullable=false, length=20)
	public String getCodigoUsuario() {
		return this.codigoUsuario;
	}

	public void setCodigoUsuario(String codigoUsuario) {
		this.codigoUsuario = codigoUsuario;
	}


	@Column(name="ERRO_EMAIL_FROM", length=50)
	public String getErroEmailFrom() {
		return this.erroEmailFrom;
	}

	public void setErroEmailFrom(String erroEmailFrom) {
		this.erroEmailFrom = erroEmailFrom;
	}


	@Column(name="ERRO_EMAIL_TO", length=50)
	public String getErroEmailTo() {
		return this.erroEmailTo;
	}

	public void setErroEmailTo(String erroEmailTo) {
		this.erroEmailTo = erroEmailTo;
	}


	@Column(name="ERRO_NOME_FROM", length=50)
	public String getErroNomeFrom() {
		return this.erroNomeFrom;
	}

	public void setErroNomeFrom(String erroNomeFrom) {
		this.erroNomeFrom = erroNomeFrom;
	}


	@Column(name="ERRO_NOME_TO", length=50)
	public String getErroNomeTo() {
		return this.erroNomeTo;
	}

	public void setErroNomeTo(String erroNomeTo) {
		this.erroNomeTo = erroNomeTo;
	}


	@Column(name="ERRO_PASSWORD", length=50)
	public String getErroPassword() {
		return this.erroPassword;
	}

	public void setErroPassword(String erroPassword) {
		this.erroPassword = erroPassword;
	}


	@Column(name="ERRO_SMTP", length=50)
	public String getErroSmtp() {
		return this.erroSmtp;
	}

	public void setErroSmtp(String erroSmtp) {
		this.erroSmtp = erroSmtp;
	}


	@Column(name="ERRO_USERNAME", length=50)
	public String getErroUsername() {
		return this.erroUsername;
	}

	public void setErroUsername(String erroUsername) {
		this.erroUsername = erroUsername;
	}


    @Lob()
	public byte[] getFoto() {
		return this.foto;
	}

	public void setFoto(byte[] foto) {
		this.foto = foto;
	}


	@Column(name="foto_usuario", length=50)
	public String getFotoUsuario() {
		return this.fotoUsuario;
	}

	public void setFotoUsuario(String fotoUsuario) {
		this.fotoUsuario = fotoUsuario;
	}


	@Column(name="NOME_USUARIO", nullable=false, length=50)
	public String getNomeUsuario() {
		return this.nomeUsuario;
	}

	public void setNomeUsuario(String nomeUsuario) {
		this.nomeUsuario = nomeUsuario;
	}


	@Column(name="SENHA_USUARIO", length=50)
	public String getSenhaUsuario() {
		return this.senhaUsuario;
	}

	public void setSenhaUsuario(String senhaUsuario) {
		this.senhaUsuario = senhaUsuario;
	}


	//bi-directional many-to-one association to Acesso
	@OneToMany(mappedBy="usuario")
	public List<Acesso> getAcessos() {
		return this.acessos;
	}

	public void setAcessos(List<Acesso> acessos) {
		this.acessos = acessos;
	}
	

	//bi-directional many-to-one association to Cliente
	@OneToMany(mappedBy="usuario")
	public List<Cliente> getClientes() {
		return this.clientes;
	}

	public void setClientes(List<Cliente> clientes) {
		this.clientes = clientes;
	}
	

	//bi-directional many-to-one association to HistAlteracoe
	@OneToMany(mappedBy="usuario")
	public List<HistoricoAlteracao> getHistAlteracoes() {
		return this.histAlteracoes;
	}

	public void setHistAlteracoes(List<HistoricoAlteracao> histAlteracoes) {
		this.histAlteracoes = histAlteracoes;
	}
	

	//bi-directional many-to-one association to HistoricoAcesso
	@OneToMany(mappedBy="usuario")
	public List<HistoricoAcesso> getHistoricoAcessos() {
		return this.historicoAcessos;
	}

	public void setHistoricoAcessos(List<HistoricoAcesso> historicoAcessos) {
		this.historicoAcessos = historicoAcessos;
	}
	

	//bi-directional many-to-one association to HistoricoLogin
	@OneToMany(mappedBy="usuario")
	public List<HistoricoLogin> getHistoricoLogins() {
		return this.historicoLogins;
	}

	public void setHistoricoLogins(List<HistoricoLogin> historicoLogins) {
		this.historicoLogins = historicoLogins;
	}
	

	//bi-directional many-to-one association to Kardex
	@OneToMany(mappedBy="usuario")
	public List<Kardex> getKardexs() {
		return this.kardexs;
	}

	public void setKardexs(List<Kardex> kardexs) {
		this.kardexs = kardexs;
	}
	

	//bi-directional many-to-one association to Vendedore
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="VENDEDOR_SQ")
	public Vendedor getVendedore() {
		return this.vendedore;
	}

	public void setVendedore(Vendedor vendedore) {
		this.vendedore = vendedore;
	}
	
}