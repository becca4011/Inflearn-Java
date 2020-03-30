package pr01;

import java.util.Scanner;

public class ConditionalStatement 
{
	public static void main(String[] args) 
	{
		int num1 = 10;
		int num2 = 20;
		
		/* if문 */
		
		// if
		if(num1 < num2)
		{
			System.out.println("num1은 num2보다 작다. \n");
		}
		
		// if, else
		if(num1 < num2)
		{
			System.out.println("num1은 num2보다 작다. \n");
		}
		else
		{
			System.out.println("num1은 num2보다 크거나 같다. \n");
		}
		
		// if, else if, else
		if(num1 < num2)
		{
			System.out.println("num1은 num2보다 작다. \n");
		}
		else if(num1 > num2)
		{
			System.out.println("num1은 num2보다 크다. \n");
		}
		else
		{
			System.out.println("num1과 num2는 같다. \n");
		}
		
		
		/* switch문 */
		
		System.out.println("점수 입력 : ");
		
		Scanner inputNum = new Scanner(System.in);
		
		int score = inputNum.nextInt();
		
		switch (score) 
		{
			case 100:
				System.out.println("score : 100");
				break;
				
			case 90:
				System.out.println("score : 90");
				break;
				
			case 80:
				System.out.println("score : 80");
				break;
	
			default:
				System.out.println("다시 실행");
				break;
		}
		
		inputNum.close();
	}
}
