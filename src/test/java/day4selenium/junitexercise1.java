package day4selenium;


import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class junitexercise1 {
	WebDriver driver;
	@Test
	public void testcase1(){
		System.out.println("test case1");
		driver.manage().window().maximize();
		driver.findElement(By.name("userName")).sendKeys("shravani");
		driver.findElement(By.name("password")).sendKeys("shra123");
		driver.findElement(By.name("submit")).click();
		String actualresult=driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[1]/td/h3")).getText();
		Assert.assertEquals("Login Successfully",actualresult);
	}
	   @Test
	   public void testcase2() throws InterruptedException{
		   System.out.println("flights search");
		   driver.findElement(By.linkText("Flights")).click();
		   Thread.sleep(5000);
		   String title=driver.getTitle();
		   Assert.assertEquals("Find a Flight: Mercury Tours:", title);
		   driver.findElement(By.xpath("//input[@value='oneway']")).click();
		   
	   }
		@Before
		public void before() {
		System.out.println("pre-requisite");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/");
		
		}
		@After
		public void after() {
			System.out.println("postcondition");
			driver.close();
		
	}

}
