package destructor;

public class MainClass 
{
	public static void main(String[] args) 
	{
		ObjectClass obj1;
		
		obj1 = new ObjectClass(); // 먼저 선언한 객체와의 연결을 끊음
		obj1 = new ObjectClass(); // 이 객체와 연결함
		
		System.gc(); // 시스템에게 GC를 실행시켜 달라고 함(바로 작동하는 것이 아닌, 가급적 빨리 작동하라고 하는 것)
	}
}
