package task11;
/* Author: Vo Van Minh
 * Date 22-08-2016
 * Version 1
 */
import java.util.ArrayList;

public class TransactionManager {


	ArrayList<Transaction> listTrans = new ArrayList<Transaction>();
	
	void addTrans(Transaction tr){
		listTrans.add(tr);
	}
	void printList() {
		System.out.println("--------------------------------------");
		System.out.println("------- List Transaction ----------");
		for (int i = 0; i < listTrans.size(); i++) {
			listTrans.get(i).printTrans();
		}
		System.out.println("--------------------------------------");
	}
	float mediumTotalGold(){
		float result = 0;
		int count = 0;
		for (int i = 0; i < listTrans.size(); i++) {
			if(listTrans.get(i) instanceof GoldTransaction){
				result += listTrans.get(i).calMoney();
				count++;
			}
		}
		if(count == 0)
			return 0;
		return result/count;
	}
	float mediumTotalCurrency(){
		float result = 0;
		int count = 0;
		for (int i = 0; i < listTrans.size(); i++) {
			if(listTrans.get(i) instanceof CurrencyTransaction){
				result += listTrans.get(i).calMoney();
				count++;
			}
		}
		if(count == 0)
			return 0;
		return result/count;
	}
}
