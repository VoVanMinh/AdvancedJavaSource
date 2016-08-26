package task9;
import java.util.Scanner;
/* @Desktop class
 * @Author: Vo Van Minh
 * @Date: 22-08-2016
 * @Version: 1.0
 */


public class Destop extends Computer {

	String cpu;
	String ram;

	public Destop() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Destop(String modelName, float price, String manufacturer, int quantity) {
		super(modelName, price, manufacturer, quantity);
		// TODO Auto-generated constructor stub
	}

	public Destop(String cpu, String ram) {
		super();
		this.cpu = cpu;
		this.ram = ram;
	}

	//to print information of a Desktop.
	@Override
	void printComputer() {
		// TODO Auto-generated method stub
		System.out.println("-------Desktop Information-----");
		super.printComputer();
		System.out.println("---CPU: " + this.cpu);
		System.out.println("---RAM: " + this.ram);
	}

	/*
	 * Get a desktop.
	 * Input: a Computer.
	 * Output: return a desktop.
	 */
	Destop getDestop(Computer com) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.println("Enter CPU: ");
		String cpu = input.nextLine();
		System.out.println("Enter RAM: ");
		String ram = input.nextLine();

		Destop des = new Destop(com.modelName, com.price, com.manufacturer, com.quantity);
		des.cpu = cpu;
		des.ram = ram;

		return des;
	}
}
