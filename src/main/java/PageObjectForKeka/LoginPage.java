package PageObjectForKeka;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage 
{
	WebDriver driver;
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	//************************************************
	@FindBy(xpath = "//input[@id='email']") 
	WebElement enteremail;
	
	public void enteremail(String email)
	{
		enteremail.sendKeys(email);
		
	}
	//*************************************************
	@FindBy(xpath = "//div[@class='text-danger validation-summary-errors']/ul/li")
	WebElement invalidmail;
	
	public void invalidemail()
	{
		invalidmail.getText();
		
	}
	//*************************************************
	public void clearEmail()
	{
		enteremail.clear();
	}
	//***********************************************
	@FindBy(xpath = " //button[@class='btn btn-primary mt-10 border-0']")
	WebElement clickonlogin;
	
	public void clickonlogin()
	{
		clickonlogin.click();
	}
	//*********************************************
	@FindBy(xpath = "//input[@placeholder='Password']")
	WebElement password;
	
	public void password(String pass)
	{
		password.sendKeys(pass);
	}
	//************************************************
	@FindBy(xpath="//button[@class='btn btn-primary mt-10 border-0']")
	WebElement clickonpassword;
	
	public void clickonpassword() throws InterruptedException
	{
		clickonpassword.click();
		Thread.sleep(2000);
	}
	//************************************************
	@FindBy(xpath = "//div[@class='text-danger validation-summary-errors']/ul/li")
	WebElement invalidpwd;
	
	public void invalidepassword()
	{
		invalidpwd.getText();
	}
	//************************************************
	public void clearpwd()
	{
		password.clear();
	}
}
