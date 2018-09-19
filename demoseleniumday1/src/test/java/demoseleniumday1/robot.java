package demoseleniumday1;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class robot {

	 public WebDriver driver;
	    public WebDriverWait wait;
	    
	    private static String filePath = System.getProperty("C:\\Users\\A07208trng_b4a.04.28\\BDC4-D-5SPZQG2.PNG");
	    
	    @BeforeMethod
	    public void setup () {
	        driver = new ChromeDriver();
	        driver.get("https://blueimp.github.io/jQuery-File-Upload/");
	        driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
	        wait = new WebDriverWait(driver,10);
	        driver.manage().window().maximize();
	    }
	 
	    @Test
	    public void robotTest () throws InterruptedException {
	        //Click Image Upload
	        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".btn.btn-success.fileinput-button")));
	        driver.findElement(By.cssSelector(".btn.btn-success.fileinput-button")).click();
	        uploadFileWithRobot(filePath);
	        Assert.assertTrue(wait.until(ExpectedConditions.visibilityOfElementLocated
	                (By.cssSelector(".name"))).getText().equals("BDC4-D-5SPZQG2.png"));
	        //I added sleep to see the result with my eyes. If you want you can remove below line.
	        Thread.sleep(2000);
	    }
	 
	   // @AfterMethod
	    //public void teardown () {
	      //  driver.quit();
	    //}

	 
	    //File upload by Robot Class
	    public void uploadFileWithRobot (String imagePath) throws InterruptedException {
	        StringSelection stringSelection = new StringSelection(imagePath);
	        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
	        clipboard.setContents(stringSelection, null);
	 
	        Robot robot = null;
	 
	        try {
	            robot = new Robot();
	        } catch (AWTException e) {
	            e.printStackTrace();
	        }
	 
	        
	        
	        robot.delay(250);
	        robot.keyPress(KeyEvent.VK_ENTER);
	        robot.keyRelease(KeyEvent.VK_ENTER);
	        robot.keyPress(KeyEvent.VK_B);
	        
	        robot.keyRelease(KeyEvent.VK_B);
	        
	        
	        robot.keyPress(KeyEvent.VK_DOWN);
	        robot.keyRelease(KeyEvent.VK_DOWN);
	        Thread.sleep(3000);
	        robot.keyPress(KeyEvent.VK_ENTER);
	        robot.delay(150);
	        robot.keyRelease(KeyEvent.VK_ENTER);
	        
	    }
	}