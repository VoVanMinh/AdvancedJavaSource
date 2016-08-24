package test;

import static org.junit.Assert.*;

import org.junit.Test;
import task13.Production;

/*
 * @Test for package task13, production class.
 * @Author: Vo Van Minh
 * @Date: 24-08-2016
 * @Version: 1.0
 */
public class TestT13 {

	// test for method calculate remunerate money of production employee.
	@Test
	public void test() {
		int[] numProduct = { 900, 1000, 1100, 1500, 2000, 2500, 3000, 5000, 7000, 9000 };
		double[] ex = { 0, 0, 5, 25, 50, 75, 100, 200, 300, 400 };
		double ac;
		for (int i = 0; i < ex.length; i++) {
			Production pro = new Production(numProduct[i]);
			ac = pro.calRemunerate();
			assertEquals(ex[i], ac, 0);
		}
	}

}
