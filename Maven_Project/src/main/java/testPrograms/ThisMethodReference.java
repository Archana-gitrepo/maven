package testPrograms;

public class ThisMethodReference {
    int a;
    int b;
    
    public void firstMethod()
    {
    	System.out.println("First Method");
    	this.secondMethod();
    }
    
    public void secondMethod()
    {
    	System.out.println("Second Method");
    }
	public static void main(String[] args) {
		ThisMethodReference obj = new ThisMethodReference();
		obj.firstMethod();
	}

}
