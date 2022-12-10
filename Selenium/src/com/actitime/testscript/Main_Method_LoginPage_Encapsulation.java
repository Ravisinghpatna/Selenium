package com.actitime.testscript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main_Method_LoginPage_Encapsulation {
static {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		
		LoginPage_Encapsulation l=new LoginPage_Encapsulation(driver);
		l.setValue("admin");
		
		
	}

}
