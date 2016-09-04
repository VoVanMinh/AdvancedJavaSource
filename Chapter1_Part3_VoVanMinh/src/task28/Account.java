package task28;

import java.util.ArrayList;
import java.util.List;
/**
 * @author vovanminh
 * @version 1.0
 * @created 04-Sep-2016 8:14:59 PM
 */
public class Account {
	private List<Observer> observers = new ArrayList<>();
	private double state;
	public double getState() {
		return state;
	}
	public void setState(double state) {
		this.state = state;
	}
	//to add a Observer into list.
	public void attach(Observer observer){
		observers.add(observer);
	}
	//to print notify email and mobi sms.
	public void notifyAllObservers(){
		for (Observer observer : observers) {
			System.out.println(observer.update());
		}
	}
}
