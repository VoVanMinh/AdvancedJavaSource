package task2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * @author vovanminh
 * @version 1.0
 * @created 07-Sep-2016
 */
public class Main {
	public static void main(String[] args) {
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		Dictionary dictionary = setDataDictionary();

		try {
			int temp = -1;
			while (temp != 0) {
				temp = menu();
				switch (temp) {
				case 1:
					dictionary.printDictionary();
					break;
				case 2:
					WordEnglish we = WordEnglish.getWordEnglish();
					dictionary.addADictionary(we);
					;
					break;
				case 3:
					System.out.println("Enter word you want to search: ");
					String sword = input.readLine();
					dictionary.searchWord(sword);
					break;
				case 4:
					System.out.println("Enter word you want to remove: ");
					String rword = input.readLine();
					dictionary.removeAWord(rword);
					break;
				default:
					break;
				}
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	// to print menu and return a chosen int type.
	private static int menu() {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		int temp = -1;
		while (temp < 0 || temp > 4) {
			System.out.println("-----Menu-----");
			System.out.println("1. Print dictionary");
			System.out.println("2. Add a word");
			System.out.println("3. Search a word");
			System.out.println("4. Remove a word");
			System.out.println("Enter 0 to quit! Enter a chosen 0->4: ");
			temp = input.nextInt();
		}
		return temp;
	}
	//to set data for a Dictionary and return a Dictionary.
	static Dictionary setDataDictionary() {
		Dictionary dic = new Dictionary();

		WordEnglish we = new WordEnglish("king", "vua");
		WordEnglish we1 = new WordEnglish("good", "tot");
		WordEnglish we2 = new WordEnglish("better", "tot hon");
		WordEnglish we3 = new WordEnglish("normal", "binh thuong");
		WordEnglish we4 = new WordEnglish("happy", "vui ve");

		dic.treeSet.add(we);
		dic.treeSet.add(we1);
		dic.treeSet.add(we2);
		dic.treeSet.add(we3);
		dic.treeSet.add(we4);

		return dic;
	}
}
