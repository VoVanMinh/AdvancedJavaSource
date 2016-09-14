package task2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @author vovanminh
 * @version 1.0
 * @created Sep 8, 2016
 */
public class Main {
	public static void main(String[] args) {
		try {

			String path = "src/task2/document.txt";

			WordManager wordManager = new WordManager();
			wordManager.cutWordinString(path);
			wordManager.printWordList();

			BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter a word you want to find: ");
			String temp = input.readLine();

			wordManager.findWord(temp);

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
