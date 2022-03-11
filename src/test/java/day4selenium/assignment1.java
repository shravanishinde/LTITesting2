package day4selenium;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import net.jodah.failsafe.internal.util.Assert;

public class assignment1 {
		WebDriver driver;

		
		 
		 @Test
		 public void Testcase1 () {
			 
			 System.out.println("Check Whether Registration is Success");	
			 driver.findElement(By.linkText("Register")).click();
				driver.findElement(By.id("gender-female")).click();
				driver.findElement(By.name("FirstName")).sendKeys("Asmita");
				driver.findElement(By.name("LastName")).sendKeys("Salunkhe");
				driver.findElement(By.name("Email")).sendKeys("asmisalunkhe@gmail.com");
				driver.findElement(By.name("Password")).sendKeys("A123456");
				driver.findElement(By.name("ConfirmPassword")).sendKeys("A123456");
				driver.findElement(By.name("register-button")).click();
				
				String actualresult=driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[1]/a")).getText();
				Assert.assertEquals("Register", actualresult);
		 }
		 
		 @Test 
		 public void Testcase2() {
			 driver.findElement(By.linkText("Log in")).click();
				driver.findElement(By.name("Email")).sendKeys("shravanishinde188@gmail.com");
				driver.findElement(By.name("Password")).sendKeys("shra123");
				driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a")).click();
				
				String actualresult=driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a")).getText();
	             Assert.assertEquals("Log in",actualresult);
				
		 }

		 @Before
		public void  before() {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Asmita Salunkhe\\Downloads\\chromedriver_win32\\chromedriver.exe");
		    driver=new ChromeDriver();
			driver.get("http://demowebshop.tricentis.com/ ");
		 }
		 
		 @After
			public void  after() {
				System.out.println("Postcondition");
				driver.close();
		 }
		 
		 
				
		 

	}

}
