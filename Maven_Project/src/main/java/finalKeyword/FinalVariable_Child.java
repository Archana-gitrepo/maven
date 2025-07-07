package finalKeyword;

//public class FinalVariable_Child extends FinalVariable_Parent //extend not possible for final class
public class FinalVariable_Child extends FinalVariable_Parent{

	public void display()
	{
		//a=18;// final variable can't be changed
		b=42;
		System.out.println("Value of a: "+a+" and value of b: "+b);
	}
	
	//public void FinalSample() // can't override final method
	public void FinalSample(int a)
	{
		System.out.println("Final Sample Child Method");
	}
	
	public static void main(String[] args) {
		FinalVariable_Child f = new FinalVariable_Child();
		f.display();
	}
}
