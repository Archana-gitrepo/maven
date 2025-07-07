package multilevel_Inheritance;

public class Multiplication extends Subtraction{

	public void mul()
	{
		int mul=a*b;
		System.out.println("Multiplication of two numbers is : "+mul);
	}
	public static void main(String[] args) {
		Multiplication obj = new Multiplication();
		obj.calculator(10,20);
		obj.mul();
		obj.sub();
		obj.sum();
		
		obj.sum1(2.15f, 7.98f);
		
	}

}
