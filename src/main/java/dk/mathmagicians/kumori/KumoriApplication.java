package dk.mathmagicians.kumori;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class KumoriApplication {

	private static final Logger log = LoggerFactory.getLogger(KumoriApplication.class);

	
	public static void main(String[] args) {
		log.info("Starting Kumori application ... ");
		SpringApplication.run(KumoriApplication.class, args);
	}
	

	

}
