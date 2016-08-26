package task9;
import java.util.ArrayList;
/* @Computer manager class
 * @Author: Vo Van Minh
 * @Date 22-08-2016
 * @Version: 1.0
 */

import java.util.List;

public class ComputerManager {

	List<Computer> listCom = new ArrayList<Computer>();

	// to add a computer into list
	void addCom(Computer c) {
		listCom.add(c);
	}

	// print a computer list.
	void printList() {
		System.out.println("--------------------------------------");
		System.out.println("------- List computer ----------");
		for (int i = 0; i < listCom.size(); i++) {
			listCom.get(i).printComputer();
		}
		System.out.println("--------------------------------------");
	}

	/*
	 * Calculate total money all desktop in list.
	 * Input: a computer list.
	 * Output: return result float type.
	 */
	float totalMoneyDestop() {
		float result = 0;
		for (int i = 0; i < listCom.size(); i++) {
			if (listCom.get(i) instanceof Destop)
				result += listCom.get(i).calMoney();
		}
		return result;
	}

	/*
	 * Calculate total money all laptop in list.
	 * Input: a computer list.
	 * Output: return result float type.
	 */
	float totalMoneyLaptop() {
		float result = 0;
		for (int i = 0; i < listCom.size(); i++) {
			if (listCom.get(i) instanceof Laptop)
				result += listCom.get(i).calMoney();
		}
		return result;
	}
}
