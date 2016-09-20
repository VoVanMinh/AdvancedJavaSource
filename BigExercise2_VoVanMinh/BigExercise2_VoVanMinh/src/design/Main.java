package design;

import java.util.Scanner;

/**
 * @author vovanminh
 * @version 1.0
 * @created 20-Sep-2016 10:35:43 AM
 */
public class Main {

	public static void main(String[] args) {

		Infantryman infan = new Infantryman("infantryman", 100, 5);
		Trooper trooper = new Trooper("trooper", 100, 10);
		
		System.out.println("-----Initialize Soldier information-----");
		System.out.println(infan);
		System.out.println(trooper);

		System.out.println("\n-----Decorate weapon for infantryman-----");
		decorateWeapon(infan);
		
		System.out.println("\n-----Decorate weapon for trooper-----");
		decorateWeapon(trooper);
		
		System.out.println("-----Informaton of soldiers after be decorated-----");
		System.out.println(infan);
		System.out.println(trooper);
		System.out.println("\n");
		
		startGame(infan, trooper);
	}

	/**
	 * @to show weapon menu for soldier.
	 * @return int type
	 */
	private static int chooseWeapon() {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);

		int choose = -1;
		while (choose < 0 || choose > 2) {
			System.out.println("0. Quit - don't choose");
			System.out.println("1. Decorate shield");
			System.out.println("2. Decorate sword");
			System.out.println("Enter a chosen: ");
			choose = input.nextInt();
		}
		return choose;
	}

	/**
	 * @to decorate weapon for soldier
	 * @param soldier
	 */
	private static void decorateWeapon(Soldier soldier) {
		int count = 0;
		Shield shield = new Shield(null, "shield", 5);
		Sword sword = new Sword(null, "sword", 10);

		int choose = -1;
		while (choose != 0) {
			choose = chooseWeapon();
			switch (choose) {
			case 1:
				count++;
				shield.setSoldier(soldier);
				shield.hit();
				System.out.println("---Decorated shield");
				break;
			case 2:
				count++;
				sword.setSoldier(soldier);
				sword.hit();
				System.out.println("---Decorated sword");
				break;
			default:
				break;
			}
			if (count == 2)
				break;
		}

	}

	private static int gameMenu() {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);

		int choose = -1;
		while (choose < 0 || choose > 2) {
			System.out.println("-------------Play game---------------");
			System.out.println("0. Quit game");
			System.out.println("1. Infantryman hit");
			System.out.println("2. Trooper hit");
			System.out.println("Enter a choosen: ");
			choose = input.nextInt();
		}
		return choose;
	}

	/**
	 * @to play game
	 * @param infan
	 * @param trooper
	 * @return print information when play game
	 */
	private static void startGame(Infantryman infan, Trooper trooper) {
		int choose = -1;
		while (choose != 0 && infan.wardOff() && trooper.wardOff()) {
			choose = gameMenu();
			switch (choose) {
			case 1:
				trooper.beHit(infan.hit());
				break;
			case 2:
				infan.beHit(trooper.hit());
				break;
			default:
				break;
			}
			System.out.println("-----Soldiers information while playing game-----");
			System.out.println(infan);
			System.out.println(trooper);
			System.out.println("\n");
		}
		System.out.println("-----Game over!");
	}

}