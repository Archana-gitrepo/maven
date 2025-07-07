package testPrograms;

public class ThisMethodParam {
     
     public void Addition(int a,int b){
    	 int sum=a+b;
    	 System.out.println("Sum of two numbers is: " +sum);
    	 this.Subtration(12, 5.6f);
    	 this.Division(12, 4);
    	 this.Multiplication(12.3f, 34);
     }
     
     public void Subtration(int c,float d){
    	 float sub=c-d;
    	 System.out.println("Subratction of two numbers is: " +sub);
     }
     
     public void Multiplication(float f,int i){
    	 float mul=f*i;
    	 System.out.println("Multiplication of two numbers is: " +mul);
     }
     
     public void Division(int g,int h){
    	 int div=g/h;
    	 System.out.println("Division of two numbers is: " +div);
     }
	public static void main(String[] args) {
		ThisMethodParam obj = new ThisMethodParam();
				obj.Addition(10, 20);
//		obj.Subtration(15, 5.2f);
//		obj.Multiplication(2.3f, 5);
//		obj.Division(5, 7);
	}

}
