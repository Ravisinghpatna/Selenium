package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintAutoSuggestionGoogle {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("java");
		Thread.sleep(2000);
		List<WebElement> allSuggestion = driver.findElements(By.xpath("//span[contains(text(),'java')]"));
		int count = allSuggestion.size();
		System.out.println(count);
		
		for(int i=0;i<count;i++)
		{
			String text = allSuggestion.get(i).getText();
			System.out.println(text);
		}
		
		  allSuggestion.get(1).click();
		
		
	}

}
