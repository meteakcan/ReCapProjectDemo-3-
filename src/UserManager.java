
public class UserManager {

	public void login(User user)
	{
		System.out.println("Ba�ar�yla giri� yapt�n," + user.getFirstName() + "!");
	}
	public void logout(User user)
	{
		System.out.println("��k�� yap�ld�.");
	}
	public void register(User user)
	{
		System.out.println(user.getEmail() + " mail adresinize do�rulama �ifresi g�nderildi.");
	}
	
}
