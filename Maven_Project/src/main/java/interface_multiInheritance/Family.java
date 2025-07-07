package interface_multiInheritance;

public class Family implements Father, Mother{

	public void father()
	{
		System.out.println("Acha");
	}
	
	public void mother()
	{
		System.out.println("Amma");
	}
	
	public static void main(String[] args) {
		Family f= new Family();
		f.father();
		f.mother();
	}

}
