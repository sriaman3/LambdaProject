package jdk8.stream;

import java.util.Arrays;
import java.util.List;

public class StreamFilterFindAnyOrElse {

	public static void main(String[] args) {
		
		
		List<Customer> list = Arrays.asList(
				new Customer("Aman",33),
				new Customer("Arpit", 29),
				new Customer("Mahit", 3)
				);
		
		Customer name = list.stream().filter(x -> "Mahit".equals(x.getName())).findAny().orElse(null);
		
		System.out.println(name.getName()+ " " + name.getAge());
		
		//Filter with multiple conditions
		Customer names = list.stream().filter(x -> "Aman".equals(x.getName()) && 33==x.getAge()).findAny().orElse(null);
		
		System.out.println(names.getName()+ " " + names.getAge());
		
	}

}
