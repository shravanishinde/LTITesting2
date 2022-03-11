package day1javaselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class launchingbrowsertest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		driver.findElement(By.linkText("REGISTER")).click();
		driver.findElement(By.name("email")).sendKeys("shravani");
		driver.findElement(By.name("password")).sendKeys("shra123");
		driver.findElement(By.name("confirmPassword")).sendKeys("shra123");
		driver.findElement(By.name("submit")).click();
		driver.close();

	}

}
