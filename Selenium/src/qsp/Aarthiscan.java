package qsp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Aarthiscan {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriverManager
		WebDriver driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.get("https://reports.aarthiscan.com/ReportsPortal/#/login?type=organisation");
		driver.findElement(By.xpath("//*[@id=\"logincontainer\"]/div/div[2]/div/div/div/div[2]/input")).sendKeys("C02000527");
		driver.findElement(By.xpath("//input[@placeholder=\"Password\"]")).sendKeys("R86C2");
		
		driver.findElement(By.xpath("//*[@id=\"reportlogin\"]")).click();
			
		
	}

}
