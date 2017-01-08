package ie.gmit.sw.client;

import ie.gmit.sw.client.config.*;
import ie.gmit.sw.server.Server;

public class Runner {

	public static void main(String[] args) throws Throwable {

		UserInterface ui = new UserInterface();
		Parsator parse = new Parsator();
		XMLParser xml = new XMLParser(parse);
		Server sv = new Server();
		xml.run();

		System.out.println(ui);

		while (ui.option != 4) {

			ui.prompt();

			switch (ui.option) {
			case 1:

				System.out.println(parse);
				break;
			case 2:
				System.out.println("Files");
				System.out.println("=====");
				Server.ListFiles lf = sv.new ListFiles();
				lf.run();
				break;
			case 3:
				System.out.println("Download not working yet");
				break;
			default:
				break;
			}

		}

	}

}
