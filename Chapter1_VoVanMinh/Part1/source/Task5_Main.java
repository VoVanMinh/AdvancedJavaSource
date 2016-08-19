package source;

import java.awt.Point;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Task5_Main {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);

		try {
			System.out.println("-----Point a: ");
			System.out.println("Enter value x: ");
			float x1 = input.nextFloat();
			System.out.println("Enter value y: ");
			float y1 = input.nextFloat();
			Point aPoint = new Point();
			aPoint.setLocation(x1, y1);
			
			System.out.println("-----Point b: ");
			System.out.println("Enter value x: ");
			float x2 = input.nextFloat();
			System.out.println("Enter value y: ");
			float y2 = input.nextFloat();
			
			Point bPoint = new Point();
			bPoint.setLocation(x2, y2);

			Task5_Rectangle rectangle = new Task5_Rectangle(aPoint, bPoint);

			float perimeter = rectangle.calPerimeterRect();
			float area = rectangle.calAreaRect();
			
			if (perimeter == 0 || area == 0)
				System.out.println("This is not Rectangle");
			else
			{
				System.out.println("Perimeter of circle is " + perimeter);
				System.out.println("Area of circle is " +area);
			}

		} catch (InputMismatchException e) {
			System.out.println("Value entered is invalid!");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
