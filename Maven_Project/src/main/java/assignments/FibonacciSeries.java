package assignments;

public class FibonacciSeries {

	public static void main(String[] args) {
		int first = 0, second = 1;
		System.out.print("Fibonacci Series: ");

		for(int i=0;i<6;i++)
		{
			System.out.print(first + " ");

            int next = first + second;
            first = second;
            second = next;
		}

	}

}
