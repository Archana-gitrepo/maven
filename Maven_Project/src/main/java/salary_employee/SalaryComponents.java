package salary_employee;

public class SalaryComponents extends EmployeeDetails{
	public double hra;
    public double pf;

    public void calculateComponents() {
        hra = 0.05 * basicPay;
        pf = 0.20 * basicPay;
    }
}
