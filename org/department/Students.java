package org.department;

public class Students {
	
	public void getStudentInfo(int id)
	{
		System.out.println("Enter Student Id "+id);
	}
	public void getStudentInfo(int id,String name,String email,String phno)
	{
		System.out.println("Enter Student Id "+id);
		System.out.println("Enter Student Id "+name);
		System.out.println("Enter Student Id "+email);
		System.out.println("Enter Student Id "+phno);
		
	}
	
	public static void main(String[] args) {
		
		Students studs=new Students();
		studs.getStudentInfo(5682);
		studs.getStudentInfo(47,"Ramya","ramyahi@gmail.com","9940677285");
		

	}

}
