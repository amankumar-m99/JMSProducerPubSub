package indeedcoder.jmsproducerpubsub;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class JmsProducerPubSubApplication {

	public static void main(String[] args) {
		SpringApplication.run(JmsProducerPubSubApplication.class, args);
	}

}
