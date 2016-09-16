package account;

import java.util.Scanner;

/**
 * @author vovanminh
 * @version 1.0
 * @created Sep 16, 2016
 */
public class Main {

	public static void main(String[] args) {

		UserController userController = new UserController();
		User user = null;
		int choose = -1;
		while (choose != 0) {
			try {
				choose = menuMain();
				switch (choose) {
				case 1:
					user = userController.loginUser(User.getUser());
					if (user == null)
						System.out.println("---Invalid username or password");
					else
						System.out.println("---Login successfully");
					break;
				case 2:
					user = User.getUser();
					Scanner input = new Scanner(System.in);
					System.out.println("Confirm Password: ");
					String cPasswd = input.nextLine();
					if (cPasswd.equals(user.getPassword()))
						userController.insertUser(user);
					else
						System.out.println("Password and Confirm Password are not the same");
					break;
				default:
					break;
				}
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
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
		while (choose < 0 || choose > 2) {
			System.out.println("-----Main menu-----");
			System.out.println("0. Quit");
			System.out.println("1. Login");
			System.out.println("2. Add new user");
			System.out.println("Enter a chosen: ");
			choose = input.nextInt();
		}
		return choose;
	}
}
