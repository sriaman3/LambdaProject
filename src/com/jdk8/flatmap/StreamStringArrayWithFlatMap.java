package com.jdk8.flatmap;

import java.util.Arrays;
import java.util.stream.Stream;

public class StreamStringArrayWithFlatMap {

	public static void main(String[] args) {
		
		String data[][] = new String[][] {
			{"a","b"},
			{"c","d"}
			};
			
			
			Stream<String[]> dataStream = Arrays.stream(data);
			
			Stream<String> streamFilterMap = dataStream.flatMap(x-> Arrays.stream(x));
			
			Stream<String> dataStreamFilter = streamFilterMap.filter(x -> "a".equals(x.toString()));
			
			dataStreamFilter.forEach(System.out::println);
			
			
	}

}
