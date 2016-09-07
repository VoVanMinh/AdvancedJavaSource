package task1;

import java.io.IOException;
import java.util.Scanner;

/**
 * @author vovanminh
 * @version 1.0
 * @created 07-Sep-2016
 */
public class Main {
	public static void main(String[] args) throws IOException {

		CDManager cdManager = new CDManager();
		try {
			int temp = -1;
			while (temp != 0) {
				temp = menu();
				switch (temp) {
				case 1:
					CD cd = CD.getCD();
					cdManager.addCD(cd);
					System.out.println("---Added!");
					break;
				case 2:
					cdManager.printCDList();
					System.out.println("---Total price of CD list: " + cdManager.calPriceTotal());
					break;

				case 3:
					cdManager.sortCDList();
					System.out.println("---Sorted!");
					break;
				default:
					break;
				}
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	// to print menu and return a chosen int type.
	private static int menu() {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		int temp = -1;
		while (temp < 0 || temp > 3) {
			System.out.println("-----Menu-----");
			System.out.println("1. Add a CD");
			System.out.println("2. Print CD list");
			System.out.println("3. Sort CD list");
			System.out.println("Enter 0 to quit! Enter a chosen 0->3: ");
			temp = input.nextInt();
		}
		return temp;
	}
}
