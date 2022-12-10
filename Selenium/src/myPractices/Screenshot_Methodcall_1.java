package myPractices;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot_Methodcall_1 {

	public void screenshot() throws IOException {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com");

		TakesScreenshot t=(TakesScreenshot) driver;
		File src = t.getScreenshotAs(OutputType.FILE);
		File des = new File("./Screenshot/ydgufsgfehjt.png");
		FileUtils.copyFile(src, des);
	}

}
