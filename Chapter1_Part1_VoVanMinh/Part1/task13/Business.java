package task13;

/* Author: Vo Van Minh
 * Date 22-08-2016
 * Version 1
 */
import task6.Employee;

public class Business extends Employee {
	double salaryBusiness;
	double rate;

	public double getSalaryBusiness() {
		return salaryBusiness;
	}

	public void setSalaryBusiness(double salaryBusiness) {
		this.salaryBusiness = salaryBusiness;
	}

	public double getRate() {
		return rate;
	}

	public void setRate(double rate) {
		this.rate = rate;
	}

	public Business() {
		super();
	}

	public Business(String name, float factorSalary, int numberPeople, float allowance) {
		super(name, factorSalary, numberPeople, allowance);
		// TODO Auto-generated constructor stub
	}

	/*
	 * calculate remunerate of business employee. Output: return double type
	 */
	double calRemunerate() {
		return salaryBusiness * rate;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + "\n--- Salary Business   \t: " + salaryBusiness + "\n--- Rate Bonus       \t: "
				+ rate;
	}

}
