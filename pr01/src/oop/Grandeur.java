package oop;

public class Grandeur 
{
	/*
  		OOP : Object-Oriented Programming(��ü ���� ���α׷���)
 
		��ü : ���� �����ϴ� ��� �� / ���α׷��ֿ��� �Ӽ�, ����� ������ ���α׷� ����

		Ŭ���� : ��ü�� �����ϱ� ���� Ʋ, ��� ��ü�� Ŭ�����κ��� ���� (�ؾ Ʋ, ���� Ʋ ���� Ʋ)
	     	 	 Ʋ(Ŭ����)�� �޶����� �ʰ�, �Ӽ��� ����� �޶��� �� �ִ�.

		Ŭ���� ���� ��� : �Ӽ�(��� ����), ���(�ż���)
	*/

	// ��� ����(�Ӽ�)
	public String color;
	public String gear;
	public int price;
	
	public Grandeur() //������(Ŭ������ ���� �̸�, ���� ���� ȣ��Ǵ� ��)
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
	
	public void info()
	{
		System.out.println("-- info --");
		System.out.println("color : " + color);
		System.out.println("gear : " + gear);
		System.out.println("price : " + price);
	}
}
