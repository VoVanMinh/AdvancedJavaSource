package test;

import static org.junit.Assert.*;

import org.junit.Test;

import task2.Calculation;
/* @Test for calculation class
 * @Author: Vo Van Minh
 * @Date: 19-08-2016
 * @Version: 1.0
 */
public class TestT2 {

	Calculation cal = new Calculation();

	//Test addition function.
	@Test
	public void testAddition() {
		float firstNumber[] = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		float secondNumber[] = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		float ex[] = { 0, 2, 4, 6, 8, 10, 12, 14, 16, 18 };
		float ac;

		for (int i = 0; i < 10; i++) {
			cal.setFirstNumber(firstNumber[i]);
			cal.setSecondNumber(secondNumber[i]);
			ac = cal.calAddition();

			assertEquals(ex[i], ac, 0);
		}
	}

	//Test subtraction function.
	@Test
	public void testSubtraction() {
		float firstNumber[] = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		float secondNumber[] = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		float ex = 0;
		float ac;

		for (int i = 0; i < 10; i++) {
			cal.setFirstNumber(firstNumber[i]);
			cal.setSecondNumber(secondNumber[i]);
			ac = cal.calSubtraction();

			assertEquals(ex, ac, 0);
		}
	}

	//Test multiplication function.
	@Test
	public void testMultiplication() {
		float firstNumber[] = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		float secondNumber[] = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		float ex[] = { 0, 1, 4, 9, 16, 25, 36, 49, 64, 81 };
		float ac;

		for (int i = 0; i < 10; i++) {
			cal.setFirstNumber(firstNumber[i]);
			cal.setSecondNumber(secondNumber[i]);
			ac = cal.calMultiplication();

			assertEquals(ex[i], ac, 0);
		}
	}

	//Test division function.
	@Test
	public void testDivision() {
		float firstNumber[] = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		float secondNumber[] = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		float ex[] = { Float.NaN, 1, 1, 1, 1, 1, 1, 1, 1, 1 };
		float ac;

		for (int i = 0; i < 10; i++) {
			cal.setFirstNumber(firstNumber[i]);
			cal.setSecondNumber(secondNumber[i]);
			ac = cal.calDivision();

			assertEquals(ex[i], ac, 0);
		}
	}
}