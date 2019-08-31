class Mouse extends Object
{
	public void Scroll()
	{
		System.out.println("scroll with Mouse");
	}
	public void Click()
	{
		System.out.println("click with Mouse ");
	}
}
class PD extends Object
{
	public void Read()
	{
		System.out.println("Read PD");
	}
	public void Write()
	{
		System.out.println("Write PD");
	}
}
class USBPort
{
	public static void ConnectDevice(Object obj)
	{
		if(obj instanceof Mouse)
		{
			Mouse ms = (Mouse)obj;
			ms.Click();
			ms.Scroll();
		}
		else
		{
			PD p1 = (PD)obj;
			p1.Read();
			p1.Write();
		}
	}

}
class Downcasting
{
	public static void main(String[] args) 
	{
		Mouse m1 = new Mouse();
		USBPort.ConnectDevice(m1);
		System.out.println("--------------------------");
		PD pd1 = new PD();
		USBPort.ConnectDevice(pd1);
		
	}
}