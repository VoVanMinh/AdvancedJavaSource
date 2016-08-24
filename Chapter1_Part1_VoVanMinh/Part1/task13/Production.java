package task13;
import task6.Employee;
/* 
 * @Production class
 * @Author: Vo Van Minh
 * @Date: 22-08-2016
 * @Version: 1.0
 */
public class Production extends Employee {
	final static int BASED = 1000;
	final static double BONUS = 0.05;
	int numProduct;

	public int getNumProduct() {
		return numProduct;
	}

	public void setNumProduct(int numProduct) {
		this.numProduct = numProduct;
	}

	public Production() {
		super();
	}

	public Production(String name, float factorSalary, int numberPeople, float allowance) {
		super(name, factorSalary, numberPeople, allowance);
		// TODO Auto-generated constructor stub
	}
	
	/*
	 * to calculate remunerate money of production employee.
	 * Output: return result double type.
	 */
	double calRemunerate()
	{
		double result = 0;
		result = (numProduct - BASED) * BONUS;
		if (result < 0)
			return 0;
		return result;
	}
	//to print information of a production employee.
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString()  + "\n--- Number Product   \t: " +numProduct; 
	}
}
