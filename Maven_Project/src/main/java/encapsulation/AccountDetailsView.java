package encapsulation;

public class AccountDetailsView {

	public static void main(String[] args) {
		AccountDetails acc = new AccountDetails(); //creating parent class object
		acc.setData("Appu", 2000);
		acc.getData();

	}

}
