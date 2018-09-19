package demoseleniumday1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class alerts {
	WebDriver driver;
	String browser="chrome";
	@BeforeMethod
	public void openbrowser()
	
	{
		driver=driverclass.listofdriver(browser);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.MILLISECONDS);
		driver.get("http://mail.rediff.com/cgi-bin/login.cgi");
	}
	
	@Test
	public void test() 
	{
		
		driver.findElement(By.name("proceed")).click();
		
		Alert a= driver.switchTo().alert();
		
	String alertmsg	=a.getText();
	
	System.out.println(alertmsg);
		
		a.accept();
		driver.findElement(By.id("login1")).sendKeys("dfdsf@rediff.com");
	}

}
