package task7;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		CDManager cdMan = new CDManager();
		try {
			String choose = "y";
			while(!choose.equalsIgnoreCase("n")){
				CD cd = cdMan.getCD();
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
