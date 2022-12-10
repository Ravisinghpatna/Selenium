package monthSept_December;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Aotomate_Actitime_Print_Print_Headlines {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class=\"popup_menu_button popup_menu_button_support\"]")).click();
		driver.findElement(By.xpath("(//div[@class=\"popup_menu_ul\"])[3]/ul/li[6]")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Read Service Agreement")).click();
		Thread.sleep(2000);
				
		Set<String> tabs = driver.getWindowHandles();		
		
//		int count = tabs.size();
//		System.out.println(count);
		
		for(String t:tabs)
		{
			driver.switchTo().window(t);									
		}
		
		List<WebElement> headings = driver.findElements(By.xpath("//h2"));
		int count2=headings.size();
		System.out.println(count2);
//
//		for(WebElement h:headings)
//		{
//			String head = h.getText();
//			System.out.println(head);
//		}
//		
		for(int i=1;i<count2;i++)
		{
			String head = headings.get(i).getText();
			System.out.println(head);
			driver.quit();
			
		}
		

	}
}

