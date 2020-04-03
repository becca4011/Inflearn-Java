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
	
	public void setInfo(String n, String g, int a) // ()안의 값은 매개변수(parameter)
	{
		System.out.println("-- setInfo --");
		
		name = n;
		gender = g;
		age = a;
	}
	
	public void getInfo() // 메서드 선언 / public : 접근자, 호출 가능 (외부에서 접근, 객체 내부 사용 가능)
	{
		// 메서드 정의
		System.out.println("-- getInfo --");
		
		System.out.println("name : " + name);
		System.out.println("gender : " + gender);
		System.out.println("age : " + age);
	}
	
	private void mySecret() // private : 접근자, 호출 불가(외부에서 접근 불가능 / 객체 내부에서만 사용 가능)
	{
		System.out.println("-- mySecret --");
	}
}
