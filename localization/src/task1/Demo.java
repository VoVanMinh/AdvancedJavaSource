package task1;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;

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
				list = getList("en", "US", "task1/resource_en_US");
				break;
			case 2:
				list = getList("vi", "VN", "task1/resource_vi_VN");
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
	 * @throws IOException 
	 */
	private static ArrayList<String> getList(String language, String country, String path) throws IOException {
		ArrayList<String> list = new ArrayList<>();
		
		Locale currentLocal = new Locale(language, country);
		ResourceBundle message = ResourceBundle.getBundle(path, currentLocal);
		Enumeration<String> keys = message.getKeys();
		
		while(keys.hasMoreElements()) {
			String key = keys.nextElement();
			String value = message.getString(key);
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
