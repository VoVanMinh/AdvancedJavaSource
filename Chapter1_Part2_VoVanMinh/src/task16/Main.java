package task16;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;
/* @Main class
 * @Author: Vo Van Minh
 * @Date: 23-08-2016
 * @Version: 1.0
 */
public class Main {
	public static void main(String[] args) {
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		try {
			ArrayList<Transport> listTr = new ArrayList<Transport>();
			
			String choose = "y";
			while (!choose.equalsIgnoreCase("n")) {
				System.out.println("---Enter distance: ");
				float distance = Float.parseFloat(input.readLine());
				System.out.println("---Enter time: ");
				float time = Float.parseFloat(input.readLine());
				System.out.println("---Enter number of liters of fuel was used: ");
				float numLiters = Float.parseFloat(input.readLine());
				System.out.println("ID: ");
				String id = input.readLine();
				System.out.println("Ower: ");
				String ower = input.readLine();
				System.out.println("Color ");
				String color = input.readLine();
				System.out.println("Manufacture: ");
				String manufacture = input.readLine();
				
				switch (menu()) {
				case 1:
					System.out.println("Gear type: ");
					String gearType = input.readLine();
					System.out.println("Car type: ");
					String carType = input.readLine();
					
					Car car = new Car(id, ower, color, manufacture, gearType, carType);
					listTr.add(car);
					car.printTransport();
					System.out.println("Speed: " +car.calSpeed(distance, time));
					System.out.println("Fuel consumption: " +car.calFuelConsumption(distance, numLiters));
					break;
				case 2:
					System.out.println("Weight: ");
					double weight = Double.parseDouble(input.readLine());
					System.out.println("Capacity: ");
					double capacity = Double.parseDouble(input.readLine());
					System.out.println("Down Stream speed: ");
					float downStreamSpeed = Float.parseFloat(input.readLine());
					System.out.println("Up stream speed: ");
					float upStreamSpeed = Float.parseFloat(input.readLine());
					System.out.println("Fuel consumption start: ");
					float fuelConsumptionStart = Float.parseFloat(input.readLine());
					System.out.println("Fuel type: ");
					String fuelType = input.readLine();
					
					Ship ship = new Ship(weight, capacity, downStreamSpeed, upStreamSpeed, fuelConsumptionStart, fuelType);
					listTr.add(ship);
					ship.printTransport();
					System.out.println("Speed: " +ship.calSpeed(distance, time));
					System.out.println("Fuel consumption: " +ship.calFuelConsumption(distance, numLiters));
					break;
				default:
					break;
				}
				System.out.println("-----Continue? y/n: ");
				choose = input.readLine();
			}
			printList(listTr);

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

	//to show menu and return a choosen int type.
	static int menu() {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.println("----Transport Information----");
		System.out.println("---1. Car");
		System.out.println("---2. Ship");

		int choose = 0;
		while (choose != 1 && choose != 2 && choose != 3) {
			System.out.println("---Enter a choosen: ");
			choose = input.nextInt();
		}
		return choose;
	}

	//to print transport list.
	static void printList(ArrayList<Transport> listTr){
		System.out.println("-------------Transport List------------");
		for (int i = 0; i < listTr.size(); i++) {
			listTr.get(i).printTransport();
		}
	}
	
}
