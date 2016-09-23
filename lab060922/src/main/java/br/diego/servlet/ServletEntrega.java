package br.diego.servlet;

import java.io.IOException;

import java.io.PrintWriter;
import java.util.Date;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.diego.classes.Entrega;
import br.diego.ejb.ProcessEntrega;

@WebServlet(value = "/entrega")
public class ServletEntrega extends HttpServlet {

	// SEGUINDO A SOLICITAÇÃO QUE EU NÁO HAVIA ENTENDIDO COM O EXEMPLO DO
	// QUICKSTART
	// TEMOS NAVEGADOR> SERVLET E AGORA VOU PRECISAR DOS EJB AQUI PRA IR DPS PRO
	// DESTINO...

	@EJB
	ProcessEntrega processEntrega;

	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// esqueci do #2
		// msg pra se der certo o fluxo...
		System.out.println("servlet entrega chamado...");
		Entrega entrega = new Entrega(1, new Date(), "rua dos anturios");
		System.out.println("empacotando remessa de entrega no servlet");
		processEntrega.processarEntrega(entrega);
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		out.write("passou pelo servlet entrega...");

	}

}
