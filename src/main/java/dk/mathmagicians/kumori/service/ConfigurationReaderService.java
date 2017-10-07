package dk.mathmagicians.kumori.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

@Service
public class ConfigurationReaderService {
	
	private static final Logger log = LoggerFactory.getLogger(ConfigurationReaderService.class);
	static final String slurper = "{\"name\": \"MongoDB\", \"id\": 1}";
	
	public String read(){
		return slurper;
	}
	
	@Bean
	public CommandLineRunner configurationReaderRunner() throws Exception {
		return args -> {
			//todo parse this trough avro instead!
			
			log.info("Read the following configuration: "+ slurper);
		};
	}

}
