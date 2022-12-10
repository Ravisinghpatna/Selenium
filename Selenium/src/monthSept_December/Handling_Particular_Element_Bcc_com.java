package monthSept_December;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling_Particular_Element_Bcc_com {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();

		driver.get("https://www.bbc.com/");
		//int y=driver.findElement(By.xpath("//span[@class='module__title__link tag tag--default']")).getLocation().getY();
		int x=driver.findElement(By.linkText("Future Planet")).getLocation().getX();

		JavascriptExecutor j=(JavascriptExecutor)driver;

		//j.executeScript("window.scrollBy(0,"+y+ ")");
		Thread.sleep(2000);
		j.executeScript("window.scrollBy(0,"+x+ ")");



	}
}
