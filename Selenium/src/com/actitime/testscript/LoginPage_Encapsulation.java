package com.actitime.testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage_Encapsulation {

	private WebElement untbx;
	
	public LoginPage_Encapsulation(WebDriver driver) {
		WebElement untbx;
		untbx=driver.findElement(By.id("username"));
		}
	
	public void setValue(String un) {
		untbx.sendKeys("admin");
	}
}
