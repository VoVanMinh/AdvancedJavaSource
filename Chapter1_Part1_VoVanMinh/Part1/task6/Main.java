package task6;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		try {
			
			System.out.println("Enter your name: ");
			String name = input.nextLine();
			
			System.out.println("Enter factory salary: ");
			float factorSalary = input.nextFloat();
			
			System.out.println("Enter number of family allowances: ");
			int numberPeople = input.nextInt();
			
			System.out.println("Enter allowance money: ");
			float allowance = input.nextFloat();
			
			Employee emp = new Employee(name, factorSalary, numberPeople, allowance);
			Salary salary = new Salary();
			
			System.out.println("-----------------------------------");
			System.out.println("Revenue: " +salary.calRevenue(emp));
			System.out.println("Revenue with tax: " +salary.calRevenueTax(emp));
			System.out.println("Tax: " +salary.calTax(emp));
			System.out.println("Salary: " +salary.calSalary(emp));
			
			
		}catch (InputMismatchException e) {
			System.out.println("Value entered is invalid!");
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
