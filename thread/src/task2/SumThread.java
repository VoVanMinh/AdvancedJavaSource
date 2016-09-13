package task2;

/**
 * @author vovanminh
 * @version 1.0
 * @created Sep 13, 2016 This thread finds the sum of a subsection of an array.
 */
public class SumThread extends Thread {
	private int low, high;
	private int[] arr;
	private int sum = 0;

	public SumThread(int low, int high, int[] arr) {
		super();
		this.low = low;
		this.high = high;
		this.arr = arr;
	}

	public int getLow() {
		return low;
	}

	public void setLow(int low) {
		this.low = low;
	}

	public int getHigh() {
		return high;
	}

	public void setHigh(int high) {
		this.high = high;
	}

	public int[] getArr() {
		return arr;
	}

	public void setArr(int[] arr) {
		this.arr = arr;
	}

	
	public int getSum() {
		return sum;
	}

	public void setSum(int sum) {
		this.sum = sum;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = low; i < high; i++) {
			this.sum += this.arr[i];
		}
	}
}
