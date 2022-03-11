package practisecode;
import org.openqua.Selenium
import org.testng.annotations.Test;

import static org.Junit.aeesert.*;
import static org.junit.Assert.assertTrue;

import org.openqa.selenium.*;

public class googletest {
	WebDriver driver;
	
	
	
@Test
public void TC1(){
	WebElement searchinput=webDriver.findElement(By.name("q"));
	WebElement searchbutton=webDriver.findElement(By.id("Search button"));
	assertTrue(searchinput.isDisplayed());
	assertTrue(searchbutton.isDisplayed());
}
@Test
public void TC2(){
	WebDriver.findElement(By.id("Search-input")).click();
	String err=webDriver.findElements(By.id("no result")).getText();
	assertTrue(err.contains("provide some query"));
	}
@Test
public void TC3() throws InterruptedException{
	webDriver.findElement(By.id("search-input")).sendKeys("testing");
	webDriver.findElement(By.id("search")).click();
	Thread.sleep(300);
	int listsize=webDriver.findElements(By.xpath("//*[@id=\'yschsp\']"));
	assertTrue(webdriver.getTitle().contains("testing"));
	
}
@Test
public void TC4() {
	int links=webDriver.(By.tagName("a")).size();
	assertTrue(links>0);
}

}
