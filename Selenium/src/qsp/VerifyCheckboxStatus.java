package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyCheckboxStatus {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/");
		boolean button=driver.findElement(By.xpath("//input[contains(@type,'checkbox')]")).isSelected();
	//boolean button=driver.findElement(By.xpath("//input[.='checkbox')]")).isSelected();

		if(button==true)
		{
			System.out.println("Checkbox is present");
		}
		else
			System.out.println("Checkbox is not present");
			
		 driver.close();
		
		//driver.quit();

		
	}

}
