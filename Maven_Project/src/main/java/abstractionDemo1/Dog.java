package abstractionDemo1;

public class Dog extends Animal {
	void eat()
	{
		System.out.println("eating");
	}

	public static void main(String[] args) {
		Dog d = new Dog();
		d.eat();
		
		//we can also invoke using Upcasting
		Animal a = new Dog();
		a.eat();
	}

}
