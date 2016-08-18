package bai5_VoVanMinh;

import java.util.Scanner;

public class Cau2_2 {

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
				float a1 = x * x + x + 1;
				float a2 = x * x - x + 1;
				float S1 = 1;
				float S2 = 1;
				int i = 1;
				while (i <= n) {
					S1 = S1 * a1;
					S2 = S2 * a2;
					i++;
				}
				/*
				 * for (int i = 1; i <= n; i++) { S1 = S1 * a1; S2 = S2 * a2; }
				 */
				if (check == 1)
					S = S1 + S2;
				else
					S = 1 / S1 + 1 / S2;
			} else
				S = 2;
			System.out.println("Tong la: " + S);

		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
