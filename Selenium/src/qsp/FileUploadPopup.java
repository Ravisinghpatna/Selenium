package qsp;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadPopup {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.get("file:///D:/Naukri.html");
		Thread.sleep(2000);
		
		File f=new File("./data/data2.property");
		Thread.sleep(3000);
		String absolutepath = f.getAbsolutePath();
		Thread.sleep(3000);
		driver.findElement(By.id("cv")).sendKeys(absolutepath);
		Thread.sleep(3000);
	}
}
