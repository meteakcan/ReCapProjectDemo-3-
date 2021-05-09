
public class InstructorManager extends UserManager {

	public void getUser(Instructor instructor)
	{
		System.out.println("Öðretmen adý : " + instructor.getFirstName() + " " + instructor.getLastName());
		System.out.println("Programlama dili : " + instructor.getProgramming_Lang());
		System.out.println("Ders tarihi : " + instructor.getCourse_Time());
	}
}
