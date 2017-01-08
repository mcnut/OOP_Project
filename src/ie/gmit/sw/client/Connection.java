package ie.gmit.sw.client;

import java.net.*;

public class Connection {

	public Connection() {

		new Thread(new Runnable() {
			public void run() {
				try {
					Socket s = new Socket("localhost", 7777);
					System.out.println("Connected to server");
					s.close();
				} catch (Exception e) {
					System.out.println("Error: " + e.getMessage());
				}
			}// run
		}, "Client-").start();
	}// Connection

}
