package lambdaExp;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class SupplierInterfaceConcept {

	public static void main(String[] args) {
		
		/*
		 * Represents a supplier of results.
		 * Its functional method is get().
		 * There is no requirement that a new or distinct result be returned each time the supplier is invoked.
		 * 
		 */
		
		getText(() -> Arrays.asList("Aman","Arpit"));
		

	}
	
	public static void getText(Supplier<List<String>> text) {
		
		System.out.println(text.get().size());
		
		System.out.println(text.get());
	}

}
