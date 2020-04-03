package method;

public class ChildClass 
{
	public String name;
	public String gender;
	public int age;
	
	public ChildClass()
	{
		System.out.println("-- ChildClass constructor --");
	}
	
	public void setInfo(String n, String g, int a) // ()���� ���� �Ű�����(parameter)
	{
		System.out.println("-- setInfo --");
		
		name = n;
		gender = g;
		age = a;
	}
	
	public void getInfo() // �޼��� ���� / public : ������, ȣ�� ���� (�ܺο��� ����, ��ü ���� ��� ����)
	{
		// �޼��� ����
		System.out.println("-- getInfo --");
		
		System.out.println("name : " + name);
		System.out.println("gender : " + gender);
		System.out.println("age : " + age);
	}
	
	private void mySecret() // private : ������, ȣ�� �Ұ�(�ܺο��� ���� �Ұ��� / ��ü ���ο����� ��� ����)
	{
		System.out.println("-- mySecret --");
	}
}
