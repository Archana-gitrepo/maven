package assignments;

public class Array {

	public static void main(String[] args) {
		int num[]= {1,2,3,4,5};
		int sum=0;
		
		for(int n:num)
		{
			sum+=n;
		}
		System.out.println("Sum of all elements in array is "+sum);
	}

}
