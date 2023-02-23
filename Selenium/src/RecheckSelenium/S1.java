package RecheckSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class S1 {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		int eh = driver.findElement(By.id("email")).getSize().getHeight();
		int ew = driver.findElement(By.id("email")).getSize().getWidth();
		 int ph = driver.findElement(By.id("pass")).getSize().getHeight();
		 int pw = driver.findElement(By.id("pass")).getSize().getWidth();

		
		
		if(eh==ph && ew==pw)
			System.out.println("email and password are equals");
		else
			System.out.println("both are not equal");
	}

}
