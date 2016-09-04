package task28;
/**
 * @author vovanminh
 * @version 1.0
 * @created 04-Sep-2016 8:14:59 PM
 */
public class MobiObserver extends Observer{

	public MobiObserver(Account account) {
		this.account = account;
		this.account.attach(this);
	}
	//to print notify balance to customer.
	@Override
	public String update() {
		// TODO Auto-generated method stub
		return "Mobi: Your account has changed. Account balance is " +account.getState();
	}
	
}
