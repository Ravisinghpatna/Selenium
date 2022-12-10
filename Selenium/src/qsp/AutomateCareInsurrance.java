package qsp;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AutomateCareInsurrance {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.careinsurance.com/rhicl/proposalcp/renew/index-care");
		driver.findElement(By.id("policynumber")).sendKeys("123");
		driver.findElement(By.id("dob")).click();

		WebElement month = driver.findElement(By.xpath("//select[@class=\"ui-datepicker-month\"]"));
		Select m=new Select(month);
		m.selectByIndex(1);

		WebElement year=driver.findElement(By.xpath("//select[@class=\"ui-datepicker-year\"]"));
		Select y=new Select(year);
		y.selectByVisibleText("1998");

		driver.findElement(By.xpath("//a[text()=\"27\"]")).click();
		driver.findElement(By.xpath("//input[@id=\"alternative_number\"]")).sendKeys("9945099450");
		driver.findElement(By.id("renew_policy_submit")).click();

		boolean text = driver.findElement(By.id("policynumberError")).isDisplayed();
		if(text==true)
		{
			System.out.println("Enter the valid Policy no is Displayed "+text);
		}
		else
			System.out.println("Enter the valid Policy no is not Displayed "+text);
		
		driver.close();



	}

}
