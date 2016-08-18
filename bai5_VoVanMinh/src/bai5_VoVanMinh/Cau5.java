package bai5_VoVanMinh;

import java.awt.Checkbox;
import java.util.Scanner;

public class Cau5 {

	static boolean check(int x) {
		int c = (int) Math.sqrt(x);
		for (int i = 2; i <= c; i++) {
			if (x % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Nhap vao n: ");
		int n = input.nextInt();

		int E = 0;
		for (int i = 2; i <= n; i++) {
			if (check(i)) {
				E = E + i;
			}
		}
		System.out.println("Ket qua E = " + E);
	}

}
