package task3;

import java.util.Scanner;

/**
 * @author vovanminh
 * @version 1.0
 * @created Sep 7, 2016
 */
public class Main {
	public static void main(String[] args) {
		try {
			StudentManager studentManager = new StudentManager();
			studentManager.setDataDefault();
			int temp = -1;
			while (temp != 0) {
				temp = menu();
				switch (temp) {
				case 1:
					studentManager.printStudentList();
					break;
				case 2:
					studentManager.addAStudent();
					break;
				case 3:
					studentManager.search();
					break;
				case 4:
					studentManager.remove();
					break;
				default:
					break;
				}
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	//to print main menu and return int type.
	public static int menu() {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		int temp = -1;
		while (temp < 0 || temp > 4) {
			System.out.println("-----Menu-----");
			System.out.println("\t1. Show student list");
			System.out.println("\t2. Add new student into list");
			System.out.println("\t3. Search student by id");
			System.out.println("\t4. Remove student by id");
			System.out.println("Enter 0 to quit! Enter a chosen 0->4: ");
			temp = input.nextInt();
		}
		return temp;

	}

}
