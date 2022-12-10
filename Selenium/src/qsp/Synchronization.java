package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Synchronization {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();

		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.xpath("//input[@id=\"username\"]")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@type=\"password\"]")).sendKeys("manager");
		driver.findElement(By.xpath("//a[@id=\"loginButton\"]")).click();
	//	driver.findElement(By.xpath("//a[@href=\"/logout.do\"]")).click();

		WebDriverWait wait=new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.titleContains("actiTIME"));
		wait.until(ExpectedConditions.titleIs("actiTIME -  Enter Time-Track"));
		String title = driver.getTitle();
		System.out.println(title);
		driver.close();


	}

}
