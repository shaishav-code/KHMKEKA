package ResourceForBase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

import PageObjectForKeka.HomePageKeka;
import PageObjectForKeka.LoginPage;
import PageObjectForKeka.Logout;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseForKeka 
{
	public static WebDriver driver;
	public LoginPage LP;
	public HomePageKeka HPK;
	public Logout LO;
	@BeforeTest
	public WebDriver Links()
	{
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		driver.get("https://app.keka.com/Account/Login?ReturnUrl=%2F");
		driver.manage().window().maximize();
		return driver;
	}
	
	@BeforeClass
	public void pageobject()
	{
		LP=new LoginPage(driver);
		HPK=new HomePageKeka(driver);
	}
	
	@AfterTest
	public void exit()
	{
		driver.close();
	}
}
