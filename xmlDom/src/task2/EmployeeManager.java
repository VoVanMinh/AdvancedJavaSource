package task2;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.TreeMap;

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


/**
 * @author vovanminh
 * @version 1.0
 * @created Sep 15, 2016
 */
public class EmployeeManager {
	final String[] INFO = { "employee", "id", "name", "sex", "birthday", "salary", "address", "department" };
	TreeMap<String, Employee> treeMap = new TreeMap<>();

	BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

	/**
	 * @to get a String from keyboard
	 * @return String
	 * @throws IOException
	 */
	public String getString(String content) throws IOException {
		System.out.println("Enter " + content + ": ");
		String temp = input.readLine();
		return temp;
	}

	// to add a employee to list
	public void addEmployee(DepartmentManager depm) throws IOException {
		depm.printList();
		Employee emp = Employee.getEmployee();
		while (treeMap.containsKey(emp.getId())) {
			System.out.println("Id already exits.");
			emp.setId(getString("id again"));
		}
		while (!depm.treeMap.containsKey(emp.getDepartment())) {
			System.out.println("ID department is not match.");
			emp.setDepartment(getString("ID department again"));
		}
		treeMap.put(emp.getId(), emp);
		System.out.println("---Added");
	}

	// to print employee list.
		public void printList() throws IOException {
			System.out.println("-----Employee list-----");
			for (String key : treeMap.keySet()) {
				System.out.println(treeMap.get(key));
			}
		}

	
	// to print employee list by department id
	public void printListByDepartID(DepartmentManager depm) throws IOException {
		depm.printList();
		String temp = getString("department id");
		System.out.println("-----Employee list by department-----");
		for (String key : treeMap.keySet()) {
			if(treeMap.get(key).getDepartment().equalsIgnoreCase(temp)) {
				System.out.println(treeMap.get(key));
			}
		}

	}

	// to get a employee node from xml file
	public Employee getNodeEmployee(Node node) {
		Employee employee = new Employee();
		if (node.getNodeType() == Node.ELEMENT_NODE) {
			Element element = (Element) node;
			employee.setId(element.getElementsByTagName(INFO[1]).item(0).getTextContent());
			employee.setName(element.getElementsByTagName(INFO[2]).item(0).getTextContent());
			employee.setSex(element.getElementsByTagName(INFO[3]).item(0).getTextContent());
			employee.setBirthday(element.getElementsByTagName(INFO[4]).item(0).getTextContent());
			employee.setSalary(Float.parseFloat(element.getElementsByTagName(INFO[5]).item(0).getTextContent()));
			employee.setAddress(element.getElementsByTagName(INFO[6]).item(0).getTextContent());
			employee.setDepartment(element.getElementsByTagName(INFO[7]).item(0).getTextContent());

		}
		return employee;
	}

	// to get Employee list from xml file
	public void getEmployeeList(String path) throws ParserConfigurationException, IOException, SAXException {
		File xmlFile = new File(path);
		if (xmlFile.exists()) {
			if (xmlFile.length() != 0) {
				DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
				DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
				Document doc = dBuilder.parse(xmlFile);
				doc.getDocumentElement().normalize();

				NodeList nodeList = doc.getElementsByTagName(INFO[0]);

				for (int i = 0; i < nodeList.getLength(); i++) {
					Employee emp = getNodeEmployee(nodeList.item(i));
					treeMap.put(emp.getId(), emp);
				}
			}
		}
	}

	// to write employee list to xml file
	public void writeListtoFile(String path)
			throws ParserConfigurationException, TransformerException, SAXException, IOException {
		DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
		Document doc = docBuilder.newDocument();

		Element rootElement;

		// root contact
		rootElement = doc.createElement("department");
		doc.appendChild(rootElement);

		for (String key : treeMap.keySet()) {
			// contact
			Element contact = doc.createElement(INFO[0]);
			rootElement.appendChild(contact);

			// id element
			Element id = doc.createElement(INFO[1]);
			id.appendChild(doc.createTextNode(treeMap.get(key).getId()));
			contact.appendChild(id);

			// name element
			Element name = doc.createElement(INFO[2]);
			name.appendChild(doc.createTextNode(treeMap.get(key).getName()));
			contact.appendChild(name);

			// sex element
			Element sex = doc.createElement(INFO[3]);
			sex.appendChild(doc.createTextNode(treeMap.get(key).getSex()));
			contact.appendChild(sex);

			// birthday element
			Element birthday = doc.createElement(INFO[4]);
			birthday.appendChild(doc.createTextNode(treeMap.get(key).getBirthday()));
			contact.appendChild(birthday);
			
			// salary element
			Element salary = doc.createElement(INFO[5]);
			salary.appendChild(doc.createTextNode(String.valueOf(treeMap.get(key).getSalary())));
			contact.appendChild(salary);
			
			// address element
			Element address = doc.createElement(INFO[6]);
			address.appendChild(doc.createTextNode(treeMap.get(key).getAddress()));
			contact.appendChild(address);
			
			// department element
			Element department = doc.createElement(INFO[7]);
			department.appendChild(doc.createTextNode(treeMap.get(key).getDepartment()));
			contact.appendChild(department);
		}

		// write the content into xml file
		TransformerFactory tranFFactory = TransformerFactory.newInstance();
		Transformer tranF = tranFFactory.newTransformer();
		DOMSource dSource = new DOMSource(doc);

		StreamResult result = new StreamResult(new File(path));
		tranF.transform(dSource, result);

	}
}
