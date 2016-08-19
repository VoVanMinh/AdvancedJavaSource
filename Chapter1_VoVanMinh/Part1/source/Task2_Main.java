package source;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task2_Main {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		float firstNumber;
		float secondNumber;

		try {

			int choose = -1;
			while (choose != 0) {
				System.out.println("-----Menu calculation-------");
				System.out.println("\t1. Addition\n\t2. Subtraction\n\t3. Multiplication\n\t4. Division");
				System.out.println("Enter 0 to quit or Enter a choosen: ");
				choose = input.nextInt();
				if (choose != 0) {
					System.out.println("Enter value a: ");
					firstNumber = input.nextFloat();

					System.out.println("Enter value b: ");
					secondNumber = input.nextFloat();

					Task2_Calculation cal = new Task2_Calculation(firstNumber, secondNumber);
					switch (choose) {
					case 1:
						System.out.println("Result addition is " +cal.calAddition());
						break;
					case 2:
						System.out.println("Result subtraction is " +cal.calSubtraction());
						break;
					case 3:
						System.out.println("Result multiplication is " +cal.calMultiplication());
						break;
					case 4:
						if(Float.isNaN(cal.calDivision()))
							System.out.println("Error division for 0");
						else
							System.out.println("Result division is " +cal.calDivision());
						break;
					default:
						System.out.println("Please enter from 1 to 4!");
						break;
					}
				}
			}

		} catch (InputMismatchException e) {
			System.out.println("Value entered is invalid!");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
