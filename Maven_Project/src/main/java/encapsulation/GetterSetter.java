package encapsulation;

public class GetterSetter {
    
	private String name;
	private int age;
	
	public void setData(String name, int age)
	{
		this.name=name;
		this.age=age;
	}
	
	public void getData()
	{
		System.out.println("Name of Student is "+name);
		//System.out.println("Age is "+(age*2));
	}
}
