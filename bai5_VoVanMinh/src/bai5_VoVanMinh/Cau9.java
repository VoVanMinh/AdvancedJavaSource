package bai5_VoVanMinh;

import java.util.Scanner;

public class Cau9 {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);

		System.out.println("Nhap vao n: ");
		int n = input.nextInt();

		int n1 = 1;
		int n2 = 1;
		int ch = n % 2;
		for (int i = 1; i <= n; i++) {
			n1 *= i;
			if (ch == 0) {
				if (i % 2 == 0) {
					n2 *= i;
				}
			} else {
				if (i % 2 == 1) {
					n2 *= i;
				}
			}
		}
		System.out.println(n + "!= " + n1);
		System.out.println(n + "!!= " + n2);

	}

}
