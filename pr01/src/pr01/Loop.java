package pr01;

import java.util.Scanner;

public class Loop 
{
	public static void main(String[] args) 
	{
		/* for문 */
		
		System.out.println("input number : ");
		Scanner scan1 = new Scanner(System.in);
		
		int inputNum1 = scan1.nextInt();
		
		for(int i = 1; i < 10; i++)
		{
			System.out.printf("%d * %d = %d \n", inputNum1, i, (inputNum1 * i));
		}
		
		
		/* while문 */
		
		System.out.println("input number : ");
		Scanner scan2 = new Scanner(System.in);
		
		int inputNum2 = scan2.nextInt();
		
		int j = 1;
		
		while(j < 10)
		{
			System.out.printf("%d * %d = %d \n", inputNum2, j, (inputNum2 * j));
			j++; // 안하면 무한반복
		}
		
		
		/* do ~ while문 */
		
		do 
		{
			System.out.println("무조건 1번은 실행");
		}while(false); // 조건식으로 더 실행할지 말지 결정
	}
}
