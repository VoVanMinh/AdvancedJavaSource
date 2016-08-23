package test;

/* Test for Rectangle class
 * Author: Vo Van Minh
 * Date 19-08-2016
 * Version 1
 */
import static org.junit.Assert.*;

import java.awt.Point;

import org.junit.Test;

import task5.Rectangle;

public class TestT5 {

	Point aPoint = new Point();
	Point bPoint = new Point();
	Rectangle rectangle = new Rectangle();

	/*
	 * Test calculate perimeter of rectangle function. 
	 * Input includes: 2 point O and R.
	 */
	@Test
	public void testPerimeter() {
		float x[] = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		float y[] = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		float ex[] = { 36, 28, 20, 12, 4, 4, 12, 20, 28, 36 };
		float ac;

		for (int i = 0; i < 10; i++) {
			aPoint.setLocation(x[i], y[i]);
			bPoint.setLocation(x[9 - i], y[9 - i]);
			rectangle.setaPoint(aPoint);
			rectangle.setbPoint(bPoint);
			ac = rectangle.calPerimeterRect();

			assertEquals(ex[i], ac, 0.2);
		}
	}

	/*
	 * Test calculate area of rectangle function. 
	 * Input includes: 2 point O and R.
	 */
	@Test
	public void testArea() {
		float x[] = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		float y[] = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		float ex[] = { 81, 49, 25, 9, 1, 1, 9, 25, 49, 81 };
		float ac;

		for (int i = 0; i < 10; i++) {
			aPoint.setLocation(x[i], y[i]);
			bPoint.setLocation(x[9 - i], y[9 - i]);
			rectangle.setaPoint(aPoint);
			rectangle.setbPoint(bPoint);
			ac = rectangle.calAreaRect();

			assertEquals(ex[i], ac, 0.2);
		}
	}

}
