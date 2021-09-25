package constructor;

public class ConstructorA {
	private int id;
	private String firstName;
	private String lastName ;
	private int rollnumber;

	//default constructor
	
	public ConstructorA() {
		this.id =102;
		this.firstName="Ranjan";
		this.lastName="Kumar";
		this.rollnumber=160280043;
		
	}
	//parameterized constructors
	
	public ConstructorA(int id,String firstName,String lastName,int rollnumber) {
		this.id = id;
		this.firstName=firstName;
		this.lastName=lastName;
		this.rollnumber=rollnumber;
		
		
	}
	
	public void rishu() {
		System.out.println("id:" + this.id);
		System.out.println("FirstName: " + this.firstName);
		System.out.println("Lastname: " + this.lastName);
		System.out.println("rollnumber: "+ this.rollnumber);
	
	}
	


}
