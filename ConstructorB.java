package constructor;

public class ConstructorB {
	
	public static void main(String[] args) {
		ConstructorA obj1= new ConstructorA();
		obj1.rishu();
		System.out.println("\n");
		
		// parameterized constructors 
		ConstructorA obj2= new ConstructorA(2,"Ranjan","Kumar",160280043);
		obj2.rishu();
	}

}
