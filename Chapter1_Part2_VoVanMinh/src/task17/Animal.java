package task17;
/* @Animal class
 * @Author: Vo Van Minh
 * @Date: 23-08-2016
 * @Version: 1.0
 */
public abstract class Animal {
	
	String name;
	String mainFood;
	
	// print a animal
	void printAnimal(){
		System.out.println("-----Name: " +name);
		System.out.println("-----Main food: " +mainFood);
	}
	public Animal() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Animal(String name, String mainFood) {
		super();
		this.name = name;
		this.mainFood = mainFood;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMainFood() {
		return mainFood;
	}

	public void setMainFood(String mainFood) {
		this.mainFood = mainFood;
	}
	
	
}
