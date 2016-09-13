package task2;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author vovanminh
 * @version 1.0
 * @created Sep 12, 2016
 */
public class Demo {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(2, 5, 3, 4, 1, 9, 6, 7, 8, 10, 15, 13, 14, 12, 11);
		System.out.println("---Original list: " + list);

		List<Integer> list2 = list.stream().map(i -> i * i).collect(Collectors.toList());
		System.out.println("---List by squaring of elements from the original list: " + list2);

		IntSummaryStatistics stats = list2.stream().mapToInt(i -> i).summaryStatistics();
		System.out.println("---Highest number in list 2 is: " + stats.getMax());
		System.out.println("---Lowest number in list 2 is: " + stats.getMin());
		System.out.println("---Sum of all number in list 2 is: " + stats.getSum());
		System.out.println("---Average of all number in list 2 is: " + stats.getMax());

		List<Integer> list3 = list.stream().filter(i -> checkPrimary(i)).map(i -> i).collect(Collectors.toList());
		System.out.println("---List with elements are primary number: " + list3);

		List<Integer> list4 = list.stream().filter(i -> checkSquare(i)).map(i -> i).collect(Collectors.toList());
		System.out.println("---List with elements are square number: " + list4);

	}

	/**
	 * to check a number is primary number. Input: a number int type. Output:
	 * true/false.
	 */
	static boolean checkPrimary(int x) {
		if (x < 2)
			return false;
		for (int i = 2; i <= Math.sqrt(x); i++) {
			if (x % i == 0)
				return false;
		}
		return true;
	}

	/**
	 * to check square number. Input: a number int type. Output: true/false.
	 */
	static boolean checkSquare(int x) {
		if (x < 0)
			return false;
		int a = (int) Math.sqrt(x);
		if (a * a == x)
			return true;
		return false;

	}
}
