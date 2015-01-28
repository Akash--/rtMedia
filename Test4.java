//login with invalid id and password 
package script;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test4 
{
   private WebDriver driver;

   @Before
	public void setUp() throws Exception {
	
	   driver=new FirefoxDriver();
		
		driver.get("http://demo.rtcamp.com/rtmedia/");
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		driver.findElement(By.linkText("Log in")).click();
		
		driver.findElement(By.id("user_login")).sendKeys("Akash123");
		
		driver.findElement(By.id("user_pass")).sendKeys("Akash1234");
		
		driver.findElement(By.id("wp-submit")).click();
		
		assertEquals("ERROR",driver.findElement(By.id("login_error")));
		fail("Not yet implemented");
	}

}
