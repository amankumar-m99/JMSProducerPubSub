package indeedcoder.jmsproducerpubsub.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import indeedcoder.jmsproducerpubsub.model.Person;
import indeedcoder.jmsproducerpubsub.service.ProducerService;

@Component
public class ProducerRunner implements CommandLineRunner {

	@Autowired
	private ProducerService producerService;

	@Override
	public void run(String... args) throws Exception {
		producerService.sendMessage(new Person(101, "First Person"));
	}
}
