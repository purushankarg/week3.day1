package week3.day1;

public class Students {
	
	public void getStudentInfo(int id) 
	{
		System.out.println("Student ID is = "+ id);
	}
	public void getStudentInfo(int id, String name) 
	{
		System.out.println("Student ID is = "+ id);
		System.out.println("Student Name is = "+ name);
	}
	public void getStudentInfo(long phone,String email) 
	{
		System.out.println("Student Phone number is = "+ phone);
		System.out.println("Student email is = "+ email);
	}

	public static void main(String[] args) {
		
		Students stud = new Students();
		stud.getStudentInfo(14693);
		stud.getStudentInfo(8081, "MohanaPriya");
		stud.getStudentInfo(948627759, "xysha@gmail.com");
		

	}

}
