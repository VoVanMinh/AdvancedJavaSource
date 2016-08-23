package task17;
/* Author: Vo Van Minh
 * Date: 23-08-2016
 * Version 1
 */
public class Bird extends Animal implements IFlying, IOverhead{

	public Bird() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Bird(String name, String mainFood) {
		super(name, mainFood);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void overhead() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		
	}
	@Override
	void printAnimal() {
		// TODO Auto-generated method stub
		super.printAnimal();
	}
}
