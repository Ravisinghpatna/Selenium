package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintLatestBusinessNewsPresentInBCC {
	static{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");

	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.bbc.com/");
		Thread.sleep(1000);
		//List<WebElement> tag = driver.findElements(By.xpath("//span[@class=\"top-list-item__bullet\"]"));
		List<WebElement> tag = driver.findElements(By.xpath("//a[@rev=\"most-popular|link\"]"));
		int count=tag.size();
		System.out.println(count);

		for(int i=0;i<count;i++)
		{
			String text=tag.get(i).getText();
			System.out.println(text);
		}

	//	driver.close();

	}

}
