package forEach;

import java.util.ArrayList;
import java.util.List;

public class ForEach_List {

	public static void main(String[] args) {
		List <String> l = new ArrayList <String> ();
		
		//ArrayList <Integer> a = new ArrayList <Integer> (); //continues memory location
		
		l.add("Red");
		l.add("Green");
		l.add("Yellow");
		l.add("Blue");
		l.add("Black");
		
		System.out.println(l);

		
		for(String s : l)
		{
			System.out.println(s);
		}
	}

}
