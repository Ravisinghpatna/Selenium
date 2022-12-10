package com.actitime.testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Username_Password_Login_Encapsulation {
	
	private WebElement untbx;
	private WebElement psdtbx;
	private WebElement log;

	
	public Username_Password_Login_Encapsulation(WebDriver driver) {
		untbx=driver.findElement(By.id("username"));
		psdtbx=driver.findElement(By.name("pwd"));
		log=driver.findElement(By.id("loginButton"));
	}
	
	
	public void setLogin(String un, String pd) {
		
		
		untbx.sendKeys("admin");
		psdtbx.sendKeys("manager");
		log.click();
	
	}
}
