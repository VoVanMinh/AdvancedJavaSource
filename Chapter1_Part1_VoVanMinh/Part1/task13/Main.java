package task13;

import java.util.InputMismatchException;
import java.util.Scanner;

import task6.Employee;
import task6.Salary;

public class Main {

	public static void main(String[] args) {
		
		try {
			
			Employee emp = new Employee();
			emp = getEmp();
			
			calculate(emp);
			
			
		}catch (InputMismatchException e) {
			System.out.println("Value entered is invalid!");
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}
	static Employee getEmp(){
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter your name: ");
		String name = input.nextLine();
		
		System.out.println("Enter factory salary: ");
		float factorSalary = input.nextFloat();
		
		System.out.println("Enter number of family allowances: ");
		int numberPeople = input.nextInt();
		
		float allowance = 0;
		
		Employee emp = new Employee(name, factorSalary, numberPeople, allowance);
		
		return emp;
	}
	
	static int menu() {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.println("----Calculate perimater and area----");
		System.out.println("---1. Business Employee");
		System.out.println("---2. Production Employee");
		int choose = 0;
		while (choose != 1 && choose != 2) {
			System.out.println("---Enter a choosen: ");
			choose = input.nextInt();
		}
		return choose;
	}

	static void calculate(Employee emp) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		switch (menu()) {
		case 1:
			System.out.println("Input business salary: ");
			double bs = input.nextDouble();
			System.out.println("Input business rate: ");
			double rate = input.nextDouble();
			Business bu = new Business(emp.name, emp.factorSalary, emp.numberPeople, emp.allowance);
			emp.setAllowance((float)bu.calRemunerate());
			bu.allowance = (float)bu.calRemunerate();
			bu.salaryBusiness = bs;
			bu.rate = rate;
			Salary sa = new Salary();
			sa.calSalary(emp);
			System.out.println("-----Salary: " +sa.calSalary(emp));
			break;
		case 2:
			System.out.println("Input nunmer product: ");
			int nump = input.nextInt();

			Production p = new Production(emp.name, emp.factorSalary, emp.numberPeople, emp.allowance);
			emp.setAllowance((float)p.calRemunerate());
			p.allowance = (float)p.calRemunerate();
			p.numProduct = nump;
			Salary sal = new Salary();
			sal.calSalary(emp);
			System.out.println("-----Salary: " +sal.calSalary(emp));
			break;
		default:
			break;
		}
	}
}
