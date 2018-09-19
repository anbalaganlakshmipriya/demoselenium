package demoseleniumday1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class frames {

	
	
	WebDriver driver;
	String browser="chrome";
	@BeforeMethod
	public void openbrowser()
	
	{
		driver=driverclass.listofdriver(browser);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.MILLISECONDS);
		driver.get("http://www.goibibo.com");
	}
	
	@Test
	public void test() 
	{
		driver.findElement(By.id("get_sign_up")).click();
		
WebElement framid=driver.findElement(By.id("authiframe"));

driver.switchTo().frame(framid);
driver.findElement(By.id("authMobile")).sendKeys("1234567890");
driver.switchTo().defaultContent();
driver.findElement(By.xpath("//*[@id='authOverlay']/div/a")).click();


}
}

