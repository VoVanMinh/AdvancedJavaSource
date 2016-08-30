package task19;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.util.Date;

/**
 * @author Vo Van Minh
 * @version 1.0
 * @created 29-Aug-2016 9:22:36 AM
 */
public class ATMCard extends Card implements IAuthMethod {

	private double balance;

	public ATMCard() {

	}

	public ATMCard(String address, String email, String identityCardNumber, String name, String phoneNumber,
			String cardID, Date dateCreated, double balance) {
		super(address, email, identityCardNumber, name, phoneNumber, cardID, dateCreated);
		this.setBalance(balance);
	}

	public void finalize() throws Throwable {
		super.finalize();
	}

	/*
	 * Get a ATM Card. Input: a Card. Output: a ATM Card.
	 */
	public ATMCard getATMCard(Card card) throws IOException, ParseException {
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter balance: ");
		double balance = Double.parseDouble(input.readLine());

		ATMCard atmCard = new ATMCard(card.address, card.email, card.identityCardNumber, card.name, card.phoneNumber,
				card.cardID, card.dateCreated, balance);
		return atmCard;

	}

	// Get authentication method of ATM Card.
	public String getAuthMethod() {
		return "ATM Card";
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	/*
	 * to check solvency. Input: total money buy products. Output: true/false.
	 */
	@Override
	public boolean checkMoney(double money) {
		if (money > balance)
			return false;
		return true;
	}

	// to print ATM Card information.
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + "\t" + balance;
	}
}