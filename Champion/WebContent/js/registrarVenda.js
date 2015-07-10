function limparTela() {
	$(document).data("produto", []);
	$('form#completarPedido input#cpf').val("");
	$('form#completarPedido input#vlrDesconto').val("");
	$('form#completarPedido input#numeroComprovanteCartao').val("");
	$('form#completarPedido select#vendedor option:selected').val("");
	$('form#completarPedido input#condPagto1').val("");
	$('form#completarPedido input#condPagto2').val("");
	$('form#completarPedido input#condPagto3').val("");
	$('form#completarPedido input#vlrCondPagto1').val("");
	$('form#completarPedido input#vlrCondPagto2').val("");
	$('form#completarPedido input#vlrCondPagto3').val("");
	$("ul#condPagto li").hide();
}

jQuery.fn.center = function () {
	var winW = 630, winH = 460;
	if (document.body && document.body.offsetWidth) {
		winW = document.body.offsetWidth;
		winH = document.body.offsetHeight;
	}
	if (document.compatMode=='CSS1Compat' &&
			document.documentElement &&
			document.documentElement.offsetWidth ) {
		winW = document.documentElement.offsetWidth;
		winH = document.documentElement.offsetHeight;
	}
	if (window.innerWidth && window.innerHeight) {
		winW = window.innerWidth;
		winH = window.innerHeight;
	}

    this.css("position","absolute");
    this.css("top", Math.max(0, ((winH - $(this).outerHeight()) / 2) + 
                                                $(window).scrollTop()) + "px");
    this.css("left", Math.max(0, ((winW - $(this).outerWidth()) / 2) + 
                                                $(window).scrollLeft()) + "px");
    return this;
};

function continuarPedido() {
	$.unblockUI();
}

function visualizarPedido() {
	$.blockUI({ 
		message: $("div#divFinalizarPedido"), 
		css: { width: '600px',
				border: '3px' }
	});
	$("div.blockUI.blockMsg.blockPage").center();
	$("div.blockUI.blockMsg.blockPage").css("top","100px");
	$("div.blockUI.blockMsg.blockPage").css("cursor","default");

	$("div#visualizarPedido").show();
	$("div#completarPedido").hide();

	var $produto = $(document).data("produto");
	var $body = $("table#listaProduto").find("tbody");
	var valorTotal = 0;
	$body.empty();

	for (var i = 0; i < $produto.length; i++) {
	    var produtoSelecionado = $produto[i];
	    $body.append("<tr>" +
	    		"<td><img src=\"" + contextPath + "/files/imagens/thumbnail/" + produtoSelecionado.codigoProduto + "\" style=\"height: 60px;\"/></td>" + 
	    		"<td>" + produtoSelecionado.codigoProduto + " <br/> " +
	    		produtoSelecionado.descricaoProduto + "</td>" +
	    		"<td class=\"precoUnit\">" + produtoSelecionado.precoUnit.toFixed(2) + "</td>" +
   				"</tr>");

	    valorTotal += (produtoSelecionado.precoUnit);
	}
	$("table#listaProduto").find("tfoot").find("td#totalPedido").text(valorTotal.toFixed(2));
	$("table#completarPedido").find("td#totalPedido").text(valorTotal.toFixed(2));
}

function visualizarProdutos() {
	$("div#visualizarPedido").show();
	$("div#completarPedido").hide();
}

function completarPedido() {
	$("div#visualizarPedido").hide();
	$("div#completarPedido").show();

	carregarListaVendedor();
	carregarListaCondPagto();
}

function carregarListaVendedor() {
	var $select = $("select#vendedor");
	$select.empty();

	$.ajax({
		url: 'listarVendedor.htm',
		success: function(listaVendedor) {
			for (var i = 0; i < listaVendedor.length; i++) {
				var vendedor = listaVendedor[i];
				$select.append("<option value=\"" + vendedor.vendedorSq + "\">" + vendedor.codigoVendedor + " - " + vendedor.nomeVendedor + "</option>");
			}
		}
	});
}

function carregarListaCondPagto() {
	var $select = $("select#condPagto");
	$select.empty();

	$.ajax({
		url: 'listarCondPagto.htm',
		success: function(listaCondPagto) {
			for (var i = 0; i < listaCondPagto.length; i++) {
				var condPagto = listaCondPagto[i];
				$select.append("<option value=\"" + condPagto.condPagtoSq + "\">" + condPagto.codigoCondPagto + " - " + condPagto.descricaoCondPagto + "</option>");
			}
		}
	});
}

function digitarCondPagto() {
	$("ul#condPagto li#digitarCondPagto").show();
	$("img#adicionarCondPagto").hide();
}

function incluirCondPagto() {
	var $ul = $("ul#condPagto");
	var index = 1;
	if ($ul.find("li#condPagto1").css("display") == "list-item")
		index = 2;
	if ($ul.find("li#condPagto2").css("display") == "list-item")
		index = 3;

	if (index < 3) {
		$("img#adicionarCondPagto").show();
	}
	var $liIncluir = $ul.find("li#digitarCondPagto");
	$liIncluir.hide();

	var $condPagto = $liIncluir.find('select#condPagto option:selected').val();
	var $descCondPagto = $liIncluir.find('select#condPagto option:selected')[0].label;
	$liIncluir.find('select#condPagto option:selected').removeAttr('selected');

	var $vlrCondPagto = $liIncluir.find('input#vlrCondPagto').val();
	$liIncluir.find('input#vlrCondPagto').val("");

	var $li = $ul.find("li#condPagto" + index);
	$li.find("input#condPagto" + index).val($condPagto);
	$li.find("input#vlrCondPagto" + index).val($vlrCondPagto);
	$li.find("label").text($descCondPagto + " (" + $vlrCondPagto + ")");
	$li.show();
}

function redimensionarThumbs() {
//corrige a ALTURA das imagens conforme a LARGURA da página
	$("img.thumb").height(~~window.innerWidth/15);
}

function mostrarImagem() {
	// We only want these styles applied when javascript is enabled
	$('div.content').css('display', 'block');
	$("div#controls").show();
	redimensionarThumbs();
	$('#thumbs').galleriffic({
   		delay:                     3000, // in milliseconds
   		numThumbs:                 10, // The number of thumbnails to show page
   		preloadAhead:              40, // Set to -1 to preload all images
   		enableTopPager:            false,
   		enableBottomPager:         true,
   		maxPagesToShow:            7,  // The maximum number of pages to display in either the top or bottom pager
   		imageContainerSel:         '#slideshow', // The CSS selector for the element within which the main slideshow image should be rendered
//   		controlsContainerSel:      '#controls', // The CSS selector for the element within which the slideshow controls should be rendered
   		captionContainerSel:       '#caption', // The CSS selector for the element within which the captions should be rendered
   		loadingContainerSel:       '#loading', // The CSS selector for the element within which should be shown when an image is loading
   		renderSSControls:          false, // Specifies whether the slideshow's Play and Pause links should be rendered
   		renderNavControls:         false, // Specifies whether the slideshow's Next and Previous links should be rendered
   		playLinkText:              'Play',
   		pauseLinkText:             'Pause',
   		prevLinkText:              'Previous',
   		nextLinkText:              'Next',
   		nextPageLinkText:          'Next &rsaquo;',
   		prevPageLinkText:          '&lsaquo; Prev',
   		enableHistory:             false, // Specifies whether the url's hash and the browser's history cache should update when the current slideshow image changes
   		enableKeyboardNavigation:  false, // Specifies whether keyboard navigation is enabled
   		autoStart:                 false, // Specifies whether the slideshow should be playing or paused when the page first loads
   		syncTransitions:           false, // Specifies whether the out and in transitions occur simultaneously or distinctly
   		defaultTransitionDuration: 1000, // If using the default transitions, specifies the duration of the transitions
   		onSlideChange:             undefined, // accepts a delegate like such: function(prevIndex, nextIndex) { ... }
   		onTransitionOut:           undefined, // accepts a delegate like such: function(slide, caption, isSync, callback) { ... }
   		onTransitionIn:            undefined, // accepts a delegate like such: function(slide, caption, isSync) { ... }
   		onPageTransitionOut:       undefined, // accepts a delegate like such: function(callback) { ... }
   		onPageTransitionIn:        undefined, // accepts a delegate like such: function() { ... }
   		onImageAdded:              undefined, // accepts a delegate like such: function(imageData, $li) { ... }
   		onImageRemoved:            undefined,  // accepts a delegate like such: function(imageData, $li) { ... }
   		onClickImage:              incluirItemSelecionado
	});
}

function incluirItemSelecionado() {
	incluirItem($("div#slideshow").find("a.advance-link").find("img")[0].alt);
}

function incluirItem(codigo) {
	var $lista = $(document).data("produto");
//	$lista.push({codigoProduto: codigo, descricaoProduto: 'Descricao ' + codigo, qtde: 1});
	$lista.push($(document).data("produto" + codigo));
	mostrarTotalCarrinho();
}

function mostrarTotalCarrinho() {
	var valorTotal = 0;
	var $produto = $(document).data("produto");

	for (var i = 0; i < $produto.length; i++) {
	    valorTotal += ($produto[i].precoUnit);
	}

	$("label#total_carrinho").text("Total do pedido: " + valorTotal.toFixed(2));
}

function incluirImagem(produto) {
	var $ul = $("ul.thumbs");
	$ul.append("<li></li>");
	var $li = $ul.find("li").filter(":last");
	$li.append("<a class=\"thumb\" name=\"optionalCustomIdentifier\" href=\"" + contextPath + "/files/imagens/" + produto.codigoProduto + ".jpg\" title=\"" + produto.codigoProduto + "\">" +
		"<img class=\"thumb\" src=\"" + contextPath + "/files/imagens/thumbnail/" + produto.codigoProduto + ".jpg\" alt=\"" + produto.codigoProduto + "\" />" +
		"</a><div class=\"caption\"><div class=\"image-title\">" + produto.descricaoProduto + "</div></div>");
	$(document).data("produto" + produto.codigoProduto, produto);
};

function filtrarModelo(listaModelo) {
	$.ajax({
		type: "GET",
		url:        'listarProdutoPorModelo.htm?listaModelo=' + listaModelo,
		beforeSend: bloqueioCarregarPagina,
		success:    function(msg) {
			bloqueioLiberar();
			$('#codigoProduto').val("");
			$("div#thumbs").empty();
			$("div#controls").hide();
			$("div#loading").empty();
			$("div#slideshow").empty();
			$("div#caption").empty();

			if (msg.length > 0) {
				$("div#thumbs").append("<ul class=\"thumbs noscript\"></ul>");

				for(var i=0;i<msg.length;i++){
					incluirImagem(msg[i]);
				}

				mostrarImagem();
			}
		}
	});
};

function removerSelecaoModelo() {
	$("#treeModelo").dynatree("getRoot").visit(function(node){
		node.select(false);
	});

}

function filtrarProdutoPorCodigo() {
	$.ajax({
		type: "GET",
		contentType: "application/json",
		dataType: "json",
		url:        'listarProdutoPorCodigo.htm?codigoProduto=' + $('#codigoProduto').val(),
		beforeSend: bloqueioCarregarPagina,
		success:    function(msg) {
			bloqueioLiberar();
			$("div#thumbs").empty();
			$("div#controls").hide();
			$("div#loading").empty();
			$("div#slideshow").empty();
			$("div#caption").empty();

			if (msg.length > 0) {
				$("div#thumbs").append("<ul class=\"thumbs noscript\"></ul>");

				for(var i=0;i<msg.length;i++){
					incluirImagem(msg[i]);
				}

				mostrarImagem();
			}
		}
	});
};

function finalizarPedido() {
	$("form#completarPedido").submit();
}

$(document).ready(
	function() {
		limparTela();

		$(window).resize(function(){
			redimensionarThumbs();
		});

		$("#treeModelo").dynatree({
			checkbox : true,
			selectMode : 3,
			onSelect : function(select, node) {
				// Get a list of all selected nodes, and convert to a key array:
				var selKeys = $.map(node.tree.getSelectedNodes(),
				function(node) {
					return node.data.key;
				});
				filtrarModelo(selKeys.join(","));
			},
			onClick : function(node, event) {
				// We should not toggle, if target was "checkbox", because this
				// would result in double-toggle (i.e. no toggle)
				if (node.getEventTargetType(event) == "title")
					node.toggleSelect();
			},
			onKeydown : function(node, event) {
				if (event.which == 32) {
					node.toggleSelect();
					return false;
				}
			},
			initAjax : {
				url : "treeModelo.htm"
			}
		});

		$("#codigoProduto").keypress(function(e) {
			if(e.which == 13) {
				filtrarProdutoPorCodigo();
	    	}
		});
		
		jQuery.validator.addMethod("desconto", function(value, element) {
			var valorTotal = parseFloat($("table#listaProduto").find("tfoot").find("td#totalPedido").text());
		    return this.optional(element) || ((parseFloat(value) > 0) && (parseFloat(value) < valorTotal));
		}, "Desconto maior que Valor Total");

		$('form#completarPedido').validate({
			rules: {
				vlrDesconto: { number: true, desconto: true},
				numeroComprovanteCartao: { number: true}
			},
			messages: {
				vlrDesconto: {number: "O valor informado não é válido"},
				numeroComprovanteCartao: {number: "O valor informado não é válido"}
			},
			submitHandler: function (form) {
				var data =
				{
					cpf: $('form#completarPedido input#cpf').val(),
					vlrDesc: $('form#completarPedido input#vlrDesconto').val(),
					numeroComprovanteCartao: $('form#completarPedido input#numeroComprovanteCartao').val(),
					vendedorSq: $('form#completarPedido select#vendedor option:selected').val(),
					condPagtoSq1: $('form#completarPedido input#condPagto1').val(),
					condPagtoSq2: $('form#completarPedido input#condPagto2').val(),
					condPagtoSq3: $('form#completarPedido input#condPagto3').val(),
					vlrCondPagto1: $('form#completarPedido input#vlrCondPagto1').val(),
					vlrCondPagto2: $('form#completarPedido input#vlrCondPagto2').val(),
					vlrCondPagto3: $('form#completarPedido input#vlrCondPagto3').val(),
					listaProduto: $(document).data("produto")
				};

				$.ajax({
					type: "POST",
					contentType : "application/json; charset=utf-8",
					data: $.toJSON(data),
					url:        'registrarVenda.htm',
					beforeSend: bloqueioGravacao,
					success: function() {
						bloqueioLiberar();
						alert("Pedido incluído com sucesso");
						limparTela();
					},
					error: function(xhr) {
						bloqueioLiberar();
						alert(xhr.responseText);
						visualizarPedido(); //mostra a div
						completarPedido(); //esconde a primeira div e mostra a segunda
					}
				});
            }
		});
	}
);