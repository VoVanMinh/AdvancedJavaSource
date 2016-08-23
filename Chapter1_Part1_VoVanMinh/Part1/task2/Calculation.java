package task2;
/* Calculation class
 * Author: Vo Van Minh
 * Date 19-08-2016
 * Version 1
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
	
	public float calAddition(){
		return (firstNumber + secondNumber);
	}
	public float calSubtraction(){
		return (firstNumber - secondNumber);
	}
	public float calMultiplication(){
		return (firstNumber * secondNumber);
	}
	public float calDivision(){
		if(secondNumber == 0)
			return Float.NaN;
		return (firstNumber / secondNumber);
	}
	
}
