package task14;
/* @Rectangle class
 * @Author: Vo Van Minh
 * @Date: 23-08-2016
 * @Version: 1.0
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
	//to calculate perimeter of rectangle.
	@Override
	double perimeter() {
		// TODO Auto-generated method stub
		return (length + width) * 2;
	}
	//to calculate area of rectangle.
	@Override
	double area() {
		// TODO Auto-generated method stub
		return length * width;
	}
	
}
