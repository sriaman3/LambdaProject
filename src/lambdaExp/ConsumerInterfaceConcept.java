package lambdaExp;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class ConsumerInterfaceConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/*
		 * Represents an operation that accepts a single input argument and returns no result. 
		 * Unlike most other functional interfaces, Consumer is expected to operate via side-effects.
		 * 
		 */
		
		Consumer<String> func = x -> System.out.println(x);
		func.accept("This is Aman");
		
		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		
		//list.forEach(x -> System.out.println(x));
		
		//list.forEach(x -> System.out.println(list.size()));
		
		List<Integer> max = list.stream().limit(5).collect(Collectors.toList());
		System.out.println(max);
	}

}
