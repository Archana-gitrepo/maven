package iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Iterator_List {

	public static void main(String[] args) {
		List <String> l = new ArrayList <String> ();
		l.add("Red");
		l.add("White");
		l.add("Green");
		l.add("Black");
		System.out.println(l);
		
		Iterator <String> i = l.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		
		i.remove();
		System.out.println(l);
		
	}

}
