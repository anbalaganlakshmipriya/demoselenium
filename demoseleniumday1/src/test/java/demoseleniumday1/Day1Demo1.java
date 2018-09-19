package demoseleniumday1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Day1Demo1 extends driverclass

{

@Test
	
public  void testcase() throws InterruptedException {


	
	// set the property
	
	//System.setProperty("webdriver.chrome.driver", "C:\\Users\\A07208trng_b4a.04.28\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
//launch browser 
	
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://www.google.com");

	
	Thread.sleep(1000);
	
	
	
	
	
}


	

}
