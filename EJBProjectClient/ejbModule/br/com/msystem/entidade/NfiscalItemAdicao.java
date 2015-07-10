package br.com.msystem.entidade;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the nfiscais_itens_adicao database table.
 * 
 */
@Entity
@Table(name="nfiscais_itens_adicao")
public class NfiscalItemAdicao implements Serializable {
	private static final long serialVersionUID = 1L;
	private int nfiscalItemAdicaoSq;
	private String codigoFabricante;
	private int numeroAdicao;
	private int numeroSequencialAdicao;
	private BigDecimal vlrDescAdicao;
	private NfiscalItem nfiscaisIten;

    public NfiscalItemAdicao() {
    }


	@Id
	@Column(name="nfiscal_item_adicao_sq", unique=true, nullable=false)
	public int getNfiscalItemAdicaoSq() {
		return this.nfiscalItemAdicaoSq;
	}

	public void setNfiscalItemAdicaoSq(int nfiscalItemAdicaoSq) {
		this.nfiscalItemAdicaoSq = nfiscalItemAdicaoSq;
	}


	@Column(name="codigo_fabricante", length=60)
	public String getCodigoFabricante() {
		return this.codigoFabricante;
	}

	public void setCodigoFabricante(String codigoFabricante) {
		this.codigoFabricante = codigoFabricante;
	}


	@Column(name="numero_adicao")
	public int getNumeroAdicao() {
		return this.numeroAdicao;
	}

	public void setNumeroAdicao(int numeroAdicao) {
		this.numeroAdicao = numeroAdicao;
	}


	@Column(name="numero_sequencial_adicao")
	public int getNumeroSequencialAdicao() {
		return this.numeroSequencialAdicao;
	}

	public void setNumeroSequencialAdicao(int numeroSequencialAdicao) {
		this.numeroSequencialAdicao = numeroSequencialAdicao;
	}


	@Column(name="vlr_desc_adicao", precision=10, scale=2)
	public BigDecimal getVlrDescAdicao() {
		return this.vlrDescAdicao;
	}

	public void setVlrDescAdicao(BigDecimal vlrDescAdicao) {
		this.vlrDescAdicao = vlrDescAdicao;
	}


	//bi-directional many-to-one association to NfiscaisIten
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="nfiscal_item_sq", nullable=false)
	public NfiscalItem getNfiscaisIten() {
		return this.nfiscaisIten;
	}

	public void setNfiscaisIten(NfiscalItem nfiscaisIten) {
		this.nfiscaisIten = nfiscaisIten;
	}
	
}