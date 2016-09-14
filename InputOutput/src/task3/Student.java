package task3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author vovanminh
 * @version 1.0
 * @created Sep 14, 2016
 */
public class Student {
	String name;
	int grade;
	double mark1;
	double mark2;

	public Student(String name, int grade, double mark1, double mark2) {
		super();
		this.name = name;
		this.grade = grade;
		this.mark1 = mark1;
		this.mark2 = mark2;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public double getMark1() {
		return mark1;
	}

	public void setMark1(double mark1) {
		this.mark1 = mark1;
	}

	public double getMark2() {
		return mark2;
	}

	public void setMark2(double mark2) {
		this.mark2 = mark2;
	}

	/**
	 * @to get a student from keyboard.
	 * @return Student
	 * @throws IOException 
	 */
	public static Student getStudent() throws IOException {
		BufferedReader input =new BufferedReader(new InputStreamReader(System.in));
		System.out.println("-----Input a student-----");
		System.out.println("Enter name: ");
		String name = input.readLine();
		System.out.println("Enter grade (number): ");
		int grade = Integer.parseInt(input.readLine());
		System.out.println("Enter mark 1: ");
		double mark1 = Double.parseDouble(input.readLine());
		System.out.println("Enter mark 2: ");
		double mark2 = Double.parseDouble(input.readLine());
		
		Student st = new Student(name, grade, mark1, mark2);
		return st;
	}
	
	// to print a student
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "[" + name + ", " + grade + ", " + mark1 + ", " + mark2 + ", " + calAverage() + ", " + calStatistic()
				+ "]";
	}

	/*
	 * @to calculate average of mark.
	 * 
	 * @return float
	 */
	public double calAverage() {
		double temp = (mark1 + (mark2 * 2)) / 3;
		temp = (double) Math.round(temp * 100) / 100;
		return temp;
	}

	/**
	 * @to statistic learning outcomes return String
	 */
	public String calStatistic() {
		String result = " ";
		double temp = calAverage();
		if (temp >= 8)
			result = "Good";
		else if (temp >= 7)
			result = "Pretty good";
		else if (temp >= 5)
			result = "Medium";
		else
			result = "Bad";
		return result;
	}
}
