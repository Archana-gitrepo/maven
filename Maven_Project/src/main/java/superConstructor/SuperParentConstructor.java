package superConstructor;

public class SuperParentConstructor {

	public SuperParentConstructor()
	{
		System.out.println("Parent Default Constructor");
	}
	
	public SuperParentConstructor(int a,int b)
	{
		this();
		int sum=a+b;
		System.out.println("Sum of two numbers is : "+sum);
	}
}


//at a time only 1 default constructor can be used in 1 class.
//using this(), only 1 constructor can be called.
