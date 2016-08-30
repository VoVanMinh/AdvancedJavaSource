package task19;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author Vo Van Minh
 * @version 1.0
 * @created 29-Aug-2016 9:22:36 AM
 */
public class CreditCard extends Card implements IAuthMethod {

	private Date expirationDate;
	private double maxDebt;
	private String type;

	public CreditCard() {

	}

	public CreditCard(String address, String email, String identityCardNumber, String name, String phoneNumber,
			String cardID, Date dateCreated, Date exprationDate, double maxDebt, String type) {
		super(address, email, identityCardNumber, name, phoneNumber, cardID, dateCreated);
		this.expirationDate = exprationDate;
		this.setMaxDebt(maxDebt);
		this.setType(type);
	}

	public void finalize() throws Throwable {
		super.finalize();
	}

	/*
	 * Get a Credit Card. Input: a Card. Output: a Credit Card.
	 */
	public CreditCard getCreditCard(Card card) throws IOException, ParseException {
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter expiration date dd/mm/yyyy: ");
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Date exd = sdf.parse(input.readLine());
		if (exd.after(new Date())) {
			System.out.println("Expiration card!");
			System.out.println("Enter expiration date dd/mm/yyyy: ");
			exd = sdf.parse(input.readLine());
		}

		System.out.println("Enter max dept: ");
		double maxDept = Double.parseDouble(input.readLine());

		System.out.println("Enter type: ");
		String type = input.readLine();

		CreditCard creditCard = new CreditCard(card.address, card.email, card.identityCardNumber, card.name,
				card.phoneNumber, card.cardID, exd, expirationDate, maxDept, type);
		return creditCard;

	}

	// Get authentication method of ATM Card.
	public String getAuthMethod() {
		return "Credit Card";
	}

	public double getMaxDebt() {
		return maxDebt;
	}

	public void setMaxDebt(double maxDebt) {
		this.maxDebt = maxDebt;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	/*
	 * to check solvency. Input: total money buy products. Output: true/false.
	 */
	@Override
	public boolean checkMoney(double money) {
		if (money > maxDebt)
			return false;
		return true;
	}

	// to print Credit Card information.
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + "\t" + expirationDate + "\t" + maxDebt + "\t" + type;
	}
}