package demoseleniumday1;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations {
	
	
	@BeforeSuite
	
	public void suite()
	{
		System.out.println("suite started");
	}
	
	@BeforeTest
	
	public void test()
	{
		System.out.println("test started");
	}
	
	
	
	
	@BeforeClass 
	public void startserver()
	{
		System.out.println("starting erver");
	}
	@Test(priority=1,enabled=false)
	public void alpha()
	{
		
		System.out.println("first test case");
	}
	@Test
	public void beta()
	{
		
		System.out.println("second test case");
	}
	@BeforeMethod
	public void open()
	{
		System.out.println("opening browser");
	}
	
	
	@AfterMethod 
	public void close()
	{
		System.out.println("closing browser ");
	}
@AfterClass
 public void closeserver()
 {
	System.out.println("closing server ");
 }


@AfterSuite

public void suiteended()
{
	System.out.println("suite ended ");
}

@AfterTest

public void testended()
{
	System.out.println("test ended");
}
}
