package demoseleniumday1;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class roughtest {
	
	WebDriver driver;
	String browser="chrome";
	@BeforeMethod
	public void openbrowser()
	
	{
		driver=driverclass.listofdriver(browser);
		driver.get("http://www.google.com");
	}
	@Test
	public void test()
	{
		System.out.println("first test case");
	}
	
	@AfterMethod
	
	public void closebrowser()
	{
		driver.close();
	}

}
