package stringBuffer;

public class Delete {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("Hello Java");
		System.out.println(sb.delete(0, 1));

		
		StringBuffer sb2 = new StringBuffer("Hello Java"); 
		System.out.println(sb2.delete(6, 9)); //6 to till 9 (9 not included)
		
		System.out.println(sb2);
	}

}
