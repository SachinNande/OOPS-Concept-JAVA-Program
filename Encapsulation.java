class Account
{
	long actno = 123456789l;
	private double bal = 0.0;

	public double getBal()
	{
		return bal;
	}
	public void setBal(double bal)
	{
		this.bal = bal;
	}
}
class Transaction
{
	public void Deposit(int  amt, Account a1)
	{
		if(amt>0)
		{
			double b1 = a1.getBal();
			b1 = b1+amt;
			a1.setBal(b1);
		}
		else
		{
			System.out.println("invalid amount  ");
		}
	}
}
class Encapsulation
{
	public static void main(String[] args) 
	{
		Account a1 = new Account();
		Transaction tx = new Transaction();
		tx.Deposit(500,a1);
		
		
	}
}