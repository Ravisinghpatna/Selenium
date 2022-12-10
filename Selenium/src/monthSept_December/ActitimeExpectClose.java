package monthSept_December;

import java.util.Scanner;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActitimeExpectClose {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value of the number");
		String st=sc.nextLine();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://secure.indeed.com/");
		driver.findElement(By.id("apple-signin-button")).click();
		driver.findElement(By.id("login-facebook-button")).click();
		String parent = driver.getWindowHandle();
		Set<String> allwh = driver.getWindowHandles();
		
	
		//int count = allwh.size();
		//String title=driver.getTitle();

		for(String wh:allwh)
		{
			driver.switchTo().window(wh);
			String title1=driver.getTitle();
			if(title1.equals(st)==false)
			{
				
				driver.close();
			}
			
		}


	}

}


