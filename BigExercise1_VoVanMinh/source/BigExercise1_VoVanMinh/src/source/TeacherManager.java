package source;

import java.util.ArrayList;

/**
 * @author vovanminh
 * @version 1.0
 * @created 06-Sep-2016 6:40:14 PM
 */
public class TeacherManager implements IManager {

	public ArrayList<Teacher> listTeacher = new ArrayList<Teacher>();

	public TeacherManager() {

	}

	// to add a Teacher into list.
	public void add(Object obj) {
		listTeacher.add((Teacher) obj);
	}

	// to print teacher list.
	public void print() {
		System.out.println("-----Teacher list---------");
		for (int i = 0; i < listTeacher.size(); i++) {
			System.out.println("---" + i + ". ");
			listTeacher.get(i).printTeacher();
		}
	}

}