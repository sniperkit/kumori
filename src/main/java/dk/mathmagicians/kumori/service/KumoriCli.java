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

	private final ConfigurationReaderService readerService;

	@Autowired
	public KumoriCli(ConfigurationReaderService readerService) {
		this.readerService = readerService;
	}

	@ShellMethod(value = "techmenu")
	public String techmenu() {
		// Check args, etc.
		log.info("Invoking cli command");
		// invoke service
		return readerService.read();
	}

}
