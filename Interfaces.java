interface User
{
	public void login();
	public void logout();
}
class Customer implements User
{
	public void login()
	{
		System.out.println("Customer loggedin ");
	}
	public void logout()
	{
		System.out.println("customer logged out ");
	}
}
class Admin implements User
{
	public void login()
	{
		System.out.println("Admin loggedin ");
	}
	public void logout()
	{
		System.out.println("Admin logged out ");
	}
}
class Interfaces
{
	public static void main(String[] args) 
	{
		Customer c1 = new Customer();
		c1.login();
		c1.logout();
		System.out.println("----------------");

		Admin a1 = new Admin();
		a1.login();
		a1.logout();
		
	}
}