package task2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author vovanminh
 * @version 1.0
 * @created 07-Sep-2016
 */
public class WordEnglish implements Comparable<WordEnglish> {
	String word;
	String meaning;

	public WordEnglish() {
		super();
		// TODO Auto-generated constructor stub
	}

	public WordEnglish(String word, String meaning) {
		super();
		this.word = word;
		this.meaning = meaning;
	}

	public String getWord() {
		return word;
	}

	public void setWord(String word) {
		this.word = word;
	}

	public String getMeaning() {
		return meaning;
	}

	public void setMeaning(String meaning) {
		this.meaning = meaning;
	}

	// to compare WordEnglishs by word.
	@Override
	public int compareTo(WordEnglish o) {
		// TODO Auto-generated method stub
		return (this.word).compareToIgnoreCase(o.word);
	}

	// to print a WordEnglish.
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "[" + word + ": " + meaning + "]";
	}

	// to get a WordEnglish from keyboard.
	static WordEnglish getWordEnglish() throws IOException {
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter word: ");
		String word = input.readLine();
		System.out.println("Enter meaning: ");
		String meaning = input.readLine();
		WordEnglish we = new WordEnglish(word, meaning);
		return we;
	}
}
