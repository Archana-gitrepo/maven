package valueOf;

public class ValueOf {

	public static void main(String[] args) {
		String s = "Testing";
		int a = 10;
		int b = 25;
		
		System.out.println(a+b);
		
		String c = String.valueOf(a);
		System.out.println(c+b);

	}

}
