package qsp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Automation_DemoSites {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://demo.automationtesting.in/Register.html");
		driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("SINGH");
		driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("RAVI");
		//Thread.sleep(1000);
		driver.findElement(By.xpath("//textarea[@ng-model='Adress']")).sendKeys("Gardanibagh Patna");
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("ravisinghpatna@gmail.com");

		driver.findElement(By.xpath("//input[@type='tel']")).sendKeys("8935964862");
		driver.findElement(By.xpath("(//input[@name='radiooptions'])[1]")).click();
		driver.findElement(By.id("checkbox2")).click();
		driver.findElement(By.id("msdd")).click();
		driver.findElement(By.linkText("Bulgarian")).click();

		WebElement skil = driver.findElement(By.id("Skills"));
		Select s=new Select(skil);
		s.selectByValue("Software");
		
//		 WebElement country = driver.findElement(By.id("countries"));
//		 Select s2=new Select(country);
//		 s2.selectByValue("Select Country");
		
		
		driver.findElement(By.xpath("//span[@role='combobox']")).click();
		driver.findElement(By.xpath("//li[text()='India']")).click();
		
		
		WebElement year = driver.findElement(By.id("yearbox"));
		Select s3=new Select(year);
		s3.selectByValue("1998");
		
		WebElement month = driver.findElement(By.xpath("//select[@placeholder='Month']"));
		Select s4=new Select(month);
		s4.selectByValue("February");
		
		WebElement day = driver.findElement(By.id("daybox"));
		Select s5=new Select(day);
		s5.selectByValue("27");
		
		driver.findElement(By.id("firstpassword")).sendKeys("ravisingh");
		driver.findElement(By.id("secondpassword")).sendKeys("ravisingh");
		
		driver.findElement(By.id("submitbtn")).click();
		//driver.findElement(By.id("Button1")).click();
		
		




	}

}
