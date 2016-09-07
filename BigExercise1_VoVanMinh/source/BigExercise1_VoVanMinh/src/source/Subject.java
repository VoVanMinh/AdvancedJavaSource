package source;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author vovanminh
 * @version 1.0
 * @created 06-Sep-2016 6:40:14 PM
 */
public class Subject {

	private String name;
	private String startedDate;
	private String endDate;
	private int sum;
	public Teacher m_Teacher = new Teacher();

	public Subject() {

	}

	public Subject(String name, String startedDate, String endDate, int sum) {
		super();
		this.name = name;
		this.startedDate = startedDate;
		this.endDate = endDate;
		this.sum = sum;
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

	public int getSum() {
		return sum;
	}

	public void setSum(int sum) {
		this.sum = sum;
	}

	public Teacher getM_Teacher() {
		return m_Teacher;
	}

	public void setM_Teacher(Teacher m_Teacher) {
		this.m_Teacher = m_Teacher;
	}
	//to get a subject from keyboard.
	static Subject getSubject() throws IOException {
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("-------Input Subject Information-----");
		System.out.println("Enter name: ");
		String name = input.readLine();
		String startedDate = " ";
		while (!Person.checkDate(startedDate)) {
			System.out.println("Enter started date dd/MM/yyyy: ");
			startedDate = input.readLine();
		}
		String endDate = " ";
		while (!Person.checkDate(startedDate)) {
			System.out.println("Enter end date dd/MM/yyyy: ");
			endDate = input.readLine();
		}
		System.out.println("Enter sum number lesson of subject");
		int sum = Integer.parseInt(input.readLine());

		return new Subject(name, startedDate, endDate, sum);
	}
	//to print a subject.
	public void printSubject() {
		System.out.println("----------Subject Information-------");
		System.out.println("Name: " + name);
		System.out.println("Started Date: " + startedDate);
		System.out.println("End date: " + endDate);
		System.out.println("Sum of lesson: " + sum);
		System.out.println("----Teacher teach ------");
		m_Teacher.printTeacher();
	}
}