package DAY5SELENIUM;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class junitexercise2 {
	WebDriver driver;
	
	
	
	@Test
	public void TestCase1() {
		WebElement registerlink=driver.findElement(By.linkText("Register"));
		WebElement loginlink=driver.findElement(By.linkText("Log in"));
		assertTrue(registerlink.isDisplayed());
		assertTrue(loginlink.isDisplayed());
		
	}
	
	@Test
	public void TestCase2() {
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.name("Email")).sendKeys("shravanishinde188@gmail.com");
		driver.findElement(By.name("Password")).sendKeys("shra123");
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		String emailtext=driver.findElement(By.linkText("shravanishinde188@gmail.com")).getText();
		assertTrue(emailtext.contains("shra123"));
		assertEquals("shravanishinde188@gmail.com",emailtext);
		assertTrue(driver.findElement(By.linkText("shravanishinde188@gmail.com")).isEnabled());
		
	}
		
	    @Before
		public void before() {
			System.out.println("pre-aquisition");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
	     driver=new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/");
	    }
	    @After
	    public void after() {
	    	System.out.println("postcondition");
	    	driver.close();
	    }
}
