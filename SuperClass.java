class Find
{
	public Find()
	{
		System.out.println("this is find constructor ");
	}
}
class NewFind extends Find
{
	public NewFind( int x)
	{
		super();
		System.out.println("this subclass constructor :"+x);
	}
}
class NoFind extends NewFind
{
	public NoFind()
	{
		super(10);
		System.out.println("Nofind Constructor ");
	}
}
class SuperClass
{
	public static void main(String[] args) 
	{
		NoFind n1 = new NoFind();

		
	}
}