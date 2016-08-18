package bai5_VoVanMinh;

import java.util.Scanner;

public class Cau4 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Nhap vao n: ");
		int n = input.nextInt();

		int C = 1;
		int A = 0;
		int B = 0;
		int D = 1;

		for (int i = 1; i <= n; i++) {
			C = C * i;
			if (i % 2 == 0) {
				A = A + i;
			} else
				B = B + i;
			if (i % 3 == 0)
				D = D * i;
		}
		System.out.println("Ket qua A = " + A);
		System.out.println("Ket qua B = " + B);
		System.out.println("Ket qua C = " + C);
		System.out.println("Ket qua D = " + D);

	}

}
