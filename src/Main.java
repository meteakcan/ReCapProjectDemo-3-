
public class Main {

	public static void main(String[] args) {
		
		Student student1 = new Student();
		
		student1.setId(1);
		student1.setFirstName("Mete");
		student1.setLastName("Akcan");
		student1.setEmail("mete@gmail.com");
		student1.setProject_isCompleted(true);
		
		StudentManager studentManager = new StudentManager();
		
		studentManager.login(student1);

		studentManager.getUser(student1);
		
		studentManager.logout(student1);
		System.out.println("---------------------------------");
		Instructor instructor1 = new Instructor();
		
		instructor1.setId(10);
		instructor1.setFirstName("Engin");
		instructor1.setLastName("Demiroğ");
		instructor1.setProgramming_Lang("Java");
		instructor1.setCourse_Time("Çarşamba günü saat 20.00");
		
		InstructorManager instructorManager = new InstructorManager();
		
		instructorManager.login(instructor1);
		
		instructorManager.getUser(instructor1);
		
		instructorManager.logout(instructor1);
		
	}

}
