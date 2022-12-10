package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Demo1 {
	static
	{
		System.setProperty("webdriver.chrome.drive", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.myntra.com");
	  driver.findElement(By.xpath("//h1[text()='HRX by Hrithik Roshan']/../div/p/span[1]/strong")).click();
	System.out.println();	
		
	}

}
