package demoseleniumday1;


import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class set {

		
		WebDriver driver;
		String browser="chrome";
		
		@BeforeMethod
		public void openbrowser()
		
		{
			driver=driverclass.listofdriver(browser);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.MILLISECONDS);
			driver.get("http://www.naukri.com");
		}
		
		
		@Test
		public void test() throws InterruptedException 
		
		{
			Thread.sleep(2000);
			
			String mwid=driver.getWindowHandle();
			
			Set<String> allwin=driver.getWindowHandles();
			for(String x:allwin)
			{
				if(!x.equals(mwid))
				{
					driver.switchTo().window(x);
					driver.close();
				}
			}
			
			driver.switchTo().window(mwid);
			Thread.sleep(1000);
		}

}


