package exception;

public class Throws {

	public static void division(int a, int b) throws Exception{
		if(b==0)
		{
		   throw new Exception("Divisible by zero is not possible");
		}
		else
		{
		   System.out.println(a/b);
		}
	}
	public static void main(String[] args) throws Exception {
		
		try
		{
			division(10, 0);
		}
		catch (Exception e) {
			System.out.println("Arithmetic Exception "+e);
		}

	}
}
