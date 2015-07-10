package br.com.msystem.entidade;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the hist_alteracoes database table.
 * 
 */
@Entity
@Table(name="hist_alteracoes")
public class HistoricoAlteracao implements Serializable {
	private static final long serialVersionUID = 1L;
	private int histAlteracaoSq;
	private int chaveSq;
	private Timestamp dataAlteracao;
	private String nomeTabela;
	private String observacao;
	private int tipoAlteracao;
	private Usuario usuario;

    public HistoricoAlteracao() {
    }


	@Id
	@Column(name="HIST_ALTERACAO_SQ", unique=true, nullable=false)
	public int getHistAlteracaoSq() {
		return this.histAlteracaoSq;
	}

	public void setHistAlteracaoSq(int histAlteracaoSq) {
		this.histAlteracaoSq = histAlteracaoSq;
	}


	@Column(name="chave_sq", nullable=false)
	public int getChaveSq() {
		return this.chaveSq;
	}

	public void setChaveSq(int chaveSq) {
		this.chaveSq = chaveSq;
	}


	@Column(name="DATA_ALTERACAO", nullable=false)
	public Timestamp getDataAlteracao() {
		return this.dataAlteracao;
	}

	public void setDataAlteracao(Timestamp dataAlteracao) {
		this.dataAlteracao = dataAlteracao;
	}


	@Column(name="NOME_TABELA", nullable=false, length=50)
	public String getNomeTabela() {
		return this.nomeTabela;
	}

	public void setNomeTabela(String nomeTabela) {
		this.nomeTabela = nomeTabela;
	}


    @Lob()
	public String getObservacao() {
		return this.observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}


	@Column(name="TIPO_ALTERACAO", nullable=false)
	public int getTipoAlteracao() {
		return this.tipoAlteracao;
	}

	public void setTipoAlteracao(int tipoAlteracao) {
		this.tipoAlteracao = tipoAlteracao;
	}


	//bi-directional many-to-one association to Usuario
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="USUARIO_SQ", nullable=false)
	public Usuario getUsuario() {
		return this.usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
}