package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateToQspiderAndTypeQspiders {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("qspiders");
		Thread.sleep(1000);

		List<WebElement> Suggest = driver.findElements(By.xpath("//span[contains(text(),'qspiders')]"));
		int count = Suggest.size();

		for(int i=0;i<count;i++)
		{
			String text = Suggest.get(i).getText();
			System.out.println(text);
		}
		Suggest.get(count-1).click();


	}

}
