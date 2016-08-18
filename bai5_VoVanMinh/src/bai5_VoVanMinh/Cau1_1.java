package bai5_VoVanMinh;

import java.util.Scanner;

public class Cau1_1 {

	public static void main(String[] args) {
		try {
			Scanner input = new Scanner(System.in);

			System.out.println("Nhap vao n: ");
			int n = input.nextInt();

			System.out.println("Nhap vao x: ");
			float x = input.nextFloat();

			float S = 1;
			int check = 1;
			if (n < 0) {
				n = Math.abs(n);
				check = -1;
			}

			if ((x != 0) && (n != 0)) {
				float a = x * x + 1;
				int i = 1;
				while (i <= n) {
					S = S * a;
					i++;
				}
			}

			if (check == 1)
				System.out.println("Tong (x * x + 1) mu n la: " + S);
			else
				System.out.println("Tong la (x * x + 1) mu n la: 1/" + S);

		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
