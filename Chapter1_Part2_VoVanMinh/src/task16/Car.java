package task16;
/* @Car class
 * @Author: Vo Van Minh
 * @Date: 23-08-2016
 * @Version: 1.0
 */
public class Car extends Transport implements ISpeed, IFuel{
	String gearType;
	String carType;
	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Car(String id, String ower, String color, String manufacture, String gearType, String carTyp) {
		super(id, ower, color, manufacture);
		this.gearType = gearType;
		this.carType = carTyp;
	}
	public Car(String gearType, String carType) {
		super();
		this.gearType = gearType;
		this.carType = carType;
	}
	public String getGearType() {
		return gearType;
	}
	public void setGearType(String gearType) {
		this.gearType = gearType;
	}
	public String getCarType() {
		return carType;
	}
	public void setCarType(String carType) {
		this.carType = carType;
	}
	//to print information of a car.
	@Override
	void printTransport() {
		System.out.println("------------------------");
		System.out.println("ID: " +id);
		System.out.println("Ower: " +ower);
		System.out.println("Color " +color);
		System.out.println("Manufacture: " +manufacture);
		System.out.println("Gear type: " +gearType);
		System.out.println("Car type: " +carType);
	}
	/*
	 * to calculate fuel consumption
	 * Input: 2 float type: distance and number liters.
	 * Output: return result float type.
	 */
	@Override
	public float calFuelConsumption(float distance, float numLiters) {
		if(numLiters <= 0)
			return 0;
		return distance/numLiters;
	}
	/*
	 * to calculate speed.
	 * Input: 2 float type: distance and time.
	 * Output: return result float type.
	 */
	@Override
	public float calSpeed(float distance, float time) {
		if(time <= 0)
			return 0;
		return distance/time;
	}
	
	
}
