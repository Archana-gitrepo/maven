package accessModifiers;

public class AccessModifiersSample {
	int a=10;
	public int b=15;
	private int c=33;
	protected int d=56;
	
	public void publicMethod()
	{
		System.out.println("Public Method");
	}

	private void privateMethod()
	{
		System.out.println("Private Method");
	}
	
	protected void protectedMethod()
	{
		System.out.println("Protected Method");
	}
	void defaultMethod()
	{
		System.out.println("Default Method");
	}
	public static void main(String[] args) {
		AccessModifiersSample obj = new AccessModifiersSample();
		obj.publicMethod();
		obj.privateMethod();
		obj.protectedMethod();
		obj.defaultMethod();
		
		System.out.println(obj.a);
		System.out.println(obj.b);
		System.out.println(obj.c);
		System.out.println(obj.d);
	}

}
