package stepDefinitions;

import java.io.File;

import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;
import utils.TestContextSetup;

public class Hooks {
	
	TestContextSetup testContextSetup;
	
	public Hooks(TestContextSetup testContextSetup)
	{
		this.testContextSetup= testContextSetup;
	}
	
	

	@After //executes after each scenario of step definition file
	public void AfterScenario() throws IOException, InterruptedException
	{
		Thread.sleep(3000);
		testContextSetup.testBase.WebDriverManager().quit();
	}
	
	
	@AfterStep
	public void AddScreenshot(Scenario scenario) throws IOException
	{
		if(scenario.isFailed())
		{
			WebDriver driver=testContextSetup.testBase.WebDriverManager();
			File SourcePath=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			byte[] filecontent=FileUtils.readFileToByteArray(SourcePath);
			scenario.attach(filecontent, "image/png", "image");
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
