package qsp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Testmatick {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://testmatick.com/");
		WebElement resource = driver.findElement(By.xpath("(//a[text()='Home'])[1]"));
		WebElement resource2 = driver.findElement(By.xpath("//span[text()='About Us']"));
		WebElement resource3=driver.findElement(By.xpath("//span[text()='Our Workspace']"));
		Actions a=new Actions(driver);
		a.moveToElement(resource).perform();
		a.moveToElement(resource2).perform();
		a.moveToElement(resource3).click().perform();
		
		JavascriptExecutor j= (JavascriptExecutor) driver;
		j.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		
		


	}
}
