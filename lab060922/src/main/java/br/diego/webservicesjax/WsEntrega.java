package br.diego.webservicesjax;

import java.io.IOException;
import java.util.Date;

import javax.ejb.EJB;
import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.servlet.ServletException;

import br.diego.classes.Entrega;
import br.diego.ejb.ProcessEntrega;

@WebService
public class WsEntrega {

	@EJB
	ProcessEntrega processEntrega;

	//nomes alterar conforme enunciado
	@WebMethod(operationName="fecharEntrega")
	@WebResult(name="resultadoEntrega")

	public Entrega fecharEntrega() throws ServletException, IOException{
		System.out.println("WsEntrega foi chamado...");
		Entrega entrega = new Entrega(1, new Date(), "rua rio oiapoque, 269");
		processEntrega.processarEntrega(entrega);
		System.out.println("passou pelo WsEntrega");
		return entrega;

	}

}
