package stringPrograms;

public class Equals {

	public static void main(String[] args) {
		String s = "Java";
		String s2 = "JAVA";
		String s3 = "Java";
		
		System.out.println(s.equals(s3));
		System.out.println(s.equals(s2));
		
		System.out.println(s.equals("archana"));
		System.out.println(s.equals(null));

	}

}
