package bai5_VoVanMinh;

import java.util.Scanner;

public class Cau3_3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Nhap vao x: ");
		float x = input.nextFloat();

		int count = 0;
		int c = (int) Math.sqrt(x);
		int i = 2;
		while (i <= c) {
			if (x % i == 0) {
				System.out.println(x + " khong phai la so nguyen to");
				count = 1;
				break;
			}
			i++;
		}
		if (count == 0)
			System.out.println(x + " la so nguyen to");
	}

}
