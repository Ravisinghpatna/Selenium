package RecheckSelenium;

import org.openqa.selenium.WebDriver;

public class ClassA {
	
		public static void testA(WebDriver driver)
		{
			driver.get("https://www.jspiders.com");
			String title1=driver.getTitle();
			System.out.println(title1);
			driver.close();
		}
	}
