package br.diego.webservicesjax;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import javax.ejb.EJB;
import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.servlet.ServletException;

import br.diego.classes.Venda;
import br.diego.ejb.ProcessVenda;

@WebService
public class WsVenda {

	@EJB
	ProcessVenda processVenda;

	//aqui mudamos o metodo pra nao ficar igual...conforme solicitado.

	@WebMethod(operationName="fecharVenda")
	@WebResult(name="resultVenda")

	public Venda fecharVenda() throws ServletException, IOException{

		System.out.println("processo no ws venda começou...");
		//colocar qualquer coisa na lista pra faze a venda mesmo...
		List<String> lista = new ArrayList<>();
		lista.add("celular");
		lista.add("tablet");
		//total da venda
		Venda venda = new Venda(1, lista, new BigDecimal(100.00));
		System.out.println("passou pelo WsVenda...");
		processVenda.processarVenda(venda);
		return venda;

	}

}
