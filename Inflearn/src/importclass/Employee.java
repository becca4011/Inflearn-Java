package importclass;

import export.*;

// ��Ű�� �ȿ� �ִ� ��� class�� ���� ���� �� 
// import ��Ű����.*

public class Employee 
{
	public static void main(String[] args) 
	{
		// export.DailyJournal journal = new dailyjournal.DailyJournal();
		// import�� ���� �ʰ� ��� ���������� �ڵ尡 �������� ����
		
		EmployeeBank parkBank = new EmployeeBank("����ȣ");
		parkBank.saveMoney(100);
		
		EmployeeBank leeBank = new EmployeeBank("�̽¿�");
		leeBank.saveMoney(300);
		
		leeBank.getBankInfo();
		
		parkBank.spendMoney(400);
		
		leeBank.getBankInfo(); // amount�� �����ؼ� ����ϱ� ������ parkBank�� ���� ���� leeBank�� amount�� �پ��
	}
}
