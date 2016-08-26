package test;

import static org.junit.Assert.*;
import org.junit.Test;
import task12.ReferenceBook;
/*
 * @Test for package task12, Reference book class
 * @Author: Vo Van Minh
 * @Date: 24-08-2016
 * @Version: 1.0
 */
public class testT12 {

	//test for calculate total a book money.
	@Test
	public void test() {
		double[] amount = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		double[] price = { 10, 11, 12, 13, 14, 15, 16, 17, 18, 19 };
		double[] tax = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		double[] ex = { 0, 11.11, 24.48, 40.17, 58.24, 78.75, 101.76, 127.33, 155.52, 186.39 };
		double ac;
		for (int i = 0; i < ex.length; i++) {
			ReferenceBook rb = new ReferenceBook(price[i], amount[i], tax[i]);
			ac = rb.calSumPrice();
			assertEquals(ex[i], ac, 0);
		}
	}

}
