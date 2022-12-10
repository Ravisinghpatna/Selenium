package monthSept_December;

import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PrintAllTheOptionPresentInCheckPostListBox {
static {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	
}
	public static void main(String[] Ravi) {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///D:/hotelmenu.html");
		WebElement cpListBox = driver.findElement(By.id("cp"));
		Select s=new Select(cpListBox);
		List<WebElement>allOptions=s.getOptions();
		
		
		
		//int count=allOptions.size();
		
		for(int i=0;i<allOptions.size();i++)
		{
			String text=allOptions.get(i).getText();
			System.out.println(text);
		}
		
		driver.close();

	}

}
