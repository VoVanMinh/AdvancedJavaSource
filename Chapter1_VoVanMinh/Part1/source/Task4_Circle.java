package source;

import java.awt.Point;

/* Circle class
 * Author: Vo Van Minh
 * Date 19-08-2016
 * Version 1
 */
public class Task4_Circle {
	Point OPoint;
	Point RPoint;

	public Point getOPoint() {
		return OPoint;
	}

	public void setOPoint(Point oPoint) {
		OPoint = oPoint;
	}

	public Point getRPoint() {
		return RPoint;
	}

	public void setRPoint(Point rPoint) {
		RPoint = rPoint;
	}

	public Task4_Circle(Point oPoint, Point rPoint) {
		super();
		OPoint = oPoint;
		RPoint = rPoint;
	}

	public Task4_Circle() {
		super();
		// TODO Auto-generated constructor stub
	}

	/*
	 * Calculate distance. Input: 2 points O and R.
	 * Output: return float type.
	 */
	public float calDistance(){
		float result = (float) Point.distance(OPoint.getX(), OPoint.getY(), RPoint.getX(), RPoint.getY());
		return result;
	}
	/*
	 * Calculate perimeter of circle. Input: radius.
	 *  Output: return float type.
	 */
	public float calPerimeterCircle() {
		if(calDistance() == 0)
			return 0;
		float result = (float) (calDistance()* 3.14 * 2);
		return result;
	}

	/*
	 * Calculate area of circle. Input: radius.
 	 *	Output: return float type.
	 */
	public float calAreaCircle() {
		if(calDistance() == 0)
			return 0;
		float result = (float) (Math.pow(calDistance(), 2) * 3.14);
		return result;
	}
}
