package day4selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class webTableTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://demo.guru99.com/test/web-table-element.php#");
		List<WebElement>col=driver.findElements(By.xpath("//*[@id=\'leftcontainer\']/table/thead/tr/th"));
		System.out.println("column size is:"+col.size());
		List<WebElement>rows=driver.findElements(By.xpath("//*[@id='leftcontainer']/table/tbody/tr"));
		System.out.println("no of rows:"+rows.size());
		String cell=driver.findElement(By.xpath("//*[@id='leftcontainer']/table/tbody/tr[1]/td[2]")).getText();
		if (cell.equals("A")) {
			System.out.println("data validation is success");
		}else
			{
				System.out.println("data is incorrect");
			}
		String toplist=driver.findElement(By.xpath("//*[@id='leftcontainer']/table/tbody/tr[1]/td[1]")).getText();
		System.out.println("top company name is:"+toplist);
		for (int i=1;i<5;i++) {
			String list=driver.findElement(By.xpath("//*[@id='leftcontainer']/table/tbody/tr["+"i"+"]/td[1]")).getText();
			System.out.println(list);
			driver.close();

	}

}
}
