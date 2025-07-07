package variables_DataTypes;

public class SwapTwoNumbers {

	public static void main(String[] args) {
		int a=5;
		int b=18;
		System.out.println("Before Swap Values:: "+a+" and "+b);
		
		int  temp=a;
		a=b;
		b=temp;
		System.out.println("After Swap Value:: "+a+" and "+b);

		
		//Swapping without temp
		int c=15;
		int d=69;
		System.out.println("Before Swap Values:: "+c+" and "+d);
		
		c=c+d;
		d=c-d;
		c=c-d;
		
		System.out.println("After Swap Values:: "+c+" and "+d);
	}

}
