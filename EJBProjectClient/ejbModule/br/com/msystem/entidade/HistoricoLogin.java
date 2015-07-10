package br.com.msystem.entidade;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the historico_login database table.
 * 
 */
@Entity
@Table(name="historico_login")
public class HistoricoLogin implements Serializable {
	private static final long serialVersionUID = 1L;
	private int histLoginSq;
	private Timestamp dataLogin;
	private String ipLogin;
	private Usuario usuario;

    public HistoricoLogin() {
    }


	@Id
	@Column(name="HIST_LOGIN_SQ", unique=true, nullable=false)
	public int getHistLoginSq() {
		return this.histLoginSq;
	}

	public void setHistLoginSq(int histLoginSq) {
		this.histLoginSq = histLoginSq;
	}


	@Column(name="DATA_LOGIN", nullable=false)
	public Timestamp getDataLogin() {
		return this.dataLogin;
	}

	public void setDataLogin(Timestamp dataLogin) {
		this.dataLogin = dataLogin;
	}


	@Column(name="IP_LOGIN", length=15)
	public String getIpLogin() {
		return this.ipLogin;
	}

	public void setIpLogin(String ipLogin) {
		this.ipLogin = ipLogin;
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