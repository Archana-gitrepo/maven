package interface_multiInheritance;

//interfaceA and interfaceB is calling with implements keyword and print using object creation 
public class FamilyClass implements Mother {

	public void father()
	{
		System.out.println("Acha");
	}
	
	public void mother()
	{
		System.out.println("Amma");
	}
	
	public static void main(String[] args) {
		FamilyClass f= new FamilyClass();
		f.father();
		f.mother();
	}

}
