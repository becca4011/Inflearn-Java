package constructor;

public class MainClass 
{
	public static void main(String[] args) 
	{
		//ObjectClass obj1 = new ObjectClass(); // 디폴트 생성자 호출
		
		
		int[] iArr = {10, 20, 30};
		
		ObjectClass obj2 = new ObjectClass("Hello", iArr);
	}
}
