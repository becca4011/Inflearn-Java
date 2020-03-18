package pr01;

public class DataType 
{
	public static void main(String[] args) 
	{
		/* 기본 자료형 */
		
		char c = 'a'; // 문자형, 2byte(유니코드를 사용하기 때문에 2byte)
		System.out.println("char형 : " + c);
		
		int i = 10; // 정수형, 4byte
		System.out.println("int형 : " + i);
		
		double d = 10.258; // 실수형, 8byte
		System.out.println("double형 : " + d);
		
		boolean b = false; // 논리형(true/false), 1byte
		System.out.println("boolean형 : " + b);
		
		/* String str = new String()으로 써야하지만, String은 많이 쓰이기 때문에 바로 선언하고 초기화 가능 */
		
		String s = "Hello Java World!"; // 문자열형
		System.out.println("String형 : " + s);
		
		s = "Hello!!";
		System.out.println("String형 : " + s);
		
		
		/* 형 변환 */
		
		// 자동(묵시적) 형 변환
		// 작은 공간의 메모리 → 큰 공간의 메모리	
		
		byte bt = 10; // 작은 공간(1byte)
		int j = bt; // 큰 공간(4byte)		
		System.out.println("\n묵시적 형 변환 : " + j); // 문제 X
		
		// 명시적 형 변환
		// 큰 공간의 메모리 → 작은 공간의 메모리	
		
		int k = 100;
		byte by = (byte)k;
		System.out.println("명시적 형 변환 : " + by);
		
		k = 123456;
		by = (byte)k;
		System.out.println("명시적 형 변환 : " + by); // 데이터 누실 가능성 있음
		
		
	}
}
