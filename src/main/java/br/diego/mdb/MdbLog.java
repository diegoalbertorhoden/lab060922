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

@MessageDriven(name = "MdbLog", activationConfig = {
		@ActivationConfigProperty(propertyName = "destinationLookup", propertyValue = "topic/TopicVenda"),
		@ActivationConfigProperty(propertyName = "destinationType", propertyValue = "javax.jms.Topic"),
		@ActivationConfigProperty(propertyName = "acknowledgeMode", propertyValue = "Auto-acknowledge")
})


public class MdbLog implements MessageListener {
	@PersistenceContext(unitName="default")
	private EntityManager em;
	private final static Logger LOGGER = Logger.getLogger(MdbLog.class.toString());

	@Override
	public void onMessage(Message receiveMessage) {
		//trecho passado pelo professor em sala...
		ObjectMessage mensagem = null;
		try{
			if(receiveMessage instanceof ObjectMessage){
				mensagem = (ObjectMessage) receiveMessage;
				//essa instancia tá aqui pq o Jms obriga? estranho PESQUISAR
				Venda venda = (Venda) mensagem.getObject();

				//tentativa de gravação de log APAGAR
				Log log = new Log();
				log.setNome("MdbLog");
				log.setInformacao(" transaçao no mdb log concluida...");
				log.setData(new TimeStamp().pegaData());
				log.setHora(new TimeStamp().pegaHora());
				//gravar o log
				em.persist(log);


			}else{
				LOGGER.warning("Pode ter ocorrido um erro no MdbLog... " +receiveMessage);
			}
		}catch (JMSException e){
			throw new RuntimeException(e);
		}			
	}
}
