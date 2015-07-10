package br.com.msystem.entidade;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the carta_correcao database table.
 * 
 */
@Entity
@Table(name="carta_correcao")
public class CartaCorrecao implements Serializable {
	private static final long serialVersionUID = 1L;
	private int cartaCorrecaoSq;
	private String chave;
	private String cnpj;
	private String codOrgao;
	private String correcao;
	private Timestamp dhEvento;
	private int nSeqEvento;
	private Nfiscal nfiscai;

    public CartaCorrecao() {
    }


	@Id
	@Column(name="carta_correcao_sq", unique=true, nullable=false)
	public int getCartaCorrecaoSq() {
		return this.cartaCorrecaoSq;
	}

	public void setCartaCorrecaoSq(int cartaCorrecaoSq) {
		this.cartaCorrecaoSq = cartaCorrecaoSq;
	}


	@Column(nullable=false, length=44)
	public String getChave() {
		return this.chave;
	}

	public void setChave(String chave) {
		this.chave = chave;
	}


	@Column(nullable=false, length=14)
	public String getCnpj() {
		return this.cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}


	@Column(name="cod_orgao", nullable=false, length=2)
	public String getCodOrgao() {
		return this.codOrgao;
	}

	public void setCodOrgao(String codOrgao) {
		this.codOrgao = codOrgao;
	}


	@Column(nullable=false, length=1000)
	public String getCorrecao() {
		return this.correcao;
	}

	public void setCorrecao(String correcao) {
		this.correcao = correcao;
	}


	@Column(name="dh_evento")
	public Timestamp getDhEvento() {
		return this.dhEvento;
	}

	public void setDhEvento(Timestamp dhEvento) {
		this.dhEvento = dhEvento;
	}


	@Column(name="n_seq_evento")
	public int getNSeqEvento() {
		return this.nSeqEvento;
	}

	public void setNSeqEvento(int nSeqEvento) {
		this.nSeqEvento = nSeqEvento;
	}


	//bi-directional many-to-one association to Nfiscai
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="nfiscal_sq", nullable=false)
	public Nfiscal getNfiscai() {
		return this.nfiscai;
	}

	public void setNfiscai(Nfiscal nfiscai) {
		this.nfiscai = nfiscai;
	}
	
}