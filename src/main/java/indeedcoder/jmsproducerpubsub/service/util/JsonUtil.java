package indeedcoder.jmsproducerpubsub.service.util;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import indeedcoder.jmsproducerpubsub.model.Person;

public class JsonUtil {

	public static String getStringFromObject(Person person) {
		String json = null;
		try {
			ObjectMapper mapper = new ObjectMapper();
			json = mapper.writeValueAsString(person);
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
		return json;
	}
}
