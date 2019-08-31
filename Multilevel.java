class W1
{
	public void TextMsg()
	{
		System.out.println("send text msg");
	}
}
class W2 extends W1
{
	public void VoiceMsg()
	{
		System.out.println("send voice msg ");
	}
}
class W3 extends W2
{
	public void VideoCall()
	{
		System.out.println("make a VideoCall ");
	}
}
class Multilevel
{
	public static void main(String[] args) 
	{
		W3 v3 =new W3();
		v3.TextMsg();
		v3.VoiceMsg();
		v3.VideoCall();	
	}
}