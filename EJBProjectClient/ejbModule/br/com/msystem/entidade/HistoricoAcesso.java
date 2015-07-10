package br.com.msystem.entidade;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the historico_acesso database table.
 * 
 */
@Entity
@Table(name="historico_acesso")
public class HistoricoAcesso implements Serializable {
	private static final long serialVersionUID = 1L;
	private int historicoAcessoSq;
	private Timestamp dataAcesso;
	private String nomePrograma;
	private Usuario usuario;
	private Empresa empresa;

    public HistoricoAcesso() {
    }


	@Id
	@Column(name="historico_acesso_sq", unique=true, nullable=false)
	public int getHistoricoAcessoSq() {
		return this.historicoAcessoSq;
	}

	public void setHistoricoAcessoSq(int historicoAcessoSq) {
		this.historicoAcessoSq = historicoAcessoSq;
	}


	@Column(name="data_acesso", nullable=false)
	public Timestamp getDataAcesso() {
		return this.dataAcesso;
	}

	public void setDataAcesso(Timestamp dataAcesso) {
		this.dataAcesso = dataAcesso;
	}


	@Column(name="nome_programa", length=250)
	public String getNomePrograma() {
		return this.nomePrograma;
	}

	public void setNomePrograma(String nomePrograma) {
		this.nomePrograma = nomePrograma;
	}


	//bi-directional many-to-one association to Usuario
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="usuario_sq", nullable=false)
	public Usuario getUsuario() {
		return this.usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	

	//bi-directional many-to-one association to Empresa
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="empresa_sq", nullable=false)
	public Empresa getEmpresa() {
		return this.empresa;
	}

	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}
	
}