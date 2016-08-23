package task10;
/* Author: Vo Van Minh
 * Date 22-08-2016
 * Version 1
 */
import java.util.Scanner;

public class Teacher extends Human {
	final int basedSalary = 1260000;
	String head;
	float factorSalary;
	float allowance;

	public Teacher(String head, float factorSalary, float allowance) {
		super();
		this.head = head;
		this.factorSalary = factorSalary;
		this.allowance = allowance;
	}

	public Teacher() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Teacher(String name, String birthday, String address, String phone) {
		super(name, birthday, address, phone);
		// TODO Auto-generated constructor stub
	}

	public String getHead() {
		return head;
	}

	public void setHead(String head) {
		this.head = head;
	}

	public float getFactorSalary() {
		return factorSalary;
	}

	public void setFactorSalary(float factorSalary) {
		this.factorSalary = factorSalary;
	}

	public float getAllowance() {
		return allowance;
	}

	public void setAllowance(float allowance) {
		this.allowance = allowance;
	}

	public int getBasedSalary() {
		return basedSalary;
	}

	float calSalary() {
		float result = 0;
		result = basedSalary * factorSalary + allowance;
		return result;
	}
	@Override
	void printHuman() {
		// TODO Auto-generated method stub
		System.out.println("-------Student Information-----");
		super.printHuman();
		System.out.println("---Factor Salary: " +this.factorSalary);
		System.out.println("---Allowance: " + this.allowance);
		System.out.println("---Head: " + this.head);
	}
	/*
	 * get a teacher
	 */
	Teacher getTeacher(Human h) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.println("Enter head class: ");
		String head = input.nextLine();
		System.out.println("Enter factor salary: ");
		float factor = input.nextFloat();
		System.out.println("Enter allowance: ");
		float allowance = input.nextFloat();

		Teacher te = new Teacher(h.name, h.birthday, h.address, h.phone);
		te.head = head;
		te.factorSalary = factor;
		te.allowance = allowance;
		
		return te;
	}
}
