package pr01;

public class Character 
{
	public static void main(String[] args) 
	{
		/* Ư�� ���� */
		
		System.out.println("Good\tMorning! \n");     // ��
		System.out.println("Good\nMorning! \n");     // �ٹٲ�(����)
		System.out.println("\'Good Morning!\' \n");  // ''
		System.out.println("\"Good Morning!\" \n");  // ""
		System.out.println("Good\\Morning! \n");        // \
		
		
		/* ���� ���� */
		
		System.out.printf("������ ����� %d�� �Դϴ�. \n", 10);
		
		// ����(%d)
		int num1 = 20;
		System.out.println("������ �����" + num1 + "�� �Դϴ�.");
		System.out.printf("������ ����� %d�� �Դϴ�. \n", num1);
		
		// 10����, 8����, 16����(%d, %o, %x)
		int num2 = 30;
		System.out.printf("num2 (10����) : %d \n", num2);
		System.out.printf("num2 (8����) : %o \n", num2);
		System.out.printf("num2 (16����) : %x \n", num2);
		
		// ����(%c)
		System.out.printf("�ҹ��� \'%c\'�� �빮�ڴ� \'%c\'�Դϴ�. \n", 'a', 'A');
		
		// ���ڿ�(%s)
		System.out.printf("�ҹ��� \"%s\"�� �빮�ڷ� �ٲٸ� \"%s\"�Դϴ�. \n", "java", "JAVA");
		
		// �Ǽ�(%f)
		double d = 1.2345d;
		System.out.printf("d = %f \n\n", d);
		
		
		/* ���� ���� ���� */
		
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
