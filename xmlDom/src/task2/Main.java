package task2;

import java.util.Scanner;

/**
 * @author vovanminh
 * @version 1.0
 * @created Sep 16, 2016
 */
public class Main {
	public static void main(String[] args) {
		int choose = -1;
		int change = 0;
		String path1 = "src/task2/department.xml";
		String path2 = "src/task2/employee.xml";

		DepartmentManager depm = new DepartmentManager();
		EmployeeManager empm = new EmployeeManager();
		
		try {
			depm.getDepartmentList(path1);
			empm.getEmployeeList(path2);
			while (choose != 0) {
				choose = menuMain();
				switch (choose) {
				case 0:
					// write override from list to file when quit program
					if (change == 1)
						empm.writeListtoFile(path2);
					break;
				case 1:
					// print employee list.
					empm.printList();
					break;
				case 2:
					// print employee list by department id.
					empm.printListByDepartID(depm);
					break;
				case 3:
					// add new contact to list.
					change = 1;
					empm.addEmployee(depm);
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
		while (choose < 0 || choose > 3) {
			System.out.println("-----Contact Management-----");
			System.out.println("0. Quit");
			System.out.println("1. Print employee list");
			System.out.println("2. Print employee list by department");
			System.out.println("3. Add new employee");
			System.out.println("Enter a chosen: ");
			choose = input.nextInt();
		}
		return choose;
	}
}
