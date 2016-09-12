package lambda;

import java.util.Arrays;
import java.util.List;

/**
 * @author vovanminh
 * @version 1.0
 * @created Sep 9, 2016
 */
public class Demo2 {
	public static void main(String[] args) {
		List<Integer> amounts = Arrays.asList(new Integer[] { 2, 3, 5, 7 });
		int price = 5200;
		amounts.forEach(n -> System.out.println("Thanh tien= " + n * price));
	}

}
