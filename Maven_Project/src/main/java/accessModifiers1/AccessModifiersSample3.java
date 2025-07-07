package accessModifiers1;

import accessModifiers.AccessModifiersSample;

public class AccessModifiersSample3  {

	public static void main(String[] args) {
		AccessModifiersSample obj = new AccessModifiersSample();
		obj.publicMethod();
		
		System.out.println(obj.b);
	}

}

//we need to call object of 1st class to get public method  - it is called Has A Relationship or Aggregation
//We need to import class as it is in different package

