package accessModifiers1;

import accessModifiers.AccessModifiersSample;

public class AccessModifiersSample2 extends AccessModifiersSample{

	public static void main(String[] args) {
		AccessModifiersSample2 obj = new AccessModifiersSample2();
		obj.protectedMethod();
		obj.publicMethod();
		
		System.out.println(obj.b);
		System.out.println(obj.d);
	}

}

//We need to import class as it is in different package
