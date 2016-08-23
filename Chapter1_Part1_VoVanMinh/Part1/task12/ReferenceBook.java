
package task12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* Author: Vo Van Minh
 * Date 22-08-2016
 * Version 1
 */
public class ReferenceBook extends Book {
	double tax;

	public double getTax() {
		return tax;
	}

	public void setTax(double tax) {
		if (tax < 0 || tax > 100)
			this.tax = 0;
		this.tax = tax;
	}

	public ReferenceBook() {
		super();
	}

	public ReferenceBook(String bookID, String name, String date, double price, double amount, String publisher,
			double tax) {
		super(bookID, name, date, price, amount, publisher);
		if (tax < 0 || tax > 100)
			this.tax = 0;
		this.tax = tax;
	}

	@Override
	public double calSumPrice() {
		// TODO Auto-generated method stub
		return (amount * price) + (amount * price) * tax / 100;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + "\n--- Tax  \t: " + tax;
	}

	/*
	 * get a reference book
	 */
	public ReferenceBook getReferenceBook(Book book) throws NumberFormatException, IOException {
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		double tax;
		System.out.println("-----Input ReferenceBook-----");
		System.out.print("---Tax: ");
		tax = Double.parseDouble(input.readLine());
		while (tax < 0 || tax > 100) {
			System.out.println("Tax input incorrect, please input again: ");
			System.out.print("---Tax: ");
			tax = Double.parseDouble(input.readLine());
		}
		ReferenceBook referenceBook = new ReferenceBook(book.bookID, book.name, book.date, book.price, book.amount,
				book.publisher, tax);
		return referenceBook;
	}
}
