package task1;

import java.util.ArrayList;
import java.util.Collections;

public class CDManager {
	ArrayList<CD> listCD = new ArrayList<>();
	
	void addCD(CD cd){
		listCD.add(cd);
	}
	void printCDList(){
		System.out.println("----------CD List----------");
		for (int i = 0; i < listCD.size(); i++) {
			System.out.println(listCD.get(i).toString());
		}
	}
	float calPriceTotal(){
		float result = 0;
		for (int i = 0; i < listCD.size(); i++) {
			result += listCD.get(i).price;
		}
		return result;
	}
	void sortCDList(){
		Collections.sort(listCD);
	}
}
