package java2selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class scenario4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/");
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.name("Email")).sendKeys("shravanishinde188@gmail.com");
		driver.findElement(By.name("Password")).sendKeys("shra123");
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		driver.findElement(By.id("small-searchterms")).sendKeys("build your own cheap computer");
		driver.findElement(By.xpath("//input[@value='Search']")).click();
		driver.findElement(By.linkText("Build ypur own computer")).click();
		driver.findElement(By.xpath("//input[@value='65']")).click();
		
		

	}

}
