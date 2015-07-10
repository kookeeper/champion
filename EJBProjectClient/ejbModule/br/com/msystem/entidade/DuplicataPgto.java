package br.com.msystem.entidade;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the duplicatas_pgto database table.
 * 
 */
@Entity
@Table(name="duplicatas_pgto")
public class DuplicataPgto implements Serializable {
	private static final long serialVersionUID = 1L;
	private int duplicataPgtoSq;
	private Date dtPgto;
	private String formaPgto;
	private String observacao;
	private BigDecimal valorPgto;
	private Duplicata duplicata;

    public DuplicataPgto() {
    }


	@Id
	@Column(name="duplicata_pgto_sq", unique=true, nullable=false)
	public int getDuplicataPgtoSq() {
		return this.duplicataPgtoSq;
	}

	public void setDuplicataPgtoSq(int duplicataPgtoSq) {
		this.duplicataPgtoSq = duplicataPgtoSq;
	}


    @Temporal( TemporalType.TIMESTAMP)
	@Column(name="dt_pgto", nullable=false)
	public Date getDtPgto() {
		return this.dtPgto;
	}

	public void setDtPgto(Date dtPgto) {
		this.dtPgto = dtPgto;
	}


	@Column(name="forma_pgto", length=10)
	public String getFormaPgto() {
		return this.formaPgto;
	}

	public void setFormaPgto(String formaPgto) {
		this.formaPgto = formaPgto;
	}


	@Column(length=100)
	public String getObservacao() {
		return this.observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}


	@Column(name="valor_pgto", nullable=false, precision=10, scale=2)
	public BigDecimal getValorPgto() {
		return this.valorPgto;
	}

	public void setValorPgto(BigDecimal valorPgto) {
		this.valorPgto = valorPgto;
	}


	//bi-directional many-to-one association to Duplicata
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="duplicata_sq", nullable=false)
	public Duplicata getDuplicata() {
		return this.duplicata;
	}

	public void setDuplicata(Duplicata duplicata) {
		this.duplicata = duplicata;
	}
	
}