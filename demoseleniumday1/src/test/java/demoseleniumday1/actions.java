package demoseleniumday1;

import java.awt.AWTException;
import java.awt.Robot;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.sun.glass.events.KeyEvent;

public class actions {
	
	
	WebDriver driver;
	String browser="chrome";
	@BeforeMethod
	public void openbrowser()
	
	{
		driver=driverclass.listofdriver(browser);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.MILLISECONDS);
		
	}
	
	@Test
	public void test() throws AWTException 
	{
	
		driver.get("http://localhost:8083/TestMeApp/login.htm");
		
		
	Actions mouse=new Actions(driver);
	
	WebElement uname=driver.findElement(By.name("userName"));
	
	mouse.moveToElement(uname).click().keyDown(uname, Keys.SHIFT).sendKeys(uname, "laks").keyUp(uname, Keys.SHIFT).doubleClick().build().perform();;
		

		Robot win=new Robot();
		
		win.keyPress(KeyEvent.VK_DOWN);
		
		win.keyPress(KeyEvent.VK_DOWN);
		win.keyPress(KeyEvent.VK_ENTER);
		
		WebElement pw=driver.findElement(By.name("password"));
		
		mouse.moveToElement(pw).click().perform();
		win.keyPress(KeyEvent.VK_CONTROL);
		win.keyPress(KeyEvent.VK_V);
		
		
		
	
	}

}
