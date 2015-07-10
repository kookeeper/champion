package br.com.msystem.champion.controller;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.EJB;
import javax.naming.NamingException;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import br.com.msystem.bean.ClienteBeanRemote;
import br.com.msystem.bean.CondPagtoBeanRemote;
import br.com.msystem.bean.ModeloBeanRemote;
import br.com.msystem.bean.NaturezaBeanRemote;
import br.com.msystem.bean.Node;
import br.com.msystem.bean.ProdutoBeanRemote;
import br.com.msystem.bean.VendedorBeanRemote;
import br.com.msystem.entidade.CondPagto;
import br.com.msystem.entidade.Produto;
import br.com.msystem.entidade.Vendedor;


@Controller
public class JsonController {

	@EJB(mappedName = "ejb/EARProject/EJBProject/ProdutoBean")
	ProdutoBeanRemote produtoBean;

	@EJB(mappedName = "ejb/EARProject/EJBProject/ModeloBean")
	ModeloBeanRemote modeloBean;

	@EJB(mappedName = "ejb/EARProject/EJBProject/ClienteBean")
	ClienteBeanRemote clienteBean;

	@EJB(mappedName = "ejb/EARProject/EJBProject/NaturezaBean")
	NaturezaBeanRemote naturezaBean;

	@EJB(mappedName = "ejb/EARProject/EJBProject/VendedorBean")
	VendedorBeanRemote vendedorBean;

	@EJB(mappedName = "ejb/EARProject/EJBProject/CondPagtoBean")
	CondPagtoBeanRemote condPagtoBean;

	@RequestMapping(value = "/listarProdutoPorModelo")
	public @ResponseBody List<Produto> listarProdutoPorModelo(@RequestParam String listaModelo) {
		if (listaModelo.isEmpty()) {
			return new ArrayList<Produto>();
		}

//		InitialContext ctx = new InitialContext();
//		ProdutoBeanRemote produtoBean = (ProdutoBeanRemote) ctx.lookup("ejb/EARProject/EJBProject/ProdutoBean");
		List<Produto> lista = produtoBean.listarProdutoPorModelo(listaModelo);
		return lista;
	}

	@RequestMapping(value = "/listarProdutoPorCodigo")
	public @ResponseBody List<Produto> listarProdutoPorCodigo(@RequestParam String codigoProduto) {
		if (codigoProduto.equals("")) {
			return new ArrayList<Produto>();
		}
		codigoProduto.replaceAll("%", "");

//		InitialContext ctx = new InitialContext();
//		ProdutoBeanRemote produtoBean = (ProdutoBeanRemote) ctx.lookup("ejb/EARProject/EJBProject/ProdutoBean");
		List<Produto> lista = produtoBean.listarProdutoPorCodigo("%" + codigoProduto + "%");
		return lista;
	}

	@RequestMapping(value = "/treeModelo")
	public @ResponseBody List<Node> getShopInJSON() {
//		InitialContext ctx = new InitialContext();
//		ModeloBeanRemote modeloBean = (ModeloBeanRemote) ctx.lookup("ejb/EARProject/EJBProject/ModeloBean");
		
		List<Node> listaNode = modeloBean.listarTreeView();
		return listaNode;
	}

	@RequestMapping(value = "/listarVendedor")
	public @ResponseBody List<Vendedor> listarVendedor() {
//		InitialContext ctx = new InitialContext();
//		VendedorBeanRemote vendedorBean = (VendedorBeanRemote) ctx.lookup("ejb/EARProject/EJBProject/VendedorBean");
		return vendedorBean.listar("vendedorSq","codigoVendedor","nomeVendedor");
	}

	@RequestMapping(value = "/listarCondPagto")
	public @ResponseBody List<CondPagto> listarCondPagto() {
//		InitialContext ctx = new InitialContext();
//		CondPagtoBeanRemote condPagtoBean = (CondPagtoBeanRemote) ctx.lookup("ejb/EARProject/EJBProject/CondPagtoBean");
		return condPagtoBean.listar("condPagtoSq","codigoCondPagto","descricaoCondPagto");
	}

}
