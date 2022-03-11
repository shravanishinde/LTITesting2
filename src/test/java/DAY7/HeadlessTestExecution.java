package DAY7;
import org.junit.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadlessTestExecution {
	@Test
	public void testcase1() {
		ChromeOptions option=new ChromeOptions();
		option.addArguments("headless");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver WebDriver=new ChromeDriver(option);
		WebDriver.get("https://www.google.com/");
		System.out.println(WebDriver.getTitle());
		WebDriver.close();
		
	}

}
