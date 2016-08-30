package test;

import task19.*;
import static org.junit.Assert.*;

import org.junit.Test;

/*
 * @Test for package task 19, class Order.
 * @Author: Vo Van Minh
 * @Date: 24-08-2016
 * @Version: 1.0
 */
public class testT19 {

	// test for calculate total money buy products with tax.
	@Test
	public void test() {

		int quantity = 1;
		double[] ex = { 1100, 1650, 1760, 1793, 2233, 2080, 2083, 2093, 2173, 2243 };
		double ac;

		for (int i = 0; i < ex.length; i++) {
			Order order = new Order();
			if (i < 5)
				order.setPrintOrder(true);
			else
				order.setPrintOrder(false);
			for (int k = 0; k <= i; k++) {
				Product product = new Product(ProductManager.NAME[k], ProductManager.PRICE[k]);
				OrderDetail od = new OrderDetail(quantity, product);
				order.listOrderDetail.add(od);
			}
			ac = order.calTotalAmount();
			assertEquals(ex[i], ac, 0);
		}

	}

}
