package task14;
/* Author: Vo Van Minh
 * Date 23-08-2016
 * Version 1
 */
public class Rectangle extends Shape{

	public Rectangle(double length, double width) {
		super();
		this.length = length;
		this.width = width;
	}
	double length;
	double width;
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	@Override
	double perimeter() {
		// TODO Auto-generated method stub
		return (length + width) * 2;
	}
	@Override
	double area() {
		// TODO Auto-generated method stub
		return length * width;
	}
	
}
