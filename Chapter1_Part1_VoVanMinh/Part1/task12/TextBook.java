package task12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* Author: Vo Van Minh
 * Date 22-08-2016
 * Version 1
 */
public class TextBook extends Book {

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
	public double calSumPrice() {
		if (state.equalsIgnoreCase("NEW"))
			return amount * price;
		else if (state.equalsIgnoreCase("OLD"))
			return amount * price * 0.5;
		else
			return 0;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + "\n--- State \t: " + state;
	}

	/*
	 * get a text book
	 */
	public TextBook getTexkBook(Book book) throws NumberFormatException, IOException {
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		String state;
		System.out.println("-----Input TextBook-----");
		System.out.print("State for Book: " + "\n\t1) NEW" + "\n\t2) OLD" + "\n---Enter a choosen: ");
		int select = Integer.parseInt(input.readLine());
		while (select > 2 || select < 1) {
			System.out.println("Selecttion is incorrect, please select again");
			System.out.print("State for Book: " + "\n\t1) NEW" + "\n\t2) OLD" + "\n---Enter a choosen: ");
			select = Integer.parseInt(input.readLine());
		}
		if (select == 1)
			state = "NEW";
		else
			state = "OLD";
		TextBook textBook = new TextBook(book.bookID, book.name, book.date, book.price, book.amount, book.publisher,
				state);
		return textBook;
	}
}
