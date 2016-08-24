package task9;
import java.util.Scanner;
/* @Computer class
 * @Author: Vo Van Minh
 * @Date 22-08-2016
 * @Version 1
 */
public class Computer {

	String modelName;
	float price;
	String manufacturer;
	int quantity;

	public Computer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Computer(String modelName, float price, String manufacturer, int quantity) {
		super();
		this.modelName = modelName;
		this.price = price;
		this.manufacturer = manufacturer;
		this.quantity = quantity;
	}
	
	public Computer(float price, int quantity){
		this.price = price;
		this.quantity = quantity;	
	}
	public String getModelName() {
		return modelName;
	}

	public void setModelName(String modelName) {
		this.modelName = modelName;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	/*
	 * Calculate money a computer.
	 * Input: price and quantity.
	 * Output: return result float type.
	 */
	public float calMoney() {
		return price * quantity;
	}
	
	 //to print information a computer
	void printComputer()
	{
		System.out.println("---Model name: " +this.modelName);
		System.out.println("---Manufacturer: " +this.manufacturer);
		System.out.println("---Unit Price: " +this.price);
		System.out.println("---Quantity: " +this.quantity);
	}
	/*
	 * Get a computer.
	 * Input: user input from keyboard.
	 * Output: return a computer.
	 */
	Computer getComputer(){
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.println("-------Computer Information-----");
		System.out.print("---Model name: ");
		String model = input.nextLine();
		System.out.print("\n---Manufacturer: ");
		String manufact = input.nextLine();
		System.out.print("\n---Unit Price: ");
		float price = input.nextFloat();
		System.out.print("\n---Quantity: ");
		int quant = input.nextInt();
		
		Computer com = new Computer(model, price, manufact, quant);
		return com;
	}
}
