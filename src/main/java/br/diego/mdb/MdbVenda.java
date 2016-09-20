package br.diego.mdb;

import java.util.logging.Logger;

import javax.ejb.ActivationConfigProperty;
import javax.ejb.MessageDriven;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.ObjectMessage;

import br.diego.classes.Venda;

@MessageDriven(name = "MdbVenda", activationConfig = {
		@ActivationConfigProperty(propertyName = "destinationLookup", propertyValue = "topic/TopicVenda"),
		@ActivationConfigProperty(propertyName = "destinationType", propertyValue = "javax.jms.Topic"),
		@ActivationConfigProperty(propertyName = "acknowledgeMode", propertyValue = "Auto-acknowledge")
})

public class MdbVenda implements MessageListener {

	private final static Logger LOGGER = Logger.getLogger(MdbVenda.class.toString());

	@Override
	public void onMessage(Message receiveMessage) {
		//trecho passado pelo professor em sala...
		ObjectMessage mensagem = null;
		try{
			if(receiveMessage instanceof ObjectMessage){
				mensagem = (ObjectMessage) receiveMessage;
				Venda venda = (Venda) mensagem.getObject();
			}else{
				LOGGER.warning("passando pelo mdb venda... " +receiveMessage);
			}
		}catch (JMSException e){
			throw new RuntimeException(e);
		}			
	}

	//	@Override
	//	public void onMessage(Message arg0) {
	//		// TODO Auto-generated method stub
	//
	//	}

}
