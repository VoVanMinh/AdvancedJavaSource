
package task4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author vovanminh
 * @version 1.0
 * @created Sep 9, 2016
 */
public class Demo {
	public static void main(String[] args) throws IOException {
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Input a: ");
		int a = Integer.parseInt(input.readLine());

		System.out.println("Input b: ");
		int b = Integer.parseInt(input.readLine());

		Operator op1 = (x1, x2) -> x1 + x2;
		System.out.println("Sum = " + op1.operator(a, b));

		Operator op2 = (x1, x2) -> x1 - x2;
		System.out.println("Sub = " + op2.operator(a, b));

		Operator op3 = (x1, x2) -> x1 * x2;
		System.out.println("Mul = " + op3.operator(a, b));

		Operator op4 = (x1, x2) -> x1 / x2;
		System.out.println("Div = " + op4.operator(a, b));
	}

	interface Operator {
		public Integer operator(Integer operand1, Integer operand2);
	}
}
