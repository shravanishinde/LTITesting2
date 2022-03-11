package DAY7;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;



	  public class ParallelTestExecution {
	  	  @Test
	  		public void testcase1() {
	  			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
	  			WebDriver WebDriver=new ChromeDriver();
	  			WebDriver.get("https://www.google.com/");
	  			System.out.println(WebDriver.getTitle());
	  			WebDriver.close();
	  			
	  		}

}
