package in.ashokit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringBootRestApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootRestApiApplication.class, args);
		System.out.println( "Hello World!" );
     //	changes for his-134
	 	System.out.println( "Hai World!" );
	}

	@GetMapping("/")
	public String welcomeMsg() {
		return "Welcome To Ashok IT..!!";
	}

}
