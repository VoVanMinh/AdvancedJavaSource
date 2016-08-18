package bai5_VoVanMinh;

import java.util.Scanner;

public class Cau7_7 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);

		System.out.println("Nhap vao so nhi phan n: ");
		int n = input.nextInt();

		int M = 0;

		for (int i = 0; n > 0; i++) {
			M += (n % 10) * Math.pow(2, i);
			n = n / 10;
		}

		System.out.println("So thap phan la: " + M);
	}

}
