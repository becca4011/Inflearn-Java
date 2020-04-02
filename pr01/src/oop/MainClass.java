package oop;

public class MainClass 
{
	public static void main(String[] args) 
	{
		Grandeur myCar1 = new Grandeur(); // new를 사용하여 객체 생성
		
		myCar1.color = "red";
		myCar1.gear = "auto";
		myCar1.price = 30000000;
		
		myCar1.run();
		myCar1.stop();
		myCar1.info();
		
		System.out.println();
		
		Grandeur myCar2 = new Grandeur();
		
		myCar2.color = "blue";
		myCar2.gear = "manual";
		myCar2.price = 25000000;
		
		myCar2.run();
		myCar2.stop();
		myCar2.info();
		
		System.out.println();
		
		Bicycle myBicycle1 = new Bicycle();
		
		myBicycle1.color = "black";
		myBicycle1.price = 150000;
		myBicycle1.info();
		
		System.out.println();
		
		Bicycle myBicycle2 = new Bicycle("green", 100000);
		
		myBicycle2.info();
	}
}
