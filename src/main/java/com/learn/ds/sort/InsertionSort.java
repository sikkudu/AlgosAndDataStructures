package com.learn.ds.sort;

import static com.learn.ds.util.DsUtil.getTestArray;
import static com.learn.ds.util.DsUtil.getTimeElapsed;
import static com.learn.ds.util.DsUtil.printArray;

import java.time.LocalDateTime;

public class InsertionSort {

	public static final int ARRAY_SIZE = 500;

	public static void main(String[] args) {

		Integer[] array = getTestArray(ARRAY_SIZE);
		printArray(array);

		LocalDateTime startTime = LocalDateTime.now();
		InsertionSort.sort(array);
		LocalDateTime endTime = LocalDateTime.now();

		printArray(array);
		System.out.println("INSERTION SORT -> " + "Time Taken to sort Integer Array of size " + ARRAY_SIZE + " is "
				+ getTimeElapsed(startTime, endTime) + " milli secs.");

	}

	public static Integer[] sort(Integer[] array) {

		if (array == null)
			return null;

		if (array.length == 0 || array.length == 1)
			return array;

		int temp;

		for (int i = 1; i < array.length; i++) {
			for (int j = i; j > 0; j--) {
				if (array[j] < array[j - 1]) {
					temp = array[j - 1];
					array[j - 1] = array[j];
					array[j] = temp;
				} else {
					break;
				}
			}
		}

		return array;
	}

}
