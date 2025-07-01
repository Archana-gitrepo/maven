package collection;

import java.util.LinkedHashSet;
import java.util.Set;

public class SetMethods {

	public static void main(String[] args) {
		Set <String> s1 = new LinkedHashSet <String> ();
		Set <String> s2 = new LinkedHashSet <String> ();
		
		s1.add("Red");
		s1.add("Yellow");
		s1.add("Blue");
		System.out.println(s1);
		
		s2.add("Apple");
		s2.add("Grapes");
		s2.add("Orange");
		System.out.println(s2);
		
		s1.addAll(s2);
		System.out.println(s1);
		
		System.out.println(s1.contains("Red"));
		System.out.println(s1.contains("Orange"));
		System.out.println(s2.contains("Apple"));
		System.out.println(s2.contains("Red"));
		
		System.out.println(s1.containsAll(s2));
		System.out.println(s2.containsAll(s1));
		
		s1.remove("Orange");
		System.out.println(s1);
		
		s1.removeAll(s2);
		System.out.println(s1);
		
		s2.removeAll(s1);
		System.out.println(s2);
		
		System.out.println(s1.size());
		System.out.println(s2.size());
		
		System.out.println(s1.isEmpty());
		System.out.println(s2.isEmpty());
		
		s1.clear();
		System.out.println(s1);

	}

}
