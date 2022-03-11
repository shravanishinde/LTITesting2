package day3selenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class window {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/popup.php");
		String oldpage=driver.getWindowHandle();
		System.out.println("currently opened page window ID is:"+oldpage);
		driver.findElement(By.linkText("Click Here")).click();
		Set <String>newpage=driver.getWindowHandles();
		for (String name:newpage) {
			driver.switchTo().window(name);
			System.out.println("window id of newly opened tab is:"+name);
		}
		driver.findElement(By.name("emailid")).sendKeys("shra188@gmail.com");
		driver.findElement(By.name("btnLogin")).click();
		driver.switchTo().window(oldpage);
		driver.quit();
		
		
			
		}
		

	}


