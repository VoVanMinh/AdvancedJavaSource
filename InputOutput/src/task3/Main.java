package task3;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * @author vovanminh
 * @version 1.0
 * @created Sep 14, 2016
 */
public class Main {

	public static void main(String[] args) {
		int choose = -1;
		String path = "src/task3/summary.txt";
		List<Student> list = new ArrayList<>();

		try {
			// read file, add to list.
			readFile(list, path);
			while (choose != 0) {
				choose = menuMain();
				switch (choose) {
				case 1:
					// print student list
					printList(list);
					break;
				case 2:
					// add student to list.
					appendFile(path);
					break;
				case 3:
					// to calculate summary for all student
					calsummary(list);
					break;
				default:
					break;
				}
			}
		} catch (Exception e) {
			// System.out.println(e.getStackTrace());
			e.printStackTrace();
		}
	}

	/**
	 * @to print student list
	 * @param list
	 */
	private static void printList(List<Student> list) {
		for (Student st : list) {
			System.out.println(st);
		}
	}

	/**
	 * @to calculate summary for all student
	 * @param list
	 */
	private static void calsummary(List<Student> list) {

		Collections.sort(list, (Student s1, Student s2) -> Integer.compare(s1.getGrade(), s2.getGrade()));
		System.out.println("-----Student list sorted by grade-----");
		int countGrade = 0;
		int countGood = 0;
		int countPretty = 0;
		int countMedium = 0;
		int countBad = 0;
		double average = 0;

		int size = list.size();
		for (int i = 0; i < size; i++) {
			System.out.println(list.get(i));
			countGrade++;
			average += list.get(i).calAverage();

			if (((i + 1) < size && list.get(i + 1).getGrade() > list.get(i).getGrade()) || i == size - 1) {
				System.out.println("---The number student of grade " + list.get(i).getGrade() + " is " + countGrade);
				System.out.println("---Average mark of grade is: " + (average / countGrade));
				System.out.println();
				countGrade = 0;
				average = 0;
			}

			if (list.get(i).calStatistic().equals("Good"))
				countGood++;
			else if (list.get(i).calStatistic().equals("Pretty good"))
				countPretty++;
			else if (list.get(i).calStatistic().equals("Medium"))
				countMedium++;
			else
				countBad++;
		}

		System.out.println("---The number of student is good: " + countGood);
		System.out.println("---The number of student is pretty good: " + countPretty);
		System.out.println("---The number of student is medium: " + countMedium);
		System.out.println("---The number of student is bad: " + countBad);

	}

	/**
	 * @to append to file.
	 * @param path
	 * @throws IOException
	 */
	private static void appendFile(String path) throws IOException {
		Student st = Student.getStudent();

		DataOutputStream output = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(path, true)));
		output.writeUTF(st.name);
		output.writeInt(st.grade);
		output.writeDouble(st.mark1);
		output.writeDouble(st.mark2);

		output.close();
		System.out.println("---Added student.");
	}

	/**
	 * @param list
	 * @to read file from path and print content
	 * @param path
	 * @return
	 * @throws IOException
	 */
	private static void readFile(List<Student> list, String path) throws IOException {
		DataInputStream input = new DataInputStream(new BufferedInputStream(new FileInputStream(path)));
		String name = "";
		int grade = 0;
		double mark1 = 0;
		double mark2 = 0;
		Student st;

		System.out.println("-----Student list-----");
		while (input.available() > 0) {
			name = input.readUTF();
			grade = input.readInt();
			mark1 = input.readDouble();
			mark2 = input.readDouble();

			st = new Student(name, grade, mark1, mark2);
			list.add(st);
		}
		input.close();
	}

	/**
	 * @to print main menu.
	 * @return a chosen int type from keyboard.
	 */
	private static int menuMain() {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		int choose = -1;
		while (choose < 0 || choose > 3) {
			System.out.println("-----Student Management-----");
			System.out.println("0. Quit");
			System.out.println("1. Student list");
			System.out.println("2. Add a new student");
			System.out.println("3. Summary");
			System.out.println("Enter a chosen: ");
			choose = input.nextInt();
		}
		return choose;
	}

}
