package demoseleniumday1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Flipkart {
	
	
	WebDriver driver;
	String browser="chrome";
	@BeforeMethod
	public void openbrowser()
	
	{
		driver=driverclass.listofdriver(browser);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.MILLISECONDS);
		driver.get("http://www.flipkart.com");
	}
	
	
	@Test
	public void test()
	{
	
		
		driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();;

		//driver.findElement(By.className("_2AkmmA _29YdH8")).click();
		driver.findElement(By.name("q")).sendKeys("watches",Keys.ENTER);
		
		
		
		
	}
	
	
	

}
