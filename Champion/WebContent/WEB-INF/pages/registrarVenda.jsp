<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registro de vendas</title>
<script>
	var contextPath = "${pageContext.request.contextPath}";
</script>
<script type="text/javascript" src="${pageContext.request.contextPath}/dynatree/jquery/jquery.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/dynatree/jquery/jquery-ui.custom.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/dynatree/dist/jquery.dynatree-1.2.4.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/dynatree/jquery/jquery.cookie.js"></script>
	
<script type="text/javascript" src="${pageContext.request.contextPath}/galleriffic/js/jquery.galleriffic.js"></script>

<!-- Optionally include jquery.history.js for history support -->
<script type="text/javascript" src="${pageContext.request.contextPath}/galleriffic/js/jquery.history.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/galleriffic/js/jquery.opacityrollover.js"></script>

<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery.blockUI.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/bloqueio.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery.validate.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/additional-methods.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery.json-2.4.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/registrarVenda.js"></script>

<link rel="stylesheet" href="${pageContext.request.contextPath}/galleriffic/css/basic.css">
<link rel="stylesheet" href="${pageContext.request.contextPath}/galleriffic/css/galleriffic-2.css">
<link rel="stylesheet" href="${pageContext.request.contextPath}/dynatree/skin/ui.dynatree.css">
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/registrarVenda.css">
</head>
<body>
	<div id="top">
		<input id="codigoProduto">
		<img alt="Filtrar produtos" onclick="filtrarProdutoPorCodigo();" src="${pageContext.request.contextPath}/imagens/find.jpg">
		<div id="top_right">
			<label id="total_carrinho">Total</label>
			<img class="visualizarPedido" alt="Visualizar Pedido" onclick="visualizarPedido();" src="${pageContext.request.contextPath}/imagens/cart.jpg">
		</div>
	</div>
	<div id="right">
		<div id="gallery" class="content">
			<div id="controls" class="controls">
				<img class="incluirItem" alt="Incluir item" onclick="incluirItemSelecionado();" src="${pageContext.request.contextPath}/imagens/cart-in.jpg">
			</div>
			<div class="slideshow-container">
				<div id="loading" class="loader"></div>
				<div id="slideshow" class="slideshow"></div>
			</div>
			<div id="caption" class="caption-container"></div>
		</div>
		<div id="thumbs">
			<ul class="thumbs noscript"></ul>
		</div>
	</div>
	<div id="treeModelo"></div>

	<div id="divFinalizarPedido">
		<div id="visualizarPedido">
			<div id="tableDiv">
				<table id="listaProduto">
					<thead>
						<tr>
							<th>Imagem</th>
							<th>Produto</th>
							<th>Valor unitário</th>
						</tr>
					</thead>
					<tbody>
					</tbody>
					<tfoot>
						<tr>
							<td colspan="2">Total do pedido</td>
							<td id="totalPedido"></td>
						</tr>
					</tfoot>
				</table>
			</div>
			<input id="completarPedido" type="button" value="Completar Pedido" onclick="completarPedido();">
			<img id="closebutton" onclick="continuarPedido();" alt="" src="${pageContext.request.contextPath}/imagens/close.png">
		</div>
		<div id="completarPedido">
			<form id="completarPedido" action="#">
			<table id="completarPedido">
				<tr>
					<td><label>Valot Total :</label></td>
					<td id="totalPedido"></td>
				</tr><tr>
					<td><label for="cpf">C.P.F. :</label></td>
					<td><input id="cpf" name="cpf" type="text"></td>
				</tr><tr>
					<td><label for="vlrDesconto">Desconto :</label></td>
					<td><input id="vlrDesconto" name="vlrDesconto" type="number"></td>
				</tr><tr>
					<td><label for="numeroComprovanteCartao">Número do comprovante<br/> do cartão :</label></td>
					<td><input id="numeroComprovanteCartao" name="numeroComprovanteCartao" type="text"></td>
				</tr><tr>
					<td><label for="vendedor">Vendedor :</label></td>
					<td><select id="vendedor"></select></td>
				</tr><tr>
					<td><label for="condPagto">Condição de pagamento :</label></td>
					<td>
						<ul id="condPagto">
							<li id="condPagto1">
								<input type="hidden" id="condPagto1" name="condPagto1">
								<input type="hidden" id="vlrCondPagto1" name="vlrCondPagto1">
								<label></label>
							</li>
							<li id="condPagto2">
								<input type="hidden" id="condPagto2" name="condPagto2">
								<input type="hidden" id="vlrCondPagto2" name="vlrCondPagto2">
								<label></label>
							</li>
							<li id="condPagto3">
								<input type="hidden" id="condPagto3" name="condPagto3">
								<input type="hidden" id="vlrCondPagto3" name="vlrCondPagto3">
								<label></label>
							</li>
							<li id="digitarCondPagto">
								<select id="condPagto"></select>
								<input type="number" id="vlrCondPagto" name="vlrCondPagto">
								<img onclick="incluirCondPagto();" src="${pageContext.request.contextPath}/imagens/salvarCondPagto.jpg">
							</li>
						</ul>
						<img id="adicionarCondPagto" alt="" onclick="digitarCondPagto();" src="${pageContext.request.contextPath}/imagens/addCondPagto.jpg">
					</td>
				</tr>
			</table>
			<img alt="Visualizar Produtos" onclick="visualizarProdutos();" src="${pageContext.request.contextPath}/imagens/cart.jpg">
			<img id="imgFinalizarPedido" onClick="finalizarPedido();" src="${pageContext.request.contextPath}/imagens/salvarPedido.jpg">
			</form>
			<img id="closebutton" onclick="continuarPedido();" alt="" src="${pageContext.request.contextPath}/imagens/close.png">
		</div>
	</div>
</body>
</html>