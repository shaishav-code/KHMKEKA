package PageObjectForKeka;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Logout 
{
	WebDriver driver;
	public Logout(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	//****************************************************
	@FindBy(xpath="//span[@class='ki-chevron-down ki']")
	WebElement Dropdownicon;
	
	public void Dropdownicon() 
	{
		Dropdownicon.click();
	}
	//*************************************************
	@FindBy(xpath = "//a[@routerlink='/logout']")
	WebElement logout;
	
	public void logOut()
	{
		logout.click();
	}
}
