package lambdaExp;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class LambdaExpressionAndMethodRef {

	public static void main(String[] args) {
		
		
		List<String> list = Arrays.asList("Aman","Arpit","Mahit");
		
		//Method Reference
		list.forEach(System.out::println);
		
		//Lambda Exp
		
		list.forEach(str -> System.out.println(str));
		
		//with Anonymous class
		list.forEach(new Consumer<String>() {

			@Override
			public void accept(String t) {
			
				System.out.println(t);
				
			}
		});
		
	}

}
