package assignments;

public class ReverseNum{

	int num;
	
	public ReverseNum()
	{
		System.out.println("Finding reverse...");
	}
	
	public ReverseNum(int num) {
        this.num = num;
        int reverse = 0;
        while (num != 0) {
            int digit = num % 10;
            reverse = reverse * 10 + digit;
            num /= 10;
        }
       System.out.println("Reversed number: " + reverse);
    }
	public static void main(String[] args) {
		ReverseNum r = new ReverseNum();
		ReverseNum rev = new ReverseNum(459876);
	}

}
