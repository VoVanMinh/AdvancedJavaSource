package task2;

import java.util.TreeSet;

/**
 * @author vovanminh
 * @version 1.0
 * @created 07-Sep-2016
 */
public class Dictionary {
	TreeSet<WordEnglish> treeSet = new TreeSet<WordEnglish>();

	// to add a WordEnglish into Dictionary.
	public void addADictionary(WordEnglish we) {
		treeSet.add(we);
		System.out.println("---Added!");
	}

	// to print Dictionary.
	public void printDictionary() {
		for (WordEnglish wordEnglish : treeSet) {
			System.out.println(wordEnglish);
		}
	}

	/*
	 * to search a WordEnglish. Input: a word String type. Output: print result.
	 */
	public void searchWord(String str) {
		int temp = 0;
		for (WordEnglish wordEnglish : treeSet) {
			if (wordEnglish.word.equalsIgnoreCase(str)) {
				System.out.println(wordEnglish);
				temp++;
			}
		}
		if (temp == 0)
			System.out.println("---Sorry, Word not exsit in Dictonary!");
	}

	/*
	 * to remove a WordEnglish. Input: a word String type. Output: print result.
	 */
	public void removeAWord(String str) {
		int temp = 0;
		for (WordEnglish wordEnglish : treeSet) {
			if (wordEnglish.word.equalsIgnoreCase(str)) {
				treeSet.remove(wordEnglish);
				System.out.println("---Removed!");
				temp++;
				return;
			}
		}
		if (temp == 0)
			System.out.println("---Sorry, Word not exsit in Dictonary!");
	}

}
