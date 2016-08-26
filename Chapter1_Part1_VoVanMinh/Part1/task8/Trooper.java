package task8;
import java.util.Scanner;
/* Author: Vo Van Minh
 * Date 22-08-2016
 * Version 1
 */
public class Trooper extends Soldier {

	//to reduce the power went 3.
	@Override
	void fight() {
		this.power -= 3;
	}

	public Trooper() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Trooper(String name, int power, String weapon) {
		super(name, power, weapon);
		// TODO Auto-generated constructor stub
	}

	/*
	 * Get a Trooper.
	 * Input: user input from keyboard.
	 * Output: a trooper.
	 */
	Trooper getTrooper() {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);

		System.out.println("Enter information of Trooper!");
		System.out.println("-----Enter name: ");
		String tname = input.nextLine();
		System.out.println("-----Enter weapon: ");
		String tweapon = input.nextLine();
		System.out.println("-----Enter power: ");
		int tpower = input.nextInt();
		Trooper trooper = new Trooper(tname, tpower, tweapon);

		return trooper;
	}

	//to print a trooper.
	@Override
	void printSoldier() {
		System.out.println("---------------------------");
		System.out.println("Information of Trooper!");
		super.printSoldier();
	}
}
