package stringPrograms;

public class StartsWithEndsWith {

	public static void main(String[] args) {
		String s = "Java Learning";
		System.out.println(s.startsWith("Ja"));
		
		String s2 = "JAva Learning";
		System.out.println(s2.startsWith("Ja"));
		
		String s3 = "JAVA LEARning";
		System.out.println(s3.endsWith("nG"));
        
		System.out.println(s3.endsWith("ng"));

	}

}
