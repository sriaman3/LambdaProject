package lambdaExp;

import java.util.function.Function;

public class FunctionalInterfaceConcept {

	public static void main(String[] args) {
		
		
		Function<String, Integer> func = x -> x.length();
		
		int len = func.apply("This is me");
		
		System.out.println(len);
		
		
		
		//chaining function
		Function<Integer, Integer> func1 = x -> x*5;
		
		int result = func.andThen(func1).apply("String");
		
		System.out.println(result);
		
		
	}

}
