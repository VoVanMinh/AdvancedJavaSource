package test;
/* Test for Linear Equation class
 * Author: Vo Van Minh
 * Date 19-08-2016
 * Version 1
 */
import static org.junit.Assert.*;

import org.junit.Test;

import source.Task1_LinearEquation;

public class Task1_Test {

	Task1_LinearEquation linearEquation = new Task1_LinearEquation();

	/* 
	 * Test linear equation function.
	 */
	@Test
	public void test() {

		float a[] = { 0, 0, 0, 0, 0, 1, 1, 1, 1, 1 };
		float b[] = { 0, 0, 0, 1, 1, 1, 1, 1, 1, 1 };
		float ex[] = { Float.MAX_VALUE, Float.MAX_VALUE, Float.MAX_VALUE, 
						Float.NaN, Float.NaN, -1, -1, -1, -1, -1, -1 };
		float ac;

		for (int i = 0; i < 10; i++) {
			linearEquation.setA(a[i]);
			linearEquation.setB(b[i]);
			ac = linearEquation.findRoot();
			
			assertEquals(ex[i], ac, 0);
		}
	}

}
