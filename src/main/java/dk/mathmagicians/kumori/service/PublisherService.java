package dk.mathmagicians.kumori.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import dk.mathmagicians.kumori.KumoriApplication;
import dk.mathmagicians.kumori.domain.ConfluencePage;

@Service 
public class PublisherService {
	
private static final Logger log = LoggerFactory.getLogger(PublisherService.class);
	
	@Value("${confluence.url}") private String confluenceUrl;
	
	@Bean
	public RestTemplate restTemplate(RestTemplateBuilder builder) {
		return builder.build();
	}

	@Bean
	public CommandLineRunner run(RestTemplate restTemplate) throws Exception {
		return args -> {
			ConfluencePage page = restTemplate.getForObject( confluenceUrl,
					ConfluencePage.class);
			log.info("Retrieved following Confluence page: "+page.toString());
		};
	}

}
