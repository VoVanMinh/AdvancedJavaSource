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
public class Card extends Information {

	protected String cardID;
	protected Date dateCreated;
	public Order m_Order;

	public Card() {

	}

	public Card(String address, String email, String identityCardNumber, String name, String phoneNumber, String cardID,
			Date dateCreated) {
		super(address, email, identityCardNumber, name, phoneNumber);
		this.cardID = cardID;
		this.dateCreated = dateCreated;
	}

	public void finalize() throws Throwable {
		super.finalize();
	}

	/*
	 * Get a Card. Input: a Information. Output: a Card.
	 */
	public Card getCard(Information info) throws IOException, ParseException {
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter card id: ");
		String cardID = input.readLine();
		System.out.println("Enter date created dd/mm/yyyy: ");

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Date dateCreated = sdf.parse(input.readLine());

		Card card = new Card(info.address, info.email, info.identityCardNumber, info.name, info.phoneNumber, cardID,
				dateCreated);
		return card;
	}

	/*
	 * to check solvency. Input: total money buy products. Output: true/false.
	 */
	public boolean checkMoney(double money) {
		return true;
	}

	// to print Card information.
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + "\t" + cardID + "\t" + dateCreated;
	}
}