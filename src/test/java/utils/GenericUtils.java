package utils;

import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GenericUtils {

	
	private WebDriver driver;

	public GenericUtils(WebDriver driver)
	{
		this.driver=driver;
	}
	
	
	public void explicitWait(By xpath)
	{
            WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
            wait.until(ExpectedConditions.visibilityOf((driver.findElement(xpath))));
				
	}
	
	
}
