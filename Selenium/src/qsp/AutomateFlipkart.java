package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomateFlipkart {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}


	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("iphone");
		Thread.sleep(2000);
		List<WebElement> allLink = driver.findElements(By.xpath("//div[@class=\"lrtEPN _17d0yO\"]"));
		
		int count = allLink.size();
		
		for(int i=0;i<count;i++)
		{
			String text = allLink.get(i).getText();
			System.out.println(text);
		}
		allLink.get(count-1).click();
		driver.close();

	}
}
