package PageObjectForKeka;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePageKeka 
{
	WebDriver driver;
	public HomePageKeka(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	//************************************************
	@FindBy(xpath="//span[@class='ki-user sidebar-list-icon']")
	WebElement me_click;
	
	public void me_click()
	{
		me_click.click();
	}
//*****************************************************
	@FindBy(xpath = "//a[@routerlink='attendance']")
	WebElement attendance_click;
	
	public void attendance_click()
	{
		attendance_click.click();
	}
	//**************************************************
	@FindBy(xpath = "//label[@class='switch-label cursor-pointer']")
	WebElement tooglebtn;
	
	public void toogleBtn()
	{
		tooglebtn.click();
	}
	//**************************************************
	@FindBy(xpath="//span[@class='ki-chevron-down ki']")
	WebElement Dropdownicon;
	
	public void Dropdownicon() 
	{
		Dropdownicon.click();
	}
	//*************************************************
	@FindBy(xpath = "//a[@class='dropdown-item'][1]")
	WebElement profile;
	
	public void profiles()
	{
		profile.click();
	}
	//***************************************************
	@FindBy(xpath = "//button[@class='btn btn-sm btn-link']")
	WebElement clickresponse;
	@FindBy(xpath = "//div[@class='ql-container ql-snow']/div[1]")
	WebElement addskills;
	@FindBy(xpath = "//button[@class='btn btn-primary btn-sm']")
	WebElement save;
	
	public void addSkilldata() throws InterruptedException
	{
		clickresponse.click();
		addskills.sendKeys("Manual testing & Automation testing");
		save.click();
		Thread.sleep(2000);
	}
	//*****************************************************
	@FindBy(xpath = "//a[@routerlink='profile']")
	WebElement clickprofile;
	@FindBy(xpath = "(//a[@class='text-link'])[1]")
	WebElement edittbn;
	@FindBy(xpath = "(//span[@class='ng-arrow-wrapper'])[2]")
	WebElement maritalstatus;
	@FindBy(xpath = "(//span[@class='ng-option-label'])[2]")
	WebElement married;
	@FindBy(xpath = "//button[@class='btn btn-primary']")
	WebElement update;
	
	public void clickProfiles() throws InterruptedException
	{
		clickprofile.click();
		Thread.sleep(1000);
		edittbn.click();
		Thread.sleep(1000);
		maritalstatus.click();
		Thread.sleep(1000);
		married.click();
		Thread.sleep(1000);
		update.click();
	}
	
}
