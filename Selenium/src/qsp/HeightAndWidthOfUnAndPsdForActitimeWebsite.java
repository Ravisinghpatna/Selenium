package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HeightAndWidthOfUnAndPsdForActitimeWebsite {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/");
		
		
	 	int heightU = driver.findElement(By.id("username")).getSize().getHeight();
		int widthU = driver.findElement(By.id("username")).getSize().getWidth();
		
		int heightP = driver.findElement(By.name("pwd")).getSize().getHeight();
		int widthP = driver.findElement(By.name("pwd")).getSize().getWidth();
		
		if(heightU==heightP&&widthU==widthP)
		{
			System.out.println("height and width of username and password textbox is equal ");
		}
		else
		{
			System.out.println("height and width of username and password textbox is not equal ");
		}
	}

}
;