package br.com.msystem.bean;

import javax.ejb.Stateless;

import br.com.msystem.entidade.Vendedor;
import br.com.msystem.exception.SystemException;

/**
 * Session Bean implementation class VendedorBean
 */
@Stateless(mappedName = "ejb/EARProject/EJBProject/VendedorBean")
public class VendedorBean extends GenericBean<Vendedor> implements VendedorBeanRemote, VendedorBeanLocal {

    /**
     * Default constructor. 
     */
    public VendedorBean() {
    }

    @Override
	public boolean validarDesconto(double vlrTotal,
			double vlrDesc, int pctDescontoMaximo) {
		
		double vlrDescontoMaximo = Math.ceil(vlrTotal * vlrDesc / 100);
		if (vlrDesc > vlrDescontoMaximo) {
			vlrDescontoMaximo = Math.ceil(vlrTotal * pctDescontoMaximo / 100);
			if (vlrDesc > vlrDescontoMaximo) {
				throw new SystemException("O valor do desconto informado é maior que o permitido.");
			}
			return true;
		} else {
			return false;
		}
	}

}
