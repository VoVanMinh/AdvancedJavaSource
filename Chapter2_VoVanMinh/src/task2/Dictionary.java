package task2;

import java.util.TreeSet;

public class Dictionary {
	TreeSet<WordEnglish> treeSet = new TreeSet<WordEnglish>();
	
	public void addADictionary(WordEnglish we){
		treeSet.add(we);
		System.out.println("---Added!");
	}
	public void printDictionary(){
		for (WordEnglish wordEnglish : treeSet) {
			System.out.println(wordEnglish);
		}
	}
	public void searchWord(String str){
		int temp = 0;
		for (WordEnglish wordEnglish : treeSet) {
			if(wordEnglish.word.equalsIgnoreCase(str)){
				System.out.println(wordEnglish);
				temp++;
			}
		}
		if(temp == 0)
			System.out.println("---Sorry, Word not exsit in Dictonary!");
	}
	public void removeAWord(String str){
		int temp = 0;
		for (WordEnglish wordEnglish : treeSet) {
			if(wordEnglish.word.equalsIgnoreCase(str)){
				treeSet.remove(wordEnglish);
				System.out.println("---Removed!");
				temp++;
				return;
			}
		}
		if(temp == 0)
			System.out.println("---Sorry, Word not exsit in Dictonary!");
	}
	
}
