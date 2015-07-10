package br.com.msystem.bean;

import javax.ejb.Stateless;

import br.com.msystem.entidade.Natureza;

/**
 * Session Bean implementation class NaturezaBean
 */
@Stateless(mappedName = "ejb/EARProject/EJBProject/NaturezaBean")
public class NaturezaBean extends GenericBean<Natureza> implements NaturezaBeanRemote, NaturezaBeanLocal {
       
    /**
     * @see GenericBean#GenericBean()
     */
    public NaturezaBean() {
        super();
        // TODO Auto-generated constructor stub
    }

}
