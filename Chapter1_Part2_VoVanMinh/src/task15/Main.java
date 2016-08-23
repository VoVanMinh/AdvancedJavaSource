package task15;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		try {
			printInstrument();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

	static int menu() {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.println("----Instrument----");
		System.out.println("---1. StringedInstrument");
		System.out.println("---2. NonStringedInstrument");

		int choose = 0;
		while (choose != 1 && choose != 2) {
			System.out.println("---Enter a choosen: ");
			choose = input.nextInt();
		}
		return choose;
	}

	static void printInstrument() {
		switch (menu()) {
		case 1:
			StringedInstrument si = new StringedInstrument();
			si = si.getSI();
			si.play();
			break;
		case 2:
		NonStringedInstrument nsi = new NonStringedInstrument();
		nsi = nsi.getNSI();
		nsi.play();
		default:
			break;
		}
	

	}

}
