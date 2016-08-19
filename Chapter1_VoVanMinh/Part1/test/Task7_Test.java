package test;
/* Test for CD class
 * Author: Vo Van Minh
 * Date 19-08-2016
 * Version 1
 */
import static org.junit.Assert.*;

import org.junit.Test;

import source.Task7_CD;
import source.Task7_CDManager;

public class Task7_Test {

	/*
	 * Test calculate total money of all CD object in List function.
	 */
	@Test
	public void test() {

		float price[] = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		float ex[] = { 0, 1, 3, 6, 10, 15, 21, 28, 36, 45 };
		float ac;

		for (int i = 0; i < 3; i++) {
			Task7_CDManager cdMan = new Task7_CDManager();
			for (int j = 0; j <= price[i]; j++) {
				Task7_CD cd = new Task7_CD(price[j]);
				cdMan.addCD(cd);
			}
			ac = cdMan.calTotalPrice();
			assertEquals(ex[i], ac, 0);
		}
	}
}
