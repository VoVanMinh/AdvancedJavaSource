package task6;


/**
 * @author vovanminh
 * @version 1.0
 * @created Sep 8, 2016
 */
public class Main {
	public static void main(String[] args) {
		try {
			
			WordManager wordManager = new WordManager();
			wordManager.cutWordinString(wordManager.getString("string"));
			wordManager.printWordList();
			wordManager.findWord(wordManager.getString("word"));
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
