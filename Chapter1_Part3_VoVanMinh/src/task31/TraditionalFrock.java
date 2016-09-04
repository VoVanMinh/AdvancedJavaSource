package task31;


/**
 * @author vovanminh
 * @version 1.0
 * @created 04-Sep-2016 8:15:00 PM
 */
public class TraditionalFrock extends Frock {

	public TraditionalFrock(){

	}

	public void finalize() throws Throwable {
		super.finalize();
	}
	//to sew a traditional frock.
	public void sew(){
		System.out.println("Sew traditional frock");
	}

}