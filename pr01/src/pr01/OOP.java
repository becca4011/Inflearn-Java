package pr01;

/*
	��ü : ���� �����ϴ� ��� �� / ���α׷��ֿ��� �Ӽ�, ����� ������ ���α׷� ����

	Ŭ���� : ��ü�� �����ϱ� ���� Ʋ, ��� ��ü�� Ŭ�����κ��� ���� (�ؾ Ʋ, ���� Ʋ ���� Ʋ)
	     	 Ʋ(Ŭ����)�� �޶����� �ʰ�, �Ӽ��� ����� �޶��� �� �ִ�.

	Ŭ���� ���� ��� : �Ӽ�(��� ����), ���(�ż���)
*/

public class OOP // Ŭ���� �̸�
{
	// ��� ����(�Ӽ�)
	public String color;
	public String gear;
	public int price;
	
	public OOP() //������(Ŭ������ ���� �̸�, ���� ���� ȣ��Ǵ� ��)
	{
		System.out.println("Grandeur constructor"); // �ʿ��� ������ ������ ������� ��� ����
	}
	
	// �ż���(���)
	public void run() // ��ȯ�� ���� ������ void�� ���
	{
		System.out.println("-- run --");
	}
	
	public void stop()
	{
		System.out.println("-- stop --");
	}
}
