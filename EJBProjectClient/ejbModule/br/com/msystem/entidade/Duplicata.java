package br.com.msystem.entidade;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the duplicatas database table.
 * 
 */
@Entity
@Table(name="duplicatas")
public class Duplicata implements Serializable {
	private static final long serialVersionUID = 1L;
	private int duplicataSq;
	private BigDecimal descontoDuplicata;
	private Date dtemissaoDuplicata;
	private Date dtvenctoDuplicata;
	private int itemDuplicata;
	private BigDecimal jurosDuplicata;
	private int numeroDuplicata;
	private int seqDuplicata;
	private BigDecimal valorDuplicata;
	private Nfiscal nfiscai;
	private List<DuplicataPgto> duplicatasPgtos;

    public Duplicata() {
    }


	@Id
	@Column(name="DUPLICATA_SQ", unique=true, nullable=false)
	public int getDuplicataSq() {
		return this.duplicataSq;
	}

	public void setDuplicataSq(int duplicataSq) {
		this.duplicataSq = duplicataSq;
	}


	@Column(name="desconto_duplicata", precision=10, scale=2)
	public BigDecimal getDescontoDuplicata() {
		return this.descontoDuplicata;
	}

	public void setDescontoDuplicata(BigDecimal descontoDuplicata) {
		this.descontoDuplicata = descontoDuplicata;
	}


    @Temporal( TemporalType.TIMESTAMP)
	@Column(name="DTEMISSAO_DUPLICATA", nullable=false)
	public Date getDtemissaoDuplicata() {
		return this.dtemissaoDuplicata;
	}

	public void setDtemissaoDuplicata(Date dtemissaoDuplicata) {
		this.dtemissaoDuplicata = dtemissaoDuplicata;
	}


    @Temporal( TemporalType.TIMESTAMP)
	@Column(name="DTVENCTO_DUPLICATA", nullable=false)
	public Date getDtvenctoDuplicata() {
		return this.dtvenctoDuplicata;
	}

	public void setDtvenctoDuplicata(Date dtvenctoDuplicata) {
		this.dtvenctoDuplicata = dtvenctoDuplicata;
	}


	@Column(name="ITEM_DUPLICATA", nullable=false)
	public int getItemDuplicata() {
		return this.itemDuplicata;
	}

	public void setItemDuplicata(int itemDuplicata) {
		this.itemDuplicata = itemDuplicata;
	}


	@Column(name="juros_duplicata", precision=10, scale=2)
	public BigDecimal getJurosDuplicata() {
		return this.jurosDuplicata;
	}

	public void setJurosDuplicata(BigDecimal jurosDuplicata) {
		this.jurosDuplicata = jurosDuplicata;
	}


	@Column(name="NUMERO_DUPLICATA", nullable=false)
	public int getNumeroDuplicata() {
		return this.numeroDuplicata;
	}

	public void setNumeroDuplicata(int numeroDuplicata) {
		this.numeroDuplicata = numeroDuplicata;
	}


	@Column(name="SEQ_DUPLICATA")
	public int getSeqDuplicata() {
		return this.seqDuplicata;
	}

	public void setSeqDuplicata(int seqDuplicata) {
		this.seqDuplicata = seqDuplicata;
	}


	@Column(name="VALOR_DUPLICATA", precision=10, scale=2)
	public BigDecimal getValorDuplicata() {
		return this.valorDuplicata;
	}

	public void setValorDuplicata(BigDecimal valorDuplicata) {
		this.valorDuplicata = valorDuplicata;
	}


	//bi-directional many-to-one association to Nfiscai
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="NFISCAL_SQ")
	public Nfiscal getNfiscai() {
		return this.nfiscai;
	}

	public void setNfiscai(Nfiscal nfiscai) {
		this.nfiscai = nfiscai;
	}
	

	//bi-directional many-to-one association to DuplicatasPgto
	@OneToMany(mappedBy="duplicata")
	public List<DuplicataPgto> getDuplicatasPgtos() {
		return this.duplicatasPgtos;
	}

	public void setDuplicatasPgtos(List<DuplicataPgto> duplicatasPgtos) {
		this.duplicatasPgtos = duplicatasPgtos;
	}
	
}