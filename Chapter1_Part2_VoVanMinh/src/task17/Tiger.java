package task17;
/* @Tiger class
 * @Author: Vo Van Minh
 * @Date: 23-08-2016
 * @Version: 1.0
 */
public class Tiger extends Animal implements ISwimming, IRunning, ILand{

	public Tiger() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Tiger(String name, String mainFood) {
		super(name, mainFood);
		// TODO Auto-generated constructor stub
	}
	//live at land
	@Override
	public void land() {
		// TODO Auto-generated method stub
		
	}
	//can running
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
	//can swimming
	@Override
	public void swim() {
		// TODO Auto-generated method stub
		
	}
	//print information of a tiger.
	@Override
	void printAnimal() {
		// TODO Auto-generated method stub
		super.printAnimal();
	}
}
