package polymorphism;

public class Dog extends Animal{

	public void eat()
	{
		System.out.println("Dog Bark and Eating");
	}
	public static void main(String[] args) {
		Animal a = new Dog(); //Upcasting
		a.eat();
	}

}
