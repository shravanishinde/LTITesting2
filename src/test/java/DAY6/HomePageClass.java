package DAY6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePageClass {
	WebDriver driver;
	
	public HomePageClass(WebDriver driver) {
		this.driver=driver;
	}
	By registerlink=By.linkText("Register");
	By loginlink=By.linkText("Log in");
	By searchbox=By.name("q");
	By searchbutton=By.xpath("//input[@value='search']");
	By logout=By.linkText("Log out");
	public void click_login() {
		driver.findElement(loginlink).click();
	}
	public void click_register() {
		driver.findElement(registerlink).click();
	}
	public void search_product(String productname) {
		driver.findElement(searchbox).sendKeys(productname);
		driver.findElement(searchbutton).click();
	}
	public void click_logout() {
		driver.findElement(logout).click();
		// TODO Auto-generated method stub
		
	}
	

}
