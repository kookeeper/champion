package br.com.msystem.bean;

import java.util.List;

import javax.ejb.Remote;

@Remote
public interface ModeloBeanRemote {

	List<Node> listarTreeView();

}
