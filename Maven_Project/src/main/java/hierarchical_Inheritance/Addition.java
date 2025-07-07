package hierarchical_Inheritance;

public class Addition extends Calculator{

	public void sum()
	{
		int sum=a+b;
		System.out.println("Sum is : "+sum);
	}
	public static void main(String[] args) {
		Addition add = new Addition();
		add.calculator();
		add.sum();

	}

}
