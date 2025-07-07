package assignments;

public class Sum_ElementsOfArray {

	public static void main(String[] args) {
		int[] numbers = {5, 12, 27, 33, 49};
        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }

        System.out.println("Sum of elements in array: " + sum);

	}

}
