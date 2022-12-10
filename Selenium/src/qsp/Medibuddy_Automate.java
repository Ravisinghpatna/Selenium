package qsp;

import java.io.File;
import java.io.IOException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Medibuddy_Automate {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException, IOException {

		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.medibuddy.in/");
		driver.findElement(By.xpath("//a[text()='Login']")).click();
		driver.findElement(By.xpath("//input[@id='phone']")).sendKeys("7903444241");
		driver.findElement(By.xpath("//button[@class='btn btn-primary loginBtn']")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//button[text()='Verify']")).click();

		driver.findElement(By.xpath("(//a[@class='primary-service cursor-pointer'])[1]")).click();


		Set<String> childwin = driver.getWindowHandles();

		for(String chw:childwin)
		{
			driver.switchTo().window(chw);
		}

		driver.findElement(By.xpath("//div[@class='card card-body card-altered']")).click();
		driver.findElement(By.xpath("//li[text()='father']")).click();
		WebElement age = driver.findElement(By.xpath("//div[text()='18 Years']"));

		Select s=new Select(age);
		s.selectByValue("53 Years");
		driver.findElement(By.xpath("//a[text()='Next']")).click();

		TakesScreenshot t=(TakesScreenshot) driver;
		File src=t.getScreenshotAs(OutputType.FILE);
		File dest = new File("./Screenshot/medibuddy.png");
		FileUtils.copyFile(src, dest);


		driver.close();
	}

}
