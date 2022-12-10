package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ISelect;
import org.openqa.selenium.support.ui.Select;

public class HandlingSingleBox {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.findElement(By.linkText("(//a[@role=\"button\"])[2]")).click();
		Thread.sleep(1000);
		
		WebElement monthListBox=driver.findElement(By.id("month"));
		Select s=new Select(monthListBox);
		s.selectByIndex(0);
		Thread.sleep(1000);
		s.selectByValue("6");
		Thread.sleep(1000);
		s.selectByVisibleText("Nov");
		
	}

}
