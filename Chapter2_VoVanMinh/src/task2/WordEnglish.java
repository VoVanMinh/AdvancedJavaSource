package task2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class WordEnglish implements Comparable<WordEnglish>{
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
	@Override
	public int compareTo(WordEnglish o) {
		// TODO Auto-generated method stub
		return (this.word).compareToIgnoreCase(o.word);
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "[" + word + ": " +meaning + "]";
	}
	static WordEnglish getWordEnglish() throws IOException{
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter word: ");
		String word = input.readLine();
		System.out.println("Enter meaning: ");
		String meaning = input.readLine();
		WordEnglish we = new WordEnglish(word, meaning);
		return we;
	}
}
