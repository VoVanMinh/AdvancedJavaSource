
package task9_Lambda;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author vovanminh
 * @version 1.0
 * @created Sep 9, 2016
 */
public class Demo3 {

	public static void main(String[] args) throws IOException {
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Input radius: ");
		double r = Double.parseDouble(input.readLine());
		Area circle = (x1, x2) -> x1 * Math.pow(x2, 2);
		System.out.println("S = PI * (r*r) = " + circle.calArea(Math.PI, r));

		System.out.println("Input length: ");
		double H = Double.parseDouble(input.readLine());
		System.out.println("Input width: ");
		double W = Double.parseDouble(input.readLine());
		Area rectangle = (x1, x2) -> x1 * x2;
		System.out.println("S = W x H = " + rectangle.calArea(W, H));
	}

	interface Area {
		public double calArea(double x1, double x2);
	}
}
