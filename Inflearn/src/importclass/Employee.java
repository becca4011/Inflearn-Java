package importclass;

import export.*;

// 패키지 안에 있는 모든 class를 쓰고 싶을 때 
// import 패키지명.*

public class Employee 
{
	public static void main(String[] args) 
	{
		// export.DailyJournal journal = new dailyjournal.DailyJournal();
		// import를 쓰지 않고도 사용 가능하지만 코드가 지저분해 보임
		
		EmployeeBank parkBank = new EmployeeBank("박찬호");
		parkBank.saveMoney(100);
		
		EmployeeBank leeBank = new EmployeeBank("이승엽");
		leeBank.saveMoney(300);
		
		leeBank.getBankInfo();
		
		parkBank.spendMoney(400);
		
		leeBank.getBankInfo(); // amount를 공유해서 사용하기 때문에 parkBank가 돈을 쓰면 leeBank도 amount가 줄어듦
	}
}
