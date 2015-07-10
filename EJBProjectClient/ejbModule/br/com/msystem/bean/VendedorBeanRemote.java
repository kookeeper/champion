package br.com.msystem.bean;

import javax.ejb.Remote;

import br.com.msystem.entidade.Vendedor;

@Remote
public interface VendedorBeanRemote extends GenericBeanRemote<Vendedor> {

	boolean validarDesconto(double vlrTotal, double vlrDesc,
			int pctDescontoMaximo);

}
