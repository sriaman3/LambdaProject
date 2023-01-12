package jdk8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsFilterCollect {

	public static void main(String[] args) {
		
		
		List<String> list = Arrays.asList("Mcbook","Apple","Ipad","Iphone");
		
		List<String> li = list.stream().filter(x ->!x.equals("Apple")).collect(Collectors.toList());
		
		li.forEach(ele -> System.out.println(ele));
		
		
	}

}
