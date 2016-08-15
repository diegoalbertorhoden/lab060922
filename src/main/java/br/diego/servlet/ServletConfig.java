package br.diego.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.annotation.Resource;
import javax.inject.Inject;
import javax.jms.Destination;
import javax.jms.JMSContext;
import javax.jms.JMSDestinationDefinition;
import javax.jms.JMSDestinationDefinitions;
import javax.jms.Queue;
import javax.jms.Topic;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@JMSDestinationDefinitions(
		value = {
				@JMSDestinationDefinition(
						name = "java:/queue/QueuePedido",
						interfaceName = "javax.jms.Queue",
						destinationName = "QueuePedido"
						),
				@JMSDestinationDefinition(
						name = "java:/topic/TopicVenda",
						interfaceName = "javax.jms.Topic",
						destinationName = "TopicVenda"
						)
		})


@WebServlet("/config")
public class ServletConfig extends HttpServlet {

	private static final long serialVersionUID = 1L;

	//aqui vamos injetar as dependencias
	@Inject
	private JMSContext context;

	//aqui vamos redirecionar as chamadas
	@Resource(lookup = "java:/queue/QueuePedido")
	private Queue QueuePedido;
	@Resource(lookup = "java:/topic/TopicVenda")
	private Topic TopicVenda;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		out.write("<h1> Porreta bixo!!! </h1>");
		try {
			boolean useTopic = req.getParameterMap().keySet().contains("TopicVenda");
			final Destination destination = useTopic ? TopicVenda : QueuePedido;

			out.write("<p>Enviando mensagem para: <em>" + destination + "</em></p>");
			out.write("<h2>As mensagens foram enviadas:</h2>");

			String text = "esta é a mensagem " ;
			context.createProducer().send(destination, text);
			out.write("Mensagem : " + text + "</br>");

			out.write("<p><i>fecho pra balanço jovem!</i></p>");
		} finally {
			if (out != null) {
				out.close();
			}
		}
		//super.doGet(req, resp);
	}


}
