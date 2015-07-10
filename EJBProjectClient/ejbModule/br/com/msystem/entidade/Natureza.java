package br.com.msystem.entidade;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;


/**
 * The persistent class for the naturezas database table.
 * 
 */
@Entity
@Table(name="naturezas")
public class Natureza implements Serializable {
	private static final long serialVersionUID = 1L;
	private int naturezaSq;
	private BigDecimal aliqIcms;
	private BigDecimal aliqIpi;
	private String cfo;
	private String cfoSubst;
	private int codigoNatureza;
	private String descricaoNatureza;
	private String descricaoNaturezaNfiscal;
	private String entSai;
	private String icmsSubst;
	private String isencaoIcms;
	private String isencaoIpi;
	private int numeroEstoqueEntrada;
	private int numeroEstoqueSaida;
	private String observacao;
	private int tipoNfiscal;
	private String uf01;
	private String uf02;
	private String uf03;
	private String uf04;
	private String uf05;
	private String uf06;
	private String uf07;
	private String uf08;
	private String uf09;
	private String uf10;
	private String uf11;
	private String uf12;
	private String uf13;
	private String uf14;
	private String uf15;
	private String uf16;
	private String uf17;
	private String uf18;
	private String uf19;
	private String uf20;
	private String uf21;
	private String uf22;
	private String uf23;
	private String uf24;
	private String uf25;
	private String uf26;
	private String uf27;
	private String uf28;
	private String uf29;
	private String uf30;
	private List<NfEntrada> nfEntradas;
	private List<Nfiscal> nfiscais1;
	private List<Nfiscal> nfiscais2;
	private List<Pedido> pedidos;

    public Natureza() {
    }


	@Id
	@Column(name="NATUREZA_SQ", unique=true, nullable=false)
	public int getNaturezaSq() {
		return this.naturezaSq;
	}

	public void setNaturezaSq(int naturezaSq) {
		this.naturezaSq = naturezaSq;
	}


	@Column(name="ALIQ_ICMS", precision=10, scale=2)
	public BigDecimal getAliqIcms() {
		return this.aliqIcms;
	}

	public void setAliqIcms(BigDecimal aliqIcms) {
		this.aliqIcms = aliqIcms;
	}


	@Column(name="ALIQ_IPI", precision=10, scale=2)
	public BigDecimal getAliqIpi() {
		return this.aliqIpi;
	}

	public void setAliqIpi(BigDecimal aliqIpi) {
		this.aliqIpi = aliqIpi;
	}


	@Column(nullable=false, length=4)
	public String getCfo() {
		return this.cfo;
	}

	public void setCfo(String cfo) {
		this.cfo = cfo;
	}


	@Column(name="cfo_subst", length=4)
	public String getCfoSubst() {
		return this.cfoSubst;
	}

	public void setCfoSubst(String cfoSubst) {
		this.cfoSubst = cfoSubst;
	}


	@Column(name="CODIGO_NATUREZA", nullable=false)
	public int getCodigoNatureza() {
		return this.codigoNatureza;
	}

	public void setCodigoNatureza(int codigoNatureza) {
		this.codigoNatureza = codigoNatureza;
	}


	@Column(name="DESCRICAO_NATUREZA", nullable=false, length=50)
	public String getDescricaoNatureza() {
		return this.descricaoNatureza;
	}

	public void setDescricaoNatureza(String descricaoNatureza) {
		this.descricaoNatureza = descricaoNatureza;
	}


	@Column(name="DESCRICAO_NATUREZA_NFISCAL", length=50)
	public String getDescricaoNaturezaNfiscal() {
		return this.descricaoNaturezaNfiscal;
	}

	public void setDescricaoNaturezaNfiscal(String descricaoNaturezaNfiscal) {
		this.descricaoNaturezaNfiscal = descricaoNaturezaNfiscal;
	}


	@Column(name="ENT_SAI", length=1)
	public String getEntSai() {
		return this.entSai;
	}

	public void setEntSai(String entSai) {
		this.entSai = entSai;
	}


	@Column(name="icms_subst", length=1)
	public String getIcmsSubst() {
		return this.icmsSubst;
	}

	public void setIcmsSubst(String icmsSubst) {
		this.icmsSubst = icmsSubst;
	}


	@Column(name="ISENCAO_ICMS", length=1)
	public String getIsencaoIcms() {
		return this.isencaoIcms;
	}

	public void setIsencaoIcms(String isencaoIcms) {
		this.isencaoIcms = isencaoIcms;
	}


	@Column(name="ISENCAO_IPI", length=1)
	public String getIsencaoIpi() {
		return this.isencaoIpi;
	}

	public void setIsencaoIpi(String isencaoIpi) {
		this.isencaoIpi = isencaoIpi;
	}


	@Column(name="numero_estoque_entrada")
	public int getNumeroEstoqueEntrada() {
		return this.numeroEstoqueEntrada;
	}

	public void setNumeroEstoqueEntrada(int numeroEstoqueEntrada) {
		this.numeroEstoqueEntrada = numeroEstoqueEntrada;
	}


	@Column(name="numero_estoque_saida")
	public int getNumeroEstoqueSaida() {
		return this.numeroEstoqueSaida;
	}

	public void setNumeroEstoqueSaida(int numeroEstoqueSaida) {
		this.numeroEstoqueSaida = numeroEstoqueSaida;
	}


    @Lob()
	public String getObservacao() {
		return this.observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}


	@Column(name="TIPO_NFISCAL")
	public int getTipoNfiscal() {
		return this.tipoNfiscal;
	}

	public void setTipoNfiscal(int tipoNfiscal) {
		this.tipoNfiscal = tipoNfiscal;
	}


	@Column(length=2)
	public String getUf01() {
		return this.uf01;
	}

	public void setUf01(String uf01) {
		this.uf01 = uf01;
	}


	@Column(length=2)
	public String getUf02() {
		return this.uf02;
	}

	public void setUf02(String uf02) {
		this.uf02 = uf02;
	}


	@Column(length=2)
	public String getUf03() {
		return this.uf03;
	}

	public void setUf03(String uf03) {
		this.uf03 = uf03;
	}


	@Column(length=2)
	public String getUf04() {
		return this.uf04;
	}

	public void setUf04(String uf04) {
		this.uf04 = uf04;
	}


	@Column(length=2)
	public String getUf05() {
		return this.uf05;
	}

	public void setUf05(String uf05) {
		this.uf05 = uf05;
	}


	@Column(length=2)
	public String getUf06() {
		return this.uf06;
	}

	public void setUf06(String uf06) {
		this.uf06 = uf06;
	}


	@Column(length=2)
	public String getUf07() {
		return this.uf07;
	}

	public void setUf07(String uf07) {
		this.uf07 = uf07;
	}


	@Column(length=2)
	public String getUf08() {
		return this.uf08;
	}

	public void setUf08(String uf08) {
		this.uf08 = uf08;
	}


	@Column(length=2)
	public String getUf09() {
		return this.uf09;
	}

	public void setUf09(String uf09) {
		this.uf09 = uf09;
	}


	@Column(length=2)
	public String getUf10() {
		return this.uf10;
	}

	public void setUf10(String uf10) {
		this.uf10 = uf10;
	}


	@Column(length=2)
	public String getUf11() {
		return this.uf11;
	}

	public void setUf11(String uf11) {
		this.uf11 = uf11;
	}


	@Column(length=2)
	public String getUf12() {
		return this.uf12;
	}

	public void setUf12(String uf12) {
		this.uf12 = uf12;
	}


	@Column(length=2)
	public String getUf13() {
		return this.uf13;
	}

	public void setUf13(String uf13) {
		this.uf13 = uf13;
	}


	@Column(length=2)
	public String getUf14() {
		return this.uf14;
	}

	public void setUf14(String uf14) {
		this.uf14 = uf14;
	}


	@Column(length=2)
	public String getUf15() {
		return this.uf15;
	}

	public void setUf15(String uf15) {
		this.uf15 = uf15;
	}


	@Column(length=2)
	public String getUf16() {
		return this.uf16;
	}

	public void setUf16(String uf16) {
		this.uf16 = uf16;
	}


	@Column(length=2)
	public String getUf17() {
		return this.uf17;
	}

	public void setUf17(String uf17) {
		this.uf17 = uf17;
	}


	@Column(length=2)
	public String getUf18() {
		return this.uf18;
	}

	public void setUf18(String uf18) {
		this.uf18 = uf18;
	}


	@Column(length=2)
	public String getUf19() {
		return this.uf19;
	}

	public void setUf19(String uf19) {
		this.uf19 = uf19;
	}


	@Column(length=2)
	public String getUf20() {
		return this.uf20;
	}

	public void setUf20(String uf20) {
		this.uf20 = uf20;
	}


	@Column(length=2)
	public String getUf21() {
		return this.uf21;
	}

	public void setUf21(String uf21) {
		this.uf21 = uf21;
	}


	@Column(length=2)
	public String getUf22() {
		return this.uf22;
	}

	public void setUf22(String uf22) {
		this.uf22 = uf22;
	}


	@Column(length=2)
	public String getUf23() {
		return this.uf23;
	}

	public void setUf23(String uf23) {
		this.uf23 = uf23;
	}


	@Column(length=2)
	public String getUf24() {
		return this.uf24;
	}

	public void setUf24(String uf24) {
		this.uf24 = uf24;
	}


	@Column(length=2)
	public String getUf25() {
		return this.uf25;
	}

	public void setUf25(String uf25) {
		this.uf25 = uf25;
	}


	@Column(length=2)
	public String getUf26() {
		return this.uf26;
	}

	public void setUf26(String uf26) {
		this.uf26 = uf26;
	}


	@Column(length=2)
	public String getUf27() {
		return this.uf27;
	}

	public void setUf27(String uf27) {
		this.uf27 = uf27;
	}


	@Column(length=2)
	public String getUf28() {
		return this.uf28;
	}

	public void setUf28(String uf28) {
		this.uf28 = uf28;
	}


	@Column(length=2)
	public String getUf29() {
		return this.uf29;
	}

	public void setUf29(String uf29) {
		this.uf29 = uf29;
	}


	@Column(length=2)
	public String getUf30() {
		return this.uf30;
	}

	public void setUf30(String uf30) {
		this.uf30 = uf30;
	}


	//bi-directional many-to-one association to NfEntrada
	@OneToMany(mappedBy="natureza")
	public List<NfEntrada> getNfEntradas() {
		return this.nfEntradas;
	}

	public void setNfEntradas(List<NfEntrada> nfEntradas) {
		this.nfEntradas = nfEntradas;
	}
	

	//bi-directional many-to-one association to Nfiscai
	@OneToMany(mappedBy="natureza1")
	public List<Nfiscal> getNfiscais1() {
		return this.nfiscais1;
	}

	public void setNfiscais1(List<Nfiscal> nfiscais1) {
		this.nfiscais1 = nfiscais1;
	}
	

	//bi-directional many-to-one association to Nfiscai
	@OneToMany(mappedBy="natureza2")
	public List<Nfiscal> getNfiscais2() {
		return this.nfiscais2;
	}

	public void setNfiscais2(List<Nfiscal> nfiscais2) {
		this.nfiscais2 = nfiscais2;
	}
	

	//bi-directional many-to-one association to Pedido
	@OneToMany(mappedBy="natureza")
	public List<Pedido> getPedidos() {
		return this.pedidos;
	}

	public void setPedidos(List<Pedido> pedidos) {
		this.pedidos = pedidos;
	}
	
}