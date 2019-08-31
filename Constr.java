class Sample
{
	public Sample()
	{ 
		this(10);
		System.out.println("this is sample constructor ");
	}
	public Sample(int x)
	{
		this(10.0);
		System.out.println("this is integer constructor :");
	}
	public Sample(double y)
	{
		System.out.println("this is double : "+y);
	}
}
class Constr
{
	public static void main(String[] args) 
	{
		Sample s1 = new Sample();
		
	}


}