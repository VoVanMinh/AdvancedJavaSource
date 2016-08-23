package test;
/*
 * Test for class task9.Computer
 * Author: Vo Van Minh
 * Date: 23-08-2016
 */
import static org.junit.Assert.*;
import task9.Computer;
import org.junit.Test;

public class TestT9 {

	/*
	 * Test for calMoney() method
	 */
	@Test
	public void test() {
		float[] price = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int[] quantity = { 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 };
		float[] ex = { 0, 8, 14, 18, 20, 20, 18, 14, 8, 0 };
		float ac;

		for (int i = 0; i < ex.length; i++) {
			Computer com = new Computer(price[i], quantity[i]);
			ac = com.calMoney();
			assertEquals(ex[i], ac, 0);
		}
	}

}
