package br.com.msystem.bean;

import java.lang.reflect.ParameterizedType;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import javax.persistence.criteria.Selection;

@SuppressWarnings("unchecked")
public class GenericBean<T> implements GenericBeanRemote<T>,
		GenericBeanLocal<T> {

	@PersistenceContext(unitName = "EJBProject")
	protected EntityManager em;
	private Class<T> persistentClass;

	public GenericBean() {
		this.persistentClass = (Class<T>) ((ParameterizedType) getClass()
				.getGenericSuperclass()).getActualTypeArguments()[0];
	}

	@Override
	public T buscarPorId(int indice) {
		return em.find(persistentClass, indice);
	}

	@Override
	public List<T> listar(String... listaCampo) {
		CriteriaQuery<T> criteriaQuery = em.getCriteriaBuilder().createQuery(persistentClass);
		Root<T> root = criteriaQuery.from(persistentClass);
		List<Selection<?>> listaSelection = new ArrayList<Selection<?>>();
		for (String campo: listaCampo) {
			listaSelection.add(root.get(campo));
		}
		criteriaQuery.multiselect(listaSelection);
		TypedQuery<T> query = em.createQuery(criteriaQuery);
		List<T> lista = query.getResultList();
		return lista;
	}
}
