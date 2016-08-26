package task3;

import java.util.InputMismatchException;
import java.util.Scanner;
/* @Main Class to execute program.
 * @Author: Vo Van Minh
 * @Date: 19-08-2016
 * @Version: 1.0
 */
public class Main {

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

			PointClass A = new PointClass(x1, y1);
			PointClass B = new PointClass(x2, y2);

			Distance dist = new Distance();
			float result = dist.calDistance(A, B);
			System.out.println("Distance is " + result);

		} catch (InputMismatchException e) {
			System.out.println("Value entered is invalid!");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}
}
