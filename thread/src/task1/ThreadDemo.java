package task1;

/**
 * @author vovanminh
 * @version 1.0
 * @created Sep 13, 2016
 */
public class ThreadDemo extends Thread {
	private Thread thread;
	private String threadName;

	ThreadDemo(String name) {
		this.threadName = name;
		System.out.println("Creating " + threadName);
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Running " + threadName);
		try {
			for (int i = 3; i > 0; i--) {
				System.out.println("Thread: " + threadName + ", " + i);
				Thread.sleep(50);
			}
		} catch (InterruptedException e) {
			System.out.println("Thread " + threadName + " interrupted.");
		}
		System.out.println("Thread " + threadName + " exiting.");

	}

	@Override
	public synchronized void start() {
		System.out.println("Strating " + threadName);
		if (thread == null) {
			thread = new Thread(this, threadName);
			thread.start();
		}
	}
}
