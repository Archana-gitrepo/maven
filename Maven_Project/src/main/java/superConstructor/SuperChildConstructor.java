package superConstructor;

public class SuperChildConstructor extends SuperParentConstructor{

	public SuperChildConstructor()
	{
		super(2,5);
		System.out.println("Child Default Constructor");
	}
	
	
	public static void main(String[] args) {
		SuperChildConstructor obj = new SuperChildConstructor();
		
	}

}
