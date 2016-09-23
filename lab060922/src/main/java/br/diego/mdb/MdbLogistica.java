package br.diego.mdb;

import java.util.logging.Logger;

import javax.ejb.ActivationConfigProperty;
import javax.ejb.MessageDriven;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.ObjectMessage;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import br.diego.classes.Log;
import br.diego.classes.TimeStamp;

@MessageDriven(name = "MdbLogistica", activationConfig = {
		@ActivationConfigProperty(propertyName = "destinationLookup", propertyValue = "queue/QueuePedido"),
		@ActivationConfigProperty(propertyName = "destinationType", propertyValue = "javax.jms.Queue"),
		@ActivationConfigProperty(propertyName = "acknowledgeMode", propertyValue = "Auto-acknowledge") })

public class MdbLogistica implements MessageListener {
	@PersistenceContext(unitName = "default")
	private EntityManager em;
	private final static Logger LOGGER = Logger.getLogger(MdbLogistica.class.toString());

	public void onMessage(Message rcvMessage) {
		ObjectMessage msg = null;
		if (rcvMessage instanceof ObjectMessage) {
			msg = (ObjectMessage) rcvMessage;
			// momento da msg recebida aparecer na tela...
			Log log = new Log();
			log.setNome("MdbLogistica");
			log.setInformacao("transacao no mdb logistica ok...");
			log.setData(new TimeStamp().pegaData());
			log.setHora(new TimeStamp().pegaHora());
			em.persist(log);
			System.out.println("aqui tem uma thread rodando...");
			em.persist(log);
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Entrega finalizada com sucesso!");
			em.persist(log);

		} else {
			LOGGER.warning("Pode ter ocorrido um erro no mdb logistica... " + rcvMessage.getClass().getName());
		}
	}

}
