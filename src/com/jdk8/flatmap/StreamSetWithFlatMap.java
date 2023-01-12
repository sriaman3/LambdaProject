package com.jdk8.flatmap;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamSetWithFlatMap {

	public static void main(String[] args) {
		
		Employee emp = new Employee();
		emp.setName("AMan");
		emp.addDevices("iphone8");
		emp.addDevices("Samsung");
		emp.addDevices("Nokia");
		
		Employee emp1 = new Employee();
		emp1.setName("Tom");
		emp1.addDevices("Lenovo");
		emp1.addDevices("Samsung");
		emp1.addDevices("iphone9");
		
		List<Employee> empList = new ArrayList<Employee>();
		empList.add(emp);
		empList.add(emp1);
		
		List<String> deviceList = empList.stream()
		.map(x -> x.getDevices()) //Stream<Set<String>>
		.flatMap(x -> x.stream())	//Stream<String>
		.distinct().collect(Collectors.toList());
		
		deviceList.forEach(x -> System.out.println(x));
	}

}
