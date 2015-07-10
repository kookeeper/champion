package br.com.msystem.entidade;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the assistencias_itens database table.
 * 
 */
@Entity
@Table(name="assistencias_itens")
public class AssistenciaItem implements Serializable {
	private static final long serialVersionUID = 1L;
	private int assistenciaItemSq;
	private BigDecimal precoUnit;
	private int qtdeAssistenciaItem;
	private AssistenciaEquip assistenciasEquip;
	private Produto produto;

    public AssistenciaItem() {
    }


	@Id
	@Column(name="ASSISTENCIA_ITEM_SQ", unique=true, nullable=false)
	public int getAssistenciaItemSq() {
		return this.assistenciaItemSq;
	}

	public void setAssistenciaItemSq(int assistenciaItemSq) {
		this.assistenciaItemSq = assistenciaItemSq;
	}


	@Column(name="PRECO_UNIT", precision=10, scale=2)
	public BigDecimal getPrecoUnit() {
		return this.precoUnit;
	}

	public void setPrecoUnit(BigDecimal precoUnit) {
		this.precoUnit = precoUnit;
	}


	@Column(name="QTDE_ASSISTENCIA_ITEM", nullable=false)
	public int getQtdeAssistenciaItem() {
		return this.qtdeAssistenciaItem;
	}

	public void setQtdeAssistenciaItem(int qtdeAssistenciaItem) {
		this.qtdeAssistenciaItem = qtdeAssistenciaItem;
	}


	//bi-directional many-to-one association to AssistenciasEquip
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="assistencia_equip_sq", nullable=false)
	public AssistenciaEquip getAssistenciasEquip() {
		return this.assistenciasEquip;
	}

	public void setAssistenciasEquip(AssistenciaEquip assistenciasEquip) {
		this.assistenciasEquip = assistenciasEquip;
	}
	

	//bi-directional many-to-one association to Produto
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="PRODUTO_SQ", nullable=false)
	public Produto getProduto() {
		return this.produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	
}