package br.com.msystem.bean;

import javax.ejb.Stateless;

import br.com.msystem.entidade.CondPagto;

/**
 * Session Bean implementation class CondPagtoBean
 */
@Stateless(mappedName = "ejb/EARProject/EJBProject/CondPagtoBean")
public class CondPagtoBean extends GenericBean<CondPagto> implements CondPagtoBeanRemote, CondPagtoBeanLocal {
       
    /**
     * @see GenericBean#GenericBean()
     */
    public CondPagtoBean() {
        super();
        // TODO Auto-generated constructor stub
    }

}
