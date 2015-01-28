//update the profile....
package script;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Test6
{
	private WebDriver driver;

	@Before
	public void setUp() throws Exception
	{
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
		
		
		Select post=new Select(driver.findElement(By.id("album-list-rtmediauploaderwidget_3")));
		assertFalse(post.isMultiple());
		post.selectByVisibleText("Profile Pictures");
		
	
		
		Select privacy=new Select(driver.findElement(By.id("rtSelect0")));
		assertFalse(privacy.isMultiple());
		privacy.selectByVisibleText("Friends");
		
		
		
		 driver.findElement(By.linkText("Howdy, Akash")).click();
		 
		 driver.findElement(By.id("field_1")).clear();
		 
		 driver.findElement(By.id("field_2")).clear();
		 
		 driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		 
		 driver.findElement(By.id("field_1")).sendKeys("Akash chavan");
		 
		 driver.findElement(By.id("field_2")).sendKeys("Mumbai");
		 
		 Select year=new Select(driver.findElement(By.id("field_4_year")));
			assertFalse(year.isMultiple());
			year.selectByVisibleText("1994");
			
		 driver.findElement(By.id("profile-group-edit-submit")).click();
	}

}
