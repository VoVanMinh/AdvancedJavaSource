package design;

/**
 * @author vovanminh
 * @version 1.0
 * @created 20-Sep-2016 10:35:44 AM
 */
public abstract class WeaponDecorator {

	private Soldier soldier;
	private String name;
	private int power;

	public WeaponDecorator() {

	}

	public WeaponDecorator(Soldier soldier, String name, int power) {
		super();
		this.soldier = soldier;
		this.name = name;
		this.power = power;
	}

	public Soldier getSoldier() {
		return soldier;
	}

	public void setSoldier(Soldier soldier) {
		this.soldier = soldier;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPower() {
		return power;
	}

	public void setPower(int power) {
		this.power = power;
	}

	// to get strength when a soldier hit
	public int hit() {
		setPower();
		return soldier.hitStrength;
	}

	// to set strength and hitStrength of a soldier when decorate weapon
	public void setPower() {
		this.soldier.strength += power;
		this.soldier.hitStrength += power;
	}

	// to print weapon info
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "[" + name + ", " + power + "]";
	}
}