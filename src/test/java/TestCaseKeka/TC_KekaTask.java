package TestCaseKeka;

import org.testng.annotations.Test;
import ResourceForBase.BaseForKeka;

public class TC_KekaTask extends BaseForKeka
{
	@Test(priority = 1)
	public void wrongEmail() throws InterruptedException
	{
		
		LP.enteremail("khm123@narola.email");
		Thread.sleep(1000);
		LP.clickonlogin();
		LP.invalidemail();
		Thread.sleep(1000);
		LP.clearEmail();
	}
	
	@Test(priority = 2)
	public void wrongPass() throws InterruptedException
	{
		LP.enteremail("khm@narola.email");
		Thread.sleep(1000);
		LP.clickonlogin();
		Thread.sleep(1000);
		LP.password("khushi46530");
		Thread.sleep(10000);
		LP.clickonpassword();
		Thread.sleep(2000);
		LP.invalidepassword();
		LP.clearpwd();
	}
	
	@Test(priority = 3)
	public void basepagenavigation() throws InterruptedException
	{
			Thread.sleep(1000);
			LP.password("khushi4630");
			Thread.sleep(10000);
			LP.clickonpassword();
			Thread.sleep(7000);
	}
	
	@Test(priority = 4)
	public void homepage() throws InterruptedException
	{
		HPK.me_click();
		Thread.sleep(2000);
		HPK.attendance_click();
		Thread.sleep(2000);
		HPK.toogleBtn();
		Thread.sleep(1000);
		HPK.Dropdownicon();
		Thread.sleep(2000);
		HPK.profiles();
		Thread.sleep(2000);
		HPK.addSkilldata();
		Thread.sleep(1000);
		HPK.clickProfiles();
		Thread.sleep(1000);
	}
	
	@Test(priority = 5)
	public void logout()
	{
		LO.Dropdownicon();
		LO.logOut();
	}
}
