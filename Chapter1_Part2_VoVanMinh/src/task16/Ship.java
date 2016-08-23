package task16;
/* Author: Vo Van Minh
 * Date: 23-08-2016
 * Version 1
 */
public class Ship extends Transport implements ISpeed, IFuel {

	double weight;
	double capacity;
	float downStreamSpeed;
	float upStreamSpeed;
	float fuelConsumptionStart;
	String fuelType;

	public Ship() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Ship(String id, String ower, String color, String manufacture, double weight, double capacity,
			float downStreamSpeed, float upStreamSpeed, float fuelConsumptionStart, String fuelType) {
		super(id, ower, color, manufacture);
		this.weight = weight;
		this.capacity = capacity;
		this.downStreamSpeed = downStreamSpeed;
		this.upStreamSpeed = upStreamSpeed;
		this.fuelConsumptionStart = fuelConsumptionStart;
		this.fuelType = fuelType;
	}

	public Ship(double weight, double capacity, float downStreamSpeed, float upStreamSpeed, float fuelConsumptionStart,
			String fuelType) {
		super();
		this.weight = weight;
		this.capacity = capacity;
		this.downStreamSpeed = downStreamSpeed;
		this.upStreamSpeed = upStreamSpeed;
		this.fuelConsumptionStart = fuelConsumptionStart;
		this.fuelType = fuelType;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public double getCapacity() {
		return capacity;
	}

	public void setCapacity(double capacity) {
		this.capacity = capacity;
	}

	public float getDownStreamSpeed() {
		return downStreamSpeed;
	}

	public void setDownStreamSpeed(float downStreamSpeed) {
		this.downStreamSpeed = downStreamSpeed;
	}

	public float getUpStreamSpeed() {
		return upStreamSpeed;
	}

	public void setUpStreamSpeed(float upStreamSpeed) {
		this.upStreamSpeed = upStreamSpeed;
	}

	public float getFuelConsumptionStart() {
		return fuelConsumptionStart;
	}

	public void setFuelConsumptionStart(float fuelConsumptionStart) {
		this.fuelConsumptionStart = fuelConsumptionStart;
	}

	public String getFuelType() {
		return fuelType;
	}

	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}

	@Override
	void printTransport() {
		System.out.println("------------------------");
		System.out.println("ID: " + id);
		System.out.println("Ower: " + ower);
		System.out.println("Color " + color);
		System.out.println("Manufacture: " + manufacture);
		System.out.println("Weight: " + weight);
		System.out.println("Capacity: " + capacity);
		System.out.println("Down Stream speed: " + downStreamSpeed);
		System.out.println("Up stream speed: " + upStreamSpeed);
		System.out.println("Fuel consumption start: " + fuelConsumptionStart);
		System.out.println("Fuel type: " + fuelType);
	}

	@Override
	public float calFuelConsumption(float distance, float numLiters) {
		if (numLiters <= 0)
			return 0;
		return distance / (numLiters - fuelConsumptionStart);
	}

	@Override
	public float calSpeed(float distance, float time) {
		if (time <= 0)
			return 0;
		return (distance / time + upStreamSpeed - downStreamSpeed);
	}

}
