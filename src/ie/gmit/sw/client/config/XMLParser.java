package ie.gmit.sw.client.config;

import javax.xml.parsers.*;
import org.w3c.dom.*;

public class XMLParser {

	private Parsator parser;

	public XMLParser(Parsator parser) {
		this.parser = parser;
	}

	public void run() throws Throwable {

		DocumentBuilderFactory docBuild = DocumentBuilderFactory.newInstance();
		DocumentBuilder db = docBuild.newDocumentBuilder();
		Document doc = db.parse(Parsator.CONFIG_FILE);

		Element root = doc.getDocumentElement();
		NodeList children = root.getChildNodes();

		for (int i = 0; i < children.getLength(); i++) {

			Node next = children.item(i);

			if (next instanceof Element) {

				Element e = (Element) next;

				if (e.getNodeName().equals("client-config")) {

					NamedNodeMap atts = e.getAttributes();

					for (int j = 0; j < atts.getLength(); j++) {
						if (atts.item(j).getNodeName().equals("username")) {
							parser.setUsername(atts.item(j).getNodeValue());
						}
					}
				}

				else if (e.getNodeName().equals("server-host")) {
					parser.setHost(e.getFirstChild().getNodeValue());
				}

				else if (e.getNodeName().equals("server-port")) {
					parser.setPort(Integer.parseInt(e.getFirstChild().getNodeValue()));
				}

				else if (e.getNodeName().equals("download-dir")) {
					parser.setDirectory(e.getFirstChild().getNodeValue());
				}
			}
		}
	}

	public Parsator getPrs() {
		return parser;
	}

	public void setPrs(Parsator parser) {
		this.parser = parser;
	}

}
