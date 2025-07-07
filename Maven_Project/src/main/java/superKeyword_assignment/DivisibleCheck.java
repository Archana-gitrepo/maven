package superKeyword_assignment;

public class DivisibleCheck extends Addition{
	
	int div = super.sum;
			
    public void divisibleCheck()
    {
 	   System.out.println("Divisible Result is : "+(div%10));
 	   
    }
	public static void main(String[] args) {
		DivisibleCheck obj = new DivisibleCheck();
		obj.divisibleCheck();

	}

}
