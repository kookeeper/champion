package br.com.msystem.entidade;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;


/**
 * The persistent class for the conteiner database table.
 * 
 */
@Entity
@Table(name="conteiner")
public class Conteiner implements Serializable {
	private static final long serialVersionUID = 1L;
	private int conteinerSq;
	private String conhecimento;
	private Timestamp dataChegada;
	private Timestamp dataRemessa;
	private String invoiceNumber;
	private String observacao;
	private String tipoEnvio;
	private List<ConteinerItem> conteinerItens;

    public Conteiner() {
    }


	@Id
	@Column(name="conteiner_sq", unique=true, nullable=false)
	public int getConteinerSq() {
		return this.conteinerSq;
	}

	public void setConteinerSq(int conteinerSq) {
		this.conteinerSq = conteinerSq;
	}


	@Column(length=20)
	public String getConhecimento() {
		return this.conhecimento;
	}

	public void setConhecimento(String conhecimento) {
		this.conhecimento = conhecimento;
	}


	@Column(name="data_chegada", nullable=false)
	public Timestamp getDataChegada() {
		return this.dataChegada;
	}

	public void setDataChegada(Timestamp dataChegada) {
		this.dataChegada = dataChegada;
	}


	@Column(name="data_remessa", nullable=false)
	public Timestamp getDataRemessa() {
		return this.dataRemessa;
	}

	public void setDataRemessa(Timestamp dataRemessa) {
		this.dataRemessa = dataRemessa;
	}


	@Column(name="invoice_number", nullable=false, length=20)
	public String getInvoiceNumber() {
		return this.invoiceNumber;
	}

	public void setInvoiceNumber(String invoiceNumber) {
		this.invoiceNumber = invoiceNumber;
	}


    @Lob()
	public String getObservacao() {
		return this.observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}


	@Column(name="tipo_envio", nullable=false, length=1)
	public String getTipoEnvio() {
		return this.tipoEnvio;
	}

	public void setTipoEnvio(String tipoEnvio) {
		this.tipoEnvio = tipoEnvio;
	}


	//bi-directional many-to-one association to ConteinerIten
	@OneToMany(mappedBy="conteiner")
	public List<ConteinerItem> getConteinerItens() {
		return this.conteinerItens;
	}

	public void setConteinerItens(List<ConteinerItem> conteinerItens) {
		this.conteinerItens = conteinerItens;
	}
	
}