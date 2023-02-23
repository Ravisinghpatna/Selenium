package myPractices;


import java.sql.Driver;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MaximizeTheBrowser_WithSpecific_HeightAndWidth {

	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.google.com");
		int width=270,height=370;
		Dimension d=new Dimension(width, height);
		driver.manage().window().setSize(d);
		
		

		
		//driver.manage().window().maximize();
	

	}

}
