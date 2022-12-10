package monthSept_December;

import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SerarchForSpecificOptionPresentInMTRListbox {
	static{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] Ravi) {
		WebDriver driver=new ChromeDriver();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the option");
		String	option=sc.nextLine();
		
		driver.get("file:///D:/hotelmenu.html");
		WebElement mtrlb=driver.findElement(By.id("mtr"));
		
		Select s=new Select(mtrlb);
		List<WebElement>allOptions=s.getOptions();
		
		int counter=0;
		for(int i=0;i<allOptions.size();i++)
		{
			String text=allOptions.get(i).getText();
			if(text.equals(option))
			{
				counter++;
			}
		}
		if(counter==0) {
			System.out.println(option+" is not present");
		}
		else if(counter==1)
		{
			System.out.println(option+" is present without duplicate");
		}
		else if(counter>1)
		{
			System.out.println(option+" is Present with duplicate");
		}
		driver.close();
	}
}