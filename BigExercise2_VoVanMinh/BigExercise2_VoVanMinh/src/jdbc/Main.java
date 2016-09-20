package jdbc;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * @author vovanminh
 * @version 1.0
 * @created Sep 17, 2016
 */
public class Main {
	public static void main(String[] args) {
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		CDController cdController = new CDController();
		try {
			int choose = -1;
			while (choose != 0) {
				try {
					choose = menuMain();
					switch (choose) {
					// cd list
					case 1:
						cdController.getCDList();
						cdController.printList();
						break;
					// insert a CD
					case 2:
						CD cd = CD.getCD();
						cdController.insertCD(cd);
						break;
					// search CD by name
					case 3:
						System.out.println("Enter CD name you want to find: ");
						String name = input.readLine();
						cdController.searchCDByName(name);
						if (cdController.list.size() == 0)
							System.out.println("---Cannot find CD.");
						else
							cdController.printList();
						break;
					// search CD by price
					case 4:
						System.out.println("Enter CD price you want to find: ");
						System.out.println("---From: ");
						double price1 = Double.parseDouble(input.readLine());
						System.out.println("---To: ");
						double price2 = Double.parseDouble(input.readLine());

						cdController.searchCDByPrice(price1, price2);
						if (cdController.list.size() == 0)
							System.out.println("---Cannot find CD.");
						else
							cdController.printList();
						break;
					// update a CD
					case 5:
						cdController.getCDList();
						cdController.printList();
						CD cdU = cdController.chooseCD();
						if (cdU != null) {
							cd = cdController.preUpdateCD(cdU);
							cdController.updateCD(cdU);
						}
						break;
					// delete a CD
					case 6:
						cdController.getCDList();
						cdController.printList();
						CD cdD = cdController.chooseCD();
						System.out.println("You still want to delete this CD? y/n: ");
						String yn = input.readLine();
						if (yn.equals("y")) {
							cdController.deleteCD(cdD);
						}
						break;
					default:
						break;
					}
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
			}

		} catch (Exception e) {
			System.out.println(e.getMessage());
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
		while (choose < 0 || choose > 6) {
			System.out.println("-----Main menu-----");
			System.out.println("0. Quit");
			System.out.println("1. CD list");
			System.out.println("2. Add new CD");
			System.out.println("3. Search CD by name");
			System.out.println("4. Search CD by price");
			System.out.println("5. Update number of songs, price for a CD");
			System.out.println("6. Delete a CD");
			System.out.println("Enter a chosen from 0->6: ");
			choose = input.nextInt();
		}
		return choose;
	}
}
