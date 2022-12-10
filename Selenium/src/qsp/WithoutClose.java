package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class WithoutClose {
	static {
		System.setProperty("webdriver.edge.driver", "./driver/msedgedriver.exe");
		
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException  {
		
	WebDriver driver=new ChromeDriver();
	driver.navigate().to("https://www.google.com");
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.navigate().back();
	Thread.sleep(1000);
	driver.navigate().forward();
	driver.close();
	WebDriver driver1=new EdgeDriver();
	driver1.navigate().to("https://www.hotstar.com");
	Thread.sleep(5000);
	driver1.manage().window().maximize();
	driver1.manage().deleteAllCookies();
	driver1.navigate().back();
	Thread.sleep(1000);
	driver.navigate().forward();
	Thread.sleep(2000);
	driver.quit();
	}

}
