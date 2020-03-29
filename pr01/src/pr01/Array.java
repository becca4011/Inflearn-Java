package pr01;

import java.util.Arrays;
import java.util.Scanner;

public class Array 
{
	public static void main(String[] args) 
	{
		/* 배열 선언과 초기화 */
		
		// 배열 선언
		int[] arr1 = new int[5];
		
		// 배열 초기화
		arr1[0] = 100; // 0부터 시작
		arr1[1] = 200;
		arr1[2] = 300;
		arr1[3] = 400;
		arr1[4] = 500;
		
		System.out.println("arr1[0] : " + arr1[0]);
		System.out.println("arr1[1] : " + arr1[1]);
		System.out.println("arr1[2] : " + arr1[2]);
		System.out.println("arr1[3] : " + arr1[3]);
		System.out.println("arr1[4] : " + arr1[4] + "\n");
		
		// 배열 선언 & 초기화
		int[] arr2 = {10, 20, 30, 40, 50};
		
		System.out.println("arr2[0] : " + arr2[0]);
		System.out.println("arr2[1] : " + arr2[1]);
		System.out.println("arr2[2] : " + arr2[2]);
		System.out.println("arr2[3] : " + arr2[3]);
		System.out.println("arr2[4] : " + arr2[4] + "\n");
		
		
		/* 배열을 이용한 학사관리 */
		
		String[] name = {"박찬호", "이승엽", "박병호", "이병규", "류현진"};
		int[] score = new int[5];
		
		Scanner scan = new Scanner(System.in);
		
		// 점수를 입력하고 score 배열에 저장
		System.out.printf("%s의 점수를 입력 : ", name[0]);
		score[0] = scan.nextInt();
		
		System.out.printf("%s의 점수를 입력 : ", name[1]);
		score[1] = scan.nextInt();
		
		System.out.printf("%s의 점수를 입력 : ", name[2]);
		score[2] = scan.nextInt();
		
		System.out.printf("%s의 점수를 입력 : ", name[3]);
		score[3] = scan.nextInt();
		
		System.out.printf("%s의 점수를 입력 : ", name[4]);
		score[4] = scan.nextInt();
		
		System.out.printf("%s의 점수 : %.2f\n", name[0], (double)score[0]);
		System.out.printf("%s의 점수 : %.2f\n", name[1], (double)score[1]);
		System.out.printf("%s의 점수 : %.2f\n", name[2], (double)score[2]);
		System.out.printf("%s의 점수 : %.2f\n", name[3], (double)score[3]);
		System.out.printf("%s의 점수 : %.2f\n", name[4], (double)score[4]);
		
		double ave = (double)(score[0] + score[1] + score[2] + score[3] + score[4]) / 5;
		System.out.printf("-------------------------\n평점 : %.2f \n\n", ave);
		
		scan.close();
		
		
		/* 배열 기본속성 */
		
		int[] arr3 = {10, 20, 30, 40, 50, 60};
		int[] arr4 = null;
		int[] arr5 = null;
		
		// 배열 길이
		System.out.println("arr3.length : " + arr3.length);
		
		// 배열 요소 출력
		System.out.println("arr3 : " + Arrays.toString(arr3));
		
		// 배열 요소 복사
		arr5 = Arrays.copyOf(arr3, arr3.length);
		System.out.println("arr5 : " + Arrays.toString(arr5));
		
		// 배열 레퍼런스
		arr4 = arr3;
		System.out.println("arr3 : " + arr3);
		System.out.println("arr4 : " + arr4);
		System.out.println("arr5 : " + arr5 + "\n"); // 배열 요소를 복사하더라도 요소만 같고 주소가 같지는 않음
		
		
		/* 다차원 배열 */
		
		int[][] arrMul = new int[3][2]; // 3행 2열
		
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
