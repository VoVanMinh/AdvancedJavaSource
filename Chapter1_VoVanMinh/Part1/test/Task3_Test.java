package test;
/* Test for Distance class
 * Author: Vo Van Minh
 * Date 19-08-2016
 * Version 1
 */
import static org.junit.Assert.*;

import org.junit.Test;

import source.Task3_Distance;
import source.Task3_Point;

public class Task3_Test {

	Task3_Point A = new Task3_Point();
	Task3_Point B = new Task3_Point();
	Task3_Distance dist = new Task3_Distance();

	/*
	 * Test calculate the distance between 2 points function.
	 * Input includes: 2 point A and B.
	 */
	@Test
	public void test() {
		float x[] = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		float y[] = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		float ex[] = { 9, 7, 5, 3, 1, 1, 3, 5, 7, 9 };
		float ac;

		for (int i = 0; i < 10; i++) {
			A.setX(x[i]);
			A.setX(y[i]);
			B.setX(x[9 - i]);
			B.setX(x[9 - i]);
			ac = dist.calDistance(A, B);

			assertEquals(ex[i], ac, 0);
		}
	}

}
