package task7;

import java.util.Scanner;

/**
 * @author vovanminh
 * @version 1.0
 * @created Sep 8, 2016
 */
public class Main {
	public static void main(String[] args) {
		try {
			ContactManager contactManager = new ContactManager();
			contactManager.setDataDefault();
			int temp = -1;
			while (temp != 0) {
				temp = menu();
				switch (temp) {
				case 1:
					contactManager.printContactList();
					break;
				case 2:
					contactManager.addContact();
					break;
				case 3:
					contactManager.findContact(contactManager.getName());
					break;
				case 4:
					contactManager.removeContact(contactManager.getName());
					break;
				case 5:
					contactManager.updateContact(contactManager.getName());
				default:
					break;
				}
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	// to print main menu and return int type.
	public static int menu() {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		int temp = -1;
		while (temp < 0 || temp > 5) {
			System.out.println("-----Menu-----");
			System.out.println("\t1. Print contact list");
			System.out.println("\t2. Add new contact into list");
			System.out.println("\t3. Search contact");
			System.out.println("\t4. Remove contact");
			System.out.println("\t5. Update contact");
			System.out.println("Enter 0 to quit! Enter a chosen 0->5: ");
			temp = input.nextInt();
		}
		return temp;
	}

}
