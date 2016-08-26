package task14;
/* @Square class
 * @Author: Vo Van Minh
 * @Date: 23-08-2016
 * @Version: 1.0
 */
public class Square extends Shape{
	double length;

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	//to calculate perimeter of square.
	@Override
	double perimeter() {
		// TODO Auto-generated method stub
		return length * 4;
	}

	//to calculate area of square.
	@Override
	double area() {
		// TODO Auto-generated method stub
		return length * length;
	}
	
	
}
