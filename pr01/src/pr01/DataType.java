package pr01;

public class DataType 
{
	public static void main(String[] args) 
	{
		/* �⺻ �ڷ��� */
		
		char c = 'a'; // ������, 2byte(�����ڵ带 ����ϱ� ������ 2byte)
		System.out.println("char�� : " + c);
		
		int i = 10; // ������, 4byte
		System.out.println("int�� : " + i);
		
		double d = 10.258; // �Ǽ���, 8byte
		System.out.println("double�� : " + d);
		
		boolean b = false; // ����(true/false), 1byte
		System.out.println("boolean�� : " + b);
		
		/* String str = new String()���� ���������, String�� ���� ���̱� ������ �ٷ� �����ϰ� �ʱ�ȭ ���� */
		
		String s = "Hello Java World!"; // ���ڿ���
		System.out.println("String�� : " + s);
		
		s = "Hello!!";
		System.out.println("String�� : " + s);
		
		
		/* �� ��ȯ */
		
		// �ڵ�(������) �� ��ȯ
		// ���� ������ �޸� �� ū ������ �޸�	
		
		byte bt = 10; // ���� ����(1byte)
		int j = bt; // ū ����(4byte)		
		System.out.println("\n������ �� ��ȯ : " + j); // ���� X
		
		// ����� �� ��ȯ
		// ū ������ �޸� �� ���� ������ �޸�	
		
		int k = 100;
		byte by = (byte)k;
		System.out.println("����� �� ��ȯ : " + by);
		
		k = 123456;
		by = (byte)k;
		System.out.println("����� �� ��ȯ : " + by); // ������ ���� ���ɼ� ����
		
		
	}
}
