package task1;

import java.util.Scanner;

/**
 * @author vovanminh
 * @version 1.0
 * @created Sep 15, 2016
 */
public class Main {

	public static void main(String[] args) {
		int choose = -1;
		int change = 0;
		String path = "src/task1/contact.xml";

		ContactManager contactManager = new ContactManager();

		try {
			contactManager.getContactList(path);
			while (choose != 0) {
				choose = menuMain();
				switch (choose) {
				case 0:
					// write override from list to file when quit program
					if (change == 1)
						contactManager.writeListtoFile(path);
					break;
				case 1:
					// print contact list.
					contactManager.printList();
					break;
				case 2:
					// search contact
					contactManager.findContact(contactManager.getString("name"));
					break;
				case 3:
					// add new contact to list.
					change = 1;
					contactManager.addContact();
					break;
				case 4:
					// update contact in list.
					change = 1;
					contactManager.updateContact(contactManager.getString("name"));
					break;
				case 5:
					// remove contact in list.
					change = 1;
					contactManager.removeContact(contactManager.getString("name"));
					break;
				default:
					break;
				}
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}

	/**
	 * @to print main menu.
	 * @return a chosen int type from keyboard.
	 */
	private static int menuMain() {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		int choose = -1;
		while (choose < 0 || choose > 5) {
			System.out.println("-----Contact Management-----");
			System.out.println("0. Quit");
			System.out.println("1. Print contact list");
			System.out.println("2. Search contact by name");
			System.out.println("3. Add new contact");
			System.out.println("4. Update the phone number");
			System.out.println("5. Remove contact");
			System.out.println("Enter a chosen: ");
			choose = input.nextInt();
		}
		return choose;
	}
}
