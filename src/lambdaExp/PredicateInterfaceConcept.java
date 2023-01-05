package lambdaExp;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateInterfaceConcept {

	public static void main(String[] args) {
		
		/*
		 * Represents a predicate (boolean-valued function) of one argument.
		 * 
		 */
		
		Predicate<Integer> func = x -> x>5;
		
		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		
		List<Integer> li = list.stream().filter(func).collect(Collectors.toList());
		
		System.out.println(li);
		
		//Predicate with &&
		
		List<Integer> li1 = list.stream().filter(x -> x > 5 && x < 10).collect(Collectors.toList());
		
		System.out.println(li1);
		
		// Predicate with negate()
		
		List<String> namelist = Arrays.asList("Naveen","Nav","Na","Java","Momos");
		
		Predicate<String> func1 = x -> x.startsWith("Nav");
		
		List<String> li2 = namelist.stream().filter(func1.negate()).collect(Collectors.toList());
		
		System.out.println(li2);
		
	}

}
