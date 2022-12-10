package qsp;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseTheBrowserExpectParentBasedOnTheTitle {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] Ravi) {


		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://secure.indeed.com/");
		driver.findElement(By.id("apple-signin-button")).click();

		driver.findElement(By.id("login-facebook-button")).click();
		String pwh=driver.getWindowHandle();
		String title = driver.getTitle();
		Set<String>allwh=driver.getWindowHandles();

		for(String wh:allwh)
		{
			driver.switchTo().window(wh);
			String  title1=driver.getTitle();
			if(title.equals(title1)) {
				
			}	
			else
				driver.close();

		}


	}

}
