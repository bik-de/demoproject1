package com.AutomationTalks.demoProject1;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class TestClass1 {
	public static WebDriver driver;
	//WebDriver driver=null;
	//ChromeDriverService service = new ChromeDriverService.Builder().withLogOutput(System.out).build();

	//webDriver driver = new ChromeDriver(service);
	
	@BeforeMethod
	public void launchDriver()
	{
		System.out.println("inside step-browser is open");
		System.setProperty("webdriver.chrome.driver","C:/Users/91736/eclipse-workspace/demoProject1/src/test/resources/drivers/chromedriver.exe");
		driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().window().fullscreen();
	}
	@Test
	public void Test1()
	{
		driver.navigate().to("https://automationtalks.com/");
		System.out.println("Test 1 title is "+driver.getTitle());
	}
	@Test
	public void Test2()
	{
		driver.navigate().to("https://automationtalks.com/");
		System.out.println("Test 2 title is "+driver.getTitle());
	}
	@Test
	public void Test3()
	{
		driver.navigate().to("https://automationtalks.com/");
		System.out.println("Test 3 title is "+driver.getTitle());
	}
	@AfterMethod
	public void quit()
	{
		driver.quit();
	}

}
