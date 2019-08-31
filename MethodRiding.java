class Whatsapp1
{
	public void Sentmsg()
	{
		System.out.println("show one black tick ");
	}

}
class Whatsapp2 extends Whatsapp1
{
	public void Sentmsg()
	{
		System.out.println("show to black tick ");
	}
} 
class Whatsapp3 extends Whatsapp2
{
	public void Sentmsg()
	{
		System.out.println("show two blue stick ");
	}
}
class MethodRiding
{
	public static void main(String[] args) 
	{
		Whatsapp3 v3 = new Whatsapp3();
		v3.Sentmsg();
		Whatsapp2 v2 = new Whatsapp2();
		v2.Sentmsg();
		Whatsapp1 v1 = new Whatsapp1();
		v1.Sentmsg();
		
	}
}