class User
{
	public void login()
	{
		System.out.println("login()");
	}
	public void logout()
	{
		System.out.println("logout()");
	}
}
class Customer extends User
{

	public void PlaceOrder()
	{
		System.out.println("order placed ");
	}
}
class Seller extends User
{
	public void RecieveOrder()
	{
		System.out.println("order recieved ");
	}

}
class Hirer
{
	public static void main(String[] args) 
	{
		Customer c1 = new Customer();
		c1.login();
		c1.PlaceOrder();
		c1.logout();
		

		System.out.println("----------------------------");
		Seller s1 = new Seller();
		s1.login();
		s1.RecieveOrder();
		s1.logout();
				
	}
}