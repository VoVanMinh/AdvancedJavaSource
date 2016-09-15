package task1;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.w3c.dom.*;
import org.xml.sax.SAXException;

import javax.xml.parsers.*;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;;

/**
 * @author vovanminh
 * @version 1.0
 * @created Sep 15, 2016
 */
public class ContactManager {
	final String[] INFO = { "contact", "name", "phone" };
	List<Contact> list = new ArrayList<Contact>();
	BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
	
	/**
	 * @to get a String from keyboard
	 * @return String
	 * @throws IOException 
	 */
	public String getString(String content) throws IOException {
		System.out.println("Enter " +content +": ");
		String temp = input.readLine();
		return temp;
	}
	
	// to add a contact to list
	public void addContact() throws IOException {
		
		Contact contact = Contact.getContact();
		while (checkPhone(contact.getPhone()) != -1) {
			System.out.println("Phone already exits. Please input again!");
			contact.setPhone(getString("phone"));
		}
		list.add(contact);
		System.out.println("---Added");
	}

	// to print contact list
	public void printList() {
		//to sort list by name
		Collections.sort(list, (Contact c1, Contact c2) -> c1.getName().compareTo(c2.getName()));
		
		System.out.println("-----Contact list-----");
		for (Contact contact : list) {
			System.out.println(contact);
		}
	}

	// to write contact list to xml file
	public void writeListtoFile(String path)
			throws ParserConfigurationException, TransformerException, SAXException, IOException {
		DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
		Document doc = docBuilder.newDocument();

		Element rootElement;

		// root contact
		rootElement = doc.createElement("contacts");
		doc.appendChild(rootElement);
		
		for (int i = 0; i < list.size(); i++) {
			// contact
			Element contact = doc.createElement(INFO[0]);
			rootElement.appendChild(contact);

			// name element
			Element name = doc.createElement(INFO[1]);
			name.appendChild(doc.createTextNode(list.get(i).getName()));
			contact.appendChild(name);

			// phone element
			Element phone = doc.createElement(INFO[2]);
			phone.appendChild(doc.createTextNode(list.get(i).getPhone()));
			contact.appendChild(phone);
		}

		// write the content into xml file
		TransformerFactory tranFFactory = TransformerFactory.newInstance();
		Transformer tranF = tranFFactory.newTransformer();
		DOMSource dSource = new DOMSource(doc);

		StreamResult result = new StreamResult(new File(path));
		tranF.transform(dSource, result);

	}

	// to get a contact node from xml file
	public Contact getNodeContact(Node node) {
		Contact contact = new Contact();
		if (node.getNodeType() == Node.ELEMENT_NODE) {
			Element element = (Element) node;
			contact.setName(element.getElementsByTagName(INFO[1]).item(0).getTextContent());
			contact.setPhone(element.getElementsByTagName(INFO[2]).item(0).getTextContent());
		}
		return contact;
	}

	// to get contact list from xml file
	public void getContactList(String path) throws ParserConfigurationException, IOException, SAXException {
		File xmlFile = new File(path);
		if (xmlFile.exists()) {
			if (xmlFile.length() != 0) {
				DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
				DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
				Document doc = dBuilder.parse(xmlFile);
				doc.getDocumentElement().normalize();

				NodeList nodeList = doc.getElementsByTagName(INFO[0]);

				for (int i = 0; i < nodeList.getLength(); i++) {
					list.add(getNodeContact(nodeList.item(i)));
				}
			}
		}
	}
	
	/**
	 * @to check a phone has exist and return index if have
	 * @param phone
	 * @rerurn int type
	 */
	public int checkPhone(String phone) {
		for (int i = 0; i < list.size(); i++) {
			if(list.get(i).getPhone().equals(phone)) {
				return i;
			}
		}
		return -1;
	}
	/**
	 * @to find a contact by name
	 * @param name
	 * @return int type and print contact list if have
	 */
	public int findContact(String name) {
		int temp = 0;
		for (Contact contact : list) {
			if(contact.getName().equalsIgnoreCase(name)) {
				System.out.println(contact);
				temp = 1;
			}
		}
		if(temp == 0) {
			System.out.println("---Name not exist in list");
		}
		return temp;
	}
	/**
	 * @to delete a contact in list
	 * @param name
	 * @return
	 * @throws IOException 
	 */
	public void removeContact(String name) throws IOException {
		if(findContact(name) == 1) {
			String phone = getString("the phone number that you want to remove");
			int temp = checkPhone(phone);
			if(temp == -1 || !name.equalsIgnoreCase(list.get(temp).getName())) {
				System.out.println("---The phone number is not match!");
			}
			else {
				list.remove(temp);
				System.out.println("---Deleted");
			}
		}
	}
	
	/**
	 * @to update a contact in list
	 * @param name
	 * @return
	 * @throws IOException 
	 */
	public void updateContact(String name) throws IOException {
		if(findContact(name) == 1) {
			String phone = getString("the phone number that you want to update");
			int temp = checkPhone(phone);
			if(temp == -1 || !name.equalsIgnoreCase(list.get(temp).getName())) {
				System.out.println("---The phone number is not match!");
			}
			else {
				String newPhone = getString("new phone number");
				while(checkPhone(newPhone) != -1) {
					System.out.println("Phone already exits. Please input again!");
					newPhone = getString("new phone number again");
				}
				list.get(temp).setPhone(newPhone);
				System.out.println("---Updated");
			}
		}
	}
}
