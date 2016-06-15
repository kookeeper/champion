// Your Client ID can be retrieved from your project in the Google
// Developer Console, https://console.developers.google.com
var CLIENT_ID = '840373071204-3babfh84dklsfd1jn16a4vvqlbi52een.apps.googleusercontent.com';
//var CLIENT_ID = '840373071204-gh3ha61ev3bhlov5bg1a5ib37q5t62q9.apps.googleusercontent.com';

// var SCOPES = [ 'https://www.googleapis.com/auth/drive.metadata.readonly' ];
var SCOPES = [ 'https://www.googleapis.com/auth/drive.file' ];

$(document).ready(function() {

	// Cache the div so that the browser doesn't have to find it every time the window is resized.
	var $div = $('div.field');

	// Run the following when the window is resized, and also trigger it once to begin with.
	$(window).resize(function () {
		// Get the current height of the div and save it as a variable.
		var height = $div.height();
		// Set the font-size and line-height of the text within the div according to the current height.
		$div.css({
			'font-size': (height/4) + 'px'
		});
		$('.inputForm input').css({
			'font-size': (height/4) + 'px'
		});
		$('.inputForm button').css({
			'font-size': (height/4) + 'px'
		});
		$('legend').css({
			'font-size': (height/4) + 'px'
		});
	}).trigger('resize');

	if (localStorage.getItem("dataVenda") === undefined)
		localStorage.setItem("dataVenda", buscarHoje());

	$(function() {
		$("#dataVenda").datepicker({
			dateFormat : 'dd/mm/yy'
		});
	});

	$('#dataVenda').val(localStorage.getItem("dataVenda"));
	$('#vendedorVenda').val(localStorage.getItem("vendedorVenda"));

	var tbCustomer = localStorage.getItem("tbCustomer");// Recupera os dados armazenados
	tbCustomer = JSON.parse(tbCustomer); // Converte string para objeto
	if (tbCustomer === null) // Caso não haja conteúdo, iniciamos um vetor vazio
		tbCustomer = [];
});

function buscarArquivoHoje() {
	var nomeArquivo = 'Vendas' + buscarHojeSemFormato() + '.xls';
	findFolder('Vendas', 'root', true, function(file) {
		findFile(nomeArquivo, file.id, function(file) {
			localStorage.setItem("arquivoHoje", file.id);
			lerArquivo();
		});
	});
}

function mostrarLinha(line) {
	var fields = line.split('	');
	$('#tabela').append(
			"<tr><td>" + fields[0] + "</td><td>" + fields[1] + "</td><td>"
					+ fields[2] + "</td></tr>");
}

function mostrarConteudo() {
	var content = localStorage.getItem("conteudoArquivo");
	var lines = content.split('\n');
	for (var i = 0; i < lines.length; i++) {
		var line = lines[i];
		if (line && line != '')
			mostrarLinha(line);
	}
}

function salvarConteudo(callback) {
	var request = gapi.client.request({
		'path' : 'https://www.googleapis.com/upload/drive/v3/files/'
				+ localStorage.getItem("arquivoHoje"),
		'method' : 'PATCH',
		'params' : {
			'uploadType' : 'media'
		},
		'body' : localStorage.getItem("conteudoArquivo")
	});

	if (!callback) {
		callback = function(file) {
			console.log(file)
		};
	}

	request.execute(callback);
}

function lerArquivo() {
	getFileById(localStorage.getItem("arquivoHoje"), function(content) {
		localStorage.setItem("conteudoArquivo", content);
		mostrarConteudo();
	});
}

function buscarHoje() {
	var today = new Date();
	var dd = today.getDate();
	var mm = today.getMonth() + 1; // January is 0!
	var yyyy = today.getFullYear();

	if (dd < 10) {
		dd = '0' + dd
	}

	if (mm < 10) {
		mm = '0' + mm
	}

	today = dd + '/' + mm + '/' + yyyy;
	return today;
}

function buscarHojeSemFormato() {
	var today = new Date();
	var dd = today.getDate();
	var mm = today.getMonth() + 1; // January is 0!
	var yyyy = today.getFullYear();

	if (dd < 10) {
		dd = '0' + dd
	}

	if (mm < 10) {
		mm = '0' + mm
	}

	today = yyyy + mm + dd;
	return today;
}

function createFolder(nome, parents, callback) {
	var data = new Object();
	data.name = nome;
	data.parents = [ parents ];
	data.mimeType = "application/vnd.google-apps.folder";
	gapi.client.drive.files.create({
		'resource' : data
	}).execute(function(file) {
		callback(file);
	});
}

function createFile(nome, parents, callback) {
	var data = new Object();
	data.name = nome;
	data.parents = [ parents ];
	data.mimeType = "application/vnd.ms-excel";
	gapi.client.drive.files.create({
		'resource' : data
	}).execute(function(file) {
		callback(file);
	});
}

function findFolder(nomePasta, parents, criarPasta, callback) {
	var filtro = "name='" + nomePasta
			+ "' and mimeType='application/vnd.google-apps.folder' and '"
			+ parents + "' in parents";

	var request = gapi.client.drive.files.list({
		'pageSize' : 1,
		'q' : filtro
	});

	request.execute(function(resp) {
		var files = resp.files;
		if (files && files.length > 0) {
			callback(files[0]);
		} else {
			if (criarPasta) {
				createFolder(nomePasta, parents, function(file) {
					callback(file);
				});
			}
		}
	});
}

function findFile(nomeArquivo, parents, callback) {
	var filtro = "name='" + nomeArquivo + "' and '" + parents + "' in parents";

	var request = gapi.client.drive.files.list({
		'pageSize' : 1,
		'q' : filtro
	});

	request.execute(function(resp) {
		var files = resp.files;
		if (files && files.length > 0) {
			callback(files[0]);
		} else {
			createFile(nomeArquivo, parents, function(file) {
				callback(file);
			});
		}
	});
}

function downloadFile(file, callback) {
	var accessToken = gapi.auth.getToken().access_token;
	var xhr = new XMLHttpRequest();
	xhr.open('GET', 'https://www.googleapis.com/drive/v2/files/' + file.id
			+ '?alt=media')
	xhr.setRequestHeader('Authorization', 'Bearer ' + accessToken);
	xhr.onload = function() {
		callback(xhr.responseText);
	};
	xhr.onerror = function() {
		callback('erro');
	};
	xhr.send();
}

function getFileById(fileId, callback) {
	var request = gapi.client.drive.files.get({
		'fileId' : fileId
	});

	request.execute(function(resp) {
		downloadFile(resp, function(text) {
			callback(text);
		});
	});
}

/**
 * Append a pre element to the body containing the given message as its text
 * node.
 * 
 * @param {string}
 *            message Text to be placed in pre element.
 */
function appendPre(message) {
	// var pre = document.getElementById('output');
	// var textContent = document.createTextNode(message + '\n');
	// pre.appendChild(textContent);
	console.log(message);
}

/**
 * Print files.
 */
function listFiles() {
	var filtro = '';
	if (parents == '') {
		filtro = "mimeType='application/vnd.google-apps.folder'";
		filtro = "";
	} else {
		filtro = "'" + parents + "' in parents";
	}
	console.log('parents = ' + parents + ' - ' + filtro);
	var request = gapi.client.drive.files.list({
		'pageToken' : nextPageToken,
		'pageSize' : 10,
		'q' : filtro,
		'fields' : "nextPageToken, files(id, name, parents, mimeType), kind"
	});

	request.execute(function(resp) {
		nextPageToken = resp.nextPageToken;
		appendPre(resp.nextPageToken);
		appendPre(resp.kind);

		appendPre('Files:');
		var files = resp.files;
		if (files && files.length > 0) {
			for (var i = 0; i < files.length; i++) {
				var file = files[i];
				// console.log(file);
				// appendPre(file.name + ' (' + file.id + ', ' + file + ')');
				// if (file.mimeType == 'application/vnd.google-apps.folder')
				appendPre(JSON.stringify(file));
			}
		} else {
			appendPre('No files found.');
		}
	});
}

function listFiles(parents) {
	var filtro = "'" + parents + "' in parents";
	console.log('parents = ' + parents + ' - ' + filtro);
	var request = gapi.client.drive.files.list({
		'pageToken' : '',
		'pageSize' : 10,
		'q' : filtro,
		'fields' : "nextPageToken, files(id, name, parents, mimeType), kind"
	});

	request.execute(function(resp) {
		var files = resp.files;
		if (files && files.length > 0) {
			for (var i = 0; i < files.length; i++) {
				var file = files[i];
				// console.log(file);
				// appendPre(file.name + ' (' + file.id + ', ' + file + ')');
				// if (file.mimeType == 'application/vnd.google-apps.folder')
				appendPre(JSON.stringify(file));
			}
		} else {
			appendPre('No files found.');
		}
	});
}

function more() {
	nextPageToken = '';
	parents = '1sUcQp-HC0jGyOC0XmBBmVMMwmWjh3g';
	listFiles();
	/*
	 * var request = gapi.client.drive.files.get({ 'fileId':
	 * "1sUcQp-HC0jGyOC0XmBBmVMMwmWjh3g" });
	 * 
	 * request.execute(function(resp) { console.log(resp); });
	 */
}

function adicionarLinhaArquivo(linha) {
	var content = localStorage.getItem("conteudoArquivo");
	content += '\n' + linha;
	localStorage.setItem("conteudoArquivo", content);
	salvarConteudo(function(resp) {
		console.log(resp);
	});
}

function Adicionar() {
	var Data = $('#dataVenda').val();
	var Valor = $('#valorVenda').val();
	var Vendedor = $('#vendedorVenda').val();
	adicionarLinhaArquivo(Data + '	' + Valor + '	' + Vendedor);
	localStorage.setItem("dataVenda", $('#dataVenda').val());
	localStorage.setItem("vendedorVenda", $('#vendedorVenda').val());
	return true;
}

function Listar() {
	$('#tabela').empty();
	for ( var i in tbCustomer) {
		var customer = JSON.parse(tbCustomer[i]);
		// Write the data to the page.
		$('#tabela').append(
				"<tr><td>" + customer.Data + "</td><td>" + customer.Valor
						+ "</td><td>" + customer.Vendedor + "</td></tr>");
	}
}

/**
 * Check if current user has authorized this application.
 */
function checkAuth() {
	
//	var xhr = new XMLHttpRequest();
//	xhr.open('GET', 'https://accounts.google.com/o/oauth2/v2/auth?scope=email%20profile&' +
//			 'state=%2Fprofile&' +
//			 'response_type=code&' +
//			 'client_id=' + CLIENT_ID + '&' +
//			 '&redirect_uri=urn:ietf:wg:oauth:2.0:oob');
//	xhr.onload = handleAuthResult;
//	xhr.onerror = function() {
//		alert('erro');
//	};
//	xhr.send();

	
	gapi.auth.authorize({
		'client_id' : CLIENT_ID,
		'scope' : SCOPES.join(' '),
		'immediate' : true
	}, handleAuthResult);
}

/**
 * Handle response from authorization server.
 * 
 * @param {Object}
 *            authResult Authorization result.
 */
function handleAuthResult(authResult) {
	var authorizeDiv = document.getElementById('authorize-div');
	if (authResult && !authResult.error) {
		// Hide auth UI, then load client library.
		authorizeDiv.style.display = 'none';
		loadDriveApi();
	} else {
		// Show auth UI, allowing the user to initiate authorization by
		// clicking authorize button.
		authorizeDiv.style.display = 'inline';
	}
}

/**
 * Initiate auth flow in response to user clicking authorize button.
 * 
 * @param {Event}
 *            event Button click event.
 */
function handleAuthClick(event) {
	gapi.auth.authorize({
		client_id : CLIENT_ID,
		scope : SCOPES,
		immediate : false
	}, handleAuthResult);
	return false;
}

/**
 * Load Drive API client library.
 */
function loadDriveApi() {
	gapi.client.load('drive', 'v3', buscarArquivoHoje);
}
