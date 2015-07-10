package br.com.msystem.bean;

import javax.ejb.Stateless;

/**
 * Session Bean implementation class FooBean
 */
@Stateless(mappedName="ejb/EARProject/EJBProject/FooBean1")
public class FooBean implements FooBeanRemote, FooBeanLocal {

    /**
     * Default constructor. 
     */
    public FooBean() {
    }

}
