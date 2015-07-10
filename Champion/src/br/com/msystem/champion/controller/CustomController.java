package br.com.msystem.champion.controller;

import java.io.IOException;
import java.io.InputStream;
import java.math.BigDecimal;

import javax.naming.InitialContext;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.io.IOUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import br.com.msystem.bean.CondPagtoBeanRemote;
import br.com.msystem.bean.PedidoBeanRemote;
import br.com.msystem.bean.VendedorBeanRemote;
import br.com.msystem.entidade.CondPagto;
import br.com.msystem.entidade.Vendedor;
import br.com.msystem.exception.SystemException;
import br.com.msystem.util.FileUtils;
import br.com.msystem.util.RegistroVendaForm;

@Controller
public class CustomController {

	@RequestMapping(value = "/welcome", method = RequestMethod.GET)
	public ModelAndView handleRequestInternal(HttpSession session) {
		ModelAndView model = new ModelAndView("registrarVenda");
		model.addObject("msg", "Bem vindo...");
		return model;
	}

	@RequestMapping(value = "/registrarVenda", method = RequestMethod.POST)
	public void registrarVenda(@RequestBody RegistroVendaForm form) {

		if (form.getCondPagtoSq1() == null) {
			throw new SystemException("Selecione uma condição de pagamento válida.");
		}

		try {
			InitialContext ctx = new InitialContext();
			PedidoBeanRemote bean = (PedidoBeanRemote) ctx
					.lookup("ejb/EARProject/EJBProject/PedidoBean");
			VendedorBeanRemote vendedorBean = (VendedorBeanRemote) ctx
					.lookup("ejb/EARProject/EJBProject/VendedorBean");
			CondPagtoBeanRemote condPagtoBean = (CondPagtoBeanRemote) ctx
					.lookup("ejb/EARProject/EJBProject/CondPagtoBean");

			Vendedor vendedor = vendedorBean.buscarPorId(form.getVendedorSq());
			CondPagto condPagto1 = condPagtoBean.buscarPorId(form
					.getCondPagtoSq1());

			CondPagto condPagto2 = null;
			if (form.getCondPagtoSq2() != null) {
				condPagto2 = condPagtoBean.buscarPorId(form.getCondPagtoSq2());
			}

			CondPagto condPagto3 = null;
			if (form.getCondPagtoSq3() != null) {
				condPagto3 = condPagtoBean.buscarPorId(form.getCondPagtoSq3());
			}

			BigDecimal vlrDesc = null;
			if (form.getVlrDesc() != null) {
				vlrDesc = form.getVlrDesc();
			}

			bean.registrarVenda(form.getListaProduto(), vendedor, condPagto1,
					condPagto2, condPagto3, form.getVlrCondPagto1(),
					form.getVlrCondPagto2(), form.getVlrCondPagto3(),
					form.getCpf(), vlrDesc, form.getNumeroComprovanteCartao());
		} catch (Exception e) {
			e.printStackTrace();
			throw new SystemException("Erro ao tentar incluir pedido", e);
		}
	}

	@RequestMapping(value = "/imagens/{file_name}", method = RequestMethod.GET)
	public void getFileImagem(@PathVariable("file_name") String fileName,
			HttpServletResponse response) {
		try {
			InputStream is = FileUtils.buscarImagem(fileName);

			// copy it to response's OutputStream
			IOUtils.copy(is, response.getOutputStream());
			response.flushBuffer();
		} catch (IOException ex) {
			throw new SystemException("IOError writing file to output stream",
					ex);
		}
	}

	@RequestMapping(value = "/imagens/thumbnail/{file_name}", method = RequestMethod.GET)
	public void getFileThumbnail(@PathVariable("file_name") String fileName,
			HttpServletResponse response) {
		try {
			InputStream is = FileUtils.buscarThumbnail(fileName);

			// copy it to response's OutputStream
			IOUtils.copy(is, response.getOutputStream());
			response.flushBuffer();
		} catch (IOException ex) {
			throw new SystemException("IOError writing file to output stream",
					ex);
		}
	}

}
