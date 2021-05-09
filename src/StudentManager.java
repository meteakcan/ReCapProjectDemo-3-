
public class StudentManager extends UserManager {

	public void getUser(Student student)
	{
		System.out.println(student.getFirstName() + " " + student.getLastName() 
		+ " adl� ��rencinin email adresi " + student.getEmail() + " dir.");
		
		if(student.isProject_isCompleted() == true)
		{
			System.out.println("Bu ��renci �devini yapm��.");
		}
		else
		{
			System.out.println("Bu ��renci �devini yapmam��.");
		}
	}

}
