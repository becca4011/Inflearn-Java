package pr01;

import java.util.Scanner;

public class Array 
{
	public static void main(String[] args) 
	{
		/* �迭 ����� �ʱ�ȭ */
		
		// �迭 ����
		int[] arr1 = new int[5];
		
		// �迭 �ʱ�ȭ
		arr1[0] = 100; // 0���� ����
		arr1[1] = 200;
		arr1[2] = 300;
		arr1[3] = 400;
		arr1[4] = 500;
		
		System.out.println("arr1[0] : " + arr1[0]);
		System.out.println("arr1[1] : " + arr1[1]);
		System.out.println("arr1[2] : " + arr1[2]);
		System.out.println("arr1[3] : " + arr1[3]);
		System.out.println("arr1[4] : " + arr1[4] + "\n");
		
		// �迭 ���� & �ʱ�ȭ
		int[] arr2 = {10, 20, 30, 40, 50};
		
		System.out.println("arr2[0] : " + arr2[0]);
		System.out.println("arr2[1] : " + arr2[1]);
		System.out.println("arr2[2] : " + arr2[2]);
		System.out.println("arr2[3] : " + arr2[3]);
		System.out.println("arr2[4] : " + arr2[4] + "\n");
		
		
		/* �迭�� �̿��� �л���� */
		
		String[] name = {"����ȣ", "�̽¿�", "�ں�ȣ", "�̺���", "������"};
		int[] score = new int[5];
		
		Scanner scan = new Scanner(System.in);
		
		// ������ �Է��ϰ� score �迭�� ����
		System.out.printf("%s�� ������ �Է� : ", name[0]);
		score[0] = scan.nextInt();
		
		System.out.printf("%s�� ������ �Է� : ", name[1]);
		score[1] = scan.nextInt();
		
		System.out.printf("%s�� ������ �Է� : ", name[2]);
		score[2] = scan.nextInt();
		
		System.out.printf("%s�� ������ �Է� : ", name[3]);
		score[3] = scan.nextInt();
		
		System.out.printf("%s�� ������ �Է� : ", name[4]);
		score[4] = scan.nextInt();
		
		System.out.printf("%s�� ���� : %.2f\n", name[0], (double)score[0]);
		System.out.printf("%s�� ���� : %.2f\n", name[1], (double)score[1]);
		System.out.printf("%s�� ���� : %.2f\n", name[2], (double)score[2]);
		System.out.printf("%s�� ���� : %.2f\n", name[3], (double)score[3]);
		System.out.printf("%s�� ���� : %.2f\n", name[4], (double)score[4]);
		
		double ave = (double)(score[0] + score[1] + score[2] + score[3] + score[4]) / 5;
		System.out.printf("-------------------------\n���� : %.2f", ave);
		
		scan.close();
	}
}
