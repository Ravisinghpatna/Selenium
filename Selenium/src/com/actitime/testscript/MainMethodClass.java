package com.actitime.testscript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MainMethodClass {
static {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
	public static void main(String[] args) throws InterruptedException {
WebDriver driver=new ChromeDriver();
driver.get("https://demo.actitime.com");
LoginPage_Encapsulation l=new LoginPage_Encapsulation(driver);
l.setValue("admin1","manager1");
Thread.sleep(1000);
l.setValue("admin","manager");

	}

}
