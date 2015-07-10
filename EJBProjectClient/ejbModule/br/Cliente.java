package br;

import java.util.Properties;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import br.com.msystem.bean.EntityBeanRemote;

public class Cliente {

	/**
	 * @param args
	 * @throws NamingException
	 */
	public static void main(String[] args) throws NamingException {
		Properties props = new Properties();

		props.put(Context.INITIAL_CONTEXT_FACTORY,
				"com.sun.enterprise.naming.SerialInitContextFactory");

		props.setProperty("org.omg.CORBA.ORBInitialHost", "localhost");
		props.setProperty("org.omg.CORBA.ORBInitialPort", "3700");

		InitialContext ctx = new InitialContext(props);
		/*
		 * System.out.println(((ModeloBeanRemote) ctx
		 * .lookup("EARProject-EJBProject-ModeloBean")).queryByRange(
		 * "select m from Modelo m", 1, 50)); System.out.println(((Bean1Remote)
		 * ctx.lookup("FooBean")) .obterValor("select m from Modelo m"));
		 */
		EntityBeanRemote bean1 = (EntityBeanRemote) ctx
				.lookup("ejb/EARProject/EJBProject/EntityBean");
		System.out.println("Numero de modelos: "
				+ bean1.queryByRange("select m from Modelo m", 1, 100).size());

		/*
		 * Modelo registro = new Modelo(); registro.setCodigoModelo("1234567");
		 * registro.setDescricaoModelo("Descricao..."); bean1.persist(registro);
		 * 
		 * System.out.println("Persistido");
		 * System.out.println("Numero de modelos: " +
		 * bean1.queryByRange("select m from Modelo m", 1, 100).size());
		 * 
		 * bean1.remove(registro); System.out.println("Removido");
		 * System.out.println("Numero de modelos: " +
		 * bean1.queryByRange("select m from Modelo m", 1, 100).size());
		 */

	}

}
