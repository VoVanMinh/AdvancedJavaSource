package test;
/* Test for Circle class
 * Author: Vo Van Minh
 * Date 19-08-2016
 * Version 1
 */
import static org.junit.Assert.*;

import java.awt.Point;

import org.junit.Test;

import task4.Circle;

public class TestT4 {

	Point OPoint = new Point();
	Point RPoint = new Point();
	Circle circle = new Circle();

	/*
	 * Test calculate perimeter of circle function. 
	 * Input includes: 2 point O and R.
	 */
	@Test
	public void testPerimeter() {
		float x[] = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		float y[] = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		float ex[] = { 80, 62, 44.4f, 26.6f, 8.9f, 8.9f, 26.6f, 44.4f, 62.2f, 80 };
		float ac;

		for (int i = 0; i < 10; i++) {
			OPoint.setLocation(x[i], y[i]);
			RPoint.setLocation(x[9 - i], y[9 - i]);
			circle.setOPoint(OPoint);
			circle.setRPoint(RPoint);
			ac = circle.calPerimeterCircle();

			assertEquals(ex[i], ac, 0.2);
		}
	}

	/*
	 * Test calculate area of circle function. 
	 * Input includes: 2 point O and R.
	 */
	@Test
	public void testArea() {
		float x[] = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		float y[] = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		float ex[] = { 508.7f, 307.8f, 157, 56.5f, 6.28f, 6.28f, 56.5f, 157, 307.8f, 508.7f };
		float ac;

		for (int i = 0; i < 10; i++) {
			OPoint.setLocation(x[i], y[i]);
			RPoint.setLocation(x[9 - i], y[9 - i]);
			circle.setOPoint(OPoint);
			circle.setRPoint(RPoint);
			ac = circle.calAreaCircle();

			assertEquals(ex[i], ac, 0.2);
		}
	}

}
