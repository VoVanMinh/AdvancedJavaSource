package task4;

import java.util.ArrayList;
import java.util.List;

/**
 * @author vovanminh
 * @version 1.0
 * @created Sep 8, 2016
 */
public class PetManager<T> {
	public List<T> pets = new ArrayList<>();

	public List<T> getPets() {
		return pets;
	}

	public void setPets(List<T> pets) {
		this.pets = pets;
	}
	public void addPets(T t){
		pets.add(t);
	}
	public void printPets(){
		for (T t : pets) {
			System.out.println(t.toString());
		}
	}
}
