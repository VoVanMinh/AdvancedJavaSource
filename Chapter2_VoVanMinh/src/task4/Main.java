package task4;

import java.util.ArrayList;

/**
 * @author vovanminh
 * @version 1.0
 * @created Sep 8, 2016
 */
public class Main {
	public static <T> void main(String[] args) {

		PetManager<Dog> managerDog = new PetManager<>();
		PetManager<Cat> managerCat = new PetManager<>();

		// set data example.
		String[] Dogs = { "Dog5", "Dog1", "Dog3", "Dog2", "Dog4" };
		String[] Cats = { "Cat4", "Cat2", "Cat6", "Cat3", "Cat1" };

		// to add data example into dog list.
		for (String string : Dogs) {
			Dog dog = new Dog(string);
			managerDog.addPets(dog);
		}

		// to add data example into cat list.
		for (String string : Cats) {
			Cat cat = new Cat(string);
			managerCat.addPets(cat);
		}

		ArrayList<Object> animal = new ArrayList<>();

		// to add dog list into animal list.
		for (Dog dog : managerDog.pets) {
			animal.add(dog);
		}

		// to add dog list into animal list.
		for (Cat cat : managerCat.pets) {
			animal.add(cat);
		}

		// to print animal list.
		for (Object object : animal) {
			System.out.println("[" + object.toString() + "]");
		}
	}
}
