package br.diego.testes;

import br.diego.WsEntregaClient.Entrega;
import br.diego.WsEntregaClient.IOException_Exception;
import br.diego.WsEntregaClient.ServletException_Exception;
import br.diego.WsEntregaClient.WsEntrega;
import br.diego.WsEntregaClient.WsEntregaService;

public class TesteEntrega {
	public static void main(String[] args) throws IOException_Exception, ServletException_Exception {
		//batata
		WsEntregaService testeEntrega = new WsEntregaService();
		WsEntrega destino = testeEntrega.getWsEntregaPort();
		Entrega pacote = destino.fecharEntrega();
		System.out.println("deu certo olha ele: "+ pacote.toString());

	}


}
