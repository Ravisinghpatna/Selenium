package monthSept_December;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DEmo {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		
	}

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com");
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("iphone 14");
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).submit();
		
		List<WebElement> mob = driver.findElements(By.xpath("//div[contains(text(),'APPLE iPhone 14 ')]"));
	List<WebElement> pri = driver.findElements(By.xpath("//div[contains(text(),'APPLE iPhone 14 ')]/../../div[2]/div[1]/div[1]"));
	 
	
	 int count = mob.size();
	 System.out.println(count);
	 
	 for(int i=1;i<=count;i++)
	 {
		String text=mob.get(i).getText();
		String text2=pri.get(i).getText();
		
		System.out.println(text+" ----------> "+text2);
	 }
	 driver.close();

	}

}
