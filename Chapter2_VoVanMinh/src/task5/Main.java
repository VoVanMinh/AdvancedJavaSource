package task5;

import java.util.Scanner;

/**
 * @author vovanminh
 * @version 1.0
 * @created Sep 8, 2016
 */
public class Main {
	public static void main(String[] args) {
		try {
			EmployeeManager empManager = new EmployeeManager();
			empManager.setDefault();
			int temp = -1;
			while (temp != 0) {
				temp = menu();
				switch (temp) {
				case 1:
					empManager.printEmployeeList();
					break;
				case 2:
					empManager.addEmployee();
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
		while (temp < 0 || temp > 2) {
			System.out.println("-----Menu-----");
			System.out.println("\t1. Show employee list sort by salary");
			System.out.println("\t2. Add new employee into list");
			System.out.println("Enter 0 to quit! Enter a chosen 0->2: ");
			temp = input.nextInt();
		}
		return temp;

	}

}
