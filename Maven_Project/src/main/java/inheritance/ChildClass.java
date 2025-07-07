package inheritance;

public class ChildClass extends ParentClass {
    
	public void ChildMethod()
    {
    	System.out.println("Child Method");
    }
	public static void main(String[] args) {
		System.out.println("Child Class");
		ChildClass obj = new ChildClass();
		obj.ChildMethod();
		obj.parent(10,25);
		obj.parent2();
		obj.parent3();
	}

}
