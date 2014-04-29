package how;

import how.service.GreetingsService;

import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.Options;
import org.apache.commons.cli.ParseException;
import org.apache.commons.cli.PosixParser;

/**
 * Sistema de saudações.
 */
public class App {

	public static void main(String[] args) throws Exception {
		Options opts = new Options()
			.addOption("f", "formal", false, "tipo de tratamento formal")
			.addOption("v", "visitor-name", true, "nome do visitante");

		CommandLine cmd = new PosixParser().parse(opts, args);

		boolean type = cmd.hasOption('f');
		String visitorName  = cmd.getOptionValue("visitor-name");

		GreetingsService service  = new GreetingsService();

		String output = service.welcome(visitorName, type);

		System.out.println(output);
	}

}
