package exception;

public class CustomException {

	public static void main(String[] args) throws VotingException{
		int age = 12;
		if(age>18)
		{
			System.out.println("Qualified");
		}
		else 
		{
			throw new VotingException("Age is under 18");
		}
		

	}

}
