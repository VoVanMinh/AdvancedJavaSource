package thread;

/**
 * @author vovanminh
 * @version 1.0
 * @created Sep 13, 2016
 */
public class CounterMain {
	public static void main(String[] args) {
		try {

			long t1 = System.currentTimeMillis();
			for (int i = 0; i < 10; i++) {
				CounterThread ct = new CounterThread(i+1);
				ct.start();
				ct.join();
			}
			long t2 = System.currentTimeMillis();

			System.out.println("Count: " + CounterThread.count);
			System.out.println("Time: " +(t2 -t1));
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}
}