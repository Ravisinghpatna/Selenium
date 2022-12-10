package monthSept_December;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Handling_Disable_Elements {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///D:/UnandPw.html");
		driver.findElement(By.id("d1")).sendKeys("ravi");
		//driver.findElement(By.id("d2")).sendKeys("ravi");//this is a disabled text field if you mention like this you will get exception 

		//RemoteWebDriver r=(RemoteWebDriver) driver;//down casting
		//r.executeScript("document.getElementById('d2').value='ravi'");
		
		JavascriptExecutor j=(JavascriptExecutor) driver;//up casting
		j.executeScript("document.getElementById('d2').value='ravi'");
		

		

	}

}
