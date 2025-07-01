package collection;

import java.util.ArrayList;
import java.util.List;

public class ListMethods {

	public static void main(String[] args) {
		List <String> l = new ArrayList<String>();
		l.add("Apple");
		l.add("Orange");
		l.add("Grapes");
		l.add("Papaya");
		
		System.out.println(l);
		System.out.println(l.get(1));
		
		l.set(0, "Banana");
		System.out.println(l);
		
		System.out.println(l.size());
		
		System.out.println(l.isEmpty());
		
		System.out.println(l.contains("Orange"));
		System.out.println(l.contains("Red"));
		
		l.remove(2);
		System.out.println(l);
		
		l.add("Orange");
		System.out.println(l);
		
		System.out.println(l.indexOf("Orange"));
		
		System.out.println(l.lastIndexOf("Orange"));

	}

}
