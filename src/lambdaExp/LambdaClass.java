package lambdaExp;

public class LambdaClass {

	public static void main(String[] args) {
		
		LambdaExp exp = (value) -> {System.out.println("Hi" +" " + value);};
		
		
		exp.test("google");

	}

}
