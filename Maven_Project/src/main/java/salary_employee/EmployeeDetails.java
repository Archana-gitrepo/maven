package salary_employee;

import java.util.Scanner;

public class EmployeeDetails {
	public double basicPay;
    public double deduction;
    public double bonus;

    public void getInput() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Basic Pay: ");
        basicPay = sc.nextDouble();

        System.out.print("Enter Deduction: ");
        deduction = sc.nextDouble();

        System.out.print("Enter Bonus: ");
        bonus = sc.nextDouble();
    }
}