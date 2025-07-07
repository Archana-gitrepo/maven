package interfaceSample;

public class CalculationsResult implements Calculations {

	@Override
	public void sum(int a, int b) {
		int sum = a+b;
		System.out.println("Sum is "+sum);
	}

	@Override
	public void sub(float c, float d) {
		float sub = c-d;
		System.out.println("Sub is "+sub);
	}

	@Override
	public void mul(int e, int f) {
		float mul = e*f;
		System.out.println("Mul is "+mul);
	}
	
	public static void main(String[] args) {
		CalculationsResult cal = new CalculationsResult();
		cal.sum(14, 18);
		cal.sub(45.25f, 23.89f);
		cal.mul(5, 7);
	}

}
