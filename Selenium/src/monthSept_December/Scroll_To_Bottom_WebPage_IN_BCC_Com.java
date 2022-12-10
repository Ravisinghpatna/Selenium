package monthSept_December;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll_To_Bottom_WebPage_IN_BCC_Com {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.bbc.com/");
		JavascriptExecutor j= (JavascriptExecutor)driver;
		j.executeScript("window.scrollTo(0,document.body.ScrollHeight");
		
		Thread.sleep(5000);
		j.executeScript("window.scrollTo(0,0)");
		
	}
		

}
