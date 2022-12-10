package monthSept_December;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PrintAllOptionPresentInCPByUsingGetWrapped {
	static{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] Ravi) {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///D:/hotelmenu.html");
		WebElement checkBoxList = driver.findElement(By.id("cp"));
		Select s= new Select(checkBoxList);
		
		String 	text=s.getWrappedElement().getText();
		
		System.out.println(text);
		
		driver.close();

	}

}
