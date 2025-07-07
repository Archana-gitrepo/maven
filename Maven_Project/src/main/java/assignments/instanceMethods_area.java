package assignments;

public class instanceMethods_area {

	//Average of int
    public double average(int a, int b, int c) {
        return (a + b + c) / 3.0;
    }

    //Average of float
    public float average(float a, float b, float c) {
        return (a + b + c) / 3;
    }

    // Area of a circle
    public double area(float radius) {
        return Math.PI * radius * radius;
    }

    // Area of a rectangle
    public int area(int length, int breadth) {
    	return length * breadth;
    }

    // Area of a square
    public int area(int side) {
        return side * side;
    }
    
    public static void main(String[] args) {
    	instanceMethods_area calc = new instanceMethods_area();

        System.out.println("Average of integers: " + calc.average(10, 20, 30));
        System.out.println("Average of floats: " + calc.average(12.5f, 15.5f, 18.0f));

        // Area calculations
        System.out.println("Area of circle: " + calc.area(7.5f));
        System.out.println("Area of rectangle: " + calc.area(10, 6));
        System.out.println("Area of square: " + calc.area(5));
    }
}
