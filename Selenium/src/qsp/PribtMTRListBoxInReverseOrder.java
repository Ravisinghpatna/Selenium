 package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PribtMTRListBoxInReverseOrder {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");	
	}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///D:/hotelmenu.html");
		WebElement mt = driver.findElement(By.id("mtr"));
		Select s=new Select(mt);
		List<WebElement> allOption = s.getOptions();
		int count = allOption.size();
		System.out.println(count);

		for(int i=count-1;i>=0;i--)
			//for(int i=0;i<count;i++)
		{

			String text = allOption.get(i).getText();
			System.out.println(text);
		}

		driver.close();

	}

}
