package lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * @use lambda to sort a list
 * @author vovanminh
 * @version 1.0
 * @created Sep 19, 2016
 */
public class Main {
	public static void main(String[] args) {

		try {
			List<String> listOriginal = new ArrayList<>();
			// to add example data to list original
			addStringToList(listOriginal);

			List<String> list = new ArrayList<>(listOriginal);

			int choose = -1;
			while (choose != 0) {
				choose = menuMain();
				switch (choose) {
				// original list
				case 1:
					System.out.println("-----Original list-----");
					printList(listOriginal);
					break;
				case 2:
					// sort list by alphabet
					sortByAlphabet(list);
					break;
				case 3:
					// sort list by increment of length
					sortIncLength(list);
					break;
				case 4:
					// sort list by decrement of length
					sortDecLength(list);
					break;
				default:
					break;
				}
			}

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

	/**
	 * @to print main menu.
	 * @return a chosen int type from keyboard.
	 */
	private static int menuMain() {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		int choose = -1;
		while (choose < 0 || choose > 4) {
			System.out.println("-----Main menu-----");
			System.out.println("0. Quit");
			System.out.println("1. Original list");
			System.out.println("2. List by alphabet");
			System.out.println("3. List by increment of length");
			System.out.println("4. List by decrement of length");
			System.out.println("Enter a chosen from 0->4: ");
			choose = input.nextInt();
		}
		return choose;
	}

	/**
	 * @to sort list by alphabet
	 * @param list
	 */
	private static void sortByAlphabet(List<String> list) {
		System.out.println("\n----List by alphabet-----");
		Collections.sort(list, (String s1, String s2) -> s1.compareTo(s2));
		printList(list);
	}

	/**
	 * @to sort list by decrement of length
	 * @param list
	 */
	private static void sortDecLength(List<String> list) {
		System.out.println("\n----List by decrement of length-----");
		Collections.sort(list, (String s1, String s2) -> Integer.compare(s2.length(), s1.length()));
		printList(list);
	}

	/**
	 * @to sort list by increment of length
	 * @param list
	 */
	private static void sortIncLength(List<String> list) {
		System.out.println("\n----List by increment of length-----");
		Collections.sort(list, (String s1, String s2) -> Integer.compare(s1.length(), s2.length()));
		printList(list);
	}

	/**
	 * @to print list
	 * @param list
	 */
	private static void printList(List<String> list) {
		list.forEach(s -> System.out.println("\t" + s));
	}

	/**
	 * @to add example data to list
	 * @param list
	 */
	private static void addStringToList(List<String> list) {
		list.add("Vo Van Minh");
		list.add("Nguyen Hoang Phu Tien");
		list.add("Doan Minh Quan");
		list.add("Tran Ngoc Dan");
		list.add("Nguyen Trong Thuan");
	}

}
