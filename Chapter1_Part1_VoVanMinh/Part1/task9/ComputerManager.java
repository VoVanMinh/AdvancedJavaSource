package task9;
/* Author: Vo Van Minh
 * Date 22-08-2016
 * Version 1
 */
import java.util.ArrayList;
import java.util.List;

public class ComputerManager {

	List<Computer> listCom = new ArrayList<Computer>();

	void addCom(Computer c) {
		listCom.add(c);
	}

	/*
	 * print a computer list 
	 */
	void printList() {
		System.out.println("--------------------------------------");
		System.out.println("------- List computer ----------");
		for (int i = 0; i < listCom.size(); i++) {
			listCom.get(i).printComputer();
		}
		System.out.println("--------------------------------------");
	}

	/*
	 * calculate total money all destop in list
	 */
	float totalMoneyDestop() {
		float result = 0;
		for (int i = 0; i < listCom.size(); i++) {
			if(listCom.get(i) instanceof Destop)
				result += listCom.get(i).calMoney();
		}		
		return result;
	}
	
	/*
	 * calculate total money all laptop in list
	 */
	float totalMoneyLaptop() {
		float result = 0;
		for (int i = 0; i < listCom.size(); i++) {
			if(listCom.get(i) instanceof Laptop)
				result += listCom.get(i).calMoney();
		}		
		return result;
	}
}
