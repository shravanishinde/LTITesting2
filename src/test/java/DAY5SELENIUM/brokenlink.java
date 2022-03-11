package DAY5SELENIUM;
	import java.io.IOException;
	import java.net.HttpURLConnection;
	import java.net.URL;
	import java.util.List;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class brokenlink{
		public static void main(String[] args) throws IOException, InterruptedException {
			System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Admin\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("http://demowebshop.tricentis.com/");
			driver.manage().window().maximize();
			//capture from Webpage
			List<WebElement>links=driver.findElements(By.tagName("a"));
			//Number of Links
			System.out.println(links.size());
			for(int i=0;i<links.size();i++)
			{
				WebElement element=links.get(i);
				String url=element.getAttribute("href");
				URL links1=new URL(url);
				HttpURLConnection httpConn=(HttpURLConnection) links1.openConnection();
				Thread.sleep(2000);
				httpConn.connect();
				int rescode=httpConn.getResponseCode();
				if(rescode>400)
				{
					System.out.println(url+"..."+"Is Broken Link");
					
				}else
				{
					System.out.println(url+"..."+"is A Valid Link");
			
				}
			  
			}
			}
			

}
