package task4;

/**
 * @author vovanminh
 * @version 1.0
 * @created Sep 13, 2016
 */
public class CounterThread extends Thread {

	public static int count = 0;
	public int name;

	public CounterThread(int name) {
		super();
		this.name = name;
	}

	public static int getCount() {
		return count;
	}

	public static void setCount(int count) {
		CounterThread.count = count;
	}

	@Override
	public void run() {
		System.out.println("\tRunning " + name);
		for (int i = 0; i < 10; i++) {
			count++;
		}
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("\tFinish " + name);
	}
}
