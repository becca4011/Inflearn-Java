package constructor;

public class ObjectClass 
{
	/* 디폴트 생성자 */
	
	/*
	public ObjectClass() 
	{
		System.out.println("-- Object Class --");
	}
	*/
	
	// 생성자가 없을 때, 객체가 생성되지 않는 것이 아닌 컴파일 시점에 자동으로 디폴트 생성자가 생성된다.
	
	
	/* 사용자 정의 생성자 */
	
	public ObjectClass(String s, int[] iArr) 
	{
		System.out.println("-- Object Class --");
		
		System.out.println("s ------> " + s);
		System.out.println("iArr ---> " + iArr);
	}
}
