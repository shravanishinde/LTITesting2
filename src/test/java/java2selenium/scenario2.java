package java2selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class scenario2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/");
		driver.manage().window().maximize();
		driver.findElement(By.name("userName")).sendKeys("shravani");
		driver.findElement(By.name("password")).sendKeys("shra123");
		driver.findElement(By.name("submit")).click();
		driver.findElement(By.linkText("Flights")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//input[@value='oneway']")).click();
		Select p=new Select(driver.findElement(By.name("passCount")));
		p.selectByIndex(2);
		Select d=new Select(driver.findElement(By.name("fromPort")));
		d.selectByVisibleText("London");
		Select month=new Select(driver.findElement(By.name("fromMonth")));
		month.selectByVisibleText("February");
		Select s=new Select(driver.findElement(By.name("fromDay")));
		s.selectByVisibleText("24");
		Select b=new Select(driver.findElement(By.name("toPort")));
		b.selectByVisibleText("Frankfurt");
		Select r=new Select(driver.findElement(By.name("toMonth")));
		r.selectByVisibleText("May");
		Select n=new Select(driver.findElement(By.name("toDay")));
		n.selectByVisibleText("20");
		driver.findElement(By.xpath("//input[@value='Coach']")).click();
		Select k=new Select(driver.findElement(By.name("airline")));
		k.selectByVisibleText("Unified Airlines ");
		driver.close();
		
		
		
		
		
				
		

	}

}
