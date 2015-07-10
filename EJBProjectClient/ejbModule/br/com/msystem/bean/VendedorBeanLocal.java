package br.com.msystem.bean;

import javax.ejb.Local;

@Local
public interface VendedorBeanLocal {

	boolean validarDesconto(double vlrTotal, double vlrDesc,
			int pctDescontoMaximo);

}
