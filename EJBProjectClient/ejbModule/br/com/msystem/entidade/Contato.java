package br.com.msystem.entidade;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the contatos database table.
 * 
 */
@Entity
@Table(name="contatos")
public class Contato implements Serializable {
	private static final long serialVersionUID = 1L;
	private int contatoSq;
	private Timestamp dataContato;
	private String finalizado;
	private String formaContato;
	private String observacao;
	private int qtdeProdutos;
	private String tipoContato;
	private Cliente cliente;
	private NfiscalItem nfiscaisIten;
	private Vendedor vendedore;

    public Contato() {
    }


	@Id
	@Column(name="CONTATO_SQ", unique=true, nullable=false)
	public int getContatoSq() {
		return this.contatoSq;
	}

	public void setContatoSq(int contatoSq) {
		this.contatoSq = contatoSq;
	}


	@Column(name="DATA_CONTATO", nullable=false)
	public Timestamp getDataContato() {
		return this.dataContato;
	}

	public void setDataContato(Timestamp dataContato) {
		this.dataContato = dataContato;
	}


	@Column(length=1)
	public String getFinalizado() {
		return this.finalizado;
	}

	public void setFinalizado(String finalizado) {
		this.finalizado = finalizado;
	}


	@Column(name="FORMA_CONTATO", length=1)
	public String getFormaContato() {
		return this.formaContato;
	}

	public void setFormaContato(String formaContato) {
		this.formaContato = formaContato;
	}


    @Lob()
	public String getObservacao() {
		return this.observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}


	@Column(name="QTDE_PRODUTOS")
	public int getQtdeProdutos() {
		return this.qtdeProdutos;
	}

	public void setQtdeProdutos(int qtdeProdutos) {
		this.qtdeProdutos = qtdeProdutos;
	}


	@Column(name="TIPO_CONTATO", length=1)
	public String getTipoContato() {
		return this.tipoContato;
	}

	public void setTipoContato(String tipoContato) {
		this.tipoContato = tipoContato;
	}


	//bi-directional many-to-one association to Cliente
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="CLIENTE_SQ", nullable=false)
	public Cliente getCliente() {
		return this.cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	

	//bi-directional many-to-one association to NfiscaisIten
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="NFISCAL_ITEM_SQ")
	public NfiscalItem getNfiscaisIten() {
		return this.nfiscaisIten;
	}

	public void setNfiscaisIten(NfiscalItem nfiscaisIten) {
		this.nfiscaisIten = nfiscaisIten;
	}
	

	//bi-directional many-to-one association to Vendedore
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="VENDEDOR_SQ", nullable=false)
	public Vendedor getVendedore() {
		return this.vendedore;
	}

	public void setVendedore(Vendedor vendedore) {
		this.vendedore = vendedore;
	}
	
}