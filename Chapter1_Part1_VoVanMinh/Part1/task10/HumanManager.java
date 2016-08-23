package task10;

/* Author: Vo Van Minh
 * Date 22-08-2016
 * Version 1
 */
import java.util.ArrayList;
import java.util.List;

public class HumanManager {

	List<Human> listHuman = new ArrayList<Human>();

	void addHuman(Human h) {
		listHuman.add(h);
	}

	/*
	 * print human list
	 */
	void printList() {
		System.out.println("--------------------------------------");
		System.out.println("------- List Human ----------");
		for (int i = 0; i < listHuman.size(); i++) {
			listHuman.get(i).printHuman();
		}
		System.out.println("--------------------------------------");
	}
}
