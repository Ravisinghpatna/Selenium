package myPractices;

import org.openqa.selenium.WebDriver;

public class Demo {
	static void testA(WebDriver driver)
	{
		driver.get("https://www.facebook.com/");
		String title1 = driver.getTitle();
		System.out.println(title1);
		driver.close();
	}

}
