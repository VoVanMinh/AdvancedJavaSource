package source;

import java.util.ArrayList;

/**
 * @author vovanminh
 * @version 1.0
 * @created 06-Sep-2016 6:40:14 PM
 */
public class SubjectManager implements IManager {

	public ArrayList<Subject> listSubject = new ArrayList<Subject>();

	public SubjectManager() {

	}

	//to add a subject into list.
	public void add(Object obj) {
		listSubject.add((Subject) obj);
	}
	//to print subject list.
	public void print() {
		System.out.println("-----Subject list---------");
		for (int i = 0; i < listSubject.size(); i++) {
			System.out.println("---" + i + ". ");
			listSubject.get(i).printSubject();
		}
	}
	//to calculate sum of all lesson subject in list. 
	public int sum() {
		int sum = 0;
		for (int i = 0; i < listSubject.size(); i++) {
			sum += listSubject.get(i).getSum();
		}
		return sum;
	}

}