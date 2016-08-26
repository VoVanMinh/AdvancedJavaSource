package task14;

import java.util.Scanner;
/*
 * @Main class to execute
 * @Author: Vo Van Minh
 * @Date: 23-08-2016
 * @Version: 1.0
 */
public class Main {

	public static void main(String[] args) {

		try {
			calculate();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}
	//to show menu anh return a choosen int type.
	static int menu() {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.println("----Calculate perimater and area----");
		System.out.println("---1. Circle");
		System.out.println("---2. Rectangle");
		System.out.println("---3. Square");

		int choose = 0;
		while (choose != 1 && choose != 2 && choose != 3) {
			System.out.println("---Enter a choosen: ");
			choose = input.nextInt();
		}
		return choose;
	}
	//to deploy program
	static void calculate() {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		switch (menu()) {
		case 1:
			System.out.println("Input radius: ");
			double r = input.nextDouble();
			Circle cir = new Circle();
			cir.setR(r);
			System.out.println("-----Perimeter: " + cir.perimeter());
			System.out.println("-----Area: " + cir.area());
			break;
		case 2:
			System.out.println("Input length: ");
			double length = input.nextDouble();

			System.out.println("Input width: ");
			double width = input.nextDouble();

			Rectangle rec = new Rectangle(length, width);

			System.out.println("-----Perimeter: " + rec.perimeter());
			System.out.println("-----Area: " + rec.area());
			break;
		case 3:
			System.out.println("Input radius: ");
			double len = input.nextDouble();
			Square sq = new Square();
			sq.setLength(len);
			System.out.println("-----Perimeter: " + sq.perimeter());
			System.out.println("-----Area: " + sq.area());
			break;
		default:
			break;
		}
	}

}
