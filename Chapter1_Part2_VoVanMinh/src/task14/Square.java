package task14;
/* Author: Vo Van Minh
 * Date 23-08-2016
 * Version 1
 */
public class Square extends Shape{
	double length;

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	@Override
	double perimeter() {
		// TODO Auto-generated method stub
		return length * 4;
	}

	@Override
	double area() {
		// TODO Auto-generated method stub
		return length * length;
	}
	
	
}
