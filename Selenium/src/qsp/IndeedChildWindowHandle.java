package qsp;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IndeedChildWindowHandle {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		driver.get("https://secure.indeed.com/");
		
		
		
		driver.findElement(By.id("apple-signin-button")).click();
		driver.findElement(By.id("login-google-button")).click();
		driver.findElement(By.id("login-facebook-button")).click();
		
		

		Set<String> allWinAdd = driver.getWindowHandles();
		int count=allWinAdd.size();
		System.out.println("Total count :"+count);

		
		for(String obj:allWinAdd)
		{
			System.out.println(obj);
		}
		driver.quit();

	}



}
