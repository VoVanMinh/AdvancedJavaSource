
package task1;

import java.util.Arrays;
import java.util.List;

/**
 * @author vovanminh
 * @version 1.0
 * @created Sep 9, 2016
 */
public class Demo {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
		list.forEach(n -> System.out.print(n + "\t"));
	}

}
