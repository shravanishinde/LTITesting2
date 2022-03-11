package java2selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demowebshop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/");
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.id("gender-female")).click();
		driver.findElement(By.name("FirstName")).sendKeys("shravani");
		driver.findElement(By.name("LastName")).sendKeys("shinde");
		driver.findElement(By.name("Email")).sendKeys("shravanishinde188@gmail.com");
		driver.findElement(By.name("Password")).sendKeys("shra123");
		driver.findElement(By.name("ConfirmPassword")).sendKeys("shra123");
		driver.findElement(By.name("register-button")).click();
		driver.close();
		

	}

}
