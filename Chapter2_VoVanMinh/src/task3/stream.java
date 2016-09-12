package task3;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Stream;

/**
 * @author vovanminh
 * @version 1.0
 * @created Sep 12, 2016
 */
public class stream {

	public static void main(String[] args) {
		Stream.iterate(10, i -> i + 1)
		.limit(10)
		.forEach(System.out::println);

	}
}
