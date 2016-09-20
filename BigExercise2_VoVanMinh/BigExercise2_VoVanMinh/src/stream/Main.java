package stream;

import java.util.Scanner;

/**
 * @to demo how to use Stream
 * @author vovanminh
 * @version 1.0
 * @created Sep 19, 2016
 */
public class Main {

	public static void main(String[] args) {
		try {
			EmployeeManager empManager = new EmployeeManager();
			empManager.addEmployeeToList();

			int choose = -1;
			while (choose != 0) {
				choose = menuMain();
				switch (choose) {
				case 1:
					empManager.printList();
					break;
				case 2:
					empManager.viewSalaryByLevel(3000000);
					break;
				case 3:
					empManager.searchName("Anh");
					break;
				case 4:
					empManager.calAverageAge();
					break;
				case 5:
					empManager.calMaxSalary();
					break;
				case 6:
					empManager.calMinSalary();
					break;
				case 7:
					empManager.calAverageSalary();
					break;
				default:
					break;
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
		while (choose < 0 || choose > 7) {
			System.out.println("-----Main menu-----");
			System.out.println("0. Quit");
			System.out.println("1. Employee list");
			System.out.println("2. List employee have salary > 3000000");
			System.out.println("3. Search name \"Anh\" in list");
			System.out.println("4. View average age of all employee");
			System.out.println("5. View max salary of employee");
			System.out.println("6. View min salary of employee");
			System.out.println("7. View average salary of all employee");
			System.out.println("Enter a chosen from 0->6: ");
			choose = input.nextInt();
		}
		return choose;
	}
}
