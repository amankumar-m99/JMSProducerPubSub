package indeedcoder.jmsproducerpubsub.scheduledjobs;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import indeedcoder.jmsproducerpubsub.model.Person;
import indeedcoder.jmsproducerpubsub.service.ProducerService;

@Component
public class ProducerJob {

	@Autowired
	private ProducerService producerService;

	@Scheduled(fixedDelay = 5000) // after every 5 seconds
	public void send() throws Exception {
		producerService.sendMessage(new Person(101, "Person" + new Date()));
	}
}
