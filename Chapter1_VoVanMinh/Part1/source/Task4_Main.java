package source;

import java.awt.Point;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Task4_Main {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);

		try {
			System.out.println("-----Point O: ");
			System.out.println("Enter value x: ");
			float x1 = input.nextFloat();
			System.out.println("Enter value y: ");
			float y1 = input.nextFloat();
			Point OPoint = new Point();
			OPoint.setLocation(x1, y1);
			
			System.out.println("-----Point R: ");
			System.out.println("Enter value x: ");
			float x2 = input.nextFloat();
			System.out.println("Enter value y: ");
			float y2 = input.nextFloat();
			Point RPoint = new Point();
			RPoint.setLocation(x2, y2);

			Task4_Circle circle = new Task4_Circle(OPoint, RPoint);

			float perimeter = circle.calPerimeterCircle();
			System.out.println("Perimeter of circle is " + perimeter);
			
			float area = circle.calAreaCircle();
			System.out.println("Area of circle is " +area);

		} catch (InputMismatchException e) {
			System.out.println("Value entered is invalid!");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
