package day3selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alert {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Alerts.html");
		driver.findElement(By.id("OKTab")).click();
		driver.switchTo().alert().accept();
		driver.findElement(By.xpath("//a[contains(text(),'Alert with OK & Cancel ')]")).click();
		driver.findElement(By.id("CancelTab")).click();
		driver.switchTo().alert().dismiss();
		driver.findElement(By.xpath("//a[contains(text(),'Alert with Textbox')]")).click();
		driver.findElement(By.id("Textbox")).click();
		String text=driver.switchTo().alert().getText();
		if(text.contains("Please enter your name")) {
		Thread.sleep(2000);
		
			driver.switchTo().alert().sendKeys("Shravani");
			driver.switchTo().alert().accept();
		}
		
		

	}

}
