package br.diego.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.diego.classes.Venda;
import br.diego.ejb.ProcessVenda;

@WebServlet("/venda")
public class ServletVenda extends HttpServlet {

	List<String> lista = new ArrayList<>();
	private static final long serialVersionUID = 1L;

	@EJB
	ProcessVenda processVenda;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("servlet de venda chamado...");
		Venda venda = new Venda(1, lista, new BigDecimal(20.00));
		System.out.println("empacotamento da venda no servlet");
		processVenda.processarVenda(venda);
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		out.write("passou pelo servlet de venda");
	}
}