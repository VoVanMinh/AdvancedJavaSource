package task17;
/* @Fish class
 * @Author: Vo Van Minh
 * @Date: 23-08-2016
 * @Version: 1.0
 */
public class Fish extends Animal implements ISwimming, IUnderwater{

	public Fish() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Fish(String name, String mainFood) {
		super(name, mainFood);
		// TODO Auto-generated constructor stub
	}
	//live underwater
	@Override
	public void underwater() {
		// TODO Auto-generated method stub
		
	}
	//can swimming
	@Override
	public void swim() {
		// TODO Auto-generated method stub
		
	}
	//print information of a fish.
	@Override
	void printAnimal() {
		// TODO Auto-generated method stub
		super.printAnimal();
	}
}
