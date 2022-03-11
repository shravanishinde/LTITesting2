package DAY5SELENIUM;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class link1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/");
		List<WebElement>ls=driver.findElements(By.tagName("a"));
		int sz=ls.size();
		System.out.println("total link available"+sz);
		for (int i=0;i<=sz;i++)
          System.out.println(ls.get(i).getText());
		driver.close();
	}
}

	