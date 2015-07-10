package br.com.msystem.entidade;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the notificacao database table.
 * 
 */
@Entity
@Table(name="notificacao")
public class Notificacao implements Serializable {
	private static final long serialVersionUID = 1L;
	private int notificacaoSq;
	private Timestamp dataNotificacao;
	private String ipUsuario;
	private String mensagem;
	private String nomeSoftware;
	private String nomeUsuario;
	private String status;
	private String tituloNotificacao;
	private String versaoSoftware;

    public Notificacao() {
    }


	@Id
	@Column(name="notificacao_sq", unique=true, nullable=false)
	public int getNotificacaoSq() {
		return this.notificacaoSq;
	}

	public void setNotificacaoSq(int notificacaoSq) {
		this.notificacaoSq = notificacaoSq;
	}


	@Column(name="data_notificacao", nullable=false)
	public Timestamp getDataNotificacao() {
		return this.dataNotificacao;
	}

	public void setDataNotificacao(Timestamp dataNotificacao) {
		this.dataNotificacao = dataNotificacao;
	}


	@Column(name="ip_usuario", length=15)
	public String getIpUsuario() {
		return this.ipUsuario;
	}

	public void setIpUsuario(String ipUsuario) {
		this.ipUsuario = ipUsuario;
	}


    @Lob()
	public String getMensagem() {
		return this.mensagem;
	}

	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}


	@Column(name="nome_software", length=50)
	public String getNomeSoftware() {
		return this.nomeSoftware;
	}

	public void setNomeSoftware(String nomeSoftware) {
		this.nomeSoftware = nomeSoftware;
	}


	@Column(name="nome_usuario", length=50)
	public String getNomeUsuario() {
		return this.nomeUsuario;
	}

	public void setNomeUsuario(String nomeUsuario) {
		this.nomeUsuario = nomeUsuario;
	}


	@Column(length=1)
	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}


	@Column(name="titulo_notificacao", length=100)
	public String getTituloNotificacao() {
		return this.tituloNotificacao;
	}

	public void setTituloNotificacao(String tituloNotificacao) {
		this.tituloNotificacao = tituloNotificacao;
	}


	@Column(name="versao_software", length=10)
	public String getVersaoSoftware() {
		return this.versaoSoftware;
	}

	public void setVersaoSoftware(String versaoSoftware) {
		this.versaoSoftware = versaoSoftware;
	}

}