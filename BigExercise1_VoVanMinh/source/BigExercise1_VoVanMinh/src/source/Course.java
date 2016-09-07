package source;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * @author vovanminh
 * @version 1.0
 * @created 06-Sep-2016 6:40:13 PM
 */
public class Course {

	private String id;
	private String name;
	private String startedDate;
	private String endDate;
	public ArrayList<Subject> listSubject = new ArrayList<Subject>();
	public ArrayList<Student> listStudent = new ArrayList<Student>();
	public Teacher m_Teacher = new Teacher();

	public Course() {

	}

	public Course(String id, String name, String startedDate, String endDate) {
		super();
		this.id = id;
		this.name = name;
		this.startedDate = startedDate;
		this.endDate = endDate;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStartedDate() {
		return startedDate;
	}

	public void setStartedDate(String startedDate) {
		this.startedDate = startedDate;
	}

	public String getEndDate() {
		return endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	public ArrayList<Subject> getListSubject() {
		return listSubject;
	}

	public void setListSubject(ArrayList<Subject> listSubject) {
		this.listSubject = listSubject;
	}

	public ArrayList<Student> getListStudent() {
		return listStudent;
	}

	public void setListStudent(ArrayList<Student> listStudent) {
		this.listStudent = listStudent;
	}

	public Teacher getM_Teacher() {
		return m_Teacher;
	}

	public void setM_Teacher(Teacher m_Teacher) {
		this.m_Teacher = m_Teacher;
	}

	/*
	 * to calculate total all number lesson of a course. 
	 * Output: return result type int.
	 */
	public int calTotal() {
		int sum = 0;
		for (int i = 0; i < listSubject.size(); i++) {
			sum += listSubject.get(i).getSum();
		}
		return sum;
	}

	/*
	 * to get a course from keyboard. 
	 * return a Course.
	 */
	static Course getCourse() throws IOException {
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("-------Input Class Information-----");
		System.out.println("Enter id: ");
		String id = input.readLine();
		System.out.println("Enter name: ");
		String name = input.readLine();
		String startedDate = " ";
		while (!Person.checkDate(startedDate)) {
			System.out.println("Enter started date dd/MM/yyyy: ");
			startedDate = input.readLine();
		}
		String endDate = " ";
		while (!Person.checkDate(endDate)) {
			System.out.println("Enter end date dd/MM/yyyy: ");
			endDate = input.readLine();
		}
		return new Course(id, name, startedDate, endDate);
	}

	// to print subject list of course.
	public void printSubjectList() {
		for (int i = 0; i < listSubject.size(); i++) {
			System.out.println("-----------Subject list-----------");
			listSubject.get(i).printSubject();
		}
	}

	// to print student list of course.
	public void printStudentList() {
		for (int i = 0; i < listStudent.size(); i++) {
			System.out.println("-----------Student list-----------");
			listStudent.get(i).printStudent();
		}
	}

	// to print a course information.
	public void printCourse() {
		System.out.println("-----------Course information-----------");
		System.out.println("ID: " + id);
		System.out.println("Name: " + name);
		System.out.println("Started date: " + startedDate);
		System.out.println("End date: " + endDate);
		System.out.println("Total number of lesson: " + calTotal());
		m_Teacher.printTeacher();
		printSubjectList();
		printStudentList();
	}
}