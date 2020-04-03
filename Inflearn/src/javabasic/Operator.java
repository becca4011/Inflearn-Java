package javabasic;

public class Operator 
{
	public static void main(String[] args) 
	{
		int x = 10;
		int y = 20;
		
		/* ���� ������ */
		
		System.out.println("x = " + x);
		System.out.println("y = " + y + "\n");
		
		
		/* ��� ������ */
		
		System.out.println("x + y = " + (x + y));
		System.out.println("x - y = " + (x - y));
		System.out.println("x * y = " + (x * y));
		System.out.println("x / y = " + (x / y));
		System.out.println("x % y = " + (x % y) + "\n");
		
		
		/* ���� ���� ������ */
		
		System.out.println("x += 10 : " + (x += 10)); // x + x
		System.out.println("x -= 10 : " + (x -= 10)); // x - x
		System.out.println("x *= 10 : " + (x *= 10)); // x * x
		System.out.println("x /= 10 : " + (x /= 10)); // x / x
		System.out.println("x %= 10 : " + (x %= 10) + "\n"); // x % x
		
		
		/* ���� ������ */
		
		x = 10;
		
		System.out.println("x > y : " + (x > y));
		System.out.println("x < y : " + (x < y));
		System.out.println("x >= y : " + (x >= y));
		System.out.println("x <= y : " + (x <= y));
		System.out.println("x == y : " + (x == y));
		System.out.println("x != y : " + (x != y) + "\n");
		
		
		/* ���� ������ */
		
		System.out.println("++x : " + (++x)); // ���� ������ : x�� ���� 1�� ����(��) �� �ܼ�â�� ���
		System.out.println("--x : " + (--x));
		System.out.println("x++ : " + (x++)); // ���� ������ : x�� ���� �ܼ�â�� ����� �� 1�� ����(��)
		System.out.println("x-- : " + (x--));
		System.out.println("x : " + x + "\n");
		
		
		/* �� ������ */
		
		boolean b1 = false;
		boolean b2 = true;
		
		System.out.println("b1 && b2 : " + (b1 && b2)); // AND : b1�� b2�� ��� true ���� true
		System.out.println("b1 || b2 : " + (b1 || b2)); // OR : b1�� b2 �� �ϳ��� true�� true
		System.out.println("!b1 : " + (!b1)); // NOT : b1�� ���¸� ����
		System.out.println("!b2 : " + (!b2) + "\n"); //       b2�� ���¸� ����
		
		
		/* ����(����) ������ */
		
		int result = 0;
		
		// ���ǽ� ? ��1(���ǽ��� true�� �� result�� ��1 ����) : ��2(���ǽ��� false�� �� result�� ��1 ����)
		result = (x > y) ? 100 : 200;
		System.out.println("result : " + result);
		
		result = (x < y) ? 100 : 200;
		System.out.println("result : " + result);
		
		result = (x == y) ? 100 : 200;
		System.out.println("result : " + result + "\n");
		
		
		/* ��Ʈ ������ */
		
		x = 2; // 0000 0010
		y = 3; // 0000 0011
		
		System.out.println("x & y : " + (x & y)); // x�� y�� ��� 1�̸� 1 (0000 0010)
		System.out.println("x | y : " + (x | y)); // x�� y�� �ϳ��� 1�̸� 1 (0000 0011)
		System.out.println("x ^ y : " + (x ^ y)); // x�� y�� ���� ������ 1 (0000 0001)
	}
}
