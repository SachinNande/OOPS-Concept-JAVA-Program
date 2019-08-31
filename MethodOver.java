class Graphsheet
{
	public void draw()
	{
		System.out.println("draw at origin 0,0 ");
	}
	protected static void draw(int x,int y)
	{
		System.out.println("draw at x, y : "+x+" "+y);
	}
	public void draw(int x,double y)
	{
		System.out.println("draw ");
	}
	public int draw(int y)
	{
		System.out.println("dray at y");
		return y;

	}
}
class MethodOver
{
	public static void main(String[] args) 
	{
		Graphsheet g1 =new Graphsheet();
		Graphsheet.draw(2,3);
		g1.draw();
		g1.draw(1,2);
		g1.draw(1);

		
	}
}