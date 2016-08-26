package task1;

/* @Linear Equation Class to calculate root of linear equation
 * @Author: Vo Van Minh
 * @Date: 19-08-2016
 * @Version: 1.0
 */
public class LinearEquation {

	float a;
	float b;

	public LinearEquation() {
		super();
		// TODO Auto-generated constructor stub
	}

	public LinearEquation(float a, float b) {
		super();
		this.a = a;
		this.b = b;
	}

	public float getA() {
		return a;
	}

	public void setA(float a) {
		this.a = a;
	}

	public float getB() {
		return b;
	}

	public void setB(float b) {
		this.b = b;
	}

	/*
	 * Calculate root of the linear equation function. Input: 2 float variables a
	 * and b. Output: return a root float type.
	 */
	public float findRoot() {
		float x = 0;
		if (this.a == 0) {
			if (this.b == 0) {
				x = Float.MAX_VALUE;
			} else {
				x = Float.NaN;
			}
		} else {
			x = (-b) / a;
			if (x == -0)
				x = 0;
		}
		return x;
	}
}
