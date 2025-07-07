package multilevel_Inheritance;

public class Addition extends Calculator{
   public void sum()
   {
	   int sum=a+b;
	   System.out.println("Sum of two numbers is : "+sum);
   }
   
   public void sum1(float e, float f)
   {
	   float sum1=e+f;
	   System.out.println("Sum of two float numbers is : "+sum1);
   }
}
