package task1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author vovanminh
 * @version 1.0
 * @created Sep 12, 2016
 */
public class Demo {
	public static void main(String[] args) {

		List<String> list = Arrays.asList("", "Waves", "Happy WM", "", "Employee", "Friends", "Girls", "happy", "I",
				"James", "", "ann", "", "A", "Happy");
		System.out.println(list);

		int count = (int) list.stream().filter(i -> i.isEmpty()).count();
		System.out.println("---Number of empty elements are: " + count);

		count = (int) list.stream().filter(i -> i.length() >= 5).count();
		System.out.println("---Number of elements have lenght >= 5 are: " + count);

		count = (int) list.stream().filter(i -> i.startsWith("a")).count();
		System.out.println("---Number of elements start with \"a\" are: " + count);

		count = (int) list.stream().filter(i -> i.equals("happy")).count();
		System.out.println("---Number of elements equals \"happy\" are: " + count);

		List<String> list2 = list.stream().filter(i -> !i.isEmpty()).collect(Collectors.toList());
		System.out.println("---List with elemtents not Empty: " + list2);

		List<String> list3 = list.stream().filter(i -> i.length() >= 3 && i.length() <= 6).collect(Collectors.toList());
		System.out.println("---List with elemtents have length >= 3 and <= 6: " + list3);
		System.out.print("---");
		list3.forEach(i -> System.out.print(i + ", "));

		List<String> list4 = list.stream().map(i -> i + " happy").collect(Collectors.toList());
		System.out.println("\n---List with elemtents +\" happy\": " + list4);

	}
}
