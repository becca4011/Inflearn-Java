package method;

public class MainClass 
{
	public static void main(String[] args) 
	{
		ChildClass child1 = new ChildClass();
		
		child1.name = "Hong Gil Dong";
		child1.gender = "M";
		child1.age = 20;
		
		child1.getInfo(); // �޼��� ȣ��
		
		System.out.println();
		
		ChildClass child2 = new ChildClass();
		
		child2.setInfo("Seong Chun Hyang", "F", 20); // ChildClass�� setInfo �Ű������� ���� �ڷ������� �����־�� ��
		
		child2.getInfo();
		
		System.out.println("\n--------------------------------\n");
		
		Overloading over1 = new Overloading();
		
		over1.info();
		System.out.println();
		
		over1.info(12, 23);
		System.out.println();
		
		over1.info("Hello!", "Bye!");
	}
}
