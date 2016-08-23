package task10;
/* Author: Vo Van Minh
 * Date 22-08-2016
 * Version 1
 */
import java.util.Scanner;

public class Student extends Human {

	String grade;
	float mark1;
	float mark2;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(String name, String birthday, String adddress, String phone) {
		super(name, birthday, adddress, phone);
		// TODO Auto-generated constructor stub
	}

	public Student(String grade, float mark1, float mark2) {
		super();
		this.grade = grade;
		this.mark1 = mark1;
		this.mark2 = mark2;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public float getMark1() {
		return mark1;
	}

	public void setMark1(float mark1) {
		this.mark1 = mark1;
	}

	public float getMark2() {
		return mark2;
	}

	public void setMark2(float mark2) {
		this.mark2 = mark2;
	}

	/*
	 * calculate medium score
	 * Output: return a float type
	 */
	float calMediumScore() {
		float result = 0;
		result = (mark1 + mark2) / 2;
		return result;
	}

	@Override
	void printHuman() {
		// TODO Auto-generated method stub
		System.out.println("-------Student Information-----");
		super.printHuman();
		System.out.println("---Grade: " +this.grade);
		System.out.println("---Mark 1: " + this.mark1);
		System.out.println("---Mark 2: " + this.mark2);
	}
	/*
	 * get a student
	 */
	Student getStudent(Human h) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.println("Enter grade: ");
		String grade = input.nextLine();
		System.out.println("Enter mark 1: ");
		float mark1 = input.nextFloat();
		System.out.println("Enter mark 2: ");
		float mark2 = input.nextFloat();

		Student st = new Student(h.name, h.birthday, h.address, h.phone);
		st.grade = grade;
		st.mark1 = mark1;
		st.mark2 = mark2;
		
		return st;
	}
}
