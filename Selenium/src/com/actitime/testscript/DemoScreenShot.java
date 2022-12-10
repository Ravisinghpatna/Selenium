package com.actitime.testscript;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoScreenShot {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] Ravi) throws IOException {
 WebDriver driver=new ChromeDriver();
 driver.get("https://www.google.com/");
	TakesScreenshot t=(TakesScreenshot) driver;
	File source = t.getScreenshotAs(OutputType.FILE);

	File destination = new File("./ScreenShot/ss.png");
	FileUtils.copyFile(source, destination);
	driver.close();
	}

}
