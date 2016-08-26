package task15;
/* @Instrument class
 * @Author: Vo Van Minh
 * @Date: 23-08-2016
 * @Version: 1.0
 */
public abstract class Instrument {
	String name;
	String manufacture;
	
	//play() method to print information.
	abstract void play();

	public Instrument() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Instrument(String name, String manufacture) {
		super();
		this.name = name;
		this.manufacture = manufacture;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getManufacture() {
		return manufacture;
	}

	public void setManufacture(String manufacture) {
		this.manufacture = manufacture;
	}
	//to print information of a instrument.
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name + "\t" + manufacture +"\t";
	}
	
}
