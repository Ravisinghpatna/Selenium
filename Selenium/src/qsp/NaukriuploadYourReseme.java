package qsp;
import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NaukriuploadYourReseme {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.naukri.com/registration/createAccount?othersrcp=11496&wExp=N");
		

		File f=new File("./data/ravisingh resume.docx");
		String absolutepath = f.getAbsolutePath();
		
		
		driver.findElement(By.xpath("//button[text()=\"Upload Resume\"]")).sendKeys(absolutepath);
		String title=driver.findElement(By.xpath(absolutepath)).getText();
		System.out.println(title);
		driver.close();
		




	}

}
