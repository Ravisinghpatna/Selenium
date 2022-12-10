package monthSept_December;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Type_ABCD_inT1_T2_Textbox_Alternatively {

	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");

		}

		public static void main(String[] args) throws InterruptedException {
			WebDriver	driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.get("file:///D:/page1.html");
		
			driver.findElement(By.id("t1")).sendKeys("A");
			Thread.sleep(1000);
			driver.switchTo().frame(0);
			
			driver.findElement(By.id("t2")).sendKeys("B");
			Thread.sleep(1000);
			driver.switchTo().defaultContent();
			driver.findElement(By.id("t1")).sendKeys("C");
			Thread.sleep(1000);
			driver.switchTo().frame(0);
			
			driver.findElement(By.id("t2")).sendKeys("D");
			driver.switchTo().defaultContent();
				
			driver.close();
	}

}
