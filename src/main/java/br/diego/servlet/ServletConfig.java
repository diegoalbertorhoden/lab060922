package br.diego.servlet;

import javax.jms.JMSDestinationDefinition;
import javax.jms.JMSDestinationDefinitions;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

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
	

}
