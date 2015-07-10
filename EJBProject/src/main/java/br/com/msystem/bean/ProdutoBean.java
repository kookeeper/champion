package br.com.msystem.bean;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import br.com.msystem.entidade.Produto;


/**
 * @generated DT_ID=none
 */
@Stateless(mappedName = "ejb/EARProject/EJBProject/ProdutoBean")
public class ProdutoBean extends GenericBean<Produto>
        implements ProdutoBeanLocal, ProdutoBeanRemote
{

    /**
     * @generated DT_ID=none
     */
    @PersistenceContext(unitName="EJBProject")
    private EntityManager em;

    /**
     * @generated DT_ID=none
     */
    public ProdutoBean() {
    }

    @Override
	public List<Produto> listarProdutoPorModelo(String listaModelo) {
    	Query query = em.createQuery("select p.produtoSq, p.codigoProduto, p.descricaoProduto, p.precoUnit from Produto p where p.modelo.modeloSq in :listaModelo");
        query.setParameter("listaModelo", Arrays.asList(listaModelo.split(",")));

		@SuppressWarnings("unchecked")
		List<Object[]> lista = query.getResultList();
		List<Produto> listaProduto = new ArrayList<Produto>();
		
		for (Object[] registro: lista) {
			Produto produto = new Produto();
			produto.setProdutoSq(((Integer)registro[0]).intValue());
			produto.setCodigoProduto((String) registro[1]);
			produto.setDescricaoProduto((String)registro[2]);
			produto.setPrecoUnit((BigDecimal) registro[3]);
			listaProduto.add(produto);
		}

        return listaProduto;
    }

	@Override
	public List<Produto> listarProdutoPorCodigo(String codigoProduto) {
		Query query = em.createQuery("select p.produtoSq, p.codigoProduto, p.descricaoProduto, p.precoUnit from Produto p where upper(p.codigoProduto) like :codigoProduto");
        query.setParameter("codigoProduto", codigoProduto.toUpperCase());

		@SuppressWarnings("unchecked")
		List<Object[]> lista = query.getResultList();
		List<Produto> listaProduto = new ArrayList<Produto>();
		
		for (Object[] registro: lista) {
			Produto produto = new Produto();
			produto.setProdutoSq(((Integer)registro[0]).intValue());
			produto.setCodigoProduto((String) registro[1]);
			produto.setDescricaoProduto((String)registro[2]);
			produto.setPrecoUnit((BigDecimal) registro[3]);
			listaProduto.add(produto);
		}

        return listaProduto;
	}

	@Override
	public Produto buscarProduto(String codigoProduto) {
		TypedQuery<Produto> query = em.createQuery("select p from Produto p where p.codigoProduto = :codigoProduto", Produto.class);
		query.setParameter("codigoProduto", codigoProduto);
		return query.getSingleResult();
	}
}
