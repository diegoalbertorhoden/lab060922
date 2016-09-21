package br.diego.ejb;

import javax.annotation.Resource;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.jms.Destination;
import javax.jms.JMSContext;
import javax.jms.JMSException;
import javax.jms.ObjectMessage;
import javax.jms.Topic;

import br.diego.classes.Venda;

@Stateless
public class ProcessVenda {
	
	@Inject
	private JMSContext context;
	@Resource(lookup="java:/topic/TopicVenda")
	private Topic topicVenda;
	
	public void processarVenda(Venda venda){
		
		System.out.println("chegou no EJB de venda");
		final Destination destination = topicVenda;
		ObjectMessage mensagem = context.createObjectMessage();
		
		try{
			mensagem.setObject(venda);
			context.createProducer().send(destination, mensagem);
			System.out.println("EJB processVenda passou...");
		}catch(JMSException e){
			e.printStackTrace();
		}

	}

}
