package task12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

	static BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) {
		Book[] listBook = new Book[1];
		int count = 1;
		try {
			String add = "y";
			while (add.equalsIgnoreCase("y")) {
				Book book = inputBook();
				System.out.println("Select type book: \n\t1) TextBook\n\t2) ReferenceBook\nSelect: ");
				int choice = Integer.parseInt(input.readLine());
				if (choice == 1) {
					TextBook textBook = inputTexkBook(book);
					if (count == 1)
						listBook[0] = textBook;
					else
						listBook = addTypeBook(textBook, listBook);
				} else {
					ReferenceBook referenceBook = inputReferenceBook(book);
					if (count == 1)
						listBook[0] = referenceBook;
					else
						listBook = addTypeBook(referenceBook, listBook);
				}
				outputListBook(listBook);
				System.out.println("Continue add Book on list : y/n");
				add = input.readLine();
				count++;
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

	public static boolean checkDate(String date) {
		Pattern pattern = Pattern
				.compile("(([0-2]{0,1}[0-9])|([3][0-1]))[/-](([0]*[0-9])|([1][0-2]))[/-](([1][9])|([2][0-1]))[0-9]{2}");
		Matcher matcher = pattern.matcher(date);
		if (matcher.matches())
			return true;
		return false;
	}

	public static Book inputBook() throws IOException {
		System.out.println("Input information book: ");
		System.out.print("Book ID: ");
		String bookID = input.readLine();
		System.out.print("Book name: ");
		String name = input.readLine();
		System.out.print("Date: ");
		String date = input.readLine();
		while (!checkDate(date)) {
			System.out.println("Date incorrect, please input again");
			System.out.print("Date: ");
			date = input.readLine();
		}
		System.out.print("Publisher: ");
		String publisher = input.readLine();
		System.out.print("Price: ");
		double price = Double.parseDouble(input.readLine());
		System.out.print("Amount: ");
		double amount = Double.parseDouble(input.readLine());
		Book book = new Book(bookID, name, date, price, amount, publisher);
		return book;
	}

	public static TextBook inputTexkBook(Book book) throws NumberFormatException, IOException {
		String state;
		System.out.println("Input TextBook: ");
		System.out.print(
				"State for Book: " + "\n\t1) " + TextBook.STATE_NEW + "\n\t2) " + TextBook.STATE_OLD + "\nSelect: ");
		int select = Integer.parseInt(input.readLine());
		while (select > 2 || select < 1) {
			System.out.println("Selecttion is incorrect, please select again");
			System.out.print("State for Book: " + "\n\t1) " + TextBook.STATE_NEW + "\n\t2) " + TextBook.STATE_OLD
					+ "\nSelect: ");
			select = Integer.parseInt(input.readLine());
		}
		if (select == 1)
			state = TextBook.STATE_NEW;
		else
			state = TextBook.STATE_OLD;
		TextBook textBook = new TextBook(book.bookID, book.name, book.date, book.price, book.amount, book.publisher,
				state);
		return textBook;
	}

	public static ReferenceBook inputReferenceBook(Book book) throws NumberFormatException, IOException {
		double tax;
		System.out.println("Input ReferenceBook: ");
		System.out.print("Tax: ");
		tax = Double.parseDouble(input.readLine());
		while (tax < 0 || tax > 100) {
			System.out.println("Tax input incorrect, please input again: ");
			System.out.print("Tax: ");
			tax = Double.parseDouble(input.readLine());
		}
		ReferenceBook referenceBook = new ReferenceBook(book.bookID, book.name, book.date, book.price, book.amount,
				book.publisher, tax);
		return referenceBook;
	}

	public static Book[] addTypeBook(Book book, Book[] listBook) {
		Book[] temp = new Book[listBook.length + 1];
		for (int i = 0; i < listBook.length; i++) {
			temp[i] = listBook[i];
		}
		temp[listBook.length] = book;
		listBook = temp;
		return listBook;
	}

	public static void outputListBook(Book[] listBook) {
		double sumpriceTextBook = 0;
		double sumpriceRefBook = 0;
		int sum = 0;
		System.out.println("-----------------List book----------------- ");
		for (int i = 0; i < listBook.length; i++) {
			if (listBook[i] instanceof TextBook) {
				System.out.println("TextBook: ");
				System.out.println(listBook[i].toString());
				sumpriceTextBook += listBook[i].findSumPrice();
			}
		}
		for (int i = 0; i < listBook.length; i++) {
			if (listBook[i] instanceof ReferenceBook) {
				System.out.println("ReferenceBook: ");
				System.out.println(listBook[i].toString());
				sumpriceRefBook += listBook[i].findSumPrice();
				sum += listBook[i].amount;
			}
		}

		System.out.println("Sum price TextBook: " + sumpriceTextBook);
		System.out.println("Sum price ReferenceBook: " + sumpriceRefBook);
		if (sum == 0)
			System.out.println("Pass price ReferenceBook : 0");
		else
			System.out.println("Pass price ReferenceBook : " + sumpriceRefBook / sum);
		System.out.println("---------------------- End. ---------------------- ");
	}
}
