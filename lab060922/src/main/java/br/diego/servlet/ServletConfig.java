package br.diego.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.jms.JMSDestinationDefinition;
import javax.jms.JMSDestinationDefinitions;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//isso aqui tudo faz com que nao passe as informaçoes pelo EJB.
//o que o professor pediu(foi dificil entender) é que nao passe só pelo mdb e servlet
//
//
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

	///ESSAS PARADA AGORA TAO NO EJB PROCESSENTREGA E PROCESSVENDA	

	//aqui vamos injetar as dependencias
	//	@Inject
	//	private JMSContext context;
	//aqui vamos redirecionar as chamadas
	//	@Resource(lookup = "java:/queue/QueuePedido")
	//	private Queue QueuePedido;
	//	@Resource(lookup = "java:/topic/TopicVenda")
	//	private Topic TopicVenda;
	//PRIMEIRO FLUXO NAVEGADOR....
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		out.write("<h1> Porreta bixo!!! </h1>");

		//		ABSTRAIDAS ESTAS PARADAS PARA SEUS SERVLETS ESPECIFICOS(PROCESSVENDA E ENTREGA)
		//		try {
		//			boolean useTopic = req.getParameterMap().keySet().contains("TopicVenda");
		//			final Destination destination = useTopic ? TopicVenda : QueuePedido;
		//
		//			out.write("<p>Enviando mensagem para: <em>" + destination + "</em></p>");
		//			out.write("<h2>As mensagens foram enviadas:</h2>");
		//
		//			String text = "esta é a mensagem " ;
		//			context.createProducer().send(destination, text);
		//			out.write("Mensagem : " + text + "</br>");
		//
		//			out.write("<p><i>fecho pra balanço jovem!</i></p>");
		//		} finally {
		//			if (out != null) {
		//				out.close();
		//			}
		//		}
		//		//super.doGet(req, resp);
	}


}
