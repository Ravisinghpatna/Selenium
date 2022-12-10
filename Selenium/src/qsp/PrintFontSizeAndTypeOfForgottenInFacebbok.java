package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintFontSizeAndTypeOfForgottenInFacebbok {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		
	driver.get("https://www.facebook.com/");
	
	String fontsize = driver.findElement(By.xpath("//a[text()=\"Forgotten password?\"]")).getCssValue("font-size");
	String fonttype = driver.findElement(By.xpath("//a[text()=\"Forgotten password?\"]"
			+ "")).getCssValue("font-family");
	
		System.out.println("font size : "+fontsize);
		System.out.println("font type : "+fonttype);
	}

}
