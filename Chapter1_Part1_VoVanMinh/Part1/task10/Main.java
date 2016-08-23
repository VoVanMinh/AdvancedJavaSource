package task10;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		HumanManager hm = new HumanManager();
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		String temp = " ";
		try {
			while (!temp.equalsIgnoreCase("n")) {
				Human h = new Human();
				h = h.getHuman();

				System.out.println("1. Add a student");
				System.out.println("2. Add a teacher");
				int choose = 0;
				while (choose != 1 && choose != 2) {
					System.out.println("-----Enter a choosen: ");
					choose = input.nextInt();
				}
				switch (choose) {
				case 1:
					Student st = new Student();
					st = st.getStudent(h);
					hm.addHuman(st);
					System.out.println("Medium score: " + st.calMediumScore());
					break;
				case 2:
					Teacher te = new Teacher();
					te = te.getTeacher(h);
					hm.addHuman(te);
					System.out.println("Salary: " + te.calSalary());
					break;
				default:
					break;
				}
				hm.printList();
				System.out.println("Continue add a computer? y/n: ");
				input = new Scanner(System.in);
				temp = input.nextLine();
			}
		} catch (InputMismatchException e) {
			System.out.println("Value entered is invalid!");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
