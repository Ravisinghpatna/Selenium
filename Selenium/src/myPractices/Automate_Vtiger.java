package myPractices;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Automate_Vtiger {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.vtiger.com/");
		WebElement resource = driver.findElement(By.xpath("(//a[@id='navbarPages'])[2]"));
		Actions a=new Actions(driver);
		a.moveToElement(resource).perform();
		
		driver.findElement(By.partialLinkText("Contact Us")).click();
		String phone = driver.findElement(By.xpath("//p[contains(text(),'Bengaluru')]/..")).getText();
		System.out.println(phone);
		driver.close();
		
	
		
		

	}

}
