package task2;
/* @Calculation class to calculate addition, subtraction, 
 * 	multiplication, division of 2 number float type.
 * @Author: Vo Van Minh
 * @Date 19-08-2016
 * @Version: 1.0
 */
public class Calculation {
	float firstNumber;
	float secondNumber;
	
	public Calculation() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Calculation(float firstNumber, float secondNumber) {
		super();
		this.firstNumber = firstNumber;
		this.secondNumber = secondNumber;
	}
	public float getFirstNumber() {
		return firstNumber;
	}
	public void setFirstNumber(float firstNumber) {
		this.firstNumber = firstNumber;
	}
	public float getSecondNumber() {
		return secondNumber;
	}
	public void setSecondNumber(float secondNumber) {
		this.secondNumber = secondNumber;
	}
	
	/*
	 * Addition function to calculate sum.
	 * Input: 2 number float type.
	 * Output: return sum float type.
	 */
	public float calAddition(){
		return (firstNumber + secondNumber);
	}
	/*
	 * Addition function to calculate subtraction.
	 * Input: 2 number float type.
	 * Output: return subtract float type.
	 */
	public float calSubtraction(){
		return (firstNumber - secondNumber);
	}
	/*
	 * Multiplication function to calculate multiplication.
	 * Input: 2 number float type.
	 * Output: return multiply float type.
	 */
	public float calMultiplication(){
		return (firstNumber * secondNumber);
	}
	/*
	 * Multiplication function to calculate division.
	 * Input: 2 number float type.
	 * Output: return divide float type.
	 */
	public float calDivision(){
		if(secondNumber == 0)
			return Float.NaN;
		return (firstNumber / secondNumber);
	}
	
}
