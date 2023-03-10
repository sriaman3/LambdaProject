package com.jdk8.flatmap;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamIntArrayWithFlatMap {

	public static void main(String[] args) {
		
		int data[] = {1,2,3,4,5};
		
		Stream<int[]> streamArray =  Stream.of(data);
		
		IntStream intStream= streamArray.flatMapToInt(x -> Arrays.stream(x));
		
		intStream.forEach(x -> System.out.println(x));
		
	}

}
