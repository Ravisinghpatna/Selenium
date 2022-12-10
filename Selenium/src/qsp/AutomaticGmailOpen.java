package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomaticGmailOpen {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://testfreshers.com/");
		driver.findElement(By.xpath("//a[@href='/login']")).click();
		driver.findElement(By.xpath("//input[@type=\"email\"]")).sendKeys("ravisinghpatna27@gmail.com");
		driver.findElement(By.xpath("//input[@type=\"password\"]")).sendKeys("Ravisingh@27");
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
	}

}
