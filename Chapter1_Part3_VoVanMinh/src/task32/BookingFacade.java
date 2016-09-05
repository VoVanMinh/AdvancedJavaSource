package task32;

import java.util.List;
/**
 * @author vovanminh
 * @version 1.0
 * @created 05-Sep-2016 8:14:59 PM
 */
public class BookingFacade {
	private Booking fightBooker;
	private Booking hotelBooker;
	private Booking trainBooker;

	public BookingFacade() {
		fightBooker = new FightBooker();
		hotelBooker = new HotelBooker();
		trainBooker = new TrainBooker();
	}

	//to search a fight list.
	public List<Object> searchFightBooker() {
		// TODO Auto-generated method stub
		return fightBooker.search();
	}
	//to search a hotel list.
	public List<Object> searchHotelBooker() {
		// TODO Auto-generated method stub
		return hotelBooker.search();
	}
	//to search a train list.
	public List<Object> searchTrainBooker() {
		// TODO Auto-generated method stub
		return trainBooker.search();
	}
}
