package test;

import static org.junit.Assert.*;

import org.junit.Test;

import task3.Distance;
import task3.PointClass;
/* @Test for Distance class
 * @Author: Vo Van Minh
 * @Date: 19-08-2016
 * @Version: 1.0
 */
public class TestT3 {

	PointClass A = new PointClass();
	PointClass B = new PointClass();
	Distance dist = new Distance();

	//Test calculate the distance between 2 points function.
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
