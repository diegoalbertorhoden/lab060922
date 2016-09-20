package br.diego.mdb;

import java.util.logging.Logger;

import javax.ejb.ActivationConfigProperty;
import javax.ejb.MessageDriven;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.ObjectMessage;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import br.diego.classes.Log;
import br.diego.classes.TimeStamp;
import br.diego.classes.Venda;
// aqui ta bagual que nem o quickstart...
@MessageDriven(name = "MdbAuditoria", activationConfig = {
		@ActivationConfigProperty(propertyName = "destinationLookup", propertyValue = "topic/TopicVenda"),
		@ActivationConfigProperty(propertyName = "destinationType", propertyValue = "javax.jms.Topic"),
		@ActivationConfigProperty(propertyName = "acknowledgeMode", propertyValue = "Auto-acknowledge")
})

public class MdbAuditoria implements MessageListener {

	private final static Logger LOGGER = Logger.getLogger(MdbAuditoria.class.toString());
	@PersistenceContext(unitName="default")
	private EntityManager em;
	//	private final static Logger LOGGER = Logger.getLogger(MdbLogistica.class.toString());
	public void onMessage(Message rcvMessage) {
		ObjectMessage msg = null;
		try {
			if (rcvMessage instanceof ObjectMessage) {
				msg = (ObjectMessage) rcvMessage;

				Venda venda = (Venda) msg.getObject();

				//momento da msg recebida aparecer na tela...
				Log log = new Log();
				log.setNome("MdbAuditoria");
				log.setInformacao("transacao no mdb auditoria ok...");
				log.setData(new TimeStamp().pegaData());
				log.setHora(new TimeStamp().pegaHora());

				em.persist(log);

			} else {
				LOGGER.warning("Pode ter ocorrido um erro no mdb auditoria... " + rcvMessage.getClass().getName());
			}
		} catch (JMSException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	//		@Override
	//		public void onMessage(Message receiveMessage) {
	//trecho passado pelo professor em sala...


	//		ObjectMessage mensagem = null;
	//		try{
	//			if(receiveMessage instanceof ObjectMessage){
	//				mensagem = (ObjectMessage) receiveMessage;
	//				Venda venda = (Venda) mensagem.getObject();
	//			}else{
	//				LOGGER.warning("passando pelo MdbAuditoria... " +receiveMessage);
	//			}
	//		}catch (JMSException e){
	//			throw new RuntimeException(e);
	//		}			
}
