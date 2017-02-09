package com.learn.ds.util;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class DsUtil {

	public static Integer[] getTestArray(int size) {
		List<Integer> values = IntStream.rangeClosed(1, size).boxed().collect(Collectors.toList());
		Collections.shuffle(values);
		return values.toArray(new Integer[values.size()]);
	}

	public static long getTimeElapsed(LocalDateTime startTime, LocalDateTime endTime) {
		return ChronoUnit.MILLIS.between(startTime, endTime);
	}

	public static void printArray(Object[] array) {
		System.out.println(Arrays.toString(array));
	}
}
