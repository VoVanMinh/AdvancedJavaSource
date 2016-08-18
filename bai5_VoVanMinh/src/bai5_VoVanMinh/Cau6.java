package bai5_VoVanMinh;

import java.util.Scanner;

public class Cau6 {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);

		System.out.println("Nhap vao so thap phan n: ");
		int n = input.nextInt();
		int a[] = new int[30];
		int i = 0;

		while (n != 0) {
			a[i] = n % 2;
			n = n / 2;
			i++;
		}
		for (int j = i - 1; j >= 0; j--) {
			System.out.print(a[j]);
		}

	}

}
