package method;

public class Overloading 
{
	public Overloading()
	{
		System.out.println("-- Overloading constructor --");
	}
	
	public void info()
	{
		System.out.println("-- info 1 --");
	}
	
	public void info(int x, int y)
	{
		System.out.println("-- info 2 --");
		System.out.printf("parameter - x : %d, y : %d", x, y);
	}
	
	public void info(String s1, String s2)
	{
		System.out.println("-- info 3 --");
		System.out.printf("parameter - s1 : %s, s2 : %s", s1, s2);
	}
}
