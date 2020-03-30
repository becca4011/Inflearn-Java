package pr01;

import java.util.Scanner;

public class ConditionalStatement 
{
	public static void main(String[] args) 
	{
		int num1 = 10;
		int num2 = 20;
		
		/* if�� */
		
		// if
		if(num1 < num2)
		{
			System.out.println("num1�� num2���� �۴�. \n");
		}
		
		// if, else
		if(num1 < num2)
		{
			System.out.println("num1�� num2���� �۴�. \n");
		}
		else
		{
			System.out.println("num1�� num2���� ũ�ų� ����. \n");
		}
		
		// if, else if, else
		if(num1 < num2)
		{
			System.out.println("num1�� num2���� �۴�. \n");
		}
		else if(num1 > num2)
		{
			System.out.println("num1�� num2���� ũ��. \n");
		}
		else
		{
			System.out.println("num1�� num2�� ����. \n");
		}
		
		
		/* switch�� */
		
		System.out.println("���� �Է� : ");
		
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
				System.out.println("�ٽ� ����");
				break;
		}
		
		inputNum.close();
	}
}
