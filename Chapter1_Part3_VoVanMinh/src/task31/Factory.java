package task31;


/**
 * @author vovanminh
 * @version 1.0
 * @created 04-Sep-2016 8:14:59 PM
 */
public abstract class Factory {

	public Factory(){

	}

	public void finalize() throws Throwable {

	}
	
	public abstract Frock chooseFactory();

}