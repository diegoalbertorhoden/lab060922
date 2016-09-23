package br.diego.ejb;

import javax.annotation.Resource;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.jms.Destination;
import javax.jms.JMSContext;
import javax.jms.JMSException;
import javax.jms.ObjectMessage;
import javax.jms.Queue;

import br.diego.classes.Entrega;

@Stateless
public class ProcessEntrega {
	//polenta
	//bom, até onde entendi é aqui que teremos que 
	//movimentar o que anteriormente foi colocado no config
	//conforme o professor havia pedido pra fazer igual
	//o exemplo do quickstart...

	//injeção da dependencia tipo relação
	@Inject
	private JMSContext context;

	@Resource(lookup = "java:/queue/QueuePedido")
	private Queue QueuePedido;

	public void processarEntrega(Entrega entrega){
		//se der certo o vai e vem esta msg aparecera pra dizer que foi
		System.out.println("chegou no EJB ProcessEntrega");
		//rota como esta no exemplo quickstart
		final Destination destination =  (Destination) QueuePedido;
		//isso aqui precisa pq tem a serialização
		ObjectMessage message = context.createObjectMessage();

		try{

			message.setObject(entrega);
			context.createProducer().send(destination, message);
			System.out.println("EJB processEntrega repassou");
		}catch(JMSException e){
			e.printStackTrace();
		}		
	}
}