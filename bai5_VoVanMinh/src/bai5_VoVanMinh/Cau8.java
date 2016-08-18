package bai5_VoVanMinh;

import java.util.Scanner;

public class Cau8 {

	public static void main(String[] args) {

		System.out.println("***************************************************");
		System.out.println("In bang cuu chuong");
		System.out.println("***************************************************");

		Scanner input = new Scanner(System.in);

		System.out.println("Tu so: ");
		int a = input.nextInt();

		System.out.println("Den so: ");
		int b = input.nextInt();

		System.out.println("-----------------------------------------------------");

		if ((a > b) || a <= 0 || b <= 0)
			System.out.println("Ban da nhap sai");
		else {
			for (int i = 1; i < 10; i++) {
				for (int j = a; j <= b; j++) {
					System.out.print(j + " x " + i + " = " + (j * i) + "\t");
				}
				System.out.println("\n");
			}
		}
	}

}
