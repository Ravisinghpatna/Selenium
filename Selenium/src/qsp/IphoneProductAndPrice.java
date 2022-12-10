package qsp;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class IphoneProductAndPrice {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://demo.actitime.com/login.do");

		driver.findElement(By.id("username")).sendKeys("admin");
		
		driver.findElement(By.name("pwd")).sendKeys("manager");
	
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(3000);
		
		WebDriverWait wait=new WebDriverWait(driver, 10);
		//wait.until(ExpectedConditions.titleContains("actiTIME -  Enter Time-Track"));
		wait.until(ExpectedConditions.titleIs("actiTIME -  Enter Time-Track"));

		String title=driver.getTitle();
		System.out.println(title);
		driver.close();



	}

}
