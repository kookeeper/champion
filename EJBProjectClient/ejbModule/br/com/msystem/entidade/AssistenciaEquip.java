package br.com.msystem.entidade;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the assistencias_equips database table.
 * 
 */
@Entity
@Table(name="assistencias_equips")
public class AssistenciaEquip implements Serializable {
	private static final long serialVersionUID = 1L;
	private int assistenciaEquipSq;
	private String defeito;
	private String nrSerieEquip;
	private String servicos;
	private Assistencia assistencia;
	private Produto produto;
	private List<AssistenciaItem> assistenciasItens;

    public AssistenciaEquip() {
    }


	@Id
	@Column(name="ASSISTENCIA_EQUIP_SQ", unique=true, nullable=false)
	public int getAssistenciaEquipSq() {
		return this.assistenciaEquipSq;
	}

	public void setAssistenciaEquipSq(int assistenciaEquipSq) {
		this.assistenciaEquipSq = assistenciaEquipSq;
	}


    @Lob()
	public String getDefeito() {
		return this.defeito;
	}

	public void setDefeito(String defeito) {
		this.defeito = defeito;
	}


    @Lob()
	@Column(name="NR_SERIE_EQUIP")
	public String getNrSerieEquip() {
		return this.nrSerieEquip;
	}

	public void setNrSerieEquip(String nrSerieEquip) {
		this.nrSerieEquip = nrSerieEquip;
	}


    @Lob()
	public String getServicos() {
		return this.servicos;
	}

	public void setServicos(String servicos) {
		this.servicos = servicos;
	}


	//bi-directional many-to-one association to Assistencia
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="ASSISTENCIA_SQ", nullable=false)
	public Assistencia getAssistencia() {
		return this.assistencia;
	}

	public void setAssistencia(Assistencia assistencia) {
		this.assistencia = assistencia;
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
	

	//bi-directional many-to-one association to AssistenciasIten
	@OneToMany(mappedBy="assistenciasEquip")
	public List<AssistenciaItem> getAssistenciasItens() {
		return this.assistenciasItens;
	}

	public void setAssistenciasItens(List<AssistenciaItem> assistenciasItens) {
		this.assistenciasItens = assistenciasItens;
	}
	
}