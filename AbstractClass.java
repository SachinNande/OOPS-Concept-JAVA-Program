abstract class Money
{
	public void CreateAccount()
	{
		System.out.println("account Created ");

	}
	abstract public void Withdraw();
	abstract public void Deposit();
} 
class Saving extends Money
{
	public void Withdraw()
	{
		System.out.println("Withdraw from Saving");
	}
	public void Deposit()
	{
		System.out.println("Deposit in Saving");
	}
}
class FD extends Money
{
	public void Withdraw()
	{
		System.out.println("Withdraw from FD");
	}
	public void Deposit()
	{
		System.out.println("Deposit in FD");
	}
}
class AbstractClass
{
	public static void main(String[] args) 
	{
		Saving s1 =  new Saving();
		s1.CreateAccount();
		s1.Withdraw();
		s1.Deposit();
		System.out.println("---------------------------");
		FD f1 = new FD();
		f1.CreateAccount();
		f1.Withdraw();
		f1.Deposit();
		
	}
}