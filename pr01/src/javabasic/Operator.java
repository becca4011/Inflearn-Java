package javabasic;

public class Operator 
{
	public static void main(String[] args) 
	{
		int x = 10;
		int y = 20;
		
		/* 대입 연산자 */
		
		System.out.println("x = " + x);
		System.out.println("y = " + y + "\n");
		
		
		/* 산술 연산자 */
		
		System.out.println("x + y = " + (x + y));
		System.out.println("x - y = " + (x - y));
		System.out.println("x * y = " + (x * y));
		System.out.println("x / y = " + (x / y));
		System.out.println("x % y = " + (x % y) + "\n");
		
		
		/* 복합 대입 연산자 */
		
		System.out.println("x += 10 : " + (x += 10)); // x + x
		System.out.println("x -= 10 : " + (x -= 10)); // x - x
		System.out.println("x *= 10 : " + (x *= 10)); // x * x
		System.out.println("x /= 10 : " + (x /= 10)); // x / x
		System.out.println("x %= 10 : " + (x %= 10) + "\n"); // x % x
		
		
		/* 관계 연산자 */
		
		x = 10;
		
		System.out.println("x > y : " + (x > y));
		System.out.println("x < y : " + (x < y));
		System.out.println("x >= y : " + (x >= y));
		System.out.println("x <= y : " + (x <= y));
		System.out.println("x == y : " + (x == y));
		System.out.println("x != y : " + (x != y) + "\n");
		
		
		/* 증감 연산자 */
		
		System.out.println("++x : " + (++x)); // 전위 연산자 : x의 값에 1을 더한(뺀) 후 콘솔창에 출력
		System.out.println("--x : " + (--x));
		System.out.println("x++ : " + (x++)); // 후위 연산자 : x의 값을 콘솔창에 출력한 후 1을 더함(뺌)
		System.out.println("x-- : " + (x--));
		System.out.println("x : " + x + "\n");
		
		
		/* 논리 연산자 */
		
		boolean b1 = false;
		boolean b2 = true;
		
		System.out.println("b1 && b2 : " + (b1 && b2)); // AND : b1과 b2가 모두 true 여야 true
		System.out.println("b1 || b2 : " + (b1 || b2)); // OR : b1나 b2 중 하나라도 true면 true
		System.out.println("!b1 : " + (!b1)); // NOT : b1의 상태를 부정
		System.out.println("!b2 : " + (!b2) + "\n"); //       b2의 상태를 부정
		
		
		/* 조건(삼항) 연산자 */
		
		int result = 0;
		
		// 조건식 ? 식1(조건식이 true일 때 result에 식1 대입) : 식2(조건식이 false일 때 result에 식1 대입)
		result = (x > y) ? 100 : 200;
		System.out.println("result : " + result);
		
		result = (x < y) ? 100 : 200;
		System.out.println("result : " + result);
		
		result = (x == y) ? 100 : 200;
		System.out.println("result : " + result + "\n");
		
		
		/* 비트 연산자 */
		
		x = 2; // 0000 0010
		y = 3; // 0000 0011
		
		System.out.println("x & y : " + (x & y)); // x와 y가 모두 1이면 1 (0000 0010)
		System.out.println("x | y : " + (x | y)); // x와 y중 하나라도 1이면 1 (0000 0011)
		System.out.println("x ^ y : " + (x ^ y)); // x와 y가 같지 않으면 1 (0000 0001)
	}
}
