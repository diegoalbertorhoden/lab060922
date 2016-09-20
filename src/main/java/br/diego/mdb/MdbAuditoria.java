package br.diego.mdb;

import java.util.logging.Logger;
import javax.ejb.ActivationConfigProperty;
import javax.ejb.MessageDriven;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.ObjectMessage;
import br.diego.classes.Venda;
// aqui ta bagual que nem o quickstart...
@MessageDriven(name = "MdbAuditoria", activationConfig = {
		@ActivationConfigProperty(propertyName = "destinationLookup", propertyValue = "topic/TopicVenda"),
		@ActivationConfigProperty(propertyName = "destinationType", propertyValue = "javax.jms.Topic"),
		@ActivationConfigProperty(propertyName = "acknowledgeMode", propertyValue = "Auto-acknowledge")
		})

public class MdbAuditoria implements MessageListener {

	private final static Logger LOGGER = Logger.getLogger(MdbAuditoria.class.toString());

	@Override
	public void onMessage(Message receiveMessage) {
		//trecho passado pelo professor em sala...
		ObjectMessage mensagem = null;
		try{
			if(receiveMessage instanceof ObjectMessage){
				mensagem = (ObjectMessage) receiveMessage;
				Venda venda = (Venda) mensagem.getObject();
			}else{
				LOGGER.warning("passando pelo MdbAuditoria... " +receiveMessage);
			}
		}catch (JMSException e){
			throw new RuntimeException(e);
		}			
	}
}