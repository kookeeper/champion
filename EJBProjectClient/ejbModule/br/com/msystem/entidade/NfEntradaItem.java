package br.com.msystem.entidade;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the nf_entradas_itens database table.
 * 
 */
@Entity
@Table(name="nf_entradas_itens")
public class NfEntradaItem implements Serializable {
	private static final long serialVersionUID = 1L;
	private int nfEntradaItemSq;
	private BigDecimal aliqIcmsItem;
	private BigDecimal aliqIpiItem;
	private int item;
	private byte[] nrSerieItem;
	private int numeroEstoque;
	private int qtdeItem;
	private BigDecimal vlrIcmsItem;
	private BigDecimal vlrIpiItem;
	private BigDecimal vlrTotalItem;
	private BigDecimal vlrUnitItem;
	private NfEntrada nfEntrada;
	private Produto produto;

    public NfEntradaItem() {
    }


	@Id
	@Column(name="NF_ENTRADA_ITEM_SQ", unique=true, nullable=false)
	public int getNfEntradaItemSq() {
		return this.nfEntradaItemSq;
	}

	public void setNfEntradaItemSq(int nfEntradaItemSq) {
		this.nfEntradaItemSq = nfEntradaItemSq;
	}


	@Column(name="ALIQ_ICMS_ITEM", precision=10, scale=2)
	public BigDecimal getAliqIcmsItem() {
		return this.aliqIcmsItem;
	}

	public void setAliqIcmsItem(BigDecimal aliqIcmsItem) {
		this.aliqIcmsItem = aliqIcmsItem;
	}


	@Column(name="ALIQ_IPI_ITEM", precision=10, scale=2)
	public BigDecimal getAliqIpiItem() {
		return this.aliqIpiItem;
	}

	public void setAliqIpiItem(BigDecimal aliqIpiItem) {
		this.aliqIpiItem = aliqIpiItem;
	}


	@Column(nullable=false)
	public int getItem() {
		return this.item;
	}

	public void setItem(int item) {
		this.item = item;
	}


    @Lob()
	@Column(name="NR_SERIE_ITEM")
	public byte[] getNrSerieItem() {
		return this.nrSerieItem;
	}

	public void setNrSerieItem(byte[] nrSerieItem) {
		this.nrSerieItem = nrSerieItem;
	}


	@Column(name="numero_estoque")
	public int getNumeroEstoque() {
		return this.numeroEstoque;
	}

	public void setNumeroEstoque(int numeroEstoque) {
		this.numeroEstoque = numeroEstoque;
	}


	@Column(name="QTDE_ITEM")
	public int getQtdeItem() {
		return this.qtdeItem;
	}

	public void setQtdeItem(int qtdeItem) {
		this.qtdeItem = qtdeItem;
	}


	@Column(name="VLR_ICMS_ITEM", precision=10, scale=2)
	public BigDecimal getVlrIcmsItem() {
		return this.vlrIcmsItem;
	}

	public void setVlrIcmsItem(BigDecimal vlrIcmsItem) {
		this.vlrIcmsItem = vlrIcmsItem;
	}


	@Column(name="VLR_IPI_ITEM", precision=10, scale=2)
	public BigDecimal getVlrIpiItem() {
		return this.vlrIpiItem;
	}

	public void setVlrIpiItem(BigDecimal vlrIpiItem) {
		this.vlrIpiItem = vlrIpiItem;
	}


	@Column(name="VLR_TOTAL_ITEM", precision=10, scale=2)
	public BigDecimal getVlrTotalItem() {
		return this.vlrTotalItem;
	}

	public void setVlrTotalItem(BigDecimal vlrTotalItem) {
		this.vlrTotalItem = vlrTotalItem;
	}


	@Column(name="VLR_UNIT_ITEM", precision=10, scale=2)
	public BigDecimal getVlrUnitItem() {
		return this.vlrUnitItem;
	}

	public void setVlrUnitItem(BigDecimal vlrUnitItem) {
		this.vlrUnitItem = vlrUnitItem;
	}


	//bi-directional many-to-one association to NfEntrada
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="NF_ENTRADA_SQ", nullable=false)
	public NfEntrada getNfEntrada() {
		return this.nfEntrada;
	}

	public void setNfEntrada(NfEntrada nfEntrada) {
		this.nfEntrada = nfEntrada;
	}
	

	//bi-directional many-to-one association to Produto
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="PRODUTO_SQ")
	public Produto getProduto() {
		return this.produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	
}