package task11;
import java.util.Scanner;

/* @Gold Transaction
 * @Author: Vo Van Minh
 * @Date: 22-08-2016
 * @Version: 1.0
 */
public class GoldTransaction extends Transaction {
	String goldType;

	final float[] RATE = { 13.889f, 19.915f, 25.978f, 35.141f, 36.370f };

	public GoldTransaction() {
		super();
		// TODO Auto-generated constructor stub
	}

	public GoldTransaction(String id, String dayTr, String transactionType, int quantity, float rate) {
		super(id, dayTr, transactionType, quantity, rate);
		// TODO Auto-generated constructor stub
	}

	public GoldTransaction(String goldType) {
		super();
		this.goldType = goldType;
	}
	
	//to get a gold rate.
	float getRA(){
		float result = 0;
		if (goldType.equalsIgnoreCase("10K")) {
			result = RATE[0];
		} else if (goldType.equalsIgnoreCase("14K")) {
			result = RATE[1];
		} else if (goldType.equalsIgnoreCase("18K")) {
			result = RATE[2];
		} else if (goldType.equalsIgnoreCase("24K")) {
			result = RATE[3];
		} else if (goldType.equalsIgnoreCase("SJC")) {
			result = RATE[4];
		}
		return result;
	}

	//Calculate total money of a gold transaction.
	@Override
	public float calMoney() {
		super.rate = this.rate;
		return super.calMoney();
	}

	//to print a gold transaction.
	@Override
	void printTrans() {
		// TODO Auto-generated method stub
		System.out.println("-------Gold Transaction Information-----");
		super.printTrans();
		System.out.println("---Gold type: " + this.goldType);
	}

	/*
	 * Get a gold transaction.
	 * Input: a transaction.
	 * Output: return a gold transaction.
	 */
	GoldTransaction getGoldTrans(Transaction tr) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.println("Enter gold type: ");
		String goldType = input.nextLine();

		GoldTransaction gt = new GoldTransaction(tr.id, tr.dayTr, tr.transactionType, tr.quantity, 1.0f);
		gt.goldType = goldType;
		gt.rate = gt.getRA();

		return gt;
	}
}
