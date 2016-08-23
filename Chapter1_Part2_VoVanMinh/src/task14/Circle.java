package task14;
/* Author: Vo Van Minh
 * Date 23-08-2016
 * Version 1
 */
public class Circle extends Shape {
	double r;

	public double getR() {
		return r;
	}

	public void setR(double r) {
		this.r = r;
	}

	@Override
	double perimeter() {
		// TODO Auto-generated method stub
		return 2 * Math.PI * r;
	}

	@Override
	double area() {
		// TODO Auto-generated method stub
		return Math.PI * r * r;
	}

}
