package qsp;

import java.util.Scanner;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseTheSpecificBrowser {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] Ravi) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Title of the Browser");
		String title1 = sc.nextLine();

		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://secure.indeed.com/");
		driver.findElement(By.id("apple-signin-button")).click();

		driver.findElement(By.id("login-facebook-button")).click();
		Set<String> allwh = driver.getWindowHandles();	
		//String title1=driver.getTitle();
		
		for(String wh:allwh)
		{
			String title2=driver.getTitle();
			if(title1.contains(title2))
			{
				driver.close();
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
}
