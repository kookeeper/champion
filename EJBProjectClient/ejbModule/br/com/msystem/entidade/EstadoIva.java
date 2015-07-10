package br.com.msystem.entidade;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the estado_iva database table.
 * 
 */
@Entity
@Table(name="estado_iva")
public class EstadoIva implements Serializable {
	private static final long serialVersionUID = 1L;
	private int estadoIvaSq;
	private BigDecimal aliqIva;
	private Estado estado;
	private Nbm nbm;

    public EstadoIva() {
    }


	@Id
	@Column(name="estado_iva_sq", unique=true, nullable=false)
	public int getEstadoIvaSq() {
		return this.estadoIvaSq;
	}

	public void setEstadoIvaSq(int estadoIvaSq) {
		this.estadoIvaSq = estadoIvaSq;
	}


	@Column(name="aliq_iva", precision=10, scale=2)
	public BigDecimal getAliqIva() {
		return this.aliqIva;
	}

	public void setAliqIva(BigDecimal aliqIva) {
		this.aliqIva = aliqIva;
	}


	//bi-directional many-to-one association to Estado
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="estado_sq", nullable=false)
	public Estado getEstado() {
		return this.estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}
	

	//bi-directional many-to-one association to Nbm
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="nbm_sq", nullable=false)
	public Nbm getNbm() {
		return this.nbm;
	}

	public void setNbm(Nbm nbm) {
		this.nbm = nbm;
	}
	
}