package DAY5SELENIUM;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class testngexercise2 {
	WebDriver driver;
  @Test(priority=1)
  public void loginTC1() {
	  System.out.println("test case1");
		driver.manage().window().maximize();
		driver.findElement(By.name("userName")).sendKeys("shravani");
		driver.findElement(By.name("password")).sendKeys("shra123");
		driver.findElement(By.name("submit")).click();
  }  
 @Test(priority=2,enabled=false)
  public void FlightSearchTC2() throws InterruptedException {
	 driver.findElement(By.linkText("Flights")).click();
	   Thread.sleep(5000);
	   driver.findElement(By.xpath("//input[@value='oneway']")).click();
 }
  @BeforeTest
  public void beforeTest() {
	  System.out.println("pre-requisite");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/");
  }

  @AfterTest
  public void afterTest() {
	  driver.close();
  }

}
