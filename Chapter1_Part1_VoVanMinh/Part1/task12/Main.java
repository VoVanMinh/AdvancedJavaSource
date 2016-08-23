package task12;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	static BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) {
		ArrayList<Book> listBook = new ArrayList<Book>();
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		try {
			String temp = "y";
			while (!temp.equalsIgnoreCase("n")) {
				Book book = new Book();
				book = book.getBook();

				switch (menu()) {
				case 1:
					ReferenceBook rb = new ReferenceBook();
					rb = rb.getReferenceBook(book);
					System.out.println(rb.toString());
					listBook.add(rb);
					System.out.println("Sum price ReferenceBook: " + rb.calSumPrice());
					break;
				case 2:
					TextBook tb = new TextBook();
					tb = tb.getTexkBook(book);
					listBook.add(tb);
					System.out.println(tb.toString());
					System.out.println("Sum price TextBook: " + tb.calSumPrice());
					break;
				default:
					break;
				}

				System.out.println("---Continue? y/n: ");
				temp = input.readLine();
			}
			printList(listBook);

		} catch (InputMismatchException e) {
			System.out.println("Value entered is invalid!");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	static int menu() {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.println("----Add a book----");
		System.out.println("---1. Reference Book");
		System.out.println("---2. Text Book");
		int choose = 0;
		while (choose != 1 && choose != 2) {
			System.out.println("---Enter a choosen: ");
			choose = input.nextInt();
		}
		return choose;
	}

	static void printList(ArrayList<Book> listBook) {
		System.out.println("-----Book List-----");
		for (int i = 0; i < listBook.size(); i++) {
			System.out.println("");
			System.out.println(listBook.get(i).toString());
		}
	}

}
