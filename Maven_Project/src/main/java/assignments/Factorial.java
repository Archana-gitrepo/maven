package assignments;

public class Factorial {

	public static int factorial(int num)
	{   
		int output=1;
		for(int i=1;i<=num;i++)
		{
			output*=i;
		}
		return output;
		
	}
	public static void main(String[] args) {
		int n=3;
		
		int fact=factorial(n);
		System.out.println("Factorial of "+n+" is "+fact);
		

	}

}
