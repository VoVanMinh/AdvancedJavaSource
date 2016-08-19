package source;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task3_Main {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		float x1;
		float x2;
		float y1;
		float y2;

		try {
			System.out.println("-----Point A: ");
			System.out.println("Enter value x: ");
			x1 = input.nextFloat();

			System.out.println("Enter value y: ");
			y1 = input.nextFloat();

			System.out.println("-----Point B: ");
			System.out.println("Enter value x: ");
			x2 = input.nextFloat();

			System.out.println("Enter value y: ");
			y2 = input.nextFloat();

			Task3_Point A = new Task3_Point(x1, y1);
			Task3_Point B = new Task3_Point(x2, y2);

			Task3_Distance dist = new Task3_Distance();
			float result = dist.calDistance(A, B);
			System.out.println("Distance is " + result);

		} catch (InputMismatchException e) {
			System.out.println("Value entered is invalid!");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}
}
