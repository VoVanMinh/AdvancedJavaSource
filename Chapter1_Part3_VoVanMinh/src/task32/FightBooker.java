package task32;

import java.util.ArrayList;
import java.util.Arrays;
/**
 * @author vovanminh
 * @version 1.0
 * @created 05-Sep-2016 8:14:59 PM
 */
public class FightBooker extends Booking {
	//to search a fight list. Return a object list.
	@Override
	ArrayList<Object> search() {
		// TODO Auto-generated method stub
		ArrayList<Object> temp = new ArrayList<>(Arrays.asList("Fight 1", "Fight 2", "Fight 3"));
		System.out.println("Fight List :" + temp);
		return temp;
	}
}
