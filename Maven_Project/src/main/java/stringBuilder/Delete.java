package stringBuilder;

public class Delete {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("Testing Java Programs");
		System.out.println(sb.delete(7, 12));
		
		System.out.println(sb);

	}

}
