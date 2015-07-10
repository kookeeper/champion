package br.com.msystem.jobs;


public class AtualizarImagem {
	
	public static void atualizarImagem(String path) {
		new AtualizarImagem().execute(path);
	}
	
	private void execute(String path) {
/*
		InitialContext ctx = new InitialContext();
		ProdutoBeanRemote bean = (ProdutoBeanRemote) ctx
				.lookup("ejb/EARProject/EJBProject/ProdutoBean");
		
		List<Produto> listaProduto = bean.listar("codigoProduto");
		FileUtils.setPath(path);
		for (Produto produto: listaProduto) {
			try {
				if (!FileUtils.existeImagemLocal(produto.getCodigoProduto())) {
					FileUtils.downloadImagemSite(produto.getCodigoProduto());
				}
				if (!FileUtils.existeThumbnailLocal(produto.getCodigoProduto())) {
					FileUtils.criarThumbnailLocal(produto.getCodigoProduto());
				}
			} catch (IOException ex) {
				throw new SystemException("IOError writing file to output stream",
						ex);
			}
		}
*/
	}
}