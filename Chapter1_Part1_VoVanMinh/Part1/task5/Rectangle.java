package task5;

import java.awt.Point;

/* @Rectangle class
 * @Author: Vo Van Minh
 * @Date: 19-08-2016
 * @Version: 1.0
 */
public class Rectangle {
	Point aPoint;
	Point bPoint;

	public Point getaPoint() {
		return aPoint;
	}

	public void setaPoint(Point aPoint) {
		this.aPoint = aPoint;
	}

	public Point getbPoint() {
		return bPoint;
	}

	public void setbPoint(Point bPoint) {
		this.bPoint = bPoint;
	}

	public Rectangle(Point aPoint, Point bPoint) {
		super();
		this.aPoint = aPoint;
		this.bPoint = bPoint;
	}

	public Rectangle() {
		super();
		// TODO Auto-generated constructor stub
	}

	/*
	 * Calculate length of rectangle. Input: 2 points. Output: return length
	 * float type.
	 */
	public float calLength() {
		if (aPoint.getY() == bPoint.getY())
			return 0;
		else
			return (float) Math.abs((aPoint.getY() - bPoint.getY()));
	}

	/*
	 * Calculate width of rectangle. Input: 2 points. Output: return width float type.
	 */
	public float calWidth() {
		if (aPoint.getX() == bPoint.getX())
			return 0;
		else
			return (float) Math.abs((aPoint.getX() - bPoint.getX()));
	}

	/*
	 * Calculate perimeter of rectangle. Input: length and width. Output: return perimeter float
	 * type.
	 */
	public float calPerimeterRect() {
		if (calLength() == 0 || calWidth() == 0)
			return 0;
		float result = (calLength() + calWidth()) * 2;
		return result;
	}

	/*
	 * Calculate area of rectangle. Input: length and width. Output: return float type.
	 */
	public float calAreaRect() {
		if (calLength() == 0 || calWidth() == 0)
			return 0;
		float result = calLength() * calWidth();
		return result;
	}
}
