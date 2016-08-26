package task11;

import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* @Transaction class
 * @Author: Vo Van Minh
 * @Date 22-08-2016
 * @Version 1
 */
public class Transaction {
	String id;
	String dayTr;
	String transactionType;
	int quantity;
	float rate;

	public Transaction() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Transaction(String id, String dayTr, String transactionType, int quantity, float rate) {
		super();
		this.id = id;
		this.dayTr = dayTr;
		this.transactionType = transactionType;
		this.quantity = quantity;
		this.rate = rate;
	}
	public Transaction(int quantity, float rate) {
		super();
		this.quantity = quantity;
		this.rate = rate;
	}
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getDayTr() {
		return dayTr;
	}

	public void setDayTr(String dayTr) {
		this.dayTr = dayTr;
	}

	public String getTransactionType() {
		return transactionType;
	}

	public void setTransactionType(String transactionType) {
		this.transactionType = transactionType;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public float getRate() {
		return rate;
	}

	public void setRate(float rate) {
		this.rate = rate;
	}

	//Calculate total money of a transaction.
	public float calMoney() {
		if (transactionType.equalsIgnoreCase("sell"))
			return (quantity * rate + (quantity * rate) * 0.001f);
		return quantity * rate;
	}

	//print a transaction.
	void printTrans() {
		System.out.println("---ID: " + this.id);
		System.out.println("---Day transaction: " + this.dayTr);
		System.out.println("---Transaction type: " + this.transactionType);
		System.out.println("---Quantity: " + this.quantity);
		System.out.println("---Rate: " + this.rate);
	}

	/*
	 * Get a transaction.
	 * Input: user input from keyboard.
	 */
	Transaction getTransaction() {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.println("-------Transaction Information-----");
		System.out.print("---ID: ");
		String id = input.nextLine();
		String dayTr = " ";
		while (!checkDate(dayTr)) {
			System.out.print("\n---Transacion Day: ");
			dayTr = input.nextLine();
		}
		System.out.print("\nEnter transaction type buy/sell: ");
		String trType = input.nextLine();

		float rate = 0;

		input = new Scanner(System.in);
		System.out.print("\n---Quantity: ");
		int quantity = input.nextInt();

		Transaction tr = new Transaction(id, dayTr, trType, quantity, rate);
		return tr;
	}

	/*
	 * to check date.
	 * Input: a string date.
	 * Output: return true/false.
	 */
	boolean checkDate(String str) {
		String re = "^(0[1-9]|[1-9]|1[0-9]|2[0-9]|3[0-1])/(0[1-9]|[1-9]|1[0-2])/(19[0-9][0-9]|[2-9][0-9][0-9][0-9])$";
		Pattern p = Pattern.compile(re);
		Matcher m = p.matcher(str);
		if (!m.matches())
			return false;
		else {
			StringTokenizer stk = new StringTokenizer(str, "/");
			int ng = Integer.parseInt(stk.nextToken());
			int th = Integer.parseInt(stk.nextToken());
			int nam = Integer.parseInt(stk.nextToken());

			if (th == 4 || th == 6 || th == 9 || th == 11) {
				if (ng == 31)
					return false;
			}
			if (th == 2) {
				if ((nam % 400 == 0) || (nam % 4 == 0 && nam % 100 != 0)) {
					if (ng > 29)
						return false;
				} else {
					if (ng > 28)
						return false;
				}
			}
			return true;
		}
	}
}
