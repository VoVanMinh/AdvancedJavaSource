package source;

import java.util.ArrayList;

/**
 * @author vovanminh
 * @version 1.0
 * @created 06-Sep-2016 6:40:13 PM
 */
public class StudentManager implements IManager {

	public ArrayList<Student> listStudent = new ArrayList<Student>();

	public StudentManager() {

	}

	//to add a Student into list.
	public void add(Object obj) {
		listStudent.add((Student) obj);
	}
	//to print student list.
	public void print() {
		System.out.println("-----Student list---------");
		for (int i = 0; i < listStudent.size(); i++) {
			System.out.println("---" + i + ". ");
			listStudent.get(i).printStudent();
		}
	}

}