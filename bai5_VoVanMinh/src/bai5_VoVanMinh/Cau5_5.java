package bai5_VoVanMinh;

import java.util.Scanner;

public class Cau5_5 {
	static boolean check(int x) {
		int c = (int) Math.sqrt(x);
		int i = 2;
		while (i <= c) {
			if (x % i == 0) {
				return false;
			}
			i++;
		}
		return true;
	}

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);

		System.out.println("Nhap vao n: ");
		int n = input.nextInt();

		int E = 0;
		int i = 2;

		while (i <= n) {
			if (check(i)) {
				E = E + i;
			}
			i++;
		}
		System.out.println("Ket qua E = " + E);
	}
}
