class Sup
{
	public void count(int x)
	{
		for(int i=1;i<=x;i++)
		{
			System.out.println(i);
		}
	}
}
class Dup extends Sup
{
	public void test(int y)
	{
		for(int i=1;i<=y;i++)
		{
			System.out.println(i);
		}
	}
}
class Upcasting
{
	public static void main(String[] args) 
	{
		Sup s1 = new Dup();///upcasting 
		s1.count(3);
		Dup d1 = (Dup)s1;//Downcasting
		d1.test(3);
		
		
	}
}