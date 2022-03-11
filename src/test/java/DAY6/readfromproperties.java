package DAY6;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.junit.AfterClass;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class readfromproperties {
	static WebDriver driver;
	static FileInputStream fis;
	static Properties prop;
	
	
	@Before
	public static void before() throws IOException {
		fis=new FileInputStream(new File("C:\\Users\\Admin\\Desktop\\JAVA\\config.properties"));
		prop=new Properties();
		prop.load(fis);
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://demo.guru99.com/test/newtours/");
		driver.get(prop.getProperty("newtoursurl"));
	}
	@AfterClass
	public static void afterClass() {
		driver.close();
		
	}
	
	

}
