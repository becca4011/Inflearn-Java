package object;

public class MainClass 
{
	public static void main(String[] args) 
	{
		// 클래스로부터 생성된 객체는 모두 다른 공간에 존재
		ObjectClass obj1 = new ObjectClass();
		ObjectClass obj2 = new ObjectClass();
		ObjectClass obj3 = new ObjectClass();
		
		System.out.println("obj1 : " + obj1);
		System.out.println("obj2 : " + obj2);
		System.out.println("obj3 : " + obj3 + "\n");
		
		// 자료형은 같아도 다른 공간에 존재하는 객체는 다른 객체
		if(obj1 == obj2)
		{
			System.out.println("obj1 == obj2");
		}
		else
		{
			System.out.println("obj1 != obj2");
		}
		
		if(obj2 == obj3)
		{
			System.out.println("obj2 == obj3");
		}
		else
		{
			System.out.println("obj2 != obj3");
		}
		
		if(obj1 == obj3)
		{
			System.out.println("obj1 == obj3");
		}
		else
		{
			System.out.println("obj1 != obj3 \n");
		}
		
		// 레퍼런스에 null이 저장되면 객체와의 연결이 끊김, 이 객체는 이용 불가능
		System.out.println("obj1 : " + obj1);
		obj1.getInfo();
		
		obj1 = null; // 레퍼런스(연결) 끊김		
		System.out.println("obj1 : " + obj1);
		// obj1.getInfo(); 오류 발생(연결 끊긴 객체를 호출, 접근하는 것은 불가능)
		// new를 이용하여 obj1을 다시 연결할 수 있음(이미 끊어진 객체를 연결하는 것은 아님)
	}
}
