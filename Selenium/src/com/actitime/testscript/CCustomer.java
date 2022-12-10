package com.actitime.testscript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CCustomer {
	
	@FindBy(id="username")
	private WebElement untbx;
	
	@FindBy(name="pwd")
	private WebElement pwtbx;
	
	
	@FindBy(xpath="//*[@id=\"loginButton\"]/div")
	private WebElement lgbtn;
	
	
	@FindBy(xpath="//*[@id=\"container_tasks\"]")
	private WebElement task;
	
	public CCustomer(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void setLogin(String un,String pw)  {
		untbx.sendKeys(un);
		pwtbx.sendKeys(pw);
		lgbtn.click();
	
		task.click();
	}

	
	
}
