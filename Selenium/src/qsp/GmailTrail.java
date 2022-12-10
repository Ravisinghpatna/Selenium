package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GmailTrail {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.gmail.com");
	
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("redmipocom2@gmail.com");
		driver.findElement(By.xpath("//div[@ jsname='Njthtb']")).click();
//		driver.findElement(By.xpath("")).sendKeys("");
//		driver.findElement(By.xpath("")).click();
	}

}
