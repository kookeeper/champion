package br.com.msystem.entidade;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the nfiscais_itens_serie database table.
 * 
 */
@Entity
@Table(name="nfiscais_itens_serie")
public class NfiscalItemSerie implements Serializable {
	private static final long serialVersionUID = 1L;
	private int nfiscalItemSerieSq;
	private NfiscalItem nfiscaisIten;
	private ProdutoNumeroSerie produtoNumeroSerie;

    public NfiscalItemSerie() {
    }


	@Id
	@Column(name="nfiscal_item_serie_sq", unique=true, nullable=false)
	public int getNfiscalItemSerieSq() {
		return this.nfiscalItemSerieSq;
	}

	public void setNfiscalItemSerieSq(int nfiscalItemSerieSq) {
		this.nfiscalItemSerieSq = nfiscalItemSerieSq;
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
	

	//bi-directional many-to-one association to ProdutoNumeroSerie
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="produto_numero_serie_sq", nullable=false)
	public ProdutoNumeroSerie getProdutoNumeroSerie() {
		return this.produtoNumeroSerie;
	}

	public void setProdutoNumeroSerie(ProdutoNumeroSerie produtoNumeroSerie) {
		this.produtoNumeroSerie = produtoNumeroSerie;
	}
	
}