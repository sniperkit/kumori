package dk.mathmagicians.kumori.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;

@ShellComponent()
public class KumoriCli// implements CommandMarker
{

	private static final Logger log = LoggerFactory.getLogger(KumoriCli.class);

	private final ConfigurationReaderService reader;
	private final PublisherService publisher;

	@Autowired
	public KumoriCli(ConfigurationReaderService reader, PublisherService publisher) {
		this.reader = reader;
		this.publisher = publisher;
	}

	@ShellMethod(value = "Displays contents of the Technology Menu")
	public String techmenu() {
		// Check args, etc.
		log.info("Invoking cli command");
		// invoke service
		return reader.read();
	}
	
	@ShellMethod(value = "Publishes contents of Technology Menu to Confluence")
	public String publish() {
		// Check args, etc.
		log.info("Invoking cli command");
		// invoke service
		publisher.publish();
		return "Done";
	}

}
