package task2;

import java.io.File;
import java.io.IOException;
import java.util.TreeMap;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

/**
 * @author vovanminh
 * @version 1.0
 * @created Sep 15, 2016
 */
public class DepartmentManager {
	final String[] INFO = { "department", "id", "name" };
	TreeMap<String, Department> treeMap = new TreeMap<>();
	
	// to print department list..
		public void printList() {
			System.out.println("-----Department list-----");
			for (String key : treeMap.keySet()) {
				System.out.println(treeMap.get(key));
			}
			
		}
	
		// to get a department node from xml file
		public Department getNodeDepartment(Node node) {
			Department department = new Department();
			if (node.getNodeType() == Node.ELEMENT_NODE) {
				Element element = (Element) node;
				department.setId(element.getElementsByTagName(INFO[1]).item(0).getTextContent());
				department.setName(element.getElementsByTagName(INFO[2]).item(0).getTextContent());
			}
			return department;
		}

		// to get Department list from xml file
		public void getDepartmentList(String path) throws ParserConfigurationException, IOException, SAXException {
			File xmlFile = new File(path);
			if (xmlFile.exists()) {
				if (xmlFile.length() != 0) {
					DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
					DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
					Document doc = dBuilder.parse(xmlFile);
					doc.getDocumentElement().normalize();

					NodeList nodeList = doc.getElementsByTagName(INFO[0]);

					for (int i = 0; i < nodeList.getLength(); i++) {
						Department dept = getNodeDepartment(nodeList.item(i));
						treeMap.put(dept.getId(), dept);
					}
				}
			}
		}
}
