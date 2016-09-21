package br.diego.testes;

import br.diego.WsEntregaClient.IOException_Exception;
import br.diego.WsEntregaClient.ServletException_Exception;
import br.diego.WsVendaClient.Venda;
import br.diego.WsVendaClient.WsVenda;
import br.diego.WsVendaClient.WsVendaService;

public class TesteVenda {

public static void main(String[] args) throws IOException_Exception, ServletException_Exception, br.diego.WsVendaClient.IOException_Exception, br.diego.WsVendaClient.ServletException_Exception {
	
	WsVendaService testeVenda = new WsVendaService();
	//dd
	WsVenda carrinho = testeVenda.getWsVendaPort();
	Venda mercadoria = carrinho.fecharVenda();
	System.out.println("ma fecho a venda rapa..."+ mercadoria.toString());
	
	
}
	
}
