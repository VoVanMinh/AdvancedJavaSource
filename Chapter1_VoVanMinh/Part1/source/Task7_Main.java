package source;

import java.util.Scanner;

public class Task7_Main {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		Task7_CDManager cdMan = new Task7_CDManager();
		try {
			String choose = "y";
			while(!choose.equalsIgnoreCase("n")){
				Task7_CD cd = cdMan.getCD();
				cdMan.addCD(cd);
				
				System.out.println("Enter \"n\" to quit!"
						+ "\n or enter \"y\" to continue add a CD: ");
				choose = input.nextLine();
				
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		cdMan.printArrCD();
		System.out.println("Total price all CD is " +cdMan.calTotalPrice());

	}

	

}
