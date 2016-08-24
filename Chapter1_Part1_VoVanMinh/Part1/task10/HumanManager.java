package task10;
import java.util.ArrayList;
/* @Human manager class.
 * @Author: Vo Van Minh
 * @Date: 22-08-2016
 * @Version: 1.0
 */

import java.util.List;

public class HumanManager {

	List<Human> listHuman = new ArrayList<Human>();

	//to add a human into list.
	void addHuman(Human h) {
		listHuman.add(h);
	}

	//to print human list.
	void printList() {
		System.out.println("--------------------------------------");
		System.out.println("------- List Human ----------");
		for (int i = 0; i < listHuman.size(); i++) {
			listHuman.get(i).printHuman();
		}
		System.out.println("--------------------------------------");
	}
}
