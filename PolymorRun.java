interface Card
{
	public void Makepayment();
}
class CreditCard implements Card
{
	public void Makepayment()
	{
		System.out.println("payment by CreditCard ");
	}
}
class DebitCard implements Card
{
	public void Makepayment()
	{
		System.out.println("payment by debit card ");
	}
}
class SwpieMachine
{
	public static void SwipeCard(Card cd)
	{
		cd.Makepayment();
	}

}
class PolymorRun
{
	public static void main(String[] args) 
	{
		CreditCard c1 = new CreditCard();
		SwpieMachine.SwipeCard(c1);
		DebitCard d1 = new DebitCard();
		SwpieMachine.SwipeCard(d1);

		
	}
}