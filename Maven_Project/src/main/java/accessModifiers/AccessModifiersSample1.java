package accessModifiers;

public class AccessModifiersSample1 extends AccessModifiersSample {

	public static void main(String[] args) {
		AccessModifiersSample1 obj = new AccessModifiersSample1();
		obj.publicMethod();
		obj.protectedMethod();
		obj.defaultMethod();
		
		System.out.println(obj.a);
		System.out.println(obj.b);
		System.out.println(obj.d);
	}

}
