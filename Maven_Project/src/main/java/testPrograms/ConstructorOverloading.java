package testPrograms;

public class ConstructorOverloading {

	public ConstructorOverloading()
	{   
		this(2,6);
		System.out.println("Default Constructor");
	}
	public ConstructorOverloading(int a,int b)
	{
		this("String Value");
		float sum=a+b;
		System.out.println("Addition of two numbers: "+sum);
	}
	
	public ConstructorOverloading(String s)
	{
		System.out.println("Third Constructor is: "+s);

	}
	public static void main(String[] args) {
		ConstructorOverloading obj = new ConstructorOverloading();
		//ConstructorOverloading obj2 = new ConstructorOverloading(5,7);
		//ConstructorOverloading obj3 = new ConstructorOverloading("String Value");
	}

}

//only one this can be used in 1 constructor
//last called come first
