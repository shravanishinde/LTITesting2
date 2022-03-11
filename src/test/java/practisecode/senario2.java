package practisecode;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test; 
import org.openqua.selenium.*
import static org.Junit.Assert.*;

public class senario2 {
	
@Test
public void TC1() {
	WebElement login=webDriver.findElement(By.name("uid")).sendKeys(" ");
	WebElement password=webDriver.findElement(By.id("password")).sendKeys(" ");
	WebElement loginbutton=webDriver.findElement(By.id("btnLogin")).click();
	webDriver.switchTo().accept();
}

}
