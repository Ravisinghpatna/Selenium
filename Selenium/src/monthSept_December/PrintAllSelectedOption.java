package monthSept_December;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PrintAllSelectedOption {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] Ravi) {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///D:/hotelmenu.html");
		WebElement checkPostList=driver.findElement(By.id("cp"));
		Select s= new Select(checkPostList);
		List<WebElement> allSelected = s.getAllSelectedOptions();
		int count=allSelected.size();
		
		for(int i=0;i<allSelected.size();i++)
		{
			String text=allSelected.get(i).getText();
			System.out.println(text);
			
		}
		driver.close();
		

	}

}
