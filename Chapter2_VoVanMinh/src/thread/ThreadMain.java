package thread;


/**
 * @author vovanminh
 * @version 1.0
 * @created Sep 13, 2016
 */
public class ThreadMain {
	public static void main(String[] args) {
		ThreadDemo t1 = new ThreadDemo("Google");
		t1.start();
		
		ThreadDemo t2 = new ThreadDemo("Yahoo");
		t2.start();
		
		ThreadDemo t3 = new ThreadDemo("Facebook");
		t3.start();
	}
}
