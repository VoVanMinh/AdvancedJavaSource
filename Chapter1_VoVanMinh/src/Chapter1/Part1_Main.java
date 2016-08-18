package Chapter1;

import java.util.InputMismatchException;
import java.util.Scanner;


public class Part1_Main {

	public static void main(String[] args) {
		Part1_LinearEquation linearEquation = new Part1_LinearEquation();
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		float a;
		float b;
		
		try {
			System.out.println("Enter value a: ");
			a = input.nextFloat();
			
			System.out.println("Enter value b: ");
			b = input.nextFloat();
			
			linearEquation.setA(a);
			linearEquation.setB(b);
			
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
