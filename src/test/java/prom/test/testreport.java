package prom.test;

import static org.junit.Assert.assertTrue;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import DAY6.HomePageClass;
import DAY6.Registerclass;

public class testreport {
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
	@Test
	public void registerTest() {
		hp.click_register();
		rp.perform_register_female("shravani","shinde","shravani1234@gmail.com","shra123","shra123");
		String text=driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]")).getText();
		assertTrue(text.contains("completed"));
		driver.findElement(By.linkText("Log out")).click();
	}
	public void LoginTC() {
		hp.click_login();
		lp.perform_login("shravani1234@gmail.com","shra123");
	}
}

