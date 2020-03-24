package pr01;

public class Character 
{
	public static void main(String[] args) 
	{
		/* 특수 문자 */
		
		System.out.println("Good\tMorning! \n");     // 탭
		System.out.println("Good\nMorning! \n");     // 줄바꿈(엔터)
		System.out.println("\'Good Morning!\' \n");  // ''
		System.out.println("\"Good Morning!\" \n");  // ""
		System.out.println("Good\\Morning! \n");        // \
		
		
		/* 서식 문자 */
		
		System.out.printf("오늘의 기온은 %d도 입니다. \n", 10);
		
		// 정수(%d)
		int num1 = 20;
		System.out.println("오늘의 기온은" + num1 + "도 입니다.");
		System.out.printf("오늘의 기온은 %d도 입니다. \n", num1);
		
		// 10진수, 8진수, 16진수(%d, %o, %x)
		int num2 = 30;
		System.out.printf("num2 (10진수) : %d \n", num2);
		System.out.printf("num2 (8진수) : %o \n", num2);
		System.out.printf("num2 (16진수) : %x \n", num2);
		
		// 문자(%c)
		System.out.printf("소문자 \'%c\'의 대문자는 \'%c\'입니다. \n", 'a', 'A');
		
		// 문자열(%s)
		System.out.printf("소문자 \"%s\"를 대문자로 바꾸면 \"%s\"입니다. \n", "java", "JAVA");
		
		// 실수(%f)
		double d = 1.2345d;
		System.out.printf("d = %f \n\n", d);
		
		
		/* 서식 문자 정렬 */
		
		System.out.printf("%5d \n", 123);
		System.out.printf("%5d \n", 1234);
		System.out.printf("%5d \n\n", 12345);
		
		System.out.printf("%f \n", 1.23);
		System.out.printf("%.0f \n", 1.23);
		System.out.printf("%.1f \n", 1.23);
		System.out.printf("%.2f \n", 1.23);
		System.out.printf("%.3f \n", 1.23);
	}
}
