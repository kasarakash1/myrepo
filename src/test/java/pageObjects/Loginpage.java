package pageObjects;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Loginpage 
{
	public WebDriver driver;
	
     private By email=By.xpath("//input[@name='email']");
     private By pass=By.xpath("//input[@name='password']");
     private By login=By.xpath("//button[text()='Login']");
     private By Error_email=By.xpath("//span[text()='Please enter an email address']");
     private By Error_pass=By.xpath("//span[text()='Please enter a password']");
     private By ErrorInvalidEmail=By.xpath("//span[text()='Please enter a valid email address']");
     private By ErrorInvalidCredentials=By.xpath("//*[text()='You have entered an invalid email or password']");
     private By ErrorBlockedUser=By.xpath("//div[text()='Too many login attempts, please try login into your account after an hour']");
     private By EmailPlaceholder=By.xpath("(//form/div/div/label)[1]");
     private By PasswordPlaceholder=By.xpath("(//form/div/div/label)[2]");
     private By ForgotPassLink=By.partialLinkText("Forgot") ;
     private By HeadingClinimise=By.xpath("//div//h2");
     private By HeadingLogin=By.xpath("//div//h4");
     private By HeadingEnterCredentials=By.xpath("//div//h6");
     
     public Loginpage(WebDriver driver)
      {
    	  this.driver=driver;
      }
      
      public void enterLoginID(String username)
      {
                      driver.findElement(email).sendKeys(username);
      }
      
      public void enterPassword(String password)
      {
                      driver.findElement(pass).sendKeys(password);
      }
      
      public void clickOnLogin()
      {
            driver.findElement(login).click();
      }
      
     
      public String validateLoginWithUrl() throws InterruptedException 
      {
            Thread.sleep(3000);
        System.out.println("Found this URL: "+driver.getCurrentUrl());   
        String url=driver.getCurrentUrl();
         return url;   
      }
      
      public String validateLoginWithTitle()
      {
    	  System.out.println("Found this Title: "+driver.getTitle());
    	  String title=driver.getTitle();
    	  return title;
    	  
      }
      
      public ArrayList<String> errorMessageForEmptyFields()
      {
    	  ArrayList<String> actual_messages = new ArrayList<String>();
    	  actual_messages.add(driver.findElement(Error_email).getText());
    	  actual_messages.add(driver.findElement(Error_pass).getText());
    	  return actual_messages;
      }
      
      public String errorMessageForInvalidEmail()
      {
    	 String errorMessageForInvalidEmail=driver.findElement(ErrorInvalidEmail).getText(); 
    	 return errorMessageForInvalidEmail;
      }
      
      public String errorMessageForInvalidCredentials()
      {
    	 String errorMessageForInvalidCredentials=driver.findElement(ErrorInvalidCredentials).getText();
    	 return errorMessageForInvalidCredentials;
      }
      
      public String errorMessageForBlockedUser()
      { 
    	  String errorMessageForBlockedUser=driver.findElement(ErrorBlockedUser).getText();
    	  return errorMessageForBlockedUser;
      }
      
      public void clickOnLoginMultipleTimes() throws InterruptedException
      {     for(int i=0;i<=3;i++)
            {
    	         driver.findElement(login).click();
    	         Thread.sleep(2000);
            }
      }
      
      public void getPlaceholderTextboolean()
      {
    	// boolean email_placeholder= driver.getPageSource().contains("Email *");
    	 
      }
      
      public ArrayList<String> getPlaceholderText()
      {
    	  ArrayList<String> PlaceholderText = new ArrayList<String>();
    	  PlaceholderText.add(driver.findElement(EmailPlaceholder).getText());
    	  PlaceholderText.add(driver.findElement(PasswordPlaceholder).getText());
    	  return PlaceholderText;
      }
      
      public boolean getForgotPasswordLink()
      {
    	    boolean ForgotPasswordLinkDisplayed=driver.findElement(ForgotPassLink).isDisplayed();
    	    return ForgotPasswordLinkDisplayed;
      }
      
      public void ClickOnForgotPasswordLink()
      {
    	  driver.findElement(ForgotPassLink).click();
      }
      
      public String getForgotPasswordPageTitle()
      {
    	 String ForgotPasswordPageTitle= driver.getTitle();
    	 return ForgotPasswordPageTitle;
      }
      
      public String validateLoginButtonText() 
      {
    	 String logintext= driver.findElement(login).getText();
    	 return logintext;
	  }
      
      public ArrayList<String> validateHeadings()
      {    ArrayList<String> validateHeadings = new ArrayList<String>();
      validateHeadings.add(driver.findElement(HeadingClinimise).getText());
      validateHeadings.add(driver.findElement(HeadingLogin).getText());
      validateHeadings.add(driver.findElement(HeadingEnterCredentials).getText());
	  return validateHeadings;
    	  
      }
      
      
      
      
      
      
}
