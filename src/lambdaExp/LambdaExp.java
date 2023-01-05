package lambdaExp;


//SAM - Single Abstract Method i.e. called Functional Interface
@FunctionalInterface
public interface LambdaExp {
	
	void test(String value);
	
	public static void test1() {
		
	}
	
	default void display() {
		
	}

}
