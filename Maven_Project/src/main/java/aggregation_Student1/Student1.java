package aggregation_Student1;

import aggregation_Address1.Address1;

public class Student1{
	public int studId=4;
	public String studName = "Ammu";
	Address1 addr;
	
	Student1(Address1 addr)
	{
		this.addr=addr;
	}
	
	public void display()
	{
		System.out.println("StudentID: "+studId);
		System.out.println("StudentName: "+studName);
		System.out.println("HouseNo: "+addr.houseNo);
		System.out.println("HouseName: "+addr.houseName);
		System.out.println("City: "+addr.city);
		System.out.println("State: "+addr.state);
	}
	public static void main(String[] args) {
		Address1 addr = new Address1();
		Student1 stud = new Student1(addr);
		stud.display();

	}

}
