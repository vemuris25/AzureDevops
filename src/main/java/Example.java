//import org.springframework.boot.*;
//import org.springframework.boot.autoconfigure.*;
import org.springframework.web.bind.annotation.*;

@RestController
//@EnableAutoConfiguration
public class Example {

	@RequestMapping("/")
	public String index(){
		return "Hello! This is my first Spring Boot Application Deployment";
	}

}
