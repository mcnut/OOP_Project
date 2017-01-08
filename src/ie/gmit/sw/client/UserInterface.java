package ie.gmit.sw.client;

import java.util.Scanner;

/**
 * 
 * @author User
 *
 */
public class UserInterface {

	Scanner console = new Scanner(System.in);

	public int option = 0;

	public UserInterface() {
		super();
	}

	public int getOption() {
		return option;
	}

	public void setOption(int select) {
		this.option = select;
	}

	@Override
	public String toString() {
		return "1. Connect to Server\n2. List available files\n3. Download File\n4. Quit\n\nType Option[1-4]";
	}

	public int prompt() {
		option = console.nextInt();
		return option;
	}

}
