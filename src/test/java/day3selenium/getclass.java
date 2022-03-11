package day3selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com");
		String title=driver.getTitle();
		System.out.println("title is correct");
	   System.out.println(driver.getCurrentUrl());
	   System.out.println(driver.getPageSource());
	   driver.navigate().back();
	   driver.navigate().forward();
	   driver.navigate().refresh();
	   driver.close();
	   
	   
	}
	}


