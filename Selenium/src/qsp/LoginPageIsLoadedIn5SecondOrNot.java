package qsp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPageIsLoadedIn5SecondOrNot {
static {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
		
		try
		{
			driver.get("https://demo.actitime.com/");
			System.out.println("Page is Loaded within 5 Second");
		}
		catch(TimeoutException e)
		{
			System.out.println("Page is not Loaded Within 5 Second");
		}
		driver.close();
		
	}

}
