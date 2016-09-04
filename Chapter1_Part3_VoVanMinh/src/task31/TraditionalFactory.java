package task31;


/**
 * @author vovanminh
 * @version 1.0
 * @created 04-Sep-2016 8:15:00 PM
 */
public class TraditionalFactory extends Factory {

	public TraditionalFactory(){

	}

	public void finalize() throws Throwable {
		super.finalize();
	}
	//to return a Traditional Frock.
	public Frock chooseFactory(){
		return new TraditionalFrock();
	}

}