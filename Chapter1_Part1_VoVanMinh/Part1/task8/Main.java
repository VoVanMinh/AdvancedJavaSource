package task8;

import java.util.InputMismatchException;
import java.util.Scanner;
/* @Main Class to execute program.
 * @Author: Vo Van Minh
 * @Date: 22-08-2016
 * @Version: 1.0
 */
public class Main {

	public static void main(String[] args) {

		try {

			Infantryman infantryman = new Infantryman();
			infantryman = infantryman.getInfantryman();

			Trooper trooper = new Trooper();
			trooper = trooper.getTrooper();

			infantryman.printSoldier();
			trooper.printSoldier();
			
			startGame(infantryman, trooper);
			

		} catch (InputMismatchException e) {
			System.out.println("Value entered is invalid!");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

	/*
	 * Create menu and play game.
	 * Input: a Infantryman and a Trooper.
	 * Output: print information when play game.
	 */
	private static void startGame(Infantryman infantryman, Trooper trooper) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		while (infantryman.power > 0 && trooper.power > 0) {
			System.out.println("-----------------------------");
			System.out.println("1. Infantryman fight");
			System.out.println("2. Trooper fight");
			System.out.println("Enter a choosen: ");
			int choose = input.nextInt();
			switch (choose) {
			case 1:
				trooper.fight();
				break;
			case 2:
				infantryman.fight();
				break;
			default:
				break;
			}
			infantryman.printSoldier();
			trooper.printSoldier();
		}
		System.out.println("-----Game over!");
		
	}

}
