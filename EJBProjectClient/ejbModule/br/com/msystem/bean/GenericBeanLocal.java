package br.com.msystem.bean;

import java.util.List;

public interface GenericBeanLocal<T> {

	T buscarPorId(int indice);

	List<T> listar(String... listaCampo);

}
