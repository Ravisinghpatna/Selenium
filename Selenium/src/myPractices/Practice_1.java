package myPractices;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import qsp.DemoA;

public class Practice_1 {
	static {

		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();

		driver.navigate().to("https://www.flipkart.com");
		driver.findElement(By.xpath("//button[text()=\"✕\"]")).click();
		driver.findElement(By.name("q")).sendKeys("iphone 14 pro max");
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();

		List<WebElement> mobile = driver.findElements(By.xpath("//div[contains(text(),\"APPLE iPhone 14 Pro Max\")]"));
		List<WebElement> price=driver.findElements(By.xpath("//div[contains(text(),\"APPLE iPhone 14 Pro Max\")]/../../div[2]/div[1]/div[1]"));

		int	count=mobile.size();

		for(int i=0;i<count;i++) 
		{
			String text = mobile.get(i).getText();
			String text1 = price.get(i).getText();
			System.out.println(text+"-------------------->"+text1);
		}
		driver.close();
	}

}
