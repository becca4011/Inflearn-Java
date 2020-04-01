package pr01;

/*
	객체 : 세상에 존재하는 모든 것 / 프로그래밍에서 속성, 기능을 가지는 프로그램 단위

	클래스 : 객체를 생성하기 위한 틀, 모든 객체는 클래스로부터 생성 (붕어빵 틀, 와플 틀 같은 틀)
	     	 틀(클래스)은 달라지지 않고, 속성과 기능은 달라질 수 있다.

	클래스 구성 요소 : 속성(멤버 변수), 기능(매서드)
*/

public class OOP // 클래스 이름
{
	// 멤버 변수(속성)
	public String color;
	public String gear;
	public int price;
	
	public OOP() //생성자(클래스와 같은 이름, 가장 먼저 호출되는 곳)
	{
		System.out.println("Grandeur constructor"); // 필요한 내용이 없으면 비워놔도 상관 없음
	}
	
	// 매서드(기능)
	public void run() // 반환할 것이 없으면 void를 사용
	{
		System.out.println("-- run --");
	}
	
	public void stop()
	{
		System.out.println("-- stop --");
	}
}
