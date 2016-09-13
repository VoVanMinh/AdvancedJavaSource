package task2;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * @author vovanminh
 * @version 1.0
 * @created Sep 13, 2016
 * @Using thread to calculate sum of array
 */
public class SumOfArrayThread {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.println("Input lenght of array: ");
		try {
			int n = input.nextInt();
			int[] arr = new int[n];

			Random random = new Random();
			for (int i = 0; i < arr.length; i++) {
				arr[i] = random.nextInt(10);
			}

			System.out.println("Input num of Threads: ");
			int numThreads = input.nextInt();
			
			long t1 = System.currentTimeMillis();
			int sum = sum(arr, numThreads);
			long t2 = System.currentTimeMillis();
			
			System.out.println("Array: " + Arrays.toString(arr));
			System.out.println("Time: " + (t2 - t1));
			System.out.println("Sum: " + sum);

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
	private static int sum(int[] arr, int numThreads) throws InterruptedException {
		int leng = arr.length;
		int sum = 0;

		// Create and start numThreads
		SumThread[] ts = new SumThread[numThreads];
		for (int i = 0; i < numThreads; i++) {
			ts[i] = new SumThread((i * leng) / numThreads, (i + 1) * leng / numThreads, arr);
			ts[i].start();
		}

		// Wait for the threads to finish and sum their results.
		for (int i = 0; i < numThreads; i++) {
			ts[i].join();
			sum += ts[i].getSum();
		}
		return sum;
	}
}
