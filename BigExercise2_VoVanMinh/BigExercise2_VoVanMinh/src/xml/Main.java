package xml;

import java.io.File;
import java.io.IOException;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import jdbc.CD;
import jdbc.CDController;

/**
 * @to read/write file xml from database
 * @author vovanminh
 * @version 1.0
 * @created Sep 19, 2016
 */
public class Main {
	final static String[] INFO = { "cd", "id", "name", "singer", "numberSongs", "price" };

	public static void main(String[] args) {

		String path = "src/xml/cd.xml";
		CDController cdController = new CDController();

		try {
			// to get all CD from database to list
			cdController.getCDList();
			
			// to write all CD in list to file
			writeListtoFile(cdController.list, path);
			
			// to read file and add CD to list
			readFiletoList(cdController.list, path);
			
			// print list
			cdController.printList();

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

	
	// to get a CD node from xml file
		public static CD getNodeCD(Node node) {
			CD cd = new CD();
			if (node.getNodeType() == Node.ELEMENT_NODE) {
				Element element = (Element) node;
				cd.setId(Integer.parseInt(element.getElementsByTagName(INFO[1]).item(0).getTextContent()));
				cd.setName(element.getElementsByTagName(INFO[2]).item(0).getTextContent());
				cd.setSinger(element.getElementsByTagName(INFO[3]).item(0).getTextContent());
				cd.setNumberSongs(Integer.parseInt(element.getElementsByTagName(INFO[4]).item(0).getTextContent()));
				cd.setPrice(Double.parseDouble(element.getElementsByTagName(INFO[5]).item(0).getTextContent()));
			}
			return cd;
		}
	
	/**
	 * @to read file from path and add to list
	 * @param list
	 * @param path
	 * @throws IOException 
	 * @throws SAXException 
	 * @throws ParserConfigurationException 
	 */
	private static void readFiletoList(List<CD> list, String path) throws SAXException, IOException, ParserConfigurationException {
		File xmlFile = new File(path);
		if (xmlFile.exists()) {
			if (xmlFile.length() != 0) {
				list.clear();
				DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
				DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
				Document doc = dBuilder.parse(xmlFile);
				doc.getDocumentElement().normalize();

				NodeList nodeList = doc.getElementsByTagName(INFO[0]);

				for (int i = 0; i < nodeList.getLength(); i++) {
					list.add(getNodeCD(nodeList.item(i)));
				}
			}
		}

	}

	/**
	 * @to write file from list
	 * @param list
	 * @param path
	 * @throws ParserConfigurationException 
	 * @throws TransformerException 
	 */
	private static void writeListtoFile(List<CD> list, String path) throws ParserConfigurationException, TransformerException {
		DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
		Document doc = docBuilder.newDocument();

		Element rootElement;

		// root CDs
		rootElement = doc.createElement("CDs");
		doc.appendChild(rootElement);

		for (int i = 0; i < list.size(); i++) {
			// cd
			Element cd = doc.createElement(INFO[0]);
			rootElement.appendChild(cd);

			// id element
			Element id = doc.createElement(INFO[1]);
			id.appendChild(doc.createTextNode(String.valueOf(list.get(i).getId())));
			cd.appendChild(id);

			// name element
			Element name = doc.createElement(INFO[2]);
			name.appendChild(doc.createTextNode(list.get(i).getName()));
			cd.appendChild(name);

			//singer element
			Element singer = doc.createElement(INFO[3]);
			singer.appendChild(doc.createTextNode(list.get(i).getSinger()));
			cd.appendChild(singer);
			
			//numberSongs element
			Element numberSongs = doc.createElement(INFO[4]);
			numberSongs.appendChild(doc.createTextNode(String.valueOf(list.get(i).getNumberSongs())));
			cd.appendChild(numberSongs);
			
			//price element
			Element price = doc.createElement(INFO[5]);
			price.appendChild(doc.createTextNode(String.valueOf(list.get(i).getPrice())));
			cd.appendChild(price);
		}

		// write the content into xml file
		TransformerFactory tranFFactory = TransformerFactory.newInstance();
		Transformer tranF = tranFFactory.newTransformer();
		DOMSource dSource = new DOMSource(doc);

		StreamResult result = new StreamResult(new File(path));
		tranF.transform(dSource, result);

	}
}
