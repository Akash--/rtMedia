//upload the media....
package script;

import static org.junit.Assert.*;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.StringSelection;
import java.io.IOException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.awt.event.*;
//import com.thoughtworks.selenium.webdriven.commands.KeyEvent;

public class Test8 {
	private WebDriver driver;

	@Before
	public void setUp() throws Exception
	{
		driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://demo.rtcamp.com/rtmedia/members/akash1234/media/");
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test

		
		public void test() throws IOException, AWTException, InterruptedException 
		{
			driver.findElement(By.linkText("Upload")).click();

			driver.findElement(By.linkText("HERE")).click();
			
			driver.findElement(By.id("user_login")).sendKeys("Akash1234");
			
			driver.findElement(By.id("user_pass")).sendKeys("Akash1234");
			
			driver.findElement(By.id("wp-submit")).click();
			
			driver.findElement(By.linkText("Howdy, Akash")).click();
			
			
		    
		    driver.findElement(By.id("user-media")).click();
			
		    driver.findElement(By.id("rtm_show_upload_ui")).click();
		    
		    driver.findElement(By.id("rtMedia-upload-button")).click();
		    
		    driver.findElement(By.id("rtmedia_upload_terms_conditions")).click();
		    
		    driver.findElement(By.id("rtMedia-upload-button")).click();
		    Thread.sleep(3000);
		    
		    //upolade the file from client to server
		    
		    StringSelection ss=new StringSelection("C:\\Users\\Public\\Pictures\\Sample Pictures\\Chrysanthemum.jpg");
		    
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
		    
		   
		    
		    driver.findElement(By.className("start-media-upload")).click();

		    
		    
		   
		    
		    
	//	fail("Not yet implemented");
	}

}
