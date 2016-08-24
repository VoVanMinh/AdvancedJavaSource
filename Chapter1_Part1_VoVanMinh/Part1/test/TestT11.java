package test;

import static org.junit.Assert.*;

import org.junit.Test;

import task11.Transaction;

/*
 * @Test for package task11, Transaction class
 * @Author: Vo Van Minh
 * @Date: 24-08-2016
 * @Version: 1.0
 */
public class TestT11 {

	// test for calculate total money of a transaction function.
	@Test
	public void test() {
		int[] quantity = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		float[] rate = { 10, 11, 12, 13, 14, 15, 16, 17, 18, 19 };
		float[] ex = { 0, 11.011f, 24.024f, 39.039f, 56.056f, 75, 96, 119, 144, 171 };
		float ac;
		for (int i = 0; i < ex.length; i++) {
			Transaction transaction = new Transaction(quantity[i], rate[i]);
			if (i < 5)
				transaction.setTransactionType("sell");
			else 
				transaction.setTransactionType("buy");
			ac = transaction.calMoney();
			assertEquals(ex[i], ac, 0);
		}

	}

}
