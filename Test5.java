//to updating the post according to privacy and media...
package script;

import static org.junit.Assert.*;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Test5 {
	private WebDriver driver;

	@Before
	public void setUp() throws Exception
	{
		driver=new FirefoxDriver();
		
		driver.get("http://demo.rtcamp.com/rtmedia/");
	}

	@After
	public void tearDown() throws Exception
	{
		//driver.quit();
	}

	@Test
	public void test() throws Exception 
	{
		driver.findElement(By.linkText("Log in")).click();
		
		driver.findElement(By.id("user_login")).sendKeys("Akash1234");
		
		driver.findElement(By.id("user_pass")).sendKeys("Akash1234");
		
		driver.findElement(By.id("wp-submit")).click();
		
		driver.findElement(By.linkText("Howdy, Akash")).click();
	
		 
		driver.findElement(By.xpath("//*[@id='user-activity']")).click();
		 
		Select post=new Select(driver.findElement(By.id("activity-filter-by"))); 
		assertFalse(post.isMultiple());
		post.selectByVisibleText("Posts");
		
		driver.findElement(By.id("whats-new")).sendKeys("Good Night Friends");
		 
		Select privacy=new Select(driver.findElement(By.id("rtSelectPrivacy")));
		assertFalse(privacy.isMultiple());
		privacy.selectByVisibleText("Private");
		
		driver.findElement(By.id("rtmedia-add-media-button-post-update")).click();
		
		//to attached file 
		StringSelection ss=new StringSelection("C:\\Users\\Public\\Pictures\\Sample Pictures\\Hydrangeas.jpg");
	    
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
	    
	    Robot r =new Robot();
	    
	    r.keyPress(KeyEvent.VK_ENTER);
	    r.keyRelease(KeyEvent.VK_ENTER);
	    r.keyPress(KeyEvent.VK_CONTROL);
	    r.keyPress(KeyEvent.VK_V);
	    r.keyRelease(KeyEvent.VK_V);
	    r.keyRelease(KeyEvent.VK_CONTROL);    
	    r.keyPress(KeyEvent.VK_ENTER);
	    r.keyRelease(KeyEvent.VK_ENTER);
	    
	    Thread.sleep(3000);
	    
		
		driver.findElement(By.id("aw-whats-new-submit")).click();
		
		
		
		//fail("Not yet implemented");
		 
		
	}

}
