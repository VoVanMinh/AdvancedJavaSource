package task12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* @Book class
 * @Author: Vo Van Minh
 * @Date: 22-08-2016
 * @Version: 1.0
 */
public class Book {
	String bookID;
	String name;
	String date;
	double price;
	double amount;
	String publisher;

	public String getBookID() {
		return bookID;
	}

	public void setBookID(String bookID) {
		this.bookID = bookID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public Book() {
		super();
	}

	public Book(String bookID, String name, String date, double price, double amount, String publisher) {
		super();
		this.bookID = bookID;
		this.name = name;
		this.date = date;
		this.price = price;
		this.amount = amount;
		this.publisher = publisher;
	}

	//to calculate total money a book.
	public double calSumPrice() {
		return 0;
	}

	//to print a book.
	public String toString() {
		return "--- Book ID\t: " + bookID + "\n--- Book name\t: " + name + "\n--- Date  \t: " + date + "\n--- Price\t: "
				+ price + "\n--- Amount\t: " + amount + "\n--- Publisher\t: " + publisher;
	}
	/*
	 * Get a Book.
	 * Input: user input form keyboard.
	 * Output: a book.
	 */
	public Book getBook() throws IOException {
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("-----Input information book-----");
		System.out.print("---Book ID: ");
		String bookID = input.readLine();
		System.out.print("\n---Book name: ");
		String name = input.readLine();
		System.out.print("\n---Date: ");
		String date = input.readLine();
		System.out.print("\n---Publisher: ");
		String publisher = input.readLine();
		System.out.print("\n---Price: ");
		double price = Double.parseDouble(input.readLine());
		System.out.print("\n---Amount: ");
		double amount = Double.parseDouble(input.readLine());
		Book book = new Book(bookID, name, date, price, amount, publisher);
		return book;
	}
}
