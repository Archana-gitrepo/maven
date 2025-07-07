package superMethod;

public class ChildClass extends ParentClass {
	int a=97;
	public void childMethod()
	{
		super.parentMethod();
		super.parentMethod2();
		System.out.println("Child Method Value is : "+a);
	}
	public static void main(String[] args) {
		ChildClass obj = new ChildClass();
		obj.childMethod();
	}

}
