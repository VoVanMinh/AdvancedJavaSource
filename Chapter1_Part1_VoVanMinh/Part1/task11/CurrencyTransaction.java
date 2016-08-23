package task11;

/* Author: Vo Van Minh
 * Date 22-08-2016
 * Version 1
 */
import java.util.Scanner;

public class CurrencyTransaction extends Transaction {

	final float[] RATE = { 22260, 24457, 16802.30f };

	String CurrencyType;

	public CurrencyTransaction() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CurrencyTransaction(String id, String dayTr, String transactionType, int quantity, float rate) {
		super(id, dayTr, transactionType, quantity, rate);
		// TODO Auto-generated constructor stub
	}

	public CurrencyTransaction(String currencyType) {
		super();
		CurrencyType = currencyType;
	}

	public String getCurrencyType() {
		return CurrencyType;
	}

	public void setCurrencyType(String currencyType) {
		CurrencyType = currencyType;
	}

	/*
	 * get currency rate
	 */
	float getRA() {
		float result = 0;
		if (CurrencyType.equalsIgnoreCase("USD")) {
			result = RATE[0];
		} else if (CurrencyType.equalsIgnoreCase("EUR")) {
			result = RATE[1];
		} else if (CurrencyType.equalsIgnoreCase("AUD")) {
			result = RATE[2];
		}
		return result;
	}

	@Override
	float calMoney() {
		super.rate = this.rate;
		return super.calMoney();
	}

	@Override
	void printTrans() {
		// TODO Auto-generated method stub
		System.out.println("-------Currency transaction Information-----");
		super.printTrans();
		System.out.println("---Currency type: " + this.CurrencyType);
	}

	/*
	 * get a currency transaction
	 */
	CurrencyTransaction getCurrencyTrans(Transaction tr) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.println("Enter currency type: ");
		String currType = input.nextLine();

		CurrencyTransaction ct = new CurrencyTransaction(tr.id, tr.dayTr, tr.transactionType, tr.quantity, tr.rate);
		ct.CurrencyType = currType;
		ct.rate = ct.getRA();

		return ct;
	}
}
