package task28;
/**
 * @author vovanminh
 * @version 1.0
 * @created 04-Sep-2016 8:14:59 PM
 */
public class EmailObserver extends Observer{

	public EmailObserver(Account account) {
		this.account = account;
		this.account.attach(this);
	}
	//to notify balance to customer.
	@Override
	public String update() {
		// TODO Auto-generated method stub
		return "Email: Your account has changed. Account balance is " +account.getState();
	}
	
}
