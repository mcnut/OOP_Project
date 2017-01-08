package ie.gmit.sw.client.config;

public class Parsator {

	public static final String CONFIG_FILE = "client-conf.xml";
	private String username;
	private String host;
	private int port;
	private String directory;

	public Parsator() {
		super();
	}

	// Getters/Setters
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getHost() {
		return host;
	}

	public void setHost(String host) {
		this.host = host;
	}

	public int getPort() {
		return port;
	}

	public void setPort(int port) {
		this.port = port;
	}

	public String getDirectory() {
		return directory;
	}

	public void setDirectory(String directory) {
		this.directory = directory;
	}

	public String toString() {
		return "User: " + username + "\nHost: " + host + "\nPort: " + port + "\nDirectory: " + directory;
	}

}
