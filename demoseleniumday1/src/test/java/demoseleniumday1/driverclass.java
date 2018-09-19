package demoseleniumday1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class driverclass {
	
	
	@Test
	
	
	public static WebDriver  listofdriver(String browser)
	{		
	if(browser.equalsIgnoreCase("chrome"))
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\A07208trng_b4a.04.28\\Desktop\\chromedriver.exe");
	return new ChromeDriver();	
	}
	else
		if(browser.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.firefox.driver", "C:\\Users\\A07208trng_b4a.04.28\\Downloads\\geckodriver-v0.19.1-win64 (1)\\geckodriver.exe");

		return new FirefoxDriver();	
		}
		else
		{
			System.out.println("invalid");
			return null;
				}
	

}
	}
