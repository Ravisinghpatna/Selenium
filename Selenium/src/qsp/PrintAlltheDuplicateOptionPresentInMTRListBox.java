package qsp;

import java.util.HashSet;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PrintAlltheDuplicateOptionPresentInMTRListBox {

	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");

	}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///D:/hotelmenu.html");
		HashSet<String> hs=new HashSet<>();
		WebElement mt=driver.findElement(By.id("mtr"));
		Select s=new Select(mt);
		List<WebElement> allListBox = s.getOptions();
		
		int	count=allListBox.size();
	//	System.out.println(count);

		for(int i=0;i<count;i++)
		{
			String text=allListBox.get(i).getText();
			boolean re = hs.add(text);
			{
				if(re==false)
				{
					System.out.println(text);
					
				}
			}
		}
		
		driver.close();



}
	}
