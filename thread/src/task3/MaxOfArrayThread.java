package task3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * @author vovanminh
 * @version 1.0
 * @created Sep 13, 2016
 */
public class MaxOfArrayThread {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.println("Input lenght of array: ");
		try {
			int n = input.nextInt();
			int[] arr = new int[n];

			Random random = new Random();
			for (int i = 0; i < arr.length; i++) {
				arr[i] = random.nextInt(100);
			}

			System.out.println("Input num of Threads: ");
			int numThreads = input.nextInt();
			
			long t1 = System.currentTimeMillis();
			int max = findMax(arr, numThreads);
			long t2 = System.currentTimeMillis();
			
			System.out.println("Array: " + Arrays.toString(arr));
			System.out.println("Time: " + (t2 - t1));
			System.out.println("Max: " + max);

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

	/**
	 * @param arr
	 * @param numThreads
	 * @return sum of array
	 * @throws InterruptedException
	 */
	private static int findMax(int[] arr, int numThreads) throws InterruptedException {
		int leng = arr.length;

		// Create and start numThreads.
		MaxThread[] ts = new MaxThread[numThreads];
		for (int i = 0; i < numThreads; i++) {
			ts[i] = new MaxThread((i * leng) / numThreads, (i + 1) * leng / numThreads, arr);
			ts[i].start();
		}
		int max = ts[0].getMax();
		// Wait for the threads to finish and find max.
		for (int i = 0; i < numThreads; i++) {
			ts[i].join();
			if(ts[i].getMax() > max)
				max = ts[i].getMax();
		}
		return max;
	}
}
