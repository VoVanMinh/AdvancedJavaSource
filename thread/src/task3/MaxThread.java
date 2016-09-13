package task3;

/**
 * @author vovanminh
 * @version 1.0
 * @created Sep 13, 2016
 */
public class MaxThread extends Thread{
	private int low, high;
	private int[] arr;
	private int max = 0;
	public MaxThread(int low, int high, int[] arr) {
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
	public int getMax() {
		return max;
	}
	public void setMax(int max) {
		this.max = max;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		this.max = arr[low];
		for (int i = low; i < high; i++) {
			if(arr[i] > max)
				this.max = arr[i];
		}
	}
}
