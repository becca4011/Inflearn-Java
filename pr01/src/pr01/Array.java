package pr01;

import java.util.Arrays;
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
		System.out.printf("-------------------------\n���� : %.2f \n\n", ave);
		
		scan.close();
		
		
		/* �迭 �⺻�Ӽ� */
		
		int[] arr3 = {10, 20, 30, 40, 50, 60};
		int[] arr4 = null;
		int[] arr5 = null;
		
		// �迭 ����
		System.out.println("arr3.length : " + arr3.length);
		
		// �迭 ��� ���
		System.out.println("arr3 : " + Arrays.toString(arr3));
		
		// �迭 ��� ����
		arr5 = Arrays.copyOf(arr3, arr3.length);
		System.out.println("arr5 : " + Arrays.toString(arr5));
		
		// �迭 ���۷���
		arr4 = arr3;
		System.out.println("arr3 : " + arr3);
		System.out.println("arr4 : " + arr4);
		System.out.println("arr5 : " + arr5 + "\n"); // �迭 ��Ҹ� �����ϴ��� ��Ҹ� ���� �ּҰ� ������ ����
		
		
		/* ������ �迭 */
		
		int[][] arrMul = new int[3][2]; // 3�� 2��
		
		arrMul[0][0] = 10;
		arrMul[0][1] = 100;
		arrMul[1][0] = 20;
		arrMul[1][1] = 200;
		arrMul[2][0] = 30;
		arrMul[2][1] = 300;
		
		System.out.println("arrMul[0] : " + Arrays.toString(arrMul[0])); // 10 100
		System.out.println("arrMul[1] : " + Arrays.toString(arrMul[1])); // 20 200
		System.out.println("arrMul[2] : " + Arrays.toString(arrMul[2])); // 30 300
	}
}
