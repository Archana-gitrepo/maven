package polymorphism;

public class MathsChild extends MathsParent{
	
	public void problem(int a, int b)
	{
		int sub=b-a;
		System.out.println("Sub is "+sub);
	}
	
	public static void main(String[] args) {
		MathsParent m = new MathsChild();
		m.problem(12, 37);

	}

}
