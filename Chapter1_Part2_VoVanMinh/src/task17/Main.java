package task17;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		try {
			ArrayList<Animal> listAnimal = new ArrayList<Animal>();
			
			String choose = "y";
			while (!choose.equalsIgnoreCase("n")) {
				System.out.println("---Enter name: ");
				String name = input.readLine();
				System.out.println("---Enter main food: ");
				String mainFood = input.readLine();
				
				
				switch (menu()) {
				case 1:
					Bird b = new Bird(name, mainFood);
					listAnimal.add(b);
					b.printAnimal();
					break;
				case 2:
					Tiger t = new Tiger(name, mainFood);
					listAnimal.add(t);
					t.printAnimal();
					break;
				case 3:
					Fish f = new Fish(name, mainFood);
					listAnimal.add(f);
					f.printAnimal();
					break;
				case 4:
					Boa boa = new Boa(name, mainFood);
					listAnimal.add(boa);
					boa.printAnimal();
					break;
				default:
					break;
				}
				System.out.println("-----Continue? y/n: ");
				choose = input.readLine();
			}
			printList(listAnimal);

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

	static int menu() {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.println("----Transport Information----");
		System.out.println("---1. Bird");
		System.out.println("---2. Tiger");
		System.out.println("---3. Fish");
		System.out.println("---4. Boa");

		int choose = 0;
		while (choose != 1 && choose != 2 && choose != 3 && choose != 4) {
			System.out.println("---Enter a choosen: ");
			choose = input.nextInt();
		}
		return choose;
	}

	static void printList(ArrayList<Animal> listAnimal){
		System.out.println("-------------Animal List------------");
		for (int i = 0; i < listAnimal.size(); i++) {
			listAnimal.get(i).printAnimal();
		}
	}
	
}
