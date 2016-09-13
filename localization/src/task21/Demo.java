package task21;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
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
			final File file = new File("/home/vovanminh/JavaAd/localization/src/task21/resource_en_US.properties");
			final Scanner scanner = new Scanner(file);

			scanner.useDelimiter(System.getProperty("line.separator"));
			while (scanner.hasNext()) {
				String[] keyValue = scanner.next().split("=");
				list.add(keyValue[1]);
			}
			scanner.close();

			for (String string : list) {
				System.out.println(string);
			}

		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		}
	}
}
