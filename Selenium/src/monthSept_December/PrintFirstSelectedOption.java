package monthSept_December;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PrintFirstSelectedOption {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] Ravi) {
		WebDriver driver =new ChromeDriver();
		driver.get("file:///D:/hotelmenu.html");
		WebElement checkPostlist = driver.findElement(By.id("cp"));
		Select s=new Select(checkPostlist);
		
		WebElement firstSOption = s.getFirstSelectedOption();
		String text = firstSOption.getText();
		
		System.out.println(text);
		driver.close();
		
		
		
	}

}
