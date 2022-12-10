package monthSept_December;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Scroll3000pxInVerticallyInBBC_com {

	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://bbc.com/");

//		JavascriptExecutor j=(JavascriptExecutor)driver;//up casting
//		j.executeScript("window.scrollBy(0,1000)");
//		Thread.sleep(2000);
//		j.executeScript("window.scrollTo(0,3800)");


		RemoteWebDriver r=(RemoteWebDriver)driver;
		r.executeScript("window.scrollBy(0,1000)");
		Thread.sleep(2000);
		r.executeScript("window.scrollTo(0,3800)");


	}

}
