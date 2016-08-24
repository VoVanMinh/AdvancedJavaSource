package task8;
import java.util.Scanner;
/* @Infantryman class
 * @Author: Vo Van Minh
 * @Date: 22-08-2016
 * @Version: 1.0
 */
public class Infantryman extends Soldier {

	// to reduce the power went 2
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
	 * Get a Infantryman. Input: user input from keyboard. Output: a
	 * Infantryman.
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

	//to print information of a Infantryman.
	@Override
	void printSoldier() {
		System.out.println("---------------------------");
		System.out.println("Information of Infantryman!");
		super.printSoldier();
	}
}
