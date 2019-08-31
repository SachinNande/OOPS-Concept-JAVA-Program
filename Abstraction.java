interface User
{
	public void login();
	public void logout();
}
class Customer implements User
{
	@Override
	public void login()
	{
		System.out.println("Customer loggedin ");
	}
	@Override
	public void logout()
	{
		System.out.println("customer logged out ");
	}
}
class Admin implements User
{
	@Override
	public void login()
	{
		System.out.println("Admin loggedin ");
	}
	@Override
	public void logout()
	{
		System.out.println("Admin logged out ");
	}
}
class SignUp
{
	public static User CreateUser(char type)
	{
		User u1;
		if(type=='C')
		{
			u1 = new Customer();
			return u1;
		}
		else
		{
			u1 = new Admin();
			return u1;
		}
	}
}
class Abstraction
{
	public static void main(String[] args) 
	{

		User ref = SignUp.CreateUser('C');
	}
}