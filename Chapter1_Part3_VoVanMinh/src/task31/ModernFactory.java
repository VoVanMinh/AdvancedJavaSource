package task31;


/**
 * @author vovanminh
 * @version 1.0
 * @created 04-Sep-2016 8:14:59 PM
 */
public class ModernFactory extends Factory {

	public ModernFactory(){

	}

	public void finalize() throws Throwable {
		super.finalize();
	}
	//to return a modern frock.
	public Frock chooseFactory(){
		return new ModernFrock();
	}

}