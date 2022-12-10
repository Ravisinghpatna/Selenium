package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintColor {

	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		//String color = driver.findElement(By.xpath("//a[text()=\"Forgotten password?\"]")).getCssValue("color");
		String color=driver.findElement(By.partialLinkText("Forgotten")).getCssValue("color");
		System.out.println(color);
		driver.close();
		
	}
		

	}


