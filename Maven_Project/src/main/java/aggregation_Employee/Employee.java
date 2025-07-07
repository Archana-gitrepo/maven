package aggregation_Employee;

import aggregation_Address.Address;

public class Employee{

		int empID;
		String empName;
		String empOrg;
		Address addr; //className is the dataType
		
		public Employee(int empID, String empName, String empOrg, Address addr)
		{
			this.empID = empID;
			this.empName = empName;
			this.empOrg = empOrg;
			this.addr = addr;
		}

		public void display()
		{
			System.out.println("Employee ID: "+empID);
			System.out.println("Employe Name:  "+empName);
			System.out.println("Employee Org:  "+empOrg);
			System.out.println("House No: "+addr.houseNo);
			System.out.println("House Name: "+addr.houseName);
			System.out.println("City: "+addr.city);
			System.out.println("State: "+addr.state);
		}
		
	public static void main(String[] args) {
		Address add = new Address(1, "House", "Kochi", "Kerala"); //first call entity reference class
		Employee emp = new Employee(2, "Achu", "Infy", add);
		
		Address add2 = new Address(2, "House2", "Kochi2", "Kerala2");
		Employee emp2 = new Employee(2, "Achu2", "Infy2", add2);
		
		emp.display();
		
		System.out.println();
		System.out.println();
		
		emp2.display();
	}

}


//first instance variables declare, create a method to display, if we need to pass parameters in object - create a constructor, then call main method by calling object.
