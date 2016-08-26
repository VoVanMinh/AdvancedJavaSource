package task16;
/* @Transport class
 * @Author: Vo Van Minh
 * @Date: 23-08-2016
 * @Version: 1.0
 */
public abstract class Transport {
	String id;
	String ower;
	String color;
	String manufacture;
		
	// to print a transport
	abstract void printTransport();

	public Transport() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getOwer() {
		return ower;
	}

	public void setOwer(String ower) {
		this.ower = ower;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getManufacture() {
		return manufacture;
	}

	public void setManufacture(String manufacture) {
		this.manufacture = manufacture;
	}

	public Transport(String id, String ower, String color, String manufacture) {
		super();
		this.id = id;
		this.ower = ower;
		this.color = color;
		this.manufacture = manufacture;
	}
	
	
}
