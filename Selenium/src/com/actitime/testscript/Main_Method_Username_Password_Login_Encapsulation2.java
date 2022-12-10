package com.actitime.testscript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main_Method_Username_Password_Login_Encapsulation2 {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		Username_Password_Login_Encapsulation ll=new Username_Password_Login_Encapsulation(driver);
		ll.setLogin("admin", "manager");
		}

}
