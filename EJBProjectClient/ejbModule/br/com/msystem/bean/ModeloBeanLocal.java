package br.com.msystem.bean;

import java.util.List;

import javax.ejb.Local;

@Local
public interface ModeloBeanLocal {

	List<Node> listarTreeView();

}
