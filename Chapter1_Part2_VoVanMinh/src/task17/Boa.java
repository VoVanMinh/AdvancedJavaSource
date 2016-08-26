package task17;
/* @Boa class
 * @Author: Vo Van Minh
 * @Date: 23-08-2016
 * @Version: 1.0
 */
public class Boa extends Animal implements IRunning, ISwimming, IMolting, ILand{

	public Boa() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Boa(String name, String mainFood) {
		super(name, mainFood);
		// TODO Auto-generated constructor stub
	}

	//live at land
	@Override
	public void land() {
		// TODO Auto-generated method stub
		
	}

	//deploy molting
	@Override
	public void molt() {
		// TODO Auto-generated method stub
		
	}

	//can swimming
	@Override
	public void swim() {
		// TODO Auto-generated method stub
		
	}

	//can run
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
	//print information of a boa.
	@Override
	void printAnimal() {
		// TODO Auto-generated method stub
		super.printAnimal();
	}
}
