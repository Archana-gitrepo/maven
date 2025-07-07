package inheritance;

public class Subtraction extends Addition {
    public void Subtraction()
    {
    	int sub=b-a;
    	System.out.println("Subtraction of two numbers is : "+sub);
    }
	public static void main(String[] args) {
		Subtraction obj = new Subtraction();
		obj.Subtraction();
		obj.sum();
	}

}
