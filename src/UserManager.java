
public class UserManager {

	public void login(User user)
	{
		System.out.println("Baþarýyla giriþ yaptýn," + user.getFirstName() + "!");
	}
	public void logout(User user)
	{
		System.out.println("Çýkýþ yapýldý.");
	}
	public void register(User user)
	{
		System.out.println(user.getEmail() + " mail adresinize doðrulama þifresi gönderildi.");
	}
	
}
