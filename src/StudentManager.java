
public class StudentManager extends UserManager {

	public void getUser(Student student)
	{
		System.out.println(student.getFirstName() + " " + student.getLastName() 
		+ " adlý öðrencinin email adresi " + student.getEmail() + " dir.");
		
		if(student.isProject_isCompleted() == true)
		{
			System.out.println("Bu öðrenci ödevini yapmýþ.");
		}
		else
		{
			System.out.println("Bu öðrenci ödevini yapmamýþ.");
		}
	}

}
