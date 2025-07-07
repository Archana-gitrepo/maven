package aggregation_Student;

import aggregation_Mark.Mark;

public class Student  {
	
	int studId = 12;
	String studName = "Ammu";
	Mark m;
	Student(Mark m)
	{
		this.m=m;
	}
	
	public void studDisplay()
	{
		System.out.println("Student1 ID: "+studId);
		System.out.println("Student1 Name: "+studName);
		System.out.println("Mark: "+m.mark);
		System.out.println("Grade: "+m.grade);
	}
	
	public static  void main(String[]args)
	{
		Mark m=new Mark();
		Student n=new Student(m);
		n.studDisplay();
	}

}
