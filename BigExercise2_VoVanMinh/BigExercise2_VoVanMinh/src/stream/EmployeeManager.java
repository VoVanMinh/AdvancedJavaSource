package stream;

import java.util.ArrayList;
import java.util.DoubleSummaryStatistics;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author vovanminh
 * @version 1.0
 * @created Sep 19, 2016
 */
public class EmployeeManager {
	public List<Employee> list = new ArrayList<>();

	/**
	 * @to calculate average salary of employee
	 * @return
	 */
	public void calAverageSalary() {
		DoubleSummaryStatistics stats = list.stream().mapToDouble(e -> e.getSalary()).summaryStatistics();
		System.out.println("---Average salary of employee is: " + stats.getAverage());
	}

	/**
	 * @to calculate min salary of employees
	 * @return
	 */
	public void calMinSalary() {
		DoubleSummaryStatistics stats = list.stream().mapToDouble(e -> e.getSalary()).summaryStatistics();
		System.out.println("---Min salary of employee is: " + (int) stats.getMin());
	}

	/**
	 * @to calculate max salary of employee
	 * @return
	 */
	public void calMaxSalary() {
		DoubleSummaryStatistics stats = list.stream().mapToDouble(e -> e.getSalary()).summaryStatistics();
		System.out.println("---Max salary of employee is: " + (int) stats.getMax());
	}

	/**
	 * @to calculate average age of employee
	 * @return int type
	 */
	public int calAverageAge() {
		IntSummaryStatistics stats = list.stream().mapToInt(e -> e.getAge()).summaryStatistics();
		int temp = (int) Math.round(stats.getAverage());
		System.out.println("---Average age of all employee is: " + temp);
		return temp;
	}

	/**
	 * @to search employee by name
	 * @param string
	 * @return type int
	 */
	public int searchName(String name) {
		List<Employee> listCal = list.stream().filter(e -> e.getName().contains(name)).collect(Collectors.toList());
		System.out.println("---The number of employees have name contains " + name + " is: " + listCal.size());
		printCalculationList(listCal);
		return listCal.size();
	}

	/**
	 * @to view salary by level > salary
	 * @param salary
	 * @return
	 */
	public void viewSalaryByLevel(float salary) {
		List<Employee> listCal = list.stream().filter(i -> i.getSalary() > salary).collect(Collectors.toList());
		System.out.println("---The number of employees have salary > " + salary + ": " + listCal.size());
		printCalculationList(listCal);
	}

	// to add example data to list
	public void addEmployeeToList() {
		list.clear();

		list.add(new Employee("Vo Van Minh", 22, 15000000));
		list.add(new Employee("Nguyen Hoang Phu Tien", 30, 1000000));
		list.add(new Employee("Doan Minh Quan", 20, 2000000));
		list.add(new Employee("Tran Ngoc Dan", 23, 2500000));
		list.add(new Employee("Nguyen Trong Thuan", 40, 3000000));

		list.add(new Employee("Ha Tan Dien", 24, 6500000));
		list.add(new Employee("Bui Truong Minh Tuan", 36, 4500000));
		list.add(new Employee("Huynh Tan Hoa", 35, 1500000));
		list.add(new Employee("Dao Duc Nha", 29, 2000000));
		list.add(new Employee("Tinh Anh", 27, 10000000));

		list.add(new Employee("Thanh Thao", 33, 15000000));
		list.add(new Employee("Thuy Quynh", 50, 20000000));
		list.add(new Employee("Phuong Hien", 45, 12000000));
		list.add(new Employee("Le Trong Nghia", 38, 17000000));
		list.add(new Employee("Nguyen Quoc Huy", 25, 11000000));
	}

	// to print employee list
	public void printList() {
		System.out.println("-----Employee List-----");
		if (list.size() == 0)
			System.out.println("List is empty.");
		else {
			for (int i = 0; i < list.size(); i++) {
				System.out.println((i + 1) + ": " + list.get(i));
			}
		}

	}

	/**
	 * @to print employee list after calculation
	 * @param
	 */
	public void printCalculationList(List<Employee> listCal) {
		for (int i = 0; i < listCal.size(); i++) {
			System.out.println((i + 1) + ": " + listCal.get(i));
		}

	}
}
