package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ContentPresentInStaticWebPage {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///D:/Demo.html");
	 List<WebElement> tag = driver.findElements(By.xpath("//a"));
	 int count = tag.size();
	 System.out.println(count);
	 for(int i=0;i<count;i++)
	 {
//		 WebElement link = tag.get(0);
//		 String text = link.getText();

		 String text = tag.get(i).getText();
		 System.out.println(text);
	 }
	 
	 driver.close();		
	}
}
