package lambdaExp;

import java.util.ArrayList;
import java.util.List;
import java.util.function.UnaryOperator;

public class UnaryOperatorInterfaceConcept {

	public static void main(String[] args) {
		
		/*
		 * Represents an operation on a single operand that produces a result of the same type as its operand. 
		 * This is a specialization of Function for the case where the operand and result are of the same type.
		 * 
		 */
		
		UnaryOperator<Integer> func = (x1) -> x1*5;
		
		System.out.println(func.apply(10));
		
		List<String> list = new ArrayList<>();
		list.add("Java");
		list.add("Ruby");
		list.add(".Net");
		
		System.out.println(list);
		
		list.replaceAll(x -> x + " Aman");
		
		System.out.println(list);

	}

}
