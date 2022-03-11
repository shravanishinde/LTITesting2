package prom.test;

import static org.junit.Assert.assertTrue;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import DAY6.HomePageClass;
import DAY6.Registerclass;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import DAY6.HomePageClass;
import DAY6.Registerclass;

public class logindata {
	static WebDriver driver;
	static FileInputStream fis;
	static Properties prop;
	 static HomePageClass hp;
	 static Registerclass rp;
	 static LoginPageClass lp;
	@BeforeClass
	public static void beforeClass() throws IOException {
	fis=new FileInputStream(new File("C:\\Users\\Admin\\Desktop\\JAVA\\config.properties"));
	prop=new Properties();
	prop.load(fis);
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	driver.get("http://demowebshop.tricentis.com/");
	hp=new HomePageClass(driver);
	rp=new Registerclass(driver);
	lp = PageFactory.initElements(driver, LoginPageClass.class);
	}
	@AfterClass
	public static void afterClass() {
		driver.close();
	}
	@Test(dataProvider = "data")
	  public void LoginTest(String email, String p) {
		hp.click_login();
		lp.perform_login(email,p);
		if(driver.findElement(By.linkText("Log out")).isDisplayed()) {
		System.out.println("login success");
		hp.click_logout();
		}else {
			System.out.println("login unsuccess");
		}
		
	}


	@DataProvider
	  public Object[][] data() {
	    return new Object[][] {
	      new Object[] { "shravani1@gmail.com", "shra123" },
	      new Object[] { "mercury", "" },
	      
	    };
	}
}