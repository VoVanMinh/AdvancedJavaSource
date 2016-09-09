package task5;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author vovanminh
 * @version 1.0
 * @created Sep 8, 2016
 */
public class EmployeeManager {
	List<Employee> list = new ArrayList<>();

	//TreeSet<Employee> treeSet = new TreeSet<>(Comparator.comparing(Employee::getSalary));
	
	//to add a Employee into list.
	public void addEmployee() throws IOException{
		Employee emp = Employee.getEmployee();
		list.add(emp);
		System.out.println("Added!");
	}

	//to print Employee List.
	public void printEmployeeList() {
		//Collections.sort(list, (Employee e1, Employee e2) -> e1.getName().compareTo(e2.getName()));
		//Collections.sort(list, (Employee e1, Employee e2) -> Double.compare(e1.getSalary(), e2.getSalary()));
		
		Collections.sort(list);
		for (Employee emp : list) {
			System.out.println(emp);
		}
	}
	
	//to set data example.
	void setDefault() {
		Employee e1 = new Employee("Nguyen Van A", 22, 10);
		Employee e2 = new Employee("Nguyen Van B", 22, 20);
		Employee e3 = new Employee("Nguyen Van C", 22, 30);
		Employee e4 = new Employee("Nguyen Van D", 22, 40);
		Employee e5 = new Employee("Nguyen Van E", 22, 50);
		
		list.add(e1);
		list.add(e2);
		list.add(e3);
		list.add(e4);
		list.add(e5);
	}
}
