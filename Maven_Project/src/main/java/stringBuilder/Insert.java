package stringBuilder;

public class Insert {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("HI");
		System.out.println(sb.insert(1, "Hello "));

		System.out.println(sb);
	}

}
