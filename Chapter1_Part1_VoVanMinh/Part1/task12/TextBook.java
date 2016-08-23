package task12;
/* Author: Vo Van Minh
 * Date 22-08-2016
 * Version 1
 */
public class TextBook extends Book {

	final static String STATE_NEW = "NEW";
	final static String STATE_OLD = "OLD";
	String state;

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public TextBook() {
		super();
	}

	public TextBook(String bookID, String name, String date, double price, double amount, String publisher,
			String state) {
		super(bookID, name, date, price, amount, publisher);
		this.state = state;
	}

	@Override
	public double findSumPrice() {
		if (state.equalsIgnoreCase(STATE_NEW))
			return amount * price;
		else if (state.equalsIgnoreCase(STATE_OLD))
			return amount * price * 0.5;
		else
			return 0;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + "\n--- State \t: " + state;
	}

}
