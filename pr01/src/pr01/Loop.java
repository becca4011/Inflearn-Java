package pr01;

import java.util.Scanner;

public class Loop 
{
	public static void main(String[] args) 
	{
		/* for�� */
		
		System.out.println("input number : ");
		Scanner scan1 = new Scanner(System.in);
		
		int inputNum1 = scan1.nextInt();
		
		for(int i = 1; i < 10; i++)
		{
			System.out.printf("%d * %d = %d \n", inputNum1, i, (inputNum1 * i));
		}
		
		
		/* while�� */
		
		System.out.println("input number : ");
		Scanner scan2 = new Scanner(System.in);
		
		int inputNum2 = scan2.nextInt();
		
		int j = 1;
		
		while(j < 10)
		{
			System.out.printf("%d * %d = %d \n", inputNum2, j, (inputNum2 * j));
			j++; // ���ϸ� ���ѹݺ�
		}
		
		
		/* do ~ while�� */
		
		do 
		{
			System.out.println("������ 1���� ����");
		}while(false); // ���ǽ����� �� �������� ���� ����
	}
}
