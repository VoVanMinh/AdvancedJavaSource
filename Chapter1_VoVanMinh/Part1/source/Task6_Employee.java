package source;
/* Employee class
 * Author: Vo Van Minh
 * Date 19-08-2016
 * Version 1
 */
public class Task6_Employee {

	private String name;
	private float factorSalary;
	private int numberPeople;
	private float allowance;

	public Task6_Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Task6_Employee(String name, float factorSalary, int numberPeople, float allowance) {
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
