package br.com.msystem.entidade;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the acessos database table.
 * 
 */
@Entity
@Table(name="acessos")
public class Acesso implements Serializable {
	private static final long serialVersionUID = 1L;
	private int acessoSq;
	private String apagar;
	private String criar;
	private String editar;
	private String nomePrograma;
	private String visualizar;
	private Usuario usuario;

    public Acesso() {
    }


	@Id
	@Column(name="ACESSO_SQ", unique=true, nullable=false)
	public int getAcessoSq() {
		return this.acessoSq;
	}

	public void setAcessoSq(int acessoSq) {
		this.acessoSq = acessoSq;
	}


	@Column(length=1)
	public String getApagar() {
		return this.apagar;
	}

	public void setApagar(String apagar) {
		this.apagar = apagar;
	}


	@Column(length=1)
	public String getCriar() {
		return this.criar;
	}

	public void setCriar(String criar) {
		this.criar = criar;
	}


	@Column(length=1)
	public String getEditar() {
		return this.editar;
	}

	public void setEditar(String editar) {
		this.editar = editar;
	}


	@Column(name="NOME_PROGRAMA", nullable=false, length=100)
	public String getNomePrograma() {
		return this.nomePrograma;
	}

	public void setNomePrograma(String nomePrograma) {
		this.nomePrograma = nomePrograma;
	}


	@Column(length=1)
	public String getVisualizar() {
		return this.visualizar;
	}

	public void setVisualizar(String visualizar) {
		this.visualizar = visualizar;
	}


	//bi-directional many-to-one association to Usuario
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="USUARIO_SQ", nullable=false)
	public Usuario getUsuario() {
		return this.usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
}