package task4;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * @author vovanminh
 * @version 1.0
 * @created Sep 14, 2016
 */
public class EmployeeManager {
	List<Employee> list = new ArrayList<Employee>();

	/**
	 * @to add a new employee to list
	 * @throws IOException
	 */
	public void addEmployee() throws IOException {
		Employee emp = Employee.getEmployee();
		list.add(emp);
		System.out.println("---Added");
	}

	/**
	 * @to search employee by name
	 * @param list
	 * @print employees have name match
	 * @throws IOException
	 */
	public void search() throws IOException {
		System.out.println("Enter name of employee you want to search: ");
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		String name = input.readLine();

		int temp = 0;
		for (Employee employee : list) {
			if (employee.getName().equalsIgnoreCase(name)) {
				System.out.println("-----Result searching: ");
				System.out.println(employee);
				temp = 1;
			}
		}
		if (temp == 0)
			System.out.println("-----No name is matched.");

	}

	/**
	 * @to print list
	 * @param list
	 */
	public void printList() {
		System.out.println("-----Employee List-----");
		for (Employee employee : list) {
			System.out.println(employee);
		}
	}

	/**
	 * @to write file from list
	 * @param list
	 * @param path
	 * @throws IOException
	 */
	public void writeListtoFile(String path) throws IOException {
		ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream(path));
		output.writeInt(list.size());
		
		for (Employee emp : list) {
			output.writeObject(emp);
			output.flush();
		}
		output.reset();
		output.close();
	}

	/**
	 * @to read file from path and add to list
	 * @param path
	 * @return
	 * @throws IOException
	 * @throws ClassNotFoundException
	 */
	public void readFiletoList(String path) throws IOException, ClassNotFoundException {
		FileInputStream file = new FileInputStream(path);
		if (file.available() != 0) {
			ObjectInputStream input = new ObjectInputStream(file);
			
			int size = input.readInt();
			for (int i = 0; i < size; i++) {
				list.add((Employee) input.readObject());
			}
			input.close();
		}
	}

}
