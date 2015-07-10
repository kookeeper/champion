package br.com.msystem.entidade;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;


/**
 * The persistent class for the estado database table.
 * 
 */
@Entity
@Table(name="estado")
public class Estado implements Serializable {
	private static final long serialVersionUID = 1L;
	private int estadoSq;
	private BigDecimal aliqIcmsIntra;
	private String codigoEstado;
	private int codigoIbge;
	private String descricaoEstado;
	private List<EstadoIva> estadoIvas;

    public Estado() {
    }


	@Id
	@Column(name="estado_sq", unique=true, nullable=false)
	public int getEstadoSq() {
		return this.estadoSq;
	}

	public void setEstadoSq(int estadoSq) {
		this.estadoSq = estadoSq;
	}


	@Column(name="aliq_icms_intra", nullable=false, precision=10, scale=2)
	public BigDecimal getAliqIcmsIntra() {
		return this.aliqIcmsIntra;
	}

	public void setAliqIcmsIntra(BigDecimal aliqIcmsIntra) {
		this.aliqIcmsIntra = aliqIcmsIntra;
	}


	@Column(name="codigo_estado", nullable=false, length=2)
	public String getCodigoEstado() {
		return this.codigoEstado;
	}

	public void setCodigoEstado(String codigoEstado) {
		this.codigoEstado = codigoEstado;
	}


	@Column(name="codigo_ibge", nullable=false)
	public int getCodigoIbge() {
		return this.codigoIbge;
	}

	public void setCodigoIbge(int codigoIbge) {
		this.codigoIbge = codigoIbge;
	}


	@Column(name="descricao_estado", nullable=false, length=50)
	public String getDescricaoEstado() {
		return this.descricaoEstado;
	}

	public void setDescricaoEstado(String descricaoEstado) {
		this.descricaoEstado = descricaoEstado;
	}


	//bi-directional many-to-one association to EstadoIva
	@OneToMany(mappedBy="estado")
	public List<EstadoIva> getEstadoIvas() {
		return this.estadoIvas;
	}

	public void setEstadoIvas(List<EstadoIva> estadoIvas) {
		this.estadoIvas = estadoIvas;
	}
	
}