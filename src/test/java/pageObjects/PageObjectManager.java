package pageObjects;

import org.openqa.selenium.WebDriver;

public class PageObjectManager 
{
	public  WebDriver driver;
	
	public Loginpage loginpage;
	public ForgotPasswordpage ForgotPasswordpage;
	
	public PageObjectManager (WebDriver driver)
	{
		this.driver=driver;
	}
	
	
	public Loginpage getLoginpage()
	{
		loginpage= new Loginpage(driver);
		return loginpage;
	}
	

	public ForgotPasswordpage getForgotPasswordpage()
	{
		ForgotPasswordpage= new ForgotPasswordpage(driver);
		return ForgotPasswordpage;
	}
	
}
