package task32;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/**
 * @author vovanminh
 * @version 1.0
 * @created 05-Sep-2016 8:14:59 PM
 */
public class TrainBooker extends Booking {
	//to search a train list. Return a object list.
	@Override
	List<Object> search() {
		// TODO Auto-generated method stub
		ArrayList<Object> temp = new ArrayList<>(Arrays.asList("Train 1", "Train 2", "Train 3"));
		System.out.println("Train List: " + temp);
		return temp;
	}
}
