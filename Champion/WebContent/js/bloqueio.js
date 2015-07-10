/**
 * @description Objeto global criado para gerenciar os bloqueios para o
 * <strong>operador</strong> e quando as comunica��es com o servidor estiverem
 * bastantes demoradas.
 * @property {IntervalID} temporizador � criado quando usado
 * {@link bloqueioIniciar} para controlar as requisi��es que ultrapassarem o
 * tempo definido em <strong>tempoParaMensagemCancelamento</strong>. �
 * destru�do automaticamente ao ser chamado {@link bloqueioLiberar}.
 * Padr�o: nulo.
 * @property {Date} inicio � criado quando usado {@link bloqueioIniciar} para
 * saber quando foi iniciado o bloqueio para o <strong>operador</strong>.
 * Padr�o: nulo.
 * @property {Integer} tempoParaMensagemCancelamento O tempo limite para
 * exibir para o <strong>operador</strong> o cancelamento da requisi��o com
 * o servidor. Exibe um v�nculo para o m�todo {@link bloqueioLiberarRequisicao}.
 * Padr�o: 30000.
 * @property {jQuery jqXHR} requisicao Permite o controle da comunica��o com o
 * servidor possibilitando o seu cancelamento com o m�todo
 * {@link bloqueioLiberarRequisicao}.
 * Padr�o: nulo.
 */
var bloqueio = {
    'temporizador': null,
    'inicio': null,
    'tempoParaMensagemCancelamento': 30000,
    'requisicao': null
};

/**
 * @name CarregarEmTodasAsPaginas
 * @description Executa na inicializa��o/carregamento de todas as p�ginas.
 */
$(document).ready(function() {
    // agiliza o carregamento das imagens para que o usu�rio n�o fique
    // esperando elas aparecerem
    var imagensPraCarregar, imagensPraCarregarTotal, i, carregarImagem;
    $('div.barra-governo').prepend($('<span />').addClass('carregador').text('Carregando as imagens...'));
    imagensPraCarregar = Array(
        'blank.gif',
        'carregador.gif',
        'carregador-enviar.gif',
        'carregador-feminino.gif',
        'carregador-masculino.gif',
        'carregador-gravar.gif',
        'carregador-seguranca.gif',
        'carregador-visualizar.gif',
        'carregador-imprimir.gif',
        'carregador-consulta.gif',
        'carregador-trocainformacao.gif'
        );
    imagensPraCarregarTotal = imagensPraCarregar.length;
/*
    for (i = 0; i < imagensPraCarregarTotal; i++) {
        carregarImagem = new Image();
        carregarImagem.src = 'resources/image/' + imagensPraCarregar[i];
    }
*/
    $('div.barra-governo span.carregador').remove();
});

/**
 * @description Notifica ao usu�rio sobre o retorno de algo, geralmente do servidor.
 * @param {String} mensagem
 * @param {Function} callback
 * @param {Integer} tempo
 */
function alertar(mensagem, callback, tempo) {
    $.blockUI({
        theme: true,
        title: 'Alerta',
        timeout: ((typeof(callback) == 'number') ? callback : (typeof(tempo) == 'number') ? tempo : 5000),
        message: '<p>' + mensagem + '</p>',
        onUnblock: function() {
            if (typeof callback == 'function') {
                callback();
            }
        }
    });
}

/**
 * @description Inicia o bloqueio para o <strong>operador</strong>,
 * exibindo uma <strong>mensagem</strong> e internamente inicializa as
 * propriedades do objeto global {@link bloqueio}.
 * @param {String} mensagem Mensagem que ser� exibida para o <strong>operador</strong>.
 */
function bloqueioIniciar(mensagem, tempo) {
    tempo = ((tempo === null) || (typeof tempo === 'undefined')) ? 500 : tempo;
    
    // define o temporizador do bloqueio
    bloqueio.temporizador = window.setInterval('bloqueioVerificarDemora()', tempo);
    // define o in�cio do bloqueio
    bloqueio.inicio = new Date();
    // um bloqueio quando inicializado ainda n�o possui requisi��o
    bloqueio.requisicao = null;

    // bloqueia a tela do usu�rio e exibe a mensagem fornecida
    $.blockUI({
        message: mensagem,
        css: {
            border: 'none',
            padding: '15px',
            backgroundColor: '#fff',
            'border-radius': '10px',
            '-moz-border-radius': '10px',
            '-webkit-border-radius': '10px',
            color: '#222',
            fontSize: '2em',
            minWidth: '300px'
        }
    });
}

/**
 * @description Executado a cada 500 milisegundos pela propriedade
 * <strong>temporizador</strong> de {@link bloqueio}. Caso o tempo definido
 * na propriedade <strong>inicio</strong> de {@link bloqueio} tenha
 * ultrapassado o valor fornecido na propriedade
 * <strong>tempoParaMensagemCancelamento</strong> de {@link bloqueio} e se
 * houver um objeto
 * <a href="http://api.jquery.com/types/#jqXHR" target="_blank">jQuery
 * jqXHR</a> na propriedade <strong>requisicao</strong> de {@link bloqueio}
 * � apresentado para o <strong>operador</strong> um
 * v�nculo que permite cancelar a requisi��o chamando o m�todo
 * {@link bloqueioLiberarRequisicao}.
 */
function bloqueioVerificarDemora() {
    var mensagem;

    if ((((new Date()) - bloqueio.inicio) >= bloqueio.tempoParaMensagemCancelamento) &&
        (bloqueio.requisicao !== null) &&
        (typeof bloqueio.requisicao === 'object')) {
        clearInterval(bloqueio.temporizador);
        bloqueio.temporizador = null;

        mensagem = $('.blockMsg');
        mensagem.html(mensagem.html() + ' <a href="javascript:void(0)" onclick="bloqueioLiberarRequisicao()">cancelar</a>');
    }
}

/**
 * @description Libera a requisi��o que est� no bloqueio.
 */
function bloqueioLiberarRequisicao() {
    if (bloqueio.requisicao !== null) {
        bloqueio.requisicao.abort();
    }

    bloqueioLiberar();
}

/**
 * @description Libera o bloqueio para o <strong>operador</strong> feito
 * por {@link bloqueioIniciar}.
 */
function bloqueioLiberar() {
    $.unblockUI();
    
    if (bloqueio.temporizador !== null) {
        clearInterval(bloqueio.temporizador);
    }
}

/**
 * @description Bloqueio de espera.
 */
function bloqueioAguarde(mensagem, tempo) {
    bloqueio.requisicao = bloqueioIniciar('<img src="' + contextPath + '/galleriffic/css/loader.gif" />&nbsp;&nbsp;&nbsp;Aguarde' +
        ((typeof mensagem === 'string') ? ', ' + mensagem : new String()), tempo);
}

/**
 * @description Bloqueio enviar foto.
 */
function bloqueioFotografiaEnviar() {
    bloqueioIniciar('<img src="' + contextPath + '/galleriffic/css/loader.gif" />&nbsp;&nbsp;&nbsp;Aguarde, enviando a foto');
}

/**
 * @description Bloqueio tirar foto.
 */
function bloqueioFotografiaWebcam(sexo) {
    bloqueioIniciar('<img src="' + contextPath + '/galleriffic/css/loader.gif" />&nbsp;&nbsp;&nbsp;Aguarde, tirando a foto');
}

/**
 * @description Bloqueio tirar foto do sexo feminino.
 */
function bloqueioFotografiaWebcamFeminino() {
    bloqueioFotografiaWebcam('feminino');
}

/**
 * @description Bloqueio tirar foto do sexo masculino.
 */
function bloqueioFotografiaWebcamMasculino() {
    bloqueioFotografiaWebcam('masculino');
}

/**
 * @description Bloqueio ao gravar.
 */
function bloqueioGravacao() {
    bloqueioIniciar('<img src="' + contextPath + '/galleriffic/css/loader.gif" />&nbsp;&nbsp;&nbsp;Aguarde, solicitando a grava��o dos dados');
}

/**
 * @description Bloqueio ao excluir.
 */
function bloqueioExclusao() {
    bloqueioIniciar('<img src="' + contextPath + '/galleriffic/css/loader.gif" />&nbsp;&nbsp;&nbsp;Aguarde, solicitando a exclus�o dos dados');
}

/**
 * @description Bloqueio ao verificar a seguran�a.
 */
function bloqueioVerificarSeguranca() {
    bloqueioIniciar('<img src="' + contextPath + '/galleriffic/css/loader.gif" />&nbsp;&nbsp;&nbsp;Solicitando autoriza��o');
}


/**
 * @description Bloqueio ao pesquisar.
 */
function bloqueioPesquisa() {
    bloqueio.requisicao = bloqueioIniciar('<img src="' + contextPath + '/galleriffic/css/loader.gif" />&nbsp;&nbsp;&nbsp;Procurando...');
}

/**
 * @description Bloqueio ao visualizar.
 */
function bloqueioVisualizar() {
    bloqueioIniciar('<img src="' + contextPath + '/galleriffic/css/loader.gif" />&nbsp;&nbsp;&nbsp;Abrindo visualiza��o...');
}

/**
 * @description Bloqueio ao gerar impress�o.
 */
function bloqueioGerarImpressao() {
    bloqueioIniciar('<img src="' + contextPath + '/galleriffic/css/loader.gif" />&nbsp;&nbsp;&nbsp;Preparando impress�o...');
}

/**
 * @description Bloqueio ao editar.
 */
function bloqueioEdicao() {
    bloqueioIniciar('<img src="' + contextPath + '/galleriffic/css/loader.gif" />&nbsp;&nbsp;&nbsp;Aguarde, carregando interface');
}

/**
 * @description Bloqueio ao carregar a p�gina.
 */
function bloqueioCarregarPagina() {
    bloqueioIniciar('<img src="' + contextPath + '/galleriffic/css/loader.gif" />&nbsp;&nbsp;&nbsp;Carregando...');
}