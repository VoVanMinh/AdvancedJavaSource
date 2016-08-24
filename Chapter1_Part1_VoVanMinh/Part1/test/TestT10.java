package test;

import static org.junit.Assert.*;

import org.junit.Test;

import task10.Human;

/*
 * @Test for task10.Human class
 * @Author: Vo Van Minh
 * @Date: 23-08-2016
 * @Version: 1.0
 */
public class TestT10 {

	//Test for check date method.
	@Test
	public void test() {
		String[] date = { "2/9/1994", "03/02/1995", "20/11/1996", "01/5/2012", "30/04/2017", "0/05/1999", "05/13/2016",
				"05/05/1000", "05/00/2015", "00/10/2010" };
		boolean ac;

		Human h = new Human();
		for (int i = 0; i < date.length; i++) {
			ac = h.checkDate(date[i]);
			if (i < 5)
				assertTrue(ac);
			else
				assertFalse(ac);
		}
	}

}
