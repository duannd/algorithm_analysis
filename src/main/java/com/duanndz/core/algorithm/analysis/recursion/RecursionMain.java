package com.duanndz.core.algorithm.analysis.recursion;

import java.util.Arrays;

/**
 * @author ngdduan at 9/21/2017 8:07 AM
 */
public class RecursionMain {

	public static void main(String args[]) {
		long startTime = System.currentTimeMillis();
		//System.out.println("9! = " + factorial(9));

		/*int[] array = {2, 4, 6, 5, 1, 0, 9, 88, 92, 100, 12, 43, 566, 99, 22, 96, 13, 24, 15, 14, 24, 25, 26,
			100, 77, 78, 73, 11, 9, 18, 20, 19, 100, 9, 8, 16};
		Arrays.sort(array);
		System.out.println("99 is in array? " + binarySearch(array, 99, 0, array.length - 1));
		*/

		//System.out.println("acker(4,5) is: " + acker(4,5));

		System.out.println("Total Time(ms): " + (System.currentTimeMillis() - startTime));
	}

	private static int factorial(int n) throws IllegalArgumentException {
		if (n < 0)
			throw new IllegalArgumentException();
		else if (n == 0)
			return 1;
		else
			return n * factorial(n - 1);
	}

	private static int acker(int m, int n) throws IllegalArgumentException {
//		if (m < 0 && n < 0)
//			throw new IllegalArgumentException();
		if (m == 0)
			return n + 1;
		if (n == 0)
			return acker(m - 1, 1);

		return acker(m - 1, acker(m, n - 1));
	}

	private static boolean binarySearch(int[] data, int target, int low, int high) {
		if (low > high)
			return false;
		else {
			int mid = (low + high) / 2;
			if (target == data[mid])
				return true;
			else if (target < data[mid])
				return binarySearch(data, target, low, mid - 1);
			else
				return binarySearch(data, target, mid + 1, high);
		}
	}
}
