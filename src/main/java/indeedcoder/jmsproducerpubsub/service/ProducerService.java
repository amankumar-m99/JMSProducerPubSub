package indeedcoder.jmsproducerpubsub.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;
import org.springframework.stereotype.Component;

import indeedcoder.jmsproducerpubsub.model.Person;
import indeedcoder.jmsproducerpubsub.service.util.JsonUtil;
import jakarta.jms.JMSException;
import jakarta.jms.Message;
import jakarta.jms.Session;

@Component
public class ProducerService {

	@Value("${my.own.key.for.destination}")
	private String destinationName;

	@Autowired
	private JmsTemplate template;

	public void sendMessage(Person person) {
		System.out.println("Publisher sending msg to mom...");
		String message = JsonUtil.getStringFromObject(person);
		template.send(destinationName, new MessageCreator() {
			@Override
			public Message createMessage(Session session) throws JMSException {
				return session.createTextMessage(message);
			}
		});
	}

}
