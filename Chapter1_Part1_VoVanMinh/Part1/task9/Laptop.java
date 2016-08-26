package task9;
import java.util.Scanner;
/* Laptop class
 * @Author: Vo Van Minh
 * @Date: 22-08-2016
 * @Version: 1.0
 */
public class Laptop extends Computer {

	float weight;
	String batteryTime;
	String screenSize;

	public Laptop() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Laptop(String modelName, float price, String manufacturer, int quantity) {
		super(modelName, price, manufacturer, quantity);
		// TODO Auto-generated constructor stub
	}

	public Laptop(float weight, String batteryTime, String screenSize) {
		super();
		this.weight = weight;
		this.batteryTime = batteryTime;
		this.screenSize = screenSize;
	}

	//to print information of a laptop.
	@Override
	void printComputer() {
		System.out.println("-------Laptop Information-----");
		super.printComputer();
		System.out.println("---Weight: " + this.weight);
		System.out.println("---Battery time: " + this.batteryTime);
		System.out.println("---Screen size: " + this.screenSize);
	}

	/*
	 * Get a laptop.
	 * Input: a computer.
	 * Output: a laptop.
	 */
	Laptop getLaptop(Computer com) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);

		System.out.println("Enter Battery time: ");
		String batt = input.nextLine();
		System.out.println("Enter Screen size: ");
		String scr = input.nextLine();
		System.out.println("Enter weight: ");
		float weight = input.nextFloat();

		Laptop lap = new Laptop(com.modelName, com.price, com.manufacturer, com.quantity);
		lap.screenSize = scr;
		lap.batteryTime = batt;
		lap.weight = weight;

		return lap;
	}

}
