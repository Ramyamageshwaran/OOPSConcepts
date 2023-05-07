package org.student;

import org.department.Department;

public class Student extends Department {
	
	public void studentName(String name)
	{
		System.out.println("Student Name :" +name);
	}
	
	public void studentDept(String Dept)
	{
		System.out.println("Student Name :" +Dept);
	}
	public void studentId(int Id)
	{
		System.out.println("Student Name :" +Id);
	}
	

	


	public static void main(String[] args) {
		Student stud=new Student();
		stud.collegeName("MOP Vaishnava");
		stud.collegeCode(568);
		stud.collegeRank(8d);
		stud.studentId(56823);
		stud.studentName("Ramya Mageshwaran");
		stud.studentDept("B.sc Comp Sci");
		stud.deptName("Computer Science");
	}

}
