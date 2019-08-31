interface Run1
{
	public void display();
}
interface Run2 extends Run1
{
	public void count();
} 
class Sample implements Run1,Run2
{
	public void display()
	{
		System.out.println("display of Run1 interface");
	}
	public void count()
	{
		System.out.println("count of interface Run 2");
	}
}
class Interfaces1
{
	public static void main(String[] args) 
	{
		Sample s1 = new Sample();
		s1.display();
		s1.count();
		
	}
}