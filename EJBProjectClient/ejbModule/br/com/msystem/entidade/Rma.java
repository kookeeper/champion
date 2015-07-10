package br.com.msystem.entidade;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the rma database table.
 * 
 */
@Entity
@Table(name="rma")
public class Rma implements Serializable {
	private static final long serialVersionUID = 1L;
	private int rmaSq;
	private Date dataCompra;
	private Date dataEmissaoNf;
	private Date dataEntradaNf;
	private String emailCliente;
	private String enderecoCliente;
	private String formaEnvio;
	private String lojaCliente;
	private int nfCompra;
	private String nomeCliente;
	private int numeroNfCliente;
	private int numeroRma;
	private String responsavelCliente;
	private String telefoneCliente;
	private List<RmaItem> rmaItems;

    public Rma() {
    }


	@Id
	@Column(name="rma_sq", unique=true, nullable=false)
	public int getRmaSq() {
		return this.rmaSq;
	}

	public void setRmaSq(int rmaSq) {
		this.rmaSq = rmaSq;
	}


    @Temporal( TemporalType.DATE)
	@Column(name="data_compra")
	public Date getDataCompra() {
		return this.dataCompra;
	}

	public void setDataCompra(Date dataCompra) {
		this.dataCompra = dataCompra;
	}


    @Temporal( TemporalType.DATE)
	@Column(name="data_emissao_nf")
	public Date getDataEmissaoNf() {
		return this.dataEmissaoNf;
	}

	public void setDataEmissaoNf(Date dataEmissaoNf) {
		this.dataEmissaoNf = dataEmissaoNf;
	}


    @Temporal( TemporalType.DATE)
	@Column(name="data_entrada_nf", nullable=false)
	public Date getDataEntradaNf() {
		return this.dataEntradaNf;
	}

	public void setDataEntradaNf(Date dataEntradaNf) {
		this.dataEntradaNf = dataEntradaNf;
	}


	@Column(name="email_cliente", length=100)
	public String getEmailCliente() {
		return this.emailCliente;
	}

	public void setEmailCliente(String emailCliente) {
		this.emailCliente = emailCliente;
	}


	@Column(name="endereco_cliente", length=200)
	public String getEnderecoCliente() {
		return this.enderecoCliente;
	}

	public void setEnderecoCliente(String enderecoCliente) {
		this.enderecoCliente = enderecoCliente;
	}


	@Column(name="forma_envio", length=20)
	public String getFormaEnvio() {
		return this.formaEnvio;
	}

	public void setFormaEnvio(String formaEnvio) {
		this.formaEnvio = formaEnvio;
	}


	@Column(name="loja_cliente", length=100)
	public String getLojaCliente() {
		return this.lojaCliente;
	}

	public void setLojaCliente(String lojaCliente) {
		this.lojaCliente = lojaCliente;
	}


	@Column(name="nf_compra")
	public int getNfCompra() {
		return this.nfCompra;
	}

	public void setNfCompra(int nfCompra) {
		this.nfCompra = nfCompra;
	}


	@Column(name="nome_cliente", nullable=false, length=50)
	public String getNomeCliente() {
		return this.nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}


	@Column(name="numero_nf_cliente")
	public int getNumeroNfCliente() {
		return this.numeroNfCliente;
	}

	public void setNumeroNfCliente(int numeroNfCliente) {
		this.numeroNfCliente = numeroNfCliente;
	}


	@Column(name="numero_rma", nullable=false)
	public int getNumeroRma() {
		return this.numeroRma;
	}

	public void setNumeroRma(int numeroRma) {
		this.numeroRma = numeroRma;
	}


	@Column(name="responsavel_cliente", length=50)
	public String getResponsavelCliente() {
		return this.responsavelCliente;
	}

	public void setResponsavelCliente(String responsavelCliente) {
		this.responsavelCliente = responsavelCliente;
	}


	@Column(name="telefone_cliente", length=20)
	public String getTelefoneCliente() {
		return this.telefoneCliente;
	}

	public void setTelefoneCliente(String telefoneCliente) {
		this.telefoneCliente = telefoneCliente;
	}


	//bi-directional many-to-one association to RmaItem
	@OneToMany(mappedBy="rma")
	public List<RmaItem> getRmaItems() {
		return this.rmaItems;
	}

	public void setRmaItems(List<RmaItem> rmaItems) {
		this.rmaItems = rmaItems;
	}
	
}