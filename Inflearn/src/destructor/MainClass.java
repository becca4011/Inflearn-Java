package destructor;

public class MainClass 
{
	public static void main(String[] args) 
	{
		ObjectClass obj1;
		
		obj1 = new ObjectClass(); // ���� ������ ��ü���� ������ ����
		obj1 = new ObjectClass(); // �� ��ü�� ������
		
		System.gc(); // �ý��ۿ��� GC�� ������� �޶�� ��(�ٷ� �۵��ϴ� ���� �ƴ�, ������ ���� �۵��϶�� �ϴ� ��)
	}
}
