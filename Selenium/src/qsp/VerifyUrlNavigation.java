package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyUrlNavigation {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe ");
	}

	public static void main(String[] args) {
		
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.seleniumhq.org/");
		String expUrl = "https://www.selenium.dev/";
		String actuUrl=driver.getCurrentUrl();
		
		if(actuUrl.equals(expUrl))
		{
			System.out.println("url is Successfully Navigate and pass");
		}
		else
			System.out.println("url is not successfully Navigate and pass");
		
	driver.close();
	}

}
