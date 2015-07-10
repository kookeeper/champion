package br.com.msystem.entidade;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;


/**
 * The persistent class for the nbm database table.
 * 
 */
@Entity
@Table(name="nbm")
public class Nbm implements Serializable {
	private static final long serialVersionUID = 1L;
	private int nbmSq;
	private BigDecimal aliqIcms;
	private BigDecimal aliqIpi;
	private BigDecimal aliqIva;
	private String codigoNbm;
	private List<EstadoIva> estadoIvas;
	private List<Produto> produtos;

    public Nbm() {
    }


	@Id
	@Column(name="NBM_SQ", unique=true, nullable=false)
	public int getNbmSq() {
		return this.nbmSq;
	}

	public void setNbmSq(int nbmSq) {
		this.nbmSq = nbmSq;
	}


	@Column(name="ALIQ_ICMS", precision=10, scale=2)
	public BigDecimal getAliqIcms() {
		return this.aliqIcms;
	}

	public void setAliqIcms(BigDecimal aliqIcms) {
		this.aliqIcms = aliqIcms;
	}


	@Column(name="ALIQ_IPI", precision=10, scale=2)
	public BigDecimal getAliqIpi() {
		return this.aliqIpi;
	}

	public void setAliqIpi(BigDecimal aliqIpi) {
		this.aliqIpi = aliqIpi;
	}


	@Column(name="aliq_iva", nullable=false, precision=10, scale=2)
	public BigDecimal getAliqIva() {
		return this.aliqIva;
	}

	public void setAliqIva(BigDecimal aliqIva) {
		this.aliqIva = aliqIva;
	}


	@Column(name="CODIGO_NBM", nullable=false, length=10)
	public String getCodigoNbm() {
		return this.codigoNbm;
	}

	public void setCodigoNbm(String codigoNbm) {
		this.codigoNbm = codigoNbm;
	}


	//bi-directional many-to-one association to EstadoIva
	@OneToMany(mappedBy="nbm")
	public List<EstadoIva> getEstadoIvas() {
		return this.estadoIvas;
	}

	public void setEstadoIvas(List<EstadoIva> estadoIvas) {
		this.estadoIvas = estadoIvas;
	}
	

	//bi-directional many-to-one association to Produto
	@OneToMany(mappedBy="nbm")
	public List<Produto> getProdutos() {
		return this.produtos;
	}

	public void setProdutos(List<Produto> produtos) {
		this.produtos = produtos;
	}
	
}