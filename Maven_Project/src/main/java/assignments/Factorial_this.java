package assignments;

public class Factorial_this {

	int number;
    int result;

    public void factorial(int number) {
        this.number = number;
        result = 1;
        for (int i = 1; i <= number; i++) {
            result *= i;
        }
        factorialResult();
    }

    public void factorialResult() {
        System.out.println("Factorial of " + number + " is: " + result);
    }

    public static void main(String[] args) {
    	Factorial_this fc = new Factorial_this();
        fc.factorial(12);
    }
}
