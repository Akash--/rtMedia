//upload the meadia through url....
package script;

import static org.junit.Assert.*;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.Action;





public class Test7
{
   private WebDriver driver;
   
	@Before
	public void setUp() throws Exception 
	{
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		
		driver.get("http://demo.rtcamp.com/rtmedia/members/akash1234/media/");
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() throws IOException, AWTException 
	{
		driver.findElement(By.linkText("Upload")).click();

		driver.findElement(By.linkText("HERE")).click();
		
		driver.findElement(By.id("user_login")).sendKeys("Akash1234");
		
		driver.findElement(By.id("user_pass")).sendKeys("Akash1234");
		
		driver.findElement(By.id("wp-submit")).click();
		
		driver.findElement(By.linkText("Howdy, Akash")).click();
		
		
	    
	    driver.findElement(By.id("user-media")).click();
		
	    driver.findElement(By.id("rtm_show_upload_ui")).click();
	    
	    driver.findElement(By.id("rtmedia_upload_terms_conditions")).click();
		
		WebElement ele=driver.findElement(By.id("rtmedia_url_upload_input"));
		
		ele.sendKeys("http://allthingsd.com/files/2013/02/google_campus.jpg");
		
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		ele.sendKeys(Keys.TAB);
		
		driver.findElement(By.className("start-media-upload")).click();
		


		
	//	fail("Not yet implemented");
	}


		
	}


