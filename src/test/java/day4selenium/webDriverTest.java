package day4selenium;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class webDriverTest {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/");
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,2000)");
		TakesScreenshot s=(TakesScreenshot)driver;
		File src=s.getScreenshotAs(OutputType.FILE);
		File dest=new File("C:\\Users\\Admin\\Desktop\\JAVA\\Reports\\screenshot1.png");
		FileUtils.copyFile(src,dest);
		Thread.sleep(2000);
		driver.close();
	}

}
