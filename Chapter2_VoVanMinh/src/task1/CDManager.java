package task1;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @author vovanminh
 * @version 1.0
 * @created 07-Sep-2016
 */
public class CDManager {
	ArrayList<CD> listCD = new ArrayList<>();

	// to add a CD into list.
	void addCD(CD cd) {
		listCD.add(cd);
	}

	// to print CD list.
	void printCDList() {
		System.out.println("----------CD List----------");
		for (int i = 0; i < listCD.size(); i++) {
			System.out.println(listCD.get(i).toString());
		}
	}

	/*
	 * to calculate sum of all CD in list. return a result float type.
	 */
	float calPriceTotal() {
		float result = 0;
		for (int i = 0; i < listCD.size(); i++) {
			result += listCD.get(i).price;
		}
		return result;
	}

	void sortCDList() {
		Collections.sort(listCD);
	}
}
