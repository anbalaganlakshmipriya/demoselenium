package demoseleniumday1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class tours {
	

	WebDriver driver;
	String browser="chrome";
	@BeforeMethod
	public void openbrowser()
	
	{
		driver=driverclass.listofdriver(browser);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.MILLISECONDS);
		driver.get("http://newtours.demoaut.com");
	}
	
	@Test
	public void test() throws InterruptedException
	{
		driver.findElement(By.linkText("REGISTER")).click();
		WebElement dropdown=driver.findElement(By.name("country"));
		Select country=new Select(dropdown);
		
		country.selectByIndex(16);
		Thread.sleep(1000);
		country.selectByValue("217");
		country.selectByVisibleText("INDIA");
		
	
		
		List<WebElement> options =country.getOptions();
		
		for(int i=0;i<options.size();i++)
		System.out.println(options.get(i).getText());
			
		}
		
		
	}
	
	


