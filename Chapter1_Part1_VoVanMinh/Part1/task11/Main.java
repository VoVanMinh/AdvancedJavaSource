package task11;

import java.util.InputMismatchException;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {

		TransactionManager tm = new TransactionManager();
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		String temp = " ";
		try {
			while (!temp.equalsIgnoreCase("n")) {
				Transaction tr = new Transaction();
				tr = tr.getTransaction();

				System.out.println("1. Gold transaction");
				System.out.println("2. Currency transaction");
				int choose = 0;
				while (choose != 1 && choose != 2) {
					System.out.println("-----Enter a choosen: ");
					choose = input.nextInt();
				}
				switch (choose) {
				case 1:
					tr.transactionType = "Gold transaction";
					GoldTransaction gt = new GoldTransaction();
					gt = gt.getGoldTrans(tr);
					tm.addTrans(gt);
					gt.printTrans();
					System.out.println("Total money: " + gt.calMoney());
					break;
				case 2:
					tr.transactionType = "Currency transaction";
					CurrencyTransaction ct = new CurrencyTransaction();
					ct = ct.getCurrencyTrans(tr);
					tm.addTrans(ct);
					ct.printTrans();
					System.out.println("Total money: " + ct.calMoney());
					break;
				default:
					break;
				}
				System.out.println("Continue add a computer? y/n: ");
				input = new Scanner(System.in);
				temp = input.nextLine();
			}
			tm.printList();
			System.out.println("Total medium of gold transaction in list " +tm.mediumTotalGold());
			System.out.println("Total medium of currency transaction in list " +tm.mediumTotalCurrency());
		} catch (InputMismatchException e) {
			System.out.println("Value entered is invalid!");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
