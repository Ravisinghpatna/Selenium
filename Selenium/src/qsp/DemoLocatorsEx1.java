package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoLocatorsEx1 {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///D:/Demo.html");
		driver.findElement(By.tagName("a")).click();
		driver.navigate().back();
		driver.findElement(By.tagName("d1")).click();
		driver.navigate().back();
		driver.findElement(By.className("n1")).click();
		driver.navigate().back();
		driver.findElement(By.className("c1")).click();
		driver.close();
	}

}
