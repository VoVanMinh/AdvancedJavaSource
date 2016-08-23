package task8;

/* Author: Vo Van Minh
 * Date 22-08-2016
 * Version 1
 */
import java.util.Scanner;

public class Infantryman extends Soldier {

	@Override
	void fight() {
		this.power -= 2;
	}

	public Infantryman() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Infantryman(String name, int power, String weapon) {
		super(name, power, weapon);
		// TODO Auto-generated constructor stub
	}

	/*
	 * get a infantryman
	 */
	Infantryman getInfantryman() {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);

		System.out.println("Enter information of Infantryman!");
		System.out.println("-----Enter name: ");
		String iname = input.nextLine();
		System.out.println("-----Enter weapon: ");
		String iweapon = input.nextLine();
		System.out.println("-----Enter power: ");
		int ipower = input.nextInt();

		Infantryman infantryman = new Infantryman(iname, ipower, iweapon);

		return infantryman;
	}

	@Override
	void printSoldier() {
		System.out.println("---------------------------");
		System.out.println("Information of Infantryman!");
		super.printSoldier();
	}
}
