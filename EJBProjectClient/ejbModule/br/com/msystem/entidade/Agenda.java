package br.com.msystem.entidade;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the agenda database table.
 * 
 */
@Entity
@Table(name="agenda")
public class Agenda implements Serializable {
	private static final long serialVersionUID = 1L;
	private int agendaSq;
	private Timestamp dataAgenda;
	private String observacao;
	private String realizado;
	private int usuarioPaiSq;
	private Cliente cliente;
	private Vendedor vendedore;

    public Agenda() {
    }


	@Id
	@Column(name="AGENDA_SQ", unique=true, nullable=false)
	public int getAgendaSq() {
		return this.agendaSq;
	}

	public void setAgendaSq(int agendaSq) {
		this.agendaSq = agendaSq;
	}


	@Column(name="DATA_AGENDA", nullable=false)
	public Timestamp getDataAgenda() {
		return this.dataAgenda;
	}

	public void setDataAgenda(Timestamp dataAgenda) {
		this.dataAgenda = dataAgenda;
	}


    @Lob()
	public String getObservacao() {
		return this.observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}


	@Column(length=1)
	public String getRealizado() {
		return this.realizado;
	}

	public void setRealizado(String realizado) {
		this.realizado = realizado;
	}


	@Column(name="USUARIO_PAI_SQ")
	public int getUsuarioPaiSq() {
		return this.usuarioPaiSq;
	}

	public void setUsuarioPaiSq(int usuarioPaiSq) {
		this.usuarioPaiSq = usuarioPaiSq;
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
	

	//bi-directional many-to-one association to Vendedore
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="VENDEDOR_SQ", nullable=false)
	public Vendedor getVendedore() {
		return this.vendedore;
	}

	public void setVendedore(Vendedor vendedore) {
		this.vendedore = vendedore;
	}
	
}