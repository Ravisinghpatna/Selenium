package monthSept_December;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PrintAllTheOptionPresentMTRLBInReverseorder {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] Ravi) {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///D:/hotelmenu.html");
		WebElement mtrListBox = driver.findElement(By.id("mtr"));
		Select s=new Select(mtrListBox);

		List<WebElement> allOptions = s.getOptions();
		int	count=allOptions.size();
		System.out.println(count);
		
		for(int i=count-1;i>=0;i--)
		{
			String	text=allOptions.get(i).getText();
			System.out.println(text);
		}
		driver.close();




	}

}
