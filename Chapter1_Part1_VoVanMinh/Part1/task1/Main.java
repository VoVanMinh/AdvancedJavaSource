package task1;

import java.util.InputMismatchException;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		float a;
		float b;
		
		try {
			System.out.println("Enter value a: ");
			a = input.nextFloat();
			
			System.out.println("Enter value b: ");
			b = input.nextFloat();
			
			LinearEquation linearEquation = new LinearEquation(a, b);
			
			float root = linearEquation.findRoot();
			if(root == Float.MAX_VALUE)
				System.out.println("Infinity equation!");
			else if(Float.isNaN(root))
				System.out.println("Equation non root!");
			else
				System.out.println("Root is " +root);
			
		} catch (InputMismatchException e) {
			System.out.println("Value entered is invalid!");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
