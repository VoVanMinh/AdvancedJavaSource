package task7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeMap;

/**
 * @author vovanminh
 * @version 1.0
 * @created Sep 8, 2016
 */
public class ContactManager {

	TreeMap<String, String> treeMap = new TreeMap<String, String>();
	BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

	// to get a name of phone.
	public String getName() throws IOException {
		System.out.println("Enter name: ");
		String name = input.readLine();
		return name;
	}

	// to add a contact into list.
	public void addContact() throws IOException {
		System.out.println("Enter name: ");
		String name = input.readLine();
		System.out.println("Enter phone number: ");
		String phone = input.readLine();
		if (treeMap.containsKey(phone))
			System.out.println("---Phone already exists");
		else {
			treeMap.put(phone, name);
			System.out.println("---Added!");
		}
	}

	// to print contact list.
	public void printContactList() {
		ArrayList<String> sorted = new ArrayList<>();
		for (String key : treeMap.keySet()) {
			sorted.add(treeMap.get(key) + ": " + key);
		}
		Collections.sort(sorted);
		for (String string : sorted) {
			System.out.println("[" + string + "]");
		}
	}

	/*
	 * to find a contact by name and print list if it exist. return type int.
	 */

	public int findContact(String name) throws IOException {
		int count = 0;
		for (String key : treeMap.keySet()) {
			if (treeMap.get(key).equalsIgnoreCase(name)) {
				System.out.println("[" + key + ": " + treeMap.get(key) + "]");
				count++;
			}
		}
		if (count == 0) {
			System.out.println("---The phone number not exist.");
		}
		return count;
	}

	// to remove contact in list.
	public void removeContact(String name) throws IOException {
		int temp = findContact(name);
		if (temp > 0) {
			System.out.println("Do you still want to remove the phone number? y/n: ");
			String choose = input.readLine();
			if (choose.equalsIgnoreCase("y")) {
				System.out.println("Enter exactly the phone number you want to delete: ");
				String phone = input.readLine();
				if (treeMap.containsKey(phone)) {
					treeMap.remove(phone);
					System.out.println("Removed!");
				} else
					System.out.println("You have entered the wrong!");
			}
		}
	}

	// to update phone by name
	public void updateContact(String name) throws IOException {
		int temp = findContact(name);
		if (temp > 0) {
			System.out.println("Re-enter the phone number OLD you want to update: ");
			String phoneOld = input.readLine();
			System.out.println("Enter the phone number NEW: ");
			String phoneNew = input.readLine();
			if (treeMap.containsKey(phoneOld)) {
				treeMap.put(phoneNew, treeMap.get(phoneOld));
				treeMap.remove(phoneOld);
				System.out.println("Updated!");
			} else
				System.out.println("You have entered the wrong!");
		}
	}

	// to set data example.
	public void setDataDefault() {
		treeMap.put("090", "Minh");
		treeMap.put("016", "Minh");
		treeMap.put("096", "King");
		treeMap.put("097", "Adam");
		treeMap.put("091", "Eva");
		treeMap.put("098", "Minh");
	}

}
