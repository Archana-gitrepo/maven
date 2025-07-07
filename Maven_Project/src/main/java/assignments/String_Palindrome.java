package assignments;

public class String_Palindrome {

	public static void main(String[] args) {
		String s ="Malayalam";
		String original = s.toLowerCase();
		String pal = new StringBuilder(original).reverse().toString();
		
		if (pal.equals(original))
		{
			System.out.println("String is Palindrome");
		}
		else
		{
			System.out.println("String is not Plaindrome");
		}

	}

}
