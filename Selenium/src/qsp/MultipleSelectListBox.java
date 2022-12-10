package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultipleSelectListBox {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}


	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///D:/hotelmenu.html");
	WebElement mt = driver.findElement(By.id("mtr"));
	Select s=new Select(mt);
	s.selectByIndex(0);
	Thread.sleep(1000);
	s.selectByValue("v");
	Thread.sleep(1000);
	s.selectByVisibleText("pizza");
	Thread.sleep(1000);
	s.deselectByIndex(0);
	Thread.sleep(1000);
	s.deselectByValue("v");
	Thread.sleep(1000);
	s.deselectByVisibleText("pizza");
	Thread.sleep(1000);
	
	boolean status = s.isMultiple();
	System.out.println(status);
	 driver.close();
	}

}
