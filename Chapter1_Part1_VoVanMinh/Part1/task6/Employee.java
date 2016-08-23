package task6;
/* Employee class
 * Author: Vo Van Minh
 * Date 19-08-2016
 * Version 1
 */
public class Employee {

	public String name;
	public float factorSalary;
	public int numberPeople;
	public float allowance;

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(String name, float factorSalary, int numberPeople, float allowance) {
		super();
		this.name = name;
		this.factorSalary = factorSalary;
		this.numberPeople = numberPeople;
		this.allowance = allowance;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getFactorSalary() {
		return factorSalary;
	}

	public void setFactorSalary(float factorSalary) {
		this.factorSalary = factorSalary;
	}

	public int getNumberPeople() {
		return numberPeople;
	}

	public void setNumberPeople(int numberPeople) {
		this.numberPeople = numberPeople;
	}

	public float getAllowance() {
		return allowance;
	}

	public void setAllowance(float allowance) {
		this.allowance = allowance;
	}

}
