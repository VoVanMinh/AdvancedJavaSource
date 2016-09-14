package task4;

import java.util.Scanner;

/**
 * @author vovanminh
 * @version 1.0
 * @created Sep 14, 2016
 */
public class Main {
	public static void main(String[] args) {
		int choose = -1;
		int change = 0;
		String path = "src/task4/employee.txt";
		EmployeeManager manager = new EmployeeManager();
		
		try {
			manager.readFiletoList(path);
			while (choose != 0) {
				choose = menuMain();
				switch (choose) {
				case 0: 
					//write override from list to file when quit program 
					if(change == 1)
						manager.writeListtoFile(path);
					break;
				case 1:
					//print employee list.
					manager.printList();
					break;
				case 2: 
					//search a employee by name
					manager.search();
					break;
				case 3:
					//add new student to list.
					change = 1;
					manager.addEmployee();
					break;
				default:
					break;
				}
			}
		} catch (Exception e) {
			//System.out.println(e.getMessage());
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
			System.out.println("-----Diary Management-----");
			System.out.println("0. Quit");
			System.out.println("1. Print employee list");
			System.out.println("2. Search a employee by name");
			System.out.println("3. Add new employee");
			System.out.println("Enter a chosen: ");
			choose = input.nextInt();
		}
		return choose;
	}

}
