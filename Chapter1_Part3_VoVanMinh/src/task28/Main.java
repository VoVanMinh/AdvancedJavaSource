package task28;

import java.util.Scanner;
/**
 * @author vovanminh
 * @version 1.0
 * @created 04-Sep-2016 8:14:59 PM
 */
public class Main {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		Account account = new Account();
		account.setState(10000000);
		@SuppressWarnings("unused")
		EmailObserver emailOb = new EmailObserver(account);
		@SuppressWarnings("unused")
		MobiObserver mobiOb = new MobiObserver(account);

		System.out.println("Enter the amount you want to withdraw: ");
		double state = input.nextDouble();
		if (state > account.getState()) {
			System.out.println("This amount is greater than the amount in your account.");
		} else {
			account.setState((account.getState() - state));
			account.notifyAllObservers();
		}

	}

}
