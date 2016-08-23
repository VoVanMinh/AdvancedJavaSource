package task8;
/* Author: Vo Van Minh
 * Date 22-08-2016
 * Version 1
 */
public class Soldier {

	String name;
	int power;
	String weapon;

	public Soldier() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Soldier(String name, int power, String weapon) {
		super();
		this.name = name;
		this.power = power;
		this.weapon = weapon;
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

	public String getWeapon() {
		return weapon;
	}

	public void setWeapon(String weapon) {
		this.weapon = weapon;
	}

	void fight() {
		this.power--;
	}
	void printSoldier(){
		System.out.println("-----Name: " + this.name);
		System.out.println("-----Power: " + this.power);
		System.out.println("-----Weapon: " + this.weapon);
	}
}
