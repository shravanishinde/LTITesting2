package DAY5SELENIUM;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class java2 {
	WebDriver driver;
	@Test
	public void testcase1(){
		List<WebElement>b=driver.findElements(By.tagName("a"));
		int a=b.size();
		System.out.println("total link available"+a);
		{
		for (int i=0;i<=a;i++)
          System.out.println(b.get(i).getText());
	}
	}
	@Before
	public void before(){
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
	    driver=new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/");
	}
	@After
	public void after() {
		driver.close();
	}
	

}
