package source;

import java.util.ArrayList;

/**
 * @author vovanminh
 * @version 1.0
 * @created 06-Sep-2016 6:40:13 PM
 */
public class Student extends Person {

	private String appreciation;
	public ArrayList<Mark> listMark = new ArrayList<Mark>();

	public Student() {

	}

	public Student(String name, String birthDay, String phone, String email, String app) {
		super(name, birthDay, phone, email);
		// TODO Auto-generated constructor stub
		this.appreciation = app;
	}

	public String getAppreciation() {
		return appreciation;
	}

	public void setAppreciation(String appreciation) {
		this.appreciation = appreciation;
	}
	//to get a Student from a Person.
	static Student getStudent(Person p) {
		String appre = " ";
		return new Student(p.getName(), p.getBirthDay(), p.getEmail(), p.getPhone(), appre);

	}
	//to print mark list.
	public void printMarkList() {
		for (int i = 0; i < listMark.size(); i++) {
			listMark.get(i).printMark();
		}
	}
	//to print a student.
	public void printStudent() {
		super.printPerson();
		System.out.println("Appreciation:" + appreciation);
		printMarkList();
	}

}