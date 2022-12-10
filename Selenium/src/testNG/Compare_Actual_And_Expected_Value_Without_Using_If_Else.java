package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Compare_Actual_And_Expected_Value_Without_Using_If_Else {

	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");

	}
	@Test
	public void verifyTitle()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		String eTitle="Hoogle";
		String aTitle=driver.getTitle();
		Assert.assertEquals(aTitle, eTitle);
		driver.close();
	}
	

}
