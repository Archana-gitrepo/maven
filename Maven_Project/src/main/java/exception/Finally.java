package exception;

public class Finally {

	public static void main(String[] args) {
		System.out.println("Program Starting");
		try
		{
			System.out.println(10/0);
		}
        finally {
			System.out.println("Finally");
		}
		System.out.println("Program Ending");
	}

}
