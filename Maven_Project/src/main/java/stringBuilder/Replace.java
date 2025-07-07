package stringBuilder;

public class Replace {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("Testing Programs");
		System.out.println(sb.replace(0, 1, "nothing T"));
		
		System.out.println(sb);

	}

}
