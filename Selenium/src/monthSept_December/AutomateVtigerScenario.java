package monthSept_December;

import java.awt.Desktop.Action;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AutomateVtigerScenario {
	static{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");

	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.vtiger.com/");

		WebElement resource = driver.findElement(By.partialLinkText("Resources"));
		Actions a=new Actions(driver);
		a.doubleClick(resource).perform();
		driver.findElement(By.partialLinkText("Customers")).click();

		WebElement button = driver.findElement(By.partialLinkText("READ FULL STORY"));
		a.doubleClick(button).perform();


		boolean text = driver.findElement(By.xpath("//h1[contains(text(),'HackerEarth + Vtiger CRM')]")).isDisplayed();
		if(text==true)
		{
			System.out.println("HackerEarth + Vtiger CRM  is displayed");
		}
		else
			System.out.println("HackerEarth + Vtiger CRM  is Not displayed");
		driver.close();

	}

}
