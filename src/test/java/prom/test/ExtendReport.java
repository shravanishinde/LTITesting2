package prom.test;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class ExtendReport {
	ExtentSparkReporter htmlreportloc;
	WebDriver driver;
	ExtentTest test;
	private ExtentReports report;
	
  @Test
  public void LoginTC(){
	  test=createTest("Login TC");
	  driver.findElement(By.name("userName")).sendKeys("mercury");
	  driver.findElement(By.name("password")).sendKeys("mercury");
	  driver.findElement(By.name("submit")).click();
	  if(driver.getTitle().contains("login"))
	  {
		  test.generateLog(Status.FAIL, "Login Unsucess");
	  }
	  }
  private ExtentTest createTest(String string) {
	// TODO Auto-generated method stub
	return null;
}
@BeforeTest
  public void beforeTest() {
	  ExtentReporter=("C:\\Users\\Admin\\Desktop\\JAVA\\MyReport.html");
	  report=new ExtentReports();
	  report.attachReporter(htmlreportloc);
	  htmlreportloc.config().setTheme(Theme.DARK);
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
	     driver=new ChromeDriver();
	     driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	     driver.get("https://demo.guru99.com/test/newtours/");
	 }
 

private void ExtentReporter(String string) {
	// TODO Auto-generated method stub
	
}
@AfterTest
  public void afterTest() {
	report.flush();
	driver.close();
  }

}
