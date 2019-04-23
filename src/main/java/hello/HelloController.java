package hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	/**
	 * llamada: mvn package && java -jar target/test.spring-0.0.1-SNAPSHOT.jar
	 * @return
	 */
	@RequestMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }

}
