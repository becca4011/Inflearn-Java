package object;

public class MainClass 
{
	public static void main(String[] args) 
	{
		// Ŭ�����κ��� ������ ��ü�� ��� �ٸ� ������ ����
		ObjectClass obj1 = new ObjectClass();
		ObjectClass obj2 = new ObjectClass();
		ObjectClass obj3 = new ObjectClass();
		
		System.out.println("obj1 : " + obj1);
		System.out.println("obj2 : " + obj2);
		System.out.println("obj3 : " + obj3 + "\n");
		
		// �ڷ����� ���Ƶ� �ٸ� ������ �����ϴ� ��ü�� �ٸ� ��ü
		if(obj1 == obj2)
		{
			System.out.println("obj1 == obj2");
		}
		else
		{
			System.out.println("obj1 != obj2");
		}
		
		if(obj2 == obj3)
		{
			System.out.println("obj2 == obj3");
		}
		else
		{
			System.out.println("obj2 != obj3");
		}
		
		if(obj1 == obj3)
		{
			System.out.println("obj1 == obj3");
		}
		else
		{
			System.out.println("obj1 != obj3 \n");
		}
		
		// ���۷����� null�� ����Ǹ� ��ü���� ������ ����, �� ��ü�� �̿� �Ұ���
		System.out.println("obj1 : " + obj1);
		obj1.getInfo();
		
		obj1 = null; // ���۷���(����) ����		
		System.out.println("obj1 : " + obj1);
		// obj1.getInfo(); ���� �߻�(���� ���� ��ü�� ȣ��, �����ϴ� ���� �Ұ���)
		// new�� �̿��Ͽ� obj1�� �ٽ� ������ �� ����(�̹� ������ ��ü�� �����ϴ� ���� �ƴ�)
	}
}
