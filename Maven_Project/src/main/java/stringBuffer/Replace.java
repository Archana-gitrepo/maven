package stringBuffer;

public class Replace {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("Hello");
		System.out.println(sb.replace(0, 5, "Hello Java"));
        
		System.out.println(sb.replace(0, 1, "Java H"));

		System.out.println(sb);
	}

}
