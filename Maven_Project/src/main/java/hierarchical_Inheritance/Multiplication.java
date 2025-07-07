package hierarchical_Inheritance;

public class Multiplication extends Calculator{
	public void mul()
	{
		int mul=a*b;
		System.out.println("Multiplication is : "+mul);
	}
	public static void main(String[] args) {
		Multiplication obj = new Multiplication();
		obj.mul();
	}

}
