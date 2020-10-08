package mx.sid.planePage.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Front {

	@RequestMapping("/")
	public String index() {
		return "Greetings from Spring Boot!";
	}
	
}
