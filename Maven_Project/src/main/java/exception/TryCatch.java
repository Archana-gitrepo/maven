package exception;

public class TryCatch {

	public static void main(String[] args) {
		try
		{
			String s = null;
			System.out.println(s.length());
			
			//System.out.println(10/0);
		}
		catch(NullPointerException n)
		{
			System.out.println("NullPointer Exception is "+n);
		}
		catch (ArrayIndexOutOfBoundsException a) {
			System.out.println("Array Exception "+a);
		}
		catch (Exception p) {
			System.out.println("Parent Exception "+p);
		}
	}

}
