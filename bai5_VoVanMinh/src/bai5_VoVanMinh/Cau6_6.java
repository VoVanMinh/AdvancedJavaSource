package bai5_VoVanMinh;

import java.util.Scanner;

public class Cau6_6 {

	static void doi10to2(int n) {
		if (n > 0) {
			doi10to2(n / 2);
			System.out.print(n % 2);
		}
	}

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Nhap vao so thap phan n: ");
		int n = input.nextInt();

		doi10to2(n);
	}

}
