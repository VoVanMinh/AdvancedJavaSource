package task12;

/* Author: Vo Van Minh
 * Date 22-08-2016
 * Version 1
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

	/*
	 * calculate total price a book
	 */
	public double findSumPrice() {
		return 0;
	}

	public String toString() {
		return "--- Book ID\t: " + bookID + "\n--- Book name\t: " + name + "\n--- Date  \t: " + date + "\n--- Price\t: "
				+ price + "\n--- Amount\t: " + amount + "\n--- Publisher\t: " + publisher;
	}
}
