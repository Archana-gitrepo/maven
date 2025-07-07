package interfaceSample;

public class Interface_ChildDog implements Interface_ParentAnimal {

	public void eat()
	{
		System.out.println("Eating");
	}
	
	public void run()
	{
		System.out.println("Running");
	}
	
	public void sleep()
	{
		System.out.println("Sleeping");
	}
	
	public static void main(String[] args) {
		Interface_ChildDog d = new Interface_ChildDog();
		d.eat();
		d.run();
		d.sleep();

	}

}
