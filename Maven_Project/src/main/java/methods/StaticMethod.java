package methods;

public class StaticMethod {

	static String n="Ammu";
	static int a=22;
	
	public static void personalDetails(String name, int age)
	{
		n=name;
		a=age;
	}
	
	public static void getDetails()
	{
		System.out.println("Name is "+n);
		System.out.println("Age is "+a);
	}
	
	public static void main(String[] args) {
		getDetails();
		personalDetails("Appu", 44);
	}

}
