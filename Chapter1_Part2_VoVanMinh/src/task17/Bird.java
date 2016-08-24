package task17;
/* @Bird class
 * @Author: Vo Van Minh
 * @Date: 23-08-2016
 * @Version: 1.0
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

	//live overhead
	@Override
	public void overhead() {
		// TODO Auto-generated method stub
		
	}
	
	//can fly
	@Override
	public void fly() {
		// TODO Auto-generated method stub
		
	}
	//print information of a bird.
	@Override
	void printAnimal() {
		// TODO Auto-generated method stub
		super.printAnimal();
	}
}
