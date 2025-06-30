package exception;

public class Throw {


	public static void main(String[] args){
		
		int a = 10;
		int b = 0;
		
		// no need to give try for throw, if throw passed, it will print in red color for the condition
		try
		{
			if(b==0)
			{
				throw new Exception("Divisible by zero is not possible");
			}
			else
			{
				System.out.println(a/b);
			}
		}
		catch (Exception e) {
			System.out.println("Exception occured");
		}
	
	}
}
