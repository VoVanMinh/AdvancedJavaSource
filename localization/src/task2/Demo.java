package task2;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;
import java.util.Set;

/**
 * @author vovanminh
 * @version 1.0
 * @created Sep 13, 2016
 */
public class Demo {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		try {
			switch (mainMenu()) {
			case 1:
				list = getList("en", "US", "task2/resource_en_US");
				break;
			case 2:
				list = getList("vi", "VN", "task2/resource_vi_VN");
				break;
			default:
				break;
			}
			printList(list);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	/**
	 * @to print main menu.
	 * @return a int type.
	 */
	private static int mainMenu() {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		int choose = -1;
		while(choose < 0 || choose > 2) {
			System.out.println("-----Language-----");
			System.out.println("1. English");
			System.out.println("2. Vietnamese");
			System.out.println("Enter a chosen: ");
			choose = input.nextInt();
		}
		return choose;
	}
	/**
	 * @param language
	 * @param country
	 * @param path
	 * @return a ArrayList
	 * @throws UnsupportedEncodingException 
	 */
	private static ArrayList<String> getList(String language, String country, String path) throws UnsupportedEncodingException {
		ArrayList<String> list = new ArrayList<>();
		
		Locale currentLocal = new Locale(language, country);
		ResourceBundle message = ResourceBundle.getBundle(path, currentLocal);
		Set<String> set = message.keySet();
		for (String string : set) {
			String value = message.getString(string);
			list.add(new String(value.getBytes("ISO-8859-1"), "UTF-8"));
		}
		return list;
	}
	/**
	 * @to print list
	 * @param list
	 */
	private static void printList(ArrayList<String> list) {
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}
}
