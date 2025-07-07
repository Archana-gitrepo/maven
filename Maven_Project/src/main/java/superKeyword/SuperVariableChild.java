package superKeyword;

public class SuperVariableChild extends SuperVariableParent{
       int a=17;
       public void superValue()
       {
    	   System.out.println("Child Value is : "+a);
    	   System.out.println("Super Value is : "+super.a);
       }
	public static void main(String[] args) {
		SuperVariableChild obj = new SuperVariableChild();
		//obj.initialValue();
		
		obj.superValue();

	}

}
