package salary_employee;

public class SalarySlip extends SalaryComponents{
	public double totalSalary;

    public void calculateTotalSalary() {
        totalSalary = basicPay + hra - pf - deduction + bonus;
    }

    public void displaySalarySlip() {
    	System.out.println("SALARY SLIP");
        System.out.printf("Basic Pay     : ₹%.2f%n", basicPay);
        System.out.printf("HRA (5%%)      : ₹%.2f%n", hra);
        System.out.printf("PF (20%%)      : ₹%.2f%n", pf);
        System.out.printf("Deduction     : ₹%.2f%n", deduction);
        System.out.printf("Bonus         : ₹%.2f%n", bonus);
        System.out.printf("Net Salary    : ₹%.2f%n", totalSalary);
    }

public static void main (String[]args)
{
	SalarySlip emp = new SalarySlip();

    emp.getInput();               // From EmployeeInput
    emp.calculateComponents();    // From SalaryComponents
    emp.calculateTotalSalary();   // From SalarySlip
    emp.displaySalarySlip();   
}}
