package task2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.TreeMap;

/**
 * @author vovanminh
 * @version 1.0
 * @created Sep 8, 2016
 */
public class WordManager {
	TreeMap<String, Integer> treeMap = new TreeMap<String, Integer>();

	// to print word list.
	public void printWordList() {
		for (String key : treeMap.keySet()) {
			System.out.println("[" + key + ": " + treeMap.get(key) + "]");
		}
	}

	/**
	 * @to cut a word in String and add to list.
	 * @param path
	 * @throws IOException
	 */
	public void cutWordinString(String path) throws IOException {
		BufferedReader input = new BufferedReader(new FileReader(path));
		String line = "";
		String str = "";
		while ((line = input.readLine()) != null) {
			str += line;
		}
		input.close();

		StringTokenizer sto = new StringTokenizer(str);
		while (sto.hasMoreTokens()) {
			String temp = sto.nextToken();
			if (treeMap.containsKey(temp))
				treeMap.put(temp, (treeMap.get(temp) + 1));
			else
				treeMap.put(temp, 1);
		}
	}

	/**
	 * @to find the number of occurrences of a word in a string.
	 * @return result by print.
	 * @param word need find
	 */
	public void findWord(String word) {
		if (treeMap.containsKey(word))
			System.out.println("[" + word + ": " + treeMap.get(word) + "]");
		else
			System.out.println("Word not exist.");
	}
}
