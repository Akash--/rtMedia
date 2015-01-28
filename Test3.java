//Login with valid id and password
package script;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test3 {
	private WebDriver driver;

	@Before
	public void setUp() throws Exception {
		driver=new FirefoxDriver();
		
		driver.get("http://demo.rtcamp.com/rtmedia/");
	}

	@After
	public void tearDown() throws Exception {
		//driver.quit();
	}

	@Test
	public void test() {
		driver.findElement(By.linkText("Log in")).click();
		
		driver.findElement(By.id("user_login")).sendKeys("Akash1234");
		
		driver.findElement(By.id("user_pass")).sendKeys("Akash1234");
		
		driver.findElement(By.id("wp-submit")).click();
		//fail("Not yet implemented");
	}

}
