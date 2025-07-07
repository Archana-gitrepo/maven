package hierarchical_Inheritance;

public class Subtraction extends Calculator {

	public void sub()
	{
		int sub=b-a;
		System.out.println("Sub is : "+sub);
	}
	public static void main(String[] args) {
		Subtraction obj = new Subtraction();
		obj.sub();
	}

}
