package myPractices;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Automate_automationtesting_website {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://demo.automationtesting.in/Alerts.html");
		driver.findElement(By.xpath("//a[text()='Alert with OK & Cancel ']")).click();
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		driver.switchTo().alert().accept();
		
		
		String expected="You Pressed Cancel";
		String disp = driver.findElement(By.xpath("//p[@id='demo']")).getText();
		
		if(expected.equals(disp))
		{
			System.out.println("It is Matching");
		}
		else {
			System.out.println("It Is Not matching");
		}
		driver.close();
			
	}
	
}
