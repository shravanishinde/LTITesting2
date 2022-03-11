package prom.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPageClass {
	WebDriver driver;
	public LoginPageClass(WebDriver driver){
      this.driver=driver;
	}
    @FindBy(name="Email")public WebElement email;
    @FindBy(name="Password")public WebElement psd;
    @FindBy(xpath="//input[@value='Log in']")public WebElement loginbutton;
    
    public void perform_login(String un,String psd) {
   email.sendKeys(un);
   loginbutton.click();
}
}
