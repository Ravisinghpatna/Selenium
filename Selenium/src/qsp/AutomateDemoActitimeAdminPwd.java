package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomateDemoActitimeAdminPwd {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/");
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager")	;
		driver.findElement(By.xpath("//a[@id='loginButton']")).click();
		//driver.findElement(By.xpath("//a[@href=\"/logout.do\"]")).click();
		driver.get("https://demo.actitime.com/user/submit_tt.do");
		//driver.findElement(By.xpath("//a[@href=\"/logout.do\"]")).click();
		driver.findElement(By.id("logoutLink")).click();
		
				
			

	}

}
