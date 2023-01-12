package jdk8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamFilterMap {

	public static void main(String[] args) {
		
		
		List<Customer> list = Arrays.asList(
				new Customer("Aman",33),
				new Customer("Arpit", 29),
				new Customer("Mahit", 3)
				);
		
		String name = list.stream().filter(x -> "Mahit".equals(x.getName())).map(Customer::getName).findAny().orElse(null);
		
		System.out.println(name);
		
		//Print all the name from the list
		List<String> lst = list.stream().map(Customer::getName).collect(Collectors.toList());
		
		lst.forEach(System.out::println);
	}

}
