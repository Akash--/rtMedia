//process of registeration.......
package script;

import static org.junit.Assert.*;

//import org.apache.bcel.generic.Select;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Test2 {
	//to create a instance of webdriver
	private WebDriver driver;

	@Before
	public void setUp() throws Exception {
		
		driver=new FirefoxDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://demo.rtcamp.com/rtmedia/");
		
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		
		//click register text
		driver.findElement(By.linkText("Register")).click();
		
		driver.findElement(By.id("signup_username")).sendKeys("Akash1234");
		
		driver.findElement(By.id("field_1")).sendKeys("Akash");
		
		driver.findElement(By.id("signup_email")).sendKeys("chavanakash230@gmail.com");
		
		driver.findElement(By.id("signup_password")).sendKeys("Akash1234");
		
		driver.findElement(By.id("field_2")).sendKeys("Pune");
		
		driver.findElement(By.id("signup_password_confirm")).sendKeys("Akash1234");
		
		Select gender=new Select(driver.findElement(By.id("field_3")));
		
		assertFalse(gender.isMultiple());
		gender.selectByVisibleText("Male");
		
		// logic starts from here..........		
		 
		String aa=  driver.findElement(By.xpath("//*[@id='signup_form']/div[3]/label")).getText();
		int w=aa.length();
		
		
		
		if (w==7)
		{
		
		char num =  driver.findElement(By.xpath("//*[@id='signup_form']/div[3]/label")).getText().charAt(0);
		
		char num2 = driver.findElement(By.xpath("//*[@id='signup_form']/div[3]/label")).getText().charAt(4);
		
		
		char num4 = driver.findElement(By.xpath("//*[@id='signup_form']/div[3]/label")).getText().charAt(2);
		
		
		
		
			

	    char min='+';
		
		
		
		
		String a=Character.toString(num);
		
		
		
		String c=Character.toString(num2);
		
		
		
		int p=Integer.parseInt(a);
		int q=Integer.parseInt(c);
		
		int r=0;
		
		if(num4==min) 
		{
			r=(p + q);
			String r1=Integer.toString(r);
			
			driver.findElement(By.name("bp-security-check")).sendKeys(r1);
			
		}	
		
		else
		{
			r=(p - q);
			String r2=Integer.toString(r);
			
			driver.findElement(By.name("bp-security-check")).sendKeys(r2);
					
		}
		
	}
		else
		{
			char num =  driver.findElement(By.xpath("//*[@id='signup_form']/div[3]/label")).getText().charAt(0);
			char num1 = driver.findElement(By.xpath("//*[@id='signup_form']/div[3]/label")).getText().charAt(1);
			char num2 = driver.findElement(By.xpath("//*[@id='signup_form']/div[3]/label")).getText().charAt(4);
			char num3 = driver.findElement(By.xpath("//*[@id='signup_form']/div[3]/label")).getText().charAt(5);
			char num4 = driver.findElement(By.xpath("//*[@id='signup_form']/div[3]/label")).getText().charAt(3);
			char num5 = driver.findElement(By.xpath("//*[@id='signup_form']/div[3]/label")).getText().charAt(2);
			
			
			String a=Character.toString(num);
			String b=Character.toString(num1);
			a=a+b;
			
		
		    String c=Character.toString(num2);
			String d=Character.toString(num3);
			c= c+d;			
			int p=Integer.parseInt(a);
			int q=Integer.parseInt(c);
			
			int r=0;
			char min='+';
			if(num5==min || num4==min) 
			{
				r=(p + q);
				String r1=Integer.toString(r);
		
				driver.findElement(By.name("bp-security-check")).sendKeys(r1);
		
			}	
			
			else
			{
				r=(p - q);
				String r2=Integer.toString(r);
		
				driver.findElement(By.name("bp-security-check")).sendKeys(r2);
		
			
			}
			
		}
		
		
		Select birthday=new Select(driver.findElement(By.id("field_4_day")));
		
		assertFalse(birthday.isMultiple());
		
		birthday.selectByVisibleText("24");
		
		Select month=new Select(driver.findElement(By.id("field_4_month")));
		
		assertFalse(month.isMultiple());
		
		month.selectByVisibleText("October");
		
		Select year=new Select(driver.findElement(By.id("field_4_year")));
		
		assertFalse(year.isMultiple());
		
		year.selectByVisibleText("1993");
		
		//driver.findElement(By.id("signup_submit")).click();
		
		assertEquals("Sorry, that username already exists!",driver.findElement(By.xpath("//*[@id='basic-details-section']/div[1]")).getText());
		assertEquals("Sorry, that email address is already used!",driver.findElement(By.xpath("//*[@id='basic-details-section']/div[2]")).getText());
		
		
		//fail("Not yet implemented");
	}

}
