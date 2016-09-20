package design;

/**
 * @author vovanminh
 * @version 1.0
 * @created 20-Sep-2016 10:35:43 AM
 */
public abstract class Soldier {

	public String name;
	public int strength;
	public int hitStrength;

	public Soldier() {

	}

	public Soldier(String name, int strength, int hitStrength) {
		super();
		this.name = name;
		this.strength = strength;
		this.hitStrength = hitStrength;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getStrength() {
		return strength;
	}

	public void setStrength(int strength) {
		this.strength = strength;
	}

	public int getHitStrength() {
		return hitStrength;
	}

	public void setHitStrength(int hitStrength) {
		this.hitStrength = hitStrength;
	}

	/**
	 * @to get strength when trooper hit
	 * @return hitStrength
	 */
	public int hit() {
		return this.hitStrength;
	}

	/**
	 * @to subtract strength when soldier be hit
	 * @param power
	 */
	public void beHit(int power) {
		strength -= power;
	}

	/**
	 * @to check strength of soldier
	 * @return true/false
	 */
	public boolean wardOff() {
		if (strength <= 0)
			return false;
		return true;
	}

	// to print soldier info
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "[" + name + ", " + strength + ", " + hitStrength + "]";
	}
}