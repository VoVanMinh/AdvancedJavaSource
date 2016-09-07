package source;

import java.util.ArrayList;

/**
 * @author vovanminh
 * @version 1.0
 * @created 06-Sep-2016 6:40:13 PM
 */
public class CourseManager implements IManager {

	public ArrayList<Course> listCourse = new ArrayList<Course>();

	public CourseManager() {

	}

	//to add a Course into list.
	public void add(Object obj) {
		listCourse.add((Course) obj);
	}
	//to print course list.
	public void print() {
		System.out.println("-----Course list---------");
		for (int i = 0; i < listCourse.size(); i++) {
			System.out.println("---" + i + ". ");
			listCourse.get(i).printCourse();
		}
	}

}