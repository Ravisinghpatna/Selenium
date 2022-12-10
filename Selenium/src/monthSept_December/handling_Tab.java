package monthSept_December;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class handling_Tab {
	static {;
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.linkText("actiTIME Inc.")).click();
		
		Set<String>	allwh=driver.getWindowHandles();
		int count=allwh.size();
		
		for (String wh:allwh)
		{
			System.out.println(wh);
		
		}
		driver.quit();
	}

}
