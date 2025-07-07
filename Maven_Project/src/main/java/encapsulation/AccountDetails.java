package encapsulation;

public class AccountDetails {
	 private String accName;
	 private int balance;
	 
	 public void setData(String accName, int balance)
	 {
		 this.accName=accName;
		 this.balance=balance;
	 }
	 
	 public void getData()
	 {
		// System.out.println("Account Name is "+accName);
		 System.out.println("Balnace is "+balance);
	 }
}
