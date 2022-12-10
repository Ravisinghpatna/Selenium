package myPractices;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Medibuddy {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.medibuddy.in/");
		driver.findElement(By.xpath("//h1[text()='Medicine']")).click();
		//driver.findElement(By.xpath("//img[@alt='medicine']")).click();
		driver.findElement(By.name("pincode")).sendKeys("560086");
		

	}

}
