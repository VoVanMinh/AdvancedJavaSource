package task9;

import java.util.InputMismatchException;
import java.util.Scanner;
/* @Main Class to execute program.
 * @Author: Vo Van Minh
 * @Date: 22-08-2016
 * @Version: 1.0
 */
public class Main {

	public static void main(String[] args) {

		ComputerManager comman = new ComputerManager();
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		String temp = " ";
		try {
			while (!temp.equalsIgnoreCase("n")) {
				Computer com = new Computer();
				com = com.getComputer();

				System.out.println("1. Input a destop");
				System.out.println("2. Input a laptop");
				int choose = 0;
				while (choose != 1 && choose != 2) {
					System.out.println("-----Enter a choosen: ");
					choose = input.nextInt();
				}
				switch (choose) {
				case 1:
					Destop des = new Destop();
					des = des.getDestop(com);
					comman.addCom(des);
					break;
				case 2:
					Laptop lap = new Laptop();
					lap = lap.getLaptop(com);
					comman.addCom(lap);
					break;
				default:
					break;
				}
				System.out.println("Continue add a computer? y/n: ");
				input = new Scanner(System.in);
				temp = input.nextLine();
			}
			comman.printList();
			System.out.println("Total price of all destop: " + comman.totalMoneyDestop());
			System.out.println("Total price of all laptop: " + comman.totalMoneyLaptop());
		} catch (InputMismatchException e) {
			System.out.println("Value entered is invalid!");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
