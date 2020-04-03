package oop;

public class Bicycle 
{
	public String color;
	public int price;
	
	public Bicycle() // 생성자 : 클래스에서 객체를 생성할 때 가장 먼저 호출됨
	{
		System.out.println("Bicycle constructor - 1");
	}
	
	public Bicycle(String c, int p)
	{
		System.out.println("Bicycle constructor - 2");
		
		color = c;
		price = p;
	}
	
	public void info()
	{
		System.out.println("-- info --");
		System.out.println("color : " + color);
		System.out.println("price : " + price);
	}
}
