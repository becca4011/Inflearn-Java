package thiskeyword;

public class ObjectClass 
{
	/* this */
	
	public int x;
	public int y;
	
	public ObjectClass(int x, int y)
	{
		this.x = x; // x(��������) = x(��������)
		this.y = y;
	}
	
	public void getInfo()
	{
		System.out.println("x ---> " + x);
		System.out.println("y ---> " + y);
	}
}
