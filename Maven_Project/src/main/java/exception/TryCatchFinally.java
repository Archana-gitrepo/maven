package exception;

public class TryCatchFinally {

	public static void main(String[] args) {
		System.out.println("Start");
		try
		{
			System.out.println(10/0);
		}
		catch (Exception e) {
			System.out.println("Exception is "+e);
		}
		finally {
			System.out.println("Finally");
		}
        System.out.println("End");
	}

}
