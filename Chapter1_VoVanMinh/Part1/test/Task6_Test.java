package test;
/* Test for Salary class
 * Author: Vo Van Minh
 * Date 19-08-2016
 * Version 1
 */
import static org.junit.Assert.*;

import org.junit.Test;

import source.Task6_Employee;
import source.Task6_Salary;

public class Task6_Test {

	Task6_Salary salary = new Task6_Salary();

	/*
	 * Test calculate the employee's salary after taxes function.
	 */
	@Test
	public void test() {

		String name = " ";
		float factorSalary[] = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int numberPeople[] = { 0, 1, 2, 3, 4, 5, 4, 3, 2, 1 };
		float allowance[] = { 8000000, 9000000, 10000000, 15000000, 30000000, 60000000, 70000000, 80000000, 90000000,
				100000000 };
		float ex[] = { 8000000, 1.026E7f, 1.252E7f, 1.878E7f, 3.4044E7f, 5.9725E7f, 6.7162E7f, 7.3964E7f, 8.0572E7f,
				8.6631E7f };
		float ac;
		for (int i = 0; i < ex.length; i++) {
			Task6_Employee emp = new Task6_Employee(name, factorSalary[i], numberPeople[i], allowance[i]);
			ac = salary.calSalary(emp);

			assertEquals(ex[i], ac, 0);
		}

	}

}
